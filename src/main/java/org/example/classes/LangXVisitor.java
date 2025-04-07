// Generated from C:/Users/Bartek/IdeaProjects/wolacz/src/main/antlr/LangX.g4 by ANTLR 4.13.2
package org.example.classes;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LangXParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LangXVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LangXParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LangXParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(LangXParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code read}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(LangXParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(LangXParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single0}
	 * labeled alternative in {@link LangXParser#expr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle0(LangXParser.Single0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link LangXParser#expr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(LangXParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link LangXParser#expr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(LangXParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single1}
	 * labeled alternative in {@link LangXParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle1(LangXParser.Single1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link LangXParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(LangXParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link LangXParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(LangXParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idd}
	 * labeled alternative in {@link LangXParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdd(LangXParser.IddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LangXParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(LangXParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code real}
	 * labeled alternative in {@link LangXParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(LangXParser.RealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toint}
	 * labeled alternative in {@link LangXParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToint(LangXParser.TointContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toreal}
	 * labeled alternative in {@link LangXParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToreal(LangXParser.TorealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code par}
	 * labeled alternative in {@link LangXParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(LangXParser.ParContext ctx);
}