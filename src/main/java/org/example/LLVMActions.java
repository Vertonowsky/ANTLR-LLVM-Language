package org.example;

import org.example.classes.WolaczBaseVisitor;
import org.example.classes.WolaczParser;

import java.util.*;

public class LLVMActions extends WolaczBaseVisitor<String> {

    public final LLVMGenerator generator = new LLVMGenerator();
    private final Map<String, String> variableTypes = new HashMap<>();

    @Override
    public String visitProgram(WolaczParser.ProgramContext ctx) {
        for (WolaczParser.StatementContext stmt : ctx.statement()) {
            visit(stmt);
        }
        return generator.getGeneratedCode();
    }

    @Override
    public String visitVariableDeclaration(WolaczParser.VariableDeclarationContext ctx) {
        String varName = ctx.ID().getText();
        String typeStr = ctx.type().getText();
        String llvmType = generator.getLLVMType(typeStr);

        List<String> validTypes = Arrays.asList("int", "float", "string", "Float32", "Float64");
        if (!validTypes.contains(typeStr)) {
            error(ctx.getStart().getLine(), "Invalid type: " + typeStr);
        }

        if (ctx.expression() != null && ctx.expression().getText().isEmpty()) {
            error(ctx.getStart().getLine(), "Variable '" + varName + "' must be initialized.");
        }

        if (typeStr.equals("string") && ctx.expression() != null && !ctx.expression().getText().isEmpty()) {
            error(ctx.getStart().getLine(), "Cannot assign a value to a string variable during declaration.");
        }

        generator.declareVariable(varName, llvmType);
        variableTypes.put(varName, llvmType);

        if (ctx.expression() != null) {
            String valueReg = visit(ctx.expression());
            generator.assignVariable(varName, valueReg);
        }
        return null;
    }

    @Override
    public String visitAssignment(WolaczParser.AssignmentContext ctx) {
        String varName = ctx.ID().getText();
        String targetType = variableTypes.getOrDefault(varName, "i32");

        List<WolaczParser.ExpressionContext> exprs = ctx.expression();
        WolaczParser.ExpressionContext valueExpr = exprs.get(exprs.size() - 1);

        // Sprawdzenie, czy zmienna została zadeklarowana
        if (!variableTypes.containsKey(varName)) {
            error(ctx.getStart().getLine(), "Variable '" + varName + "' has not been declared.");
        }

        // Obsługa przypisania literału stringa
        if (valueExpr.value() != null && valueExpr.value().STRING() != null) {
            if (!targetType.equals("i8*")) {
                error(ctx.getStart().getLine(), "Cannot assign string literal to non-string variable: " + varName);
            }

            String literalText = valueExpr.value().STRING().getText();
            literalText = literalText.substring(1, literalText.length() - 1);

            String label = generator.registerStringLiteral(literalText);
            String destPtr = generator.newRegister();
            generator.emit(destPtr + " = getelementptr [100 x i8], [100 x i8]* %" + varName + ", i32 0, i32 0");

            int len = literalText.length() + 1;
            String srcPtr = generator.newRegister();
            generator.emit(srcPtr + " = getelementptr [" + len + " x i8], [" + len + " x i8]* " + label + ", i32 0, i32 0");

            generator.emit("call void @llvm.memcpy.p0i8.p0i8.i64(i8* " + destPtr + ", i8* " + srcPtr + ", i64 " + len + ", i1 false)");
            return null;
        }

        // Przypisanie wartości liczbowej
        String valueReg = visit(valueExpr);
        String sourceType = expressionType(valueExpr);

        // Dodaj rzutowanie jeśli typy są różne
        if (!targetType.equals(sourceType)) {
            String casted = generator.newRegister();
            valueReg = switch (targetType + " <- " + sourceType) {
                case "float <- double" -> {
                    generator.emit(casted + " = fptrunc double " + valueReg + " to float");
                    yield casted;
                }
                case "double <- float" -> {
                    generator.emit(casted + " = fpext float " + valueReg + " to double");
                    yield casted;
                }
                case "float <- i32" -> {
                    generator.emit(casted + " = sitofp i32 " + valueReg + " to float");
                    yield casted;
                }
                case "double <- i32" -> {
                    generator.emit(casted + " = sitofp i32 " + valueReg + " to double");
                    yield casted;
                }
                default -> {
                    error(ctx.getStart().getLine(), "Unsupported operation for type: " + targetType);
                    yield null;
                }
            };
        }

        // Specjalna obsługa dla string
        if (targetType.equals("i8*")) {
            String destPtr = generator.newRegister();
            generator.emit(destPtr + " = getelementptr [100 x i8], [100 x i8]* %" + varName + ", i32 0, i32 0");

            String srcPtr = generator.newRegister();
            generator.emit(srcPtr + " = getelementptr [100 x i8], [100 x i8]* %" + valueReg + ", i32 0, i32 0");

            generator.emit("call void @llvm.memcpy.p0i8.p0i8.i64(i8* " + destPtr + ", i8* " + srcPtr + ", i64 100, i1 false)");
        } else {
            generator.assignVariable(varName, valueReg);
        }

        return null;
    }


    @Override
    public String visitIoStatement(WolaczParser.IoStatementContext ctx) {
        if (ctx.getChildCount() != 4) {
            error(ctx.getStart().getLine(), "Invalid format. Provide one variable inside brackets.");
        }

        if (ctx.READ() != null) {
            String varName = ctx.ID().getText();
            if (!variableTypes.containsKey(varName)) {
                error(ctx.getStart().getLine(), "Variable '" + varName + "' has not been declared.");
            }

            String type = variableTypes.getOrDefault(varName, "i32");
            generator.emitRead(varName, type);
        } else if (ctx.PRINT() != null) {
            String valReg = visit(ctx.expression()); // Odwiedź wyrażenie
            String valType = expressionType(ctx.expression());

            if (ctx.expression().getChild(0) instanceof WolaczParser.ValueContext valueContext) {
                if (valueContext.ID() != null) {
                    String varName = valueContext.ID().getText();
                    if (!variableTypes.containsKey(varName)) {
                        error(ctx.getStart().getLine(), "Variable '" + varName + "' has not been declared.");
                    }
                }
            }

            generator.emitPrint(valReg, valType);
        }
        return null;
    }

    @Override
    public String visitExpressionStatement(WolaczParser.ExpressionStatementContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public String visitExpression(WolaczParser.ExpressionContext ctx) {
        // pojedyncza wartość
        if (ctx.value() != null) {
            return visit(ctx.value());
        }

        // wyrażenie binarne (np. a + b)
        if (ctx.expression().size() == 2) {
            String left = visit(ctx.expression(0));
            String right = visit(ctx.expression(1));
            String op = ctx.op.getText();

            String typeLeft = expressionType(ctx.expression(0));
            String typeRight = expressionType(ctx.expression(1));
            String resultType = dominantType(ctx.expression(0), ctx.expression(1));

            // Rzutowanie operandów jeśli są różnych typów
            if (!typeLeft.equals(typeRight)) {
                if (typeLeft.equals("float") && typeRight.equals("double")) {
                    String castedLeft = generator.newRegister();
                    generator.emit(castedLeft + " = fpext float " + left + " to double");
                    left = castedLeft;
                } else if (typeLeft.equals("double") && typeRight.equals("float")) {
                    String castedRight = generator.newRegister();
                    generator.emit(castedRight + " = fpext float " + right + " to double");
                    right = castedRight;
                } else if (typeLeft.equals("i32") && (typeRight.equals("float") || typeRight.equals("double"))) {
                    String castedLeft = generator.newRegister();
                    generator.emit(castedLeft + " = sitofp i32 " + left + " to " + typeRight);
                    left = castedLeft;
                } else if (typeRight.equals("i32") && (typeLeft.equals("float") || typeLeft.equals("double"))) {
                    String castedRight = generator.newRegister();
                    generator.emit(castedRight + " = sitofp i32 " + right + " to " + typeLeft);
                    right = castedRight;
                }
            }

            if (op.equals("/") && resultType.equals("i32")) {
                String isZero = generator.newRegister();
                generator.emit(isZero + " = icmp eq i32 " + right + ", 0");

                String thenLabel = generator.newLabel();
                String endLabel = generator.newLabel();

                // Jeśli dzielnik jest zerem, to obsługuję błąd
                generator.emit("br i1 " + isZero + ", label %" + thenLabel + ", label %" + endLabel);

                // jeśli dzielnik to zero
                generator.emit(thenLabel + ":");
                generator.emit("call void @print_error(i8* getelementptr ([22 x i8], [22 x i8]* @.divzero_msg, i32 0, i32 0))");
                generator.emit("call void @exit(i32 1)");
                generator.emit("br label %" + endLabel);

                // jeśli dzielnik nie jest zerem
                generator.emit(endLabel + ":");
                generator.emit("; continue division");
            }

            String resultReg = generator.newRegister();
            if (resultType.equals("double") || resultType.equals("float")) {
                String llvmOp = switch (op) {
                    case "+" -> "fadd";
                    case "-" -> "fsub";
                    case "*" -> "fmul";
                    case "/" -> "fdiv";
                    default -> {
                        error(ctx.getStart().getLine(), "Unsupported operator: " + op);
                        yield null;
                    }
                };
                generator.emit(resultReg + " = " + llvmOp + " " + resultType + " " + left + ", " + right);
            } else {
                String llvmOp = switch (op) {
                    case "+" -> "add";
                    case "-" -> "sub";
                    case "*" -> "mul";
                    case "/" -> "sdiv";
                    default -> {
                        error(ctx.getStart().getLine(), "Unsupported operator: " + op);
                        yield null;
                    }
                };
                generator.emit(resultReg + " = " + llvmOp + " i32 " + left + ", " + right);
            }

            return resultReg;
        }

        // nawiasy
        if (ctx.expression().size() == 1) {
            return visit(ctx.expression(0));
        }

        return null;
    }


    @Override
    public String visitValue(WolaczParser.ValueContext ctx) {
        if (ctx.INT() != null) {
            String reg = generator.newRegister();
            generator.emit(reg + " = add i32 0, " + ctx.INT().getText());
            return reg;
        } else if (ctx.FLOAT() != null) {
            // Domyślnie zakładamy, że FLOAT literał to double (Float64)
            String reg = generator.newRegister();
            generator.emit(reg + " = fadd double 0.0, " + ctx.FLOAT().getText());
            return reg;
        } else if (ctx.ID() != null) {
            String varName = ctx.ID().getText();
            String type = variableTypes.getOrDefault(varName, "i32");

            if (type.equals("i8*")) {
                // Dla stringa — nie ładujemy, tylko zwracamy nazwę
                return varName;
            } else {
                String reg = generator.newRegister();
                generator.emit(reg + " = load " + type + ", " + type + "* %" + varName);
                return reg;
            }
        } else if (ctx.STRING() != null) {
            // Na razie tylko komentarz — można dodać print("text") później
            generator.emit("; string literal (not yet supported): " + ctx.STRING().getText());
            return "null";
        }

        return null;
    }




    public String getLLVM() {
        return generator.getGeneratedCode();
    }

    private String expressionType(WolaczParser.ExpressionContext ctx) {
        if (ctx.value() != null) {
            WolaczParser.ValueContext v = ctx.value();
            if (v.FLOAT() != null) return "double";
            if (v.INT() != null) return "i32";
            if (v.ID() != null) {
                return variableTypes.getOrDefault(v.ID().getText(), "i32");
            }
        }
        if (ctx.expression().size() == 2) {
            return dominantType(ctx.expression(0), ctx.expression(1));
        }
        if (ctx.expression().size() == 1) {
            return expressionType(ctx.expression(0));
        }
        return "i32";
    }

    private String dominantType(WolaczParser.ExpressionContext a, WolaczParser.ExpressionContext b) {
        String t1 = expressionType(a);
        String t2 = expressionType(b);
        if (t1.equals("double") || t2.equals("double")) return "double";
        if (t1.equals("float") || t2.equals("float")) return "float";
        return "i32";
    }

    void error(int line, String msg) {
        System.err.println("Error, line " + line + ", " + msg);
        System.exit(1);
    }

}
