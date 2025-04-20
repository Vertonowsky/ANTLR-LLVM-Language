// Generated from C:/Users/Bartek/IdeaProjects/wolacz/grammar/Wolacz.g4 by ANTLR 4.13.2
package org.vertonowsky.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WolaczParser}.
 */
public interface WolaczListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WolaczParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(WolaczParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link WolaczParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(WolaczParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link WolaczParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(WolaczParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link WolaczParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(WolaczParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link WolaczParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(WolaczParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link WolaczParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(WolaczParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link WolaczParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterIf(WolaczParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link WolaczParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitIf(WolaczParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code write}
	 * labeled alternative in {@link WolaczParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterWrite(WolaczParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code write}
	 * labeled alternative in {@link WolaczParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitWrite(WolaczParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link WolaczParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterAssign(WolaczParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link WolaczParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitAssign(WolaczParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link WolaczParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterRead(WolaczParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link WolaczParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitRead(WolaczParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link WolaczParser#repetitions}.
	 * @param ctx the parse tree
	 */
	void enterRepetitions(WolaczParser.RepetitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WolaczParser#repetitions}.
	 * @param ctx the parse tree
	 */
	void exitRepetitions(WolaczParser.RepetitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id3}
	 * labeled alternative in {@link WolaczParser#repvalue}.
	 * @param ctx the parse tree
	 */
	void enterId3(WolaczParser.Id3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code id3}
	 * labeled alternative in {@link WolaczParser#repvalue}.
	 * @param ctx the parse tree
	 */
	void exitId3(WolaczParser.Id3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code int2}
	 * labeled alternative in {@link WolaczParser#repvalue}.
	 * @param ctx the parse tree
	 */
	void enterInt2(WolaczParser.Int2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code int2}
	 * labeled alternative in {@link WolaczParser#repvalue}.
	 * @param ctx the parse tree
	 */
	void exitInt2(WolaczParser.Int2Context ctx);
	/**
	 * Enter a parse tree produced by {@link WolaczParser#ifblock}.
	 * @param ctx the parse tree
	 */
	void enterIfblock(WolaczParser.IfblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link WolaczParser#ifblock}.
	 * @param ctx the parse tree
	 */
	void exitIfblock(WolaczParser.IfblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link WolaczParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(WolaczParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link WolaczParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(WolaczParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single0}
	 * labeled alternative in {@link WolaczParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterSingle0(WolaczParser.Single0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single0}
	 * labeled alternative in {@link WolaczParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitSingle0(WolaczParser.Single0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link WolaczParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterAdd(WolaczParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link WolaczParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitAdd(WolaczParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolexpr}
	 * labeled alternative in {@link WolaczParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr(WolaczParser.BoolexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolexpr}
	 * labeled alternative in {@link WolaczParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr(WolaczParser.BoolexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single1}
	 * labeled alternative in {@link WolaczParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterSingle1(WolaczParser.Single1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single1}
	 * labeled alternative in {@link WolaczParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitSingle1(WolaczParser.Single1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link WolaczParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterString(WolaczParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link WolaczParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitString(WolaczParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link WolaczParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterMult(WolaczParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link WolaczParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitMult(WolaczParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single2}
	 * labeled alternative in {@link WolaczParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterSingle2(WolaczParser.Single2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single2}
	 * labeled alternative in {@link WolaczParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitSingle2(WolaczParser.Single2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link WolaczParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterSub(WolaczParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link WolaczParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitSub(WolaczParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single3}
	 * labeled alternative in {@link WolaczParser#expr3}.
	 * @param ctx the parse tree
	 */
	void enterSingle3(WolaczParser.Single3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single3}
	 * labeled alternative in {@link WolaczParser#expr3}.
	 * @param ctx the parse tree
	 */
	void exitSingle3(WolaczParser.Single3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link WolaczParser#expr3}.
	 * @param ctx the parse tree
	 */
	void enterDiv(WolaczParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link WolaczParser#expr3}.
	 * @param ctx the parse tree
	 */
	void exitDiv(WolaczParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link WolaczParser#expr4}.
	 * @param ctx the parse tree
	 */
	void enterInt(WolaczParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link WolaczParser#expr4}.
	 * @param ctx the parse tree
	 */
	void exitInt(WolaczParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link WolaczParser#expr4}.
	 * @param ctx the parse tree
	 */
	void enterFloat(WolaczParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link WolaczParser#expr4}.
	 * @param ctx the parse tree
	 */
	void exitFloat(WolaczParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id1}
	 * labeled alternative in {@link WolaczParser#expr4}.
	 * @param ctx the parse tree
	 */
	void enterId1(WolaczParser.Id1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code id1}
	 * labeled alternative in {@link WolaczParser#expr4}.
	 * @param ctx the parse tree
	 */
	void exitId1(WolaczParser.Id1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code array}
	 * labeled alternative in {@link WolaczParser#expr4}.
	 * @param ctx the parse tree
	 */
	void enterArray(WolaczParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array}
	 * labeled alternative in {@link WolaczParser#expr4}.
	 * @param ctx the parse tree
	 */
	void exitArray(WolaczParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toint}
	 * labeled alternative in {@link WolaczParser#expr4}.
	 * @param ctx the parse tree
	 */
	void enterToint(WolaczParser.TointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toint}
	 * labeled alternative in {@link WolaczParser#expr4}.
	 * @param ctx the parse tree
	 */
	void exitToint(WolaczParser.TointContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tofloat}
	 * labeled alternative in {@link WolaczParser#expr4}.
	 * @param ctx the parse tree
	 */
	void enterTofloat(WolaczParser.TofloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tofloat}
	 * labeled alternative in {@link WolaczParser#expr4}.
	 * @param ctx the parse tree
	 */
	void exitTofloat(WolaczParser.TofloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functioncall}
	 * labeled alternative in {@link WolaczParser#expr4}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(WolaczParser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functioncall}
	 * labeled alternative in {@link WolaczParser#expr4}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(WolaczParser.FunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code par}
	 * labeled alternative in {@link WolaczParser#expr4}.
	 * @param ctx the parse tree
	 */
	void enterPar(WolaczParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code par}
	 * labeled alternative in {@link WolaczParser#expr4}.
	 * @param ctx the parse tree
	 */
	void exitPar(WolaczParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by {@link WolaczParser#funccall}.
	 * @param ctx the parse tree
	 */
	void enterFunccall(WolaczParser.FunccallContext ctx);
	/**
	 * Exit a parse tree produced by {@link WolaczParser#funccall}.
	 * @param ctx the parse tree
	 */
	void exitFunccall(WolaczParser.FunccallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singlebool0}
	 * labeled alternative in {@link WolaczParser#boolExpr0}.
	 * @param ctx the parse tree
	 */
	void enterSinglebool0(WolaczParser.Singlebool0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code singlebool0}
	 * labeled alternative in {@link WolaczParser#boolExpr0}.
	 * @param ctx the parse tree
	 */
	void exitSinglebool0(WolaczParser.Singlebool0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link WolaczParser#boolExpr0}.
	 * @param ctx the parse tree
	 */
	void enterAnd(WolaczParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link WolaczParser#boolExpr0}.
	 * @param ctx the parse tree
	 */
	void exitAnd(WolaczParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singlebool1}
	 * labeled alternative in {@link WolaczParser#boolExpr1}.
	 * @param ctx the parse tree
	 */
	void enterSinglebool1(WolaczParser.Singlebool1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code singlebool1}
	 * labeled alternative in {@link WolaczParser#boolExpr1}.
	 * @param ctx the parse tree
	 */
	void exitSinglebool1(WolaczParser.Singlebool1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link WolaczParser#boolExpr1}.
	 * @param ctx the parse tree
	 */
	void enterOr(WolaczParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link WolaczParser#boolExpr1}.
	 * @param ctx the parse tree
	 */
	void exitOr(WolaczParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singlebool2}
	 * labeled alternative in {@link WolaczParser#boolExpr2}.
	 * @param ctx the parse tree
	 */
	void enterSinglebool2(WolaczParser.Singlebool2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code singlebool2}
	 * labeled alternative in {@link WolaczParser#boolExpr2}.
	 * @param ctx the parse tree
	 */
	void exitSinglebool2(WolaczParser.Singlebool2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code xor}
	 * labeled alternative in {@link WolaczParser#boolExpr2}.
	 * @param ctx the parse tree
	 */
	void enterXor(WolaczParser.XorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xor}
	 * labeled alternative in {@link WolaczParser#boolExpr2}.
	 * @param ctx the parse tree
	 */
	void exitXor(WolaczParser.XorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singlebool3}
	 * labeled alternative in {@link WolaczParser#boolExpr3}.
	 * @param ctx the parse tree
	 */
	void enterSinglebool3(WolaczParser.Singlebool3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code singlebool3}
	 * labeled alternative in {@link WolaczParser#boolExpr3}.
	 * @param ctx the parse tree
	 */
	void exitSinglebool3(WolaczParser.Singlebool3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code neg}
	 * labeled alternative in {@link WolaczParser#boolExpr3}.
	 * @param ctx the parse tree
	 */
	void enterNeg(WolaczParser.NegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code neg}
	 * labeled alternative in {@link WolaczParser#boolExpr3}.
	 * @param ctx the parse tree
	 */
	void exitNeg(WolaczParser.NegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link WolaczParser#boolExpr4}.
	 * @param ctx the parse tree
	 */
	void enterBool(WolaczParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link WolaczParser#boolExpr4}.
	 * @param ctx the parse tree
	 */
	void exitBool(WolaczParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id2}
	 * labeled alternative in {@link WolaczParser#boolExpr4}.
	 * @param ctx the parse tree
	 */
	void enterId2(WolaczParser.Id2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code id2}
	 * labeled alternative in {@link WolaczParser#boolExpr4}.
	 * @param ctx the parse tree
	 */
	void exitId2(WolaczParser.Id2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code boolpar}
	 * labeled alternative in {@link WolaczParser#boolExpr4}.
	 * @param ctx the parse tree
	 */
	void enterBoolpar(WolaczParser.BoolparContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolpar}
	 * labeled alternative in {@link WolaczParser#boolExpr4}.
	 * @param ctx the parse tree
	 */
	void exitBoolpar(WolaczParser.BoolparContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intarray}
	 * labeled alternative in {@link WolaczParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntarray(WolaczParser.IntarrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intarray}
	 * labeled alternative in {@link WolaczParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntarray(WolaczParser.IntarrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatarray}
	 * labeled alternative in {@link WolaczParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void enterFloatarray(WolaczParser.FloatarrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatarray}
	 * labeled alternative in {@link WolaczParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void exitFloatarray(WolaczParser.FloatarrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link WolaczParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(WolaczParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WolaczParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(WolaczParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WolaczParser#fname}.
	 * @param ctx the parse tree
	 */
	void enterFname(WolaczParser.FnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link WolaczParser#fname}.
	 * @param ctx the parse tree
	 */
	void exitFname(WolaczParser.FnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link WolaczParser#fparam}.
	 * @param ctx the parse tree
	 */
	void enterFparam(WolaczParser.FparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link WolaczParser#fparam}.
	 * @param ctx the parse tree
	 */
	void exitFparam(WolaczParser.FparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link WolaczParser#fblock}.
	 * @param ctx the parse tree
	 */
	void enterFblock(WolaczParser.FblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link WolaczParser#fblock}.
	 * @param ctx the parse tree
	 */
	void exitFblock(WolaczParser.FblockContext ctx);
}