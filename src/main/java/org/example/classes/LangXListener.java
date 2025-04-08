// Generated from C:/Users/Bartek/IdeaProjects/wolacz/src/main/antlr/LangX.g4 by ANTLR 4.13.2
package org.example.classes;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangXParser}.
 */
public interface LangXListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LangXParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LangXParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LangXParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangXParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LangXParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LangXParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangXParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(LangXParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(LangXParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangXParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(LangXParser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(LangXParser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangXParser#matrixDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMatrixDeclaration(LangXParser.MatrixDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#matrixDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMatrixDeclaration(LangXParser.MatrixDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangXParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(LangXParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(LangXParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangXParser#ioStatement}.
	 * @param ctx the parse tree
	 */
	void enterIoStatement(LangXParser.IoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#ioStatement}.
	 * @param ctx the parse tree
	 */
	void exitIoStatement(LangXParser.IoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangXParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(LangXParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(LangXParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangXParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LangXParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LangXParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangXParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(LangXParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(LangXParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangXParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(LangXParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(LangXParser.TypeContext ctx);
}