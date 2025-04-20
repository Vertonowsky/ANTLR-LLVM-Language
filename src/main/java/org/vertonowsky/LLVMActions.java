package org.vertonowsky;

import org.vertonowsky.gen.WolaczBaseListener;
import org.vertonowsky.gen.WolaczParser;

import java.util.*;

enum VarType {INT, FLOAT, STRING, BOOL, UNKNOWN}

class Value {
    public String name;
    public VarType type;
    public int length;

    public Value(String name, VarType type, int length) {
        this.name = name;
        this.type = type;
        this.length = length;
    }
}

public class LLVMActions extends WolaczBaseListener {

    HashMap<String, Value> variables = new HashMap<String, Value>();
    HashMap<String, Value> localvariables = new HashMap<String, Value>();
    HashMap<String,String> functions = new HashMap<String,String>();
    Stack<Value> stack = new Stack<Value>();
    List<String> funcArgs = new ArrayList<>();
    String function;
    String functionType;
    Boolean global;

    static int BUFFER_SIZE = 16;

    @Override
    public void enterProgram(WolaczParser.ProgramContext ctx) {
        global = true;
    }

    @Override
    public void exitFunccall(WolaczParser.FunccallContext ctx) {
        String ID = ctx.ID().getText();
        String funcType = functions.get(ID);
        List<Value> stackValues = new ArrayList<>();
        while (!stack.isEmpty()) {
            stackValues.add(stack.pop());
        }

        LLVMGenerator.func_call(ID, funcType, stackValues);
        var resultType = funcType.equals("int") ? VarType.INT : (funcType.equals("float") ? VarType.FLOAT : VarType.BOOL);
        stack.push(new Value("%" + (LLVMGenerator.reg - 1), resultType, 0));
    }

    @Override
    public void exitFname(WolaczParser.FnameContext ctx) {
        String FTYPE = ctx.FTYPE().getText();
        String ID = ctx.ID().getText();
        if (functions.containsKey(ID))
            error(ctx.getStart().getLine(), String.format("Function with name \"%s\" already exists", ID));

        funcArgs = new ArrayList<>();
        functions.put(ID, FTYPE);
        functionType = FTYPE;
        function = ID;
    }

    @Override
    public void exitFparam(WolaczParser.FparamContext ctx) {
        StringBuilder argsStr = new StringBuilder();
        for (int i = 0; i <ctx.ID().size(); i++) {
            String id = ctx.ID(i).getText();
            String type = ctx.FTYPE(i).getText();
            switch (type) {
                case "int" -> {
                    argsStr.append("i32 ");
                    localvariables.put("%" + id, new Value("%" + id, VarType.INT, 0));
                }
                case "float" -> {
                    argsStr.append("double ");
                    localvariables.put("%" + id, new Value("%" + id, VarType.FLOAT, 0));
                }
                case "bool" -> {
                    argsStr.append("i1 ");
                    localvariables.put("%" + id, new Value("%" + id, VarType.BOOL, 0));
                }
                default -> error(ctx.getStart().getLine(), "Unknown variable type");
            }
            funcArgs.add("%" + id);
            argsStr.append(String.format("%%%s, ", id));
        }
        argsStr.delete(argsStr.length()-2, argsStr.length());

        LLVMGenerator.functionstart(function, functionType, argsStr.toString());
    }

    @Override
    public void enterFblock(WolaczParser.FblockContext ctx) {
        global = false;
    }

    @Override
    public void exitFblock(WolaczParser.FblockContext ctx) {
        String retID = ctx.ID().getText();
        if (!localvariables.containsKey("%" + retID))
            error(ctx.getStart().getLine(), String.format("Return variable %s missing.", retID));

        LLVMGenerator.functionend(functionType,"%" + retID);
        localvariables = new HashMap<>();
        global = true;
    }

    @Override
    public void exitRepetitions(WolaczParser.RepetitionsContext ctx) {
        var tmp = stack.pop();
        if (tmp.type != VarType.INT)
            error(ctx.getStart().getLine(), ", wrong type, should be int");

        LLVMGenerator.repeatstart(tmp.name);
    }

    @Override
    public void exitBlock(WolaczParser.BlockContext ctx) {
        if (ctx.getParent() instanceof WolaczParser.RepeatContext)
            LLVMGenerator.repeatend();
    }

    @Override
    public void enterIfblock(WolaczParser.IfblockContext ctx) {
        LLVMGenerator.ifstart();
    }

    @Override
    public void exitIfblock(WolaczParser.IfblockContext ctx) {
        LLVMGenerator.ifend();
    }

    @Override
    public void exitCond(WolaczParser.CondContext ctx) {
        String prefix = global ? "@" : "%";
        String ID = prefix + ctx.ID().getText();
        String INT = ctx.INT().getText();
        if (!variables.containsKey(ID))
            error(ctx.getStart().getLine(), String.format("unknown variable: %s", ID));

        LLVMGenerator.icmp(ID, INT);
    }

    @Override
    public void exitAssign(WolaczParser.AssignContext ctx) {
        String ID = ctx.ID().getText();
        Value v = stack.pop();
        String prefix = global ? "@" : "%";

        if (!variables.containsKey(prefix + ID) && !localvariables.containsKey(prefix + ID)) {
            if (global)
                variables.put(prefix + ID, v);
            else
                localvariables.put(prefix + ID, v);

            switch (v.type) {
                case INT    -> LLVMGenerator.declare_i32(ID, global);
                case FLOAT  -> LLVMGenerator.declare_double(ID, global);
                case BOOL   -> LLVMGenerator.declare_bool(ID, global);
                case STRING -> LLVMGenerator.declare_string(ID, global);
            }
        }

        Value prevVal = global ? variables.get(prefix + ID) : localvariables.get(prefix + ID);
        if (v.type != prevVal.type) {
            prevVal.type = v.type;
            prevVal.name = v.name;
        }

        switch (v.type) {
            case INT    -> LLVMGenerator.assign_i32(prefix + ID, v.name);
            case FLOAT  -> LLVMGenerator.assign_double(prefix + ID, v.name);
            case BOOL   -> LLVMGenerator.assign_bool(prefix + ID, v.name);
            case STRING -> LLVMGenerator.assign_string(prefix + ID);
        }
    }

    @Override
    public void exitProgram(WolaczParser.ProgramContext ctx) {
        LLVMGenerator.close_main();
    }

    @Override
    public void exitId1(WolaczParser.Id1Context ctx) {
        String prefix = global ? "@" : "%";
        String ID = prefix + ctx.ID().getText();
        if (localvariables.containsKey(ID) && funcArgs.contains(ID)) {
            stack.push(localvariables.get(ID));
            return;
        }

        if (!variables.containsKey(ID) && !localvariables.containsKey(ID))
            error(ctx.getStart().getLine(), "unknown variable");

        var tmp = localvariables.containsKey(ID) ? localvariables.get(ID) : variables.get(ID);
        switch (tmp.type) {
            case INT    -> LLVMGenerator.load_i32(ID);
            case FLOAT  -> LLVMGenerator.load_double(ID);
            case STRING -> LLVMGenerator.load_bool(ID);
            case BOOL   -> LLVMGenerator.load_string(ID);
        }

        stack.push(new Value("%" + (LLVMGenerator.reg - 1), tmp.type, tmp.length));
    }

    @Override
    public void exitId2(WolaczParser.Id2Context ctx) {
        String prefix = global ? "@" : "%";
        String ID = prefix + ctx.ID().getText();
        if (localvariables.containsKey(ID) && funcArgs.contains(ID)) {
            stack.push(localvariables.get(ID));
            return;
        }

        if (!variables.containsKey(ID) && !localvariables.containsKey(ID))
            error(ctx.getStart().getLine(), "unknown variable");

        var tmp = localvariables.containsKey(ID) ? localvariables.get(ID) : variables.get(ID);
        switch (tmp.type) {
            case INT    -> LLVMGenerator.load_i32(ID);
            case FLOAT  -> LLVMGenerator.load_double(ID);
            case STRING -> LLVMGenerator.load_bool(ID);
            case BOOL   -> LLVMGenerator.load_string(ID);

        }

        stack.push(new Value("%" + (LLVMGenerator.reg - 1), tmp.type, tmp.length));
    }

    @Override
    public void exitId3(WolaczParser.Id3Context ctx) {
        String prefix = global ? "@" : "%";
        String ID = prefix + ctx.ID().getText();
        if (localvariables.containsKey(ID) && funcArgs.contains(ID)) {
            stack.push(localvariables.get(ID));
            return;
        }
        if (!variables.containsKey(ID) && !localvariables.containsKey(ID))
            error(ctx.getStart().getLine(), "unknown variable");

        var tmp = localvariables.containsKey(ID) ? localvariables.get(ID) : variables.get(ID);
        switch (tmp.type) {
            case INT    -> LLVMGenerator.load_i32(ID);
            case FLOAT  -> LLVMGenerator.load_double(ID);
            case STRING -> LLVMGenerator.load_bool(ID);
            case BOOL   -> LLVMGenerator.load_string(ID);
        }

        stack.push(new Value("%" + (LLVMGenerator.reg - 1), tmp.type, tmp.length));
    }

    @Override
    public void exitInt(WolaczParser.IntContext ctx) {
        stack.push(new Value(ctx.INT().getText(), VarType.INT, 0));
    }

    @Override
    public void exitInt2(WolaczParser.Int2Context ctx) {
        stack.push(new Value(ctx.INT().getText(), VarType.INT, 0));
    }

    @Override
    public void exitFloat(WolaczParser.FloatContext ctx) {
        stack.push(new Value(ctx.FLOAT().getText(), VarType.FLOAT, 0));
    }

    @Override
    public void exitBool(WolaczParser.BoolContext ctx) {
        var tmp = ctx.BOOL().getText().equals("true") ? "1" : "0";
        stack.push(new Value(tmp, VarType.BOOL, 0));
    }

    @Override
    public void exitString(WolaczParser.StringContext ctx) {
        String tmp = ctx.STRING().getText();
        String content = tmp.substring(1, tmp.length() - 1);
        LLVMGenerator.constant_string(content);
        String n = "%ptrstr" + (LLVMGenerator.str - 1);
        stack.push(new Value(n, VarType.STRING, content.length()));
    }

    @Override
    public void exitAdd(WolaczParser.AddContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type != v2.type)
            error(ctx.getStart().getLine(), "add type mismatch");

        if (v1.type == VarType.INT) {
            LLVMGenerator.add_i32(v1.name, v2.name);
            stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT, 0));
        }
        if (v1.type == VarType.FLOAT) {
            LLVMGenerator.add_double(v1.name, v2.name);
            stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.FLOAT, 0));
        }
        if (v1.type == VarType.STRING) {
            LLVMGenerator.add_string(v1.name, v1.length, v2.name, v2.length);
            stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.STRING, v1.length + v2.length));
        }
    }

    @Override
    public void exitSub(WolaczParser.SubContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type != v2.type)
            error(ctx.getStart().getLine(), "sub type mismatch");

        if (v1.type == VarType.INT) {
            LLVMGenerator.sub_i32(v1.name, v2.name);
            stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT, 0));
        }
        if (v1.type == VarType.FLOAT) {
            LLVMGenerator.sub_double(v1.name, v2.name);
            stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.FLOAT, 0));
        }
    }

    @Override
    public void exitMult(WolaczParser.MultContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type != v2.type)
            error(ctx.getStart().getLine(), "mult type mismatch");

        if (v1.type == VarType.INT) {
            LLVMGenerator.mult_i32(v1.name, v2.name);
            stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT, 0));
        }
        if (v1.type == VarType.FLOAT) {
            LLVMGenerator.mult_double(v1.name, v2.name);
            stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.FLOAT, 0));
        }
    }

    @Override
    public void exitDiv(WolaczParser.DivContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type != v2.type)
            error(ctx.getStart().getLine(), "div type mismatch");

        if (v1.type == VarType.INT) {
            LLVMGenerator.div_i32(v1.name, v2.name);
            stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT, 0));
        }
        else if (v1.type == VarType.FLOAT) {
            LLVMGenerator.div_double(v1.name, v2.name);
            stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.FLOAT, 0));
        }
    }

    @Override
    public void exitAnd(WolaczParser.AndContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type != VarType.BOOL && v2.type != VarType.BOOL)
            error(ctx.getStart().getLine(), "or type mismatch");

        LLVMGenerator.and_short_circuit(v1.name, v2.name);
        stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.BOOL, 0));
    }

    @Override
    public void exitOr(WolaczParser.OrContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type != VarType.BOOL && v2.type != VarType.BOOL)
            error(ctx.getStart().getLine(), "or type mismatch");

        LLVMGenerator.or_short_circuit(v1.name, v2.name);
        stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.BOOL, 0));
    }

    @Override
    public void exitXor(WolaczParser.XorContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type != VarType.BOOL && v2.type != VarType.BOOL)
            error(ctx.getStart().getLine(), "or type mismatch");

        LLVMGenerator.xor_bool(v1.name, v2.name);
        stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.BOOL, 0));
    }

    @Override
    public void exitNeg(WolaczParser.NegContext ctx) {
        Value v = stack.pop();
        if (v.type != VarType.BOOL)
            error(ctx.getStart().getLine(), "neg type mismatch");

        LLVMGenerator.neg_bool(v.name);
        stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.BOOL, 0));
    }

    @Override
    public void exitToint(WolaczParser.TointContext ctx) {
        Value v = stack.pop();
        LLVMGenerator.fptosi(v.name);
        stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT, 0));
    }

    @Override
    public void exitTofloat(WolaczParser.TofloatContext ctx) {
        Value v = stack.pop();
        LLVMGenerator.sitofp(v.name);
        stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.FLOAT, 0));
    }

    @Override
    public void exitWrite(WolaczParser.WriteContext ctx) {
        String ID = ctx.ID().getText();
        String prefix = global ? "@" : "%";
        ID = prefix + ID;
        if (!variables.containsKey(ID))
            error(ctx.getStart().getLine(), "unknown variable");

        Value v = variables.get(ID);
        if (v.type != null) {
            switch (v.type) {
                case INT    -> LLVMGenerator.writef_i32(ID);
                case FLOAT  -> LLVMGenerator.writef_double(ID);
                case STRING -> LLVMGenerator.writef_string(ID);
                case BOOL   -> LLVMGenerator.writef_bool(ID);
            }
        }
    }

    @Override
    public void exitRead(WolaczParser.ReadContext ctx) {
        String ID = ctx.ID().getText();
        Value v = new Value(ID, VarType.STRING, BUFFER_SIZE - 1);
        variables.put(ID, v);
        LLVMGenerator.scanf(ID, BUFFER_SIZE, global);
    }

    void error(int line, String msg) {
        System.err.println("Error, line " + line + ", " + msg);
        System.exit(1);
    }

}