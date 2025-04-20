// Generated from C:/Users/Bartek/IdeaProjects/wolacz/grammar/Wolacz.g4 by ANTLR 4.13.2
package org.vertonowsky.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WolaczParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WolaczVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WolaczParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(WolaczParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link WolaczParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(WolaczParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link WolaczParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(WolaczParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link WolaczParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(WolaczParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code write}
	 * labeled alternative in {@link WolaczParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(WolaczParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link WolaczParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(WolaczParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code read}
	 * labeled alternative in {@link WolaczParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(WolaczParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link WolaczParser#repetitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetitions(WolaczParser.RepetitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id3}
	 * labeled alternative in {@link WolaczParser#repvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId3(WolaczParser.Id3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code int2}
	 * labeled alternative in {@link WolaczParser#repvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt2(WolaczParser.Int2Context ctx);
	/**
	 * Visit a parse tree produced by {@link WolaczParser#ifblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfblock(WolaczParser.IfblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link WolaczParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(WolaczParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single0}
	 * labeled alternative in {@link WolaczParser#expr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle0(WolaczParser.Single0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link WolaczParser#expr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(WolaczParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolexpr}
	 * labeled alternative in {@link WolaczParser#expr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexpr(WolaczParser.BoolexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single1}
	 * labeled alternative in {@link WolaczParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle1(WolaczParser.Single1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link WolaczParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(WolaczParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link WolaczParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(WolaczParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single2}
	 * labeled alternative in {@link WolaczParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle2(WolaczParser.Single2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link WolaczParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(WolaczParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single3}
	 * labeled alternative in {@link WolaczParser#expr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle3(WolaczParser.Single3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link WolaczParser#expr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(WolaczParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link WolaczParser#expr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(WolaczParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link WolaczParser#expr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(WolaczParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id1}
	 * labeled alternative in {@link WolaczParser#expr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId1(WolaczParser.Id1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code array}
	 * labeled alternative in {@link WolaczParser#expr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(WolaczParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toint}
	 * labeled alternative in {@link WolaczParser#expr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToint(WolaczParser.TointContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tofloat}
	 * labeled alternative in {@link WolaczParser#expr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTofloat(WolaczParser.TofloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functioncall}
	 * labeled alternative in {@link WolaczParser#expr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(WolaczParser.FunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code par}
	 * labeled alternative in {@link WolaczParser#expr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(WolaczParser.ParContext ctx);
	/**
	 * Visit a parse tree produced by {@link WolaczParser#funccall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunccall(WolaczParser.FunccallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singlebool0}
	 * labeled alternative in {@link WolaczParser#boolExpr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinglebool0(WolaczParser.Singlebool0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link WolaczParser#boolExpr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(WolaczParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singlebool1}
	 * labeled alternative in {@link WolaczParser#boolExpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinglebool1(WolaczParser.Singlebool1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link WolaczParser#boolExpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(WolaczParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singlebool2}
	 * labeled alternative in {@link WolaczParser#boolExpr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinglebool2(WolaczParser.Singlebool2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code xor}
	 * labeled alternative in {@link WolaczParser#boolExpr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor(WolaczParser.XorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singlebool3}
	 * labeled alternative in {@link WolaczParser#boolExpr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinglebool3(WolaczParser.Singlebool3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code neg}
	 * labeled alternative in {@link WolaczParser#boolExpr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeg(WolaczParser.NegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link WolaczParser#boolExpr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(WolaczParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id2}
	 * labeled alternative in {@link WolaczParser#boolExpr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId2(WolaczParser.Id2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code boolpar}
	 * labeled alternative in {@link WolaczParser#boolExpr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolpar(WolaczParser.BoolparContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intarray}
	 * labeled alternative in {@link WolaczParser#arrayExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntarray(WolaczParser.IntarrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatarray}
	 * labeled alternative in {@link WolaczParser#arrayExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatarray(WolaczParser.FloatarrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link WolaczParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(WolaczParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WolaczParser#fname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFname(WolaczParser.FnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link WolaczParser#fparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFparam(WolaczParser.FparamContext ctx);
	/**
	 * Visit a parse tree produced by {@link WolaczParser#fblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFblock(WolaczParser.FblockContext ctx);
}