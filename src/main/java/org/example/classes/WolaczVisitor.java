// Generated from C:/Users/Bartek/IdeaProjects/wolacz/src/main/antlr/Wolacz.g4 by ANTLR 4.13.2
package org.example.classes;
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
	 * Visit a parse tree produced by {@link WolaczParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(WolaczParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WolaczParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(WolaczParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link WolaczParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(WolaczParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link WolaczParser#ioStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIoStatement(WolaczParser.IoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WolaczParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(WolaczParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WolaczParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(WolaczParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WolaczParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(WolaczParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link WolaczParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(WolaczParser.TypeContext ctx);
}