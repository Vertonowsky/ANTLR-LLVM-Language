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
	 * Visit a parse tree produced by {@link LangXParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LangXParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangXParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LangXParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangXParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(LangXParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangXParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(LangXParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangXParser#ioStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIoStatement(LangXParser.IoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangXParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(LangXParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangXParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LangXParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangXParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(LangXParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangXParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(LangXParser.TypeContext ctx);
}