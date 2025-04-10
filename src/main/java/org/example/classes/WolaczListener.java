// Generated from D:/SZKOLA/Studia/PW/Semestr_I/JIFK/src/main/antlr/Wolacz.g4 by ANTLR 4.13.2
package org.example.classes;
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
	 * Enter a parse tree produced by {@link WolaczParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(WolaczParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WolaczParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(WolaczParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WolaczParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(WolaczParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link WolaczParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(WolaczParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link WolaczParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(WolaczParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WolaczParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(WolaczParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WolaczParser#ioStatement}.
	 * @param ctx the parse tree
	 */
	void enterIoStatement(WolaczParser.IoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WolaczParser#ioStatement}.
	 * @param ctx the parse tree
	 */
	void exitIoStatement(WolaczParser.IoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WolaczParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(WolaczParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WolaczParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(WolaczParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WolaczParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(WolaczParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WolaczParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(WolaczParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WolaczParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(WolaczParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link WolaczParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(WolaczParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link WolaczParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(WolaczParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WolaczParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(WolaczParser.TypeContext ctx);
}