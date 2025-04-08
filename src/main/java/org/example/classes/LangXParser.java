// Generated from C:/Users/Bartek/IdeaProjects/wolacz/src/main/antlr/LangX.g4 by ANTLR 4.13.2
package org.example.classes;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LangXParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, ADD=16, SUB=17, 
		MUL=18, DIV=19, AND=20, OR=21, XOR=22, NEG=23, READ=24, PRINT=25, INT=26, 
		FLOAT=27, STRING=28, BOOL=29, ID=30, WS=31;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_variableDeclaration = 2, RULE_arrayDeclaration = 3, 
		RULE_matrixDeclaration = 4, RULE_assignment = 5, RULE_ioStatement = 6, 
		RULE_expressionStatement = 7, RULE_expression = 8, RULE_value = 9, RULE_type = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "variableDeclaration", "arrayDeclaration", "matrixDeclaration", 
			"assignment", "ioStatement", "expressionStatement", "expression", "value", 
			"type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'['", "']'", "'{'", "','", "'}'", "'('", "')'", 
			"'int'", "'float'", "'Float32'", "'Float64'", "'bool'", "'string'", "'+'", 
			"'-'", "'*'", "'/'", "'AND'", "'OR'", "'XOR'", "'NEG'", "'read'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "ADD", "SUB", "MUL", "DIV", "AND", "OR", "XOR", 
			"NEG", "READ", "PRINT", "INT", "FLOAT", "STRING", "BOOL", "ID", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LangX.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LangXParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LangXParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangXVisitor ) return ((LangXVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2139159808L) != 0)) {
				{
				{
				setState(22);
				statement();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public MatrixDeclarationContext matrixDeclaration() {
			return getRuleContext(MatrixDeclarationContext.class,0);
		}
		public IoStatementContext ioStatement() {
			return getRuleContext(IoStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangXVisitor ) return ((LangXVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				variableDeclaration();
				setState(31);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				assignment();
				setState(34);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				arrayDeclaration();
				setState(37);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				matrixDeclaration();
				setState(40);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				ioStatement();
				setState(43);
				match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(45);
				expressionStatement();
				setState(46);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangXVisitor ) return ((LangXVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			type();
			setState(51);
			match(ID);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(52);
				match(T__1);
				setState(53);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public TerminalNode INT() { return getToken(LangXParser.INT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangXVisitor ) return ((LangXVisitor<? extends T>)visitor).visitArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arrayDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			type();
			setState(57);
			match(ID);
			setState(58);
			match(T__2);
			setState(59);
			match(INT);
			setState(60);
			match(T__3);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(61);
				match(T__1);
				setState(62);
				match(T__4);
				setState(63);
				expression(0);
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(64);
					match(T__5);
					setState(65);
					expression(0);
					}
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(71);
				match(T__6);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatrixDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public List<TerminalNode> INT() { return getTokens(LangXParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LangXParser.INT, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MatrixDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterMatrixDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitMatrixDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangXVisitor ) return ((LangXVisitor<? extends T>)visitor).visitMatrixDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrixDeclarationContext matrixDeclaration() throws RecognitionException {
		MatrixDeclarationContext _localctx = new MatrixDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_matrixDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			type();
			setState(76);
			match(ID);
			setState(77);
			match(T__2);
			setState(78);
			match(INT);
			setState(79);
			match(T__3);
			setState(80);
			match(T__2);
			setState(81);
			match(INT);
			setState(82);
			match(T__3);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(83);
				match(T__1);
				setState(84);
				match(T__4);
				setState(85);
				match(T__4);
				setState(86);
				expression(0);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(87);
					match(T__5);
					setState(88);
					expression(0);
					}
					}
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(94);
				match(T__6);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(95);
					match(T__5);
					setState(96);
					match(T__4);
					setState(97);
					expression(0);
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(98);
						match(T__5);
						setState(99);
						expression(0);
						}
						}
						setState(104);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(105);
					match(T__6);
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(112);
				match(T__6);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangXVisitor ) return ((LangXVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(ID);
				setState(117);
				match(T__1);
				setState(118);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(ID);
				setState(120);
				match(T__2);
				setState(121);
				expression(0);
				setState(122);
				match(T__3);
				setState(123);
				match(T__1);
				setState(124);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				match(ID);
				setState(127);
				match(T__2);
				setState(128);
				expression(0);
				setState(129);
				match(T__3);
				setState(130);
				match(T__2);
				setState(131);
				expression(0);
				setState(132);
				match(T__3);
				setState(133);
				match(T__1);
				setState(134);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IoStatementContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(LangXParser.READ, 0); }
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public TerminalNode PRINT() { return getToken(LangXParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ioStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterIoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitIoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangXVisitor ) return ((LangXVisitor<? extends T>)visitor).visitIoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IoStatementContext ioStatement() throws RecognitionException {
		IoStatementContext _localctx = new IoStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ioStatement);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(READ);
				setState(139);
				match(T__7);
				setState(140);
				match(ID);
				setState(141);
				match(T__8);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(PRINT);
				setState(143);
				match(T__7);
				setState(144);
				expression(0);
				setState(145);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangXVisitor ) return ((LangXVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEG() { return getToken(LangXParser.NEG, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode MUL() { return getToken(LangXParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LangXParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(LangXParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(LangXParser.SUB, 0); }
		public TerminalNode AND() { return getToken(LangXParser.AND, 0); }
		public TerminalNode OR() { return getToken(LangXParser.OR, 0); }
		public TerminalNode XOR() { return getToken(LangXParser.XOR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangXVisitor ) return ((LangXVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(152);
				match(T__7);
				setState(153);
				expression(0);
				setState(154);
				match(T__8);
				}
				break;
			case NEG:
				{
				setState(156);
				match(NEG);
				setState(157);
				expression(5);
				}
				break;
			case INT:
			case FLOAT:
			case STRING:
			case BOOL:
			case ID:
				{
				setState(158);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(170);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(161);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(162);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(163);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(164);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(165);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(166);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(167);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(168);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(169);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LangXParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(LangXParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(LangXParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(LangXParser.BOOL, 0); }
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangXVisitor ) return ((LangXVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2080374784L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangXVisitor ) return ((LangXVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 64512L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u00b4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0005\u0000"+
		"\u0018\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u00011\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u00027\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003C\b\u0003\n\u0003\f\u0003F\t\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003J\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004Z\b\u0004\n\u0004"+
		"\f\u0004]\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004e\b\u0004\n\u0004\f\u0004h\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004l\b\u0004\n\u0004\f\u0004o\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004s\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0089\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0094"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u00a0\b\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00ab\b\b\n\b\f\b\u00ae"+
		"\t\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0000\u0001\u0010\u000b\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0005\u0001\u0000"+
		"\u0012\u0013\u0001\u0000\u0010\u0011\u0001\u0000\u0014\u0016\u0001\u0000"+
		"\u001a\u001e\u0001\u0000\n\u000f\u00bd\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u00020\u0001\u0000\u0000\u0000\u00042\u0001\u0000\u0000\u0000\u00068"+
		"\u0001\u0000\u0000\u0000\bK\u0001\u0000\u0000\u0000\n\u0088\u0001\u0000"+
		"\u0000\u0000\f\u0093\u0001\u0000\u0000\u0000\u000e\u0095\u0001\u0000\u0000"+
		"\u0000\u0010\u009f\u0001\u0000\u0000\u0000\u0012\u00af\u0001\u0000\u0000"+
		"\u0000\u0014\u00b1\u0001\u0000\u0000\u0000\u0016\u0018\u0003\u0002\u0001"+
		"\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000"+
		"\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000"+
		"\u0000\u001a\u001c\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0005\u0000\u0000\u0001\u001d\u0001\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0003\u0004\u0002\u0000\u001f \u0005\u0001\u0000\u0000"+
		" 1\u0001\u0000\u0000\u0000!\"\u0003\n\u0005\u0000\"#\u0005\u0001\u0000"+
		"\u0000#1\u0001\u0000\u0000\u0000$%\u0003\u0006\u0003\u0000%&\u0005\u0001"+
		"\u0000\u0000&1\u0001\u0000\u0000\u0000\'(\u0003\b\u0004\u0000()\u0005"+
		"\u0001\u0000\u0000)1\u0001\u0000\u0000\u0000*+\u0003\f\u0006\u0000+,\u0005"+
		"\u0001\u0000\u0000,1\u0001\u0000\u0000\u0000-.\u0003\u000e\u0007\u0000"+
		"./\u0005\u0001\u0000\u0000/1\u0001\u0000\u0000\u00000\u001e\u0001\u0000"+
		"\u0000\u00000!\u0001\u0000\u0000\u00000$\u0001\u0000\u0000\u00000\'\u0001"+
		"\u0000\u0000\u00000*\u0001\u0000\u0000\u00000-\u0001\u0000\u0000\u0000"+
		"1\u0003\u0001\u0000\u0000\u000023\u0003\u0014\n\u000036\u0005\u001e\u0000"+
		"\u000045\u0005\u0002\u0000\u000057\u0003\u0010\b\u000064\u0001\u0000\u0000"+
		"\u000067\u0001\u0000\u0000\u00007\u0005\u0001\u0000\u0000\u000089\u0003"+
		"\u0014\n\u00009:\u0005\u001e\u0000\u0000:;\u0005\u0003\u0000\u0000;<\u0005"+
		"\u001a\u0000\u0000<I\u0005\u0004\u0000\u0000=>\u0005\u0002\u0000\u0000"+
		">?\u0005\u0005\u0000\u0000?D\u0003\u0010\b\u0000@A\u0005\u0006\u0000\u0000"+
		"AC\u0003\u0010\b\u0000B@\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000"+
		"DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EG\u0001\u0000\u0000"+
		"\u0000FD\u0001\u0000\u0000\u0000GH\u0005\u0007\u0000\u0000HJ\u0001\u0000"+
		"\u0000\u0000I=\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000J\u0007"+
		"\u0001\u0000\u0000\u0000KL\u0003\u0014\n\u0000LM\u0005\u001e\u0000\u0000"+
		"MN\u0005\u0003\u0000\u0000NO\u0005\u001a\u0000\u0000OP\u0005\u0004\u0000"+
		"\u0000PQ\u0005\u0003\u0000\u0000QR\u0005\u001a\u0000\u0000Rr\u0005\u0004"+
		"\u0000\u0000ST\u0005\u0002\u0000\u0000TU\u0005\u0005\u0000\u0000UV\u0005"+
		"\u0005\u0000\u0000V[\u0003\u0010\b\u0000WX\u0005\u0006\u0000\u0000XZ\u0003"+
		"\u0010\b\u0000YW\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000"+
		"][\u0001\u0000\u0000\u0000^m\u0005\u0007\u0000\u0000_`\u0005\u0006\u0000"+
		"\u0000`a\u0005\u0005\u0000\u0000af\u0003\u0010\b\u0000bc\u0005\u0006\u0000"+
		"\u0000ce\u0003\u0010\b\u0000db\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0005\u0007\u0000\u0000jl\u0001"+
		"\u0000\u0000\u0000k_\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000"+
		"\u0000om\u0001\u0000\u0000\u0000pq\u0005\u0007\u0000\u0000qs\u0001\u0000"+
		"\u0000\u0000rS\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s\t\u0001"+
		"\u0000\u0000\u0000tu\u0005\u001e\u0000\u0000uv\u0005\u0002\u0000\u0000"+
		"v\u0089\u0003\u0010\b\u0000wx\u0005\u001e\u0000\u0000xy\u0005\u0003\u0000"+
		"\u0000yz\u0003\u0010\b\u0000z{\u0005\u0004\u0000\u0000{|\u0005\u0002\u0000"+
		"\u0000|}\u0003\u0010\b\u0000}\u0089\u0001\u0000\u0000\u0000~\u007f\u0005"+
		"\u001e\u0000\u0000\u007f\u0080\u0005\u0003\u0000\u0000\u0080\u0081\u0003"+
		"\u0010\b\u0000\u0081\u0082\u0005\u0004\u0000\u0000\u0082\u0083\u0005\u0003"+
		"\u0000\u0000\u0083\u0084\u0003\u0010\b\u0000\u0084\u0085\u0005\u0004\u0000"+
		"\u0000\u0085\u0086\u0005\u0002\u0000\u0000\u0086\u0087\u0003\u0010\b\u0000"+
		"\u0087\u0089\u0001\u0000\u0000\u0000\u0088t\u0001\u0000\u0000\u0000\u0088"+
		"w\u0001\u0000\u0000\u0000\u0088~\u0001\u0000\u0000\u0000\u0089\u000b\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0005\u0018\u0000\u0000\u008b\u008c\u0005"+
		"\b\u0000\u0000\u008c\u008d\u0005\u001e\u0000\u0000\u008d\u0094\u0005\t"+
		"\u0000\u0000\u008e\u008f\u0005\u0019\u0000\u0000\u008f\u0090\u0005\b\u0000"+
		"\u0000\u0090\u0091\u0003\u0010\b\u0000\u0091\u0092\u0005\t\u0000\u0000"+
		"\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u008a\u0001\u0000\u0000\u0000"+
		"\u0093\u008e\u0001\u0000\u0000\u0000\u0094\r\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0003\u0010\b\u0000\u0096\u000f\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0006\b\uffff\uffff\u0000\u0098\u0099\u0005\b\u0000\u0000\u0099\u009a"+
		"\u0003\u0010\b\u0000\u009a\u009b\u0005\t\u0000\u0000\u009b\u00a0\u0001"+
		"\u0000\u0000\u0000\u009c\u009d\u0005\u0017\u0000\u0000\u009d\u00a0\u0003"+
		"\u0010\b\u0005\u009e\u00a0\u0003\u0012\t\u0000\u009f\u0097\u0001\u0000"+
		"\u0000\u0000\u009f\u009c\u0001\u0000\u0000\u0000\u009f\u009e\u0001\u0000"+
		"\u0000\u0000\u00a0\u00ac\u0001\u0000\u0000\u0000\u00a1\u00a2\n\u0004\u0000"+
		"\u0000\u00a2\u00a3\u0007\u0000\u0000\u0000\u00a3\u00ab\u0003\u0010\b\u0005"+
		"\u00a4\u00a5\n\u0003\u0000\u0000\u00a5\u00a6\u0007\u0001\u0000\u0000\u00a6"+
		"\u00ab\u0003\u0010\b\u0004\u00a7\u00a8\n\u0002\u0000\u0000\u00a8\u00a9"+
		"\u0007\u0002\u0000\u0000\u00a9\u00ab\u0003\u0010\b\u0003\u00aa\u00a1\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a4\u0001\u0000\u0000\u0000\u00aa\u00a7\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u0011\u0001"+
		"\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b0\u0007"+
		"\u0003\u0000\u0000\u00b0\u0013\u0001\u0000\u0000\u0000\u00b1\u00b2\u0007"+
		"\u0004\u0000\u0000\u00b2\u0015\u0001\u0000\u0000\u0000\u000e\u001906D"+
		"I[fmr\u0088\u0093\u009f\u00aa\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}