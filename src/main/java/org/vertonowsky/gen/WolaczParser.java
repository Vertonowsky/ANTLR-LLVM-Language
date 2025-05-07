// Generated from C:/Users/Bartek/IdeaProjects/wolacz/grammar/Wolacz.g4 by ANTLR 4.13.2
package org.vertonowsky.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class WolaczParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, TOINT=13, TOFLOAT=14, FTYPE=15, WRITE=16, 
		READ=17, FUNCTION=18, ENDFUNCTION=19, REPEAT=20, ENDREPEAT=21, IF=22, 
		ENDIF=23, STRING=24, BOOL=25, ID=26, INT=27, FLOAT=28, FLOAT64=29, ADD=30, 
		MULT=31, DIV=32, SUB=33, AND=34, OR=35, XOR=36, NEG=37, NEWLINE=38, WS=39;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_operation = 2, RULE_repetitions = 3, 
		RULE_repvalue = 4, RULE_ifblock = 5, RULE_cond = 6, RULE_expr0 = 7, RULE_expr1 = 8, 
		RULE_expr2 = 9, RULE_expr3 = 10, RULE_expr4 = 11, RULE_funccall = 12, 
		RULE_boolExpr0 = 13, RULE_boolExpr1 = 14, RULE_boolExpr2 = 15, RULE_boolExpr3 = 16, 
		RULE_boolExpr4 = 17, RULE_function = 18, RULE_fname = 19, RULE_fparam = 20, 
		RULE_fblock = 21, RULE_arrayType = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "operation", "repetitions", "repvalue", "ifblock", 
			"cond", "expr0", "expr1", "expr2", "expr3", "expr4", "funccall", "boolExpr0", 
			"boolExpr1", "boolExpr2", "boolExpr3", "boolExpr4", "function", "fname", 
			"fparam", "fblock", "arrayType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'('", "')'", "'='", "'['", "']'", "'=='", "','", "'):'", 
			"'return'", "'int[]'", "'float[]'", "'(int)'", "'(float)'", null, "'write'", 
			"'read'", "'function'", "'endfunction'", "'repeat'", "'endrepeat'", "'if'", 
			"'endif'", null, null, null, null, null, null, "'+'", "'*'", "'/'", "'-'", 
			"'&&'", "'||'", "'^'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "TOINT", "TOFLOAT", "FTYPE", "WRITE", "READ", "FUNCTION", "ENDFUNCTION", 
			"REPEAT", "ENDREPEAT", "IF", "ENDIF", "STRING", "BOOL", "ID", "INT", 
			"FLOAT", "FLOAT64", "ADD", "MULT", "DIV", "SUB", "AND", "OR", "XOR", 
			"NEG", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "Wolacz.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WolaczParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			block();
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
	public static class BlockContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(WolaczParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(WolaczParser.NEWLINE, i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 274950723584L) != 0)) {
				{
				{
				setState(50);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
				case T__11:
				case WRITE:
				case READ:
				case REPEAT:
				case IF:
				case ID:
					{
					setState(48);
					operation();
					}
					break;
				case FUNCTION:
					{
					setState(49);
					function();
					}
					break;
				case NEWLINE:
					break;
				default:
					break;
				}
				setState(52);
				match(NEWLINE);
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class OperationContext extends ParserRuleContext {
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	 
		public OperationContext() { }
		public void copyFrom(OperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadContext extends OperationContext {
		public TerminalNode READ() { return getToken(WolaczParser.READ, 0); }
		public TerminalNode ID() { return getToken(WolaczParser.ID, 0); }
		public ReadContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RepeatContext extends OperationContext {
		public TerminalNode REPEAT() { return getToken(WolaczParser.REPEAT, 0); }
		public RepetitionsContext repetitions() {
			return getRuleContext(RepetitionsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ENDREPEAT() { return getToken(WolaczParser.ENDREPEAT, 0); }
		public RepeatContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewArrayContext extends OperationContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(WolaczParser.ID, 0); }
		public List<TerminalNode> INT() { return getTokens(WolaczParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(WolaczParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(WolaczParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(WolaczParser.FLOAT, i);
		}
		public NewArrayContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitNewArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitNewArray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends OperationContext {
		public TerminalNode IF() { return getToken(WolaczParser.IF, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public IfblockContext ifblock() {
			return getRuleContext(IfblockContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(WolaczParser.ENDIF, 0); }
		public IfContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WriteContext extends OperationContext {
		public TerminalNode WRITE() { return getToken(WolaczParser.WRITE, 0); }
		public TerminalNode ID() { return getToken(WolaczParser.ID, 0); }
		public WriteContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends OperationContext {
		public TerminalNode ID() { return getToken(WolaczParser.ID, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public AssignContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operation);
		int _la;
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REPEAT:
				_localctx = new RepeatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(REPEAT);
				setState(59);
				repetitions();
				setState(60);
				match(T__0);
				setState(61);
				block();
				setState(62);
				match(ENDREPEAT);
				}
				break;
			case IF:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(IF);
				setState(65);
				cond();
				setState(66);
				match(T__0);
				setState(67);
				ifblock();
				setState(68);
				match(ENDIF);
				}
				break;
			case WRITE:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				match(WRITE);
				setState(71);
				match(T__1);
				setState(72);
				match(ID);
				setState(73);
				match(T__2);
				}
				break;
			case ID:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				match(ID);
				setState(75);
				match(T__3);
				setState(76);
				expr0();
				}
				break;
			case READ:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(77);
				match(READ);
				setState(78);
				match(T__1);
				setState(79);
				match(ID);
				setState(80);
				match(T__2);
				}
				break;
			case T__10:
			case T__11:
				_localctx = new NewArrayContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				arrayType();
				setState(82);
				match(ID);
				setState(83);
				match(T__3);
				setState(84);
				match(T__4);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==INT || _la==FLOAT) {
					{
					{
					setState(85);
					_la = _input.LA(1);
					if ( !(_la==INT || _la==FLOAT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(91);
				match(T__5);
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
	public static class RepetitionsContext extends ParserRuleContext {
		public RepvalueContext repvalue() {
			return getRuleContext(RepvalueContext.class,0);
		}
		public RepetitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterRepetitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitRepetitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitRepetitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepetitionsContext repetitions() throws RecognitionException {
		RepetitionsContext _localctx = new RepetitionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_repetitions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			repvalue();
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
	public static class RepvalueContext extends ParserRuleContext {
		public RepvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repvalue; }
	 
		public RepvalueContext() { }
		public void copyFrom(RepvalueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Int2Context extends RepvalueContext {
		public TerminalNode INT() { return getToken(WolaczParser.INT, 0); }
		public Int2Context(RepvalueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterInt2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitInt2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitInt2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Id3Context extends RepvalueContext {
		public TerminalNode ID() { return getToken(WolaczParser.ID, 0); }
		public Id3Context(RepvalueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterId3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitId3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitId3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepvalueContext repvalue() throws RecognitionException {
		RepvalueContext _localctx = new RepvalueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_repvalue);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new Id3Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(ID);
				}
				break;
			case INT:
				_localctx = new Int2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(INT);
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
	public static class IfblockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterIfblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitIfblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitIfblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfblockContext ifblock() throws RecognitionException {
		IfblockContext _localctx = new IfblockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			block();
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
	public static class CondContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(WolaczParser.ID, 0); }
		public TerminalNode INT() { return getToken(WolaczParser.INT, 0); }
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(ID);
			setState(104);
			match(T__6);
			setState(105);
			match(INT);
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
	public static class Expr0Context extends ParserRuleContext {
		public Expr0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr0; }
	 
		public Expr0Context() { }
		public void copyFrom(Expr0Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Single0Context extends Expr0Context {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Single0Context(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterSingle0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitSingle0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitSingle0(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddContext extends Expr0Context {
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public TerminalNode ADD() { return getToken(WolaczParser.ADD, 0); }
		public AddContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolexprContext extends Expr0Context {
		public BoolExpr0Context boolExpr0() {
			return getRuleContext(BoolExpr0Context.class,0);
		}
		public BoolexprContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterBoolexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitBoolexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitBoolexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr0Context expr0() throws RecognitionException {
		Expr0Context _localctx = new Expr0Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr0);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new Single0Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				expr1();
				}
				break;
			case 2:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				expr1();
				setState(109);
				match(ADD);
				setState(110);
				expr1();
				}
				break;
			case 3:
				_localctx = new BoolexprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				boolExpr0();
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
	public static class Expr1Context extends ParserRuleContext {
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	 
		public Expr1Context() { }
		public void copyFrom(Expr1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Single1Context extends Expr1Context {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Single1Context(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterSingle1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitSingle1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitSingle1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultContext extends Expr1Context {
		public List<Expr2Context> expr2() {
			return getRuleContexts(Expr2Context.class);
		}
		public Expr2Context expr2(int i) {
			return getRuleContext(Expr2Context.class,i);
		}
		public TerminalNode MULT() { return getToken(WolaczParser.MULT, 0); }
		public MultContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends Expr1Context {
		public TerminalNode STRING() { return getToken(WolaczParser.STRING, 0); }
		public StringContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr1);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new Single1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				expr2();
				}
				break;
			case 2:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(STRING);
				}
				break;
			case 3:
				_localctx = new MultContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				expr2();
				setState(118);
				match(MULT);
				setState(119);
				expr2();
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
	public static class Expr2Context extends ParserRuleContext {
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
	 
		public Expr2Context() { }
		public void copyFrom(Expr2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubContext extends Expr2Context {
		public List<Expr3Context> expr3() {
			return getRuleContexts(Expr3Context.class);
		}
		public Expr3Context expr3(int i) {
			return getRuleContext(Expr3Context.class,i);
		}
		public TerminalNode SUB() { return getToken(WolaczParser.SUB, 0); }
		public SubContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Single2Context extends Expr2Context {
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public Single2Context(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterSingle2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitSingle2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitSingle2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr2);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new Single2Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				expr3();
				}
				break;
			case 2:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				expr3();
				setState(125);
				match(SUB);
				setState(126);
				expr3();
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
	public static class Expr3Context extends ParserRuleContext {
		public Expr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr3; }
	 
		public Expr3Context() { }
		public void copyFrom(Expr3Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivContext extends Expr3Context {
		public List<Expr4Context> expr4() {
			return getRuleContexts(Expr4Context.class);
		}
		public Expr4Context expr4(int i) {
			return getRuleContext(Expr4Context.class,i);
		}
		public TerminalNode DIV() { return getToken(WolaczParser.DIV, 0); }
		public DivContext(Expr3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Single3Context extends Expr3Context {
		public Expr4Context expr4() {
			return getRuleContext(Expr4Context.class,0);
		}
		public Single3Context(Expr3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterSingle3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitSingle3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitSingle3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr3Context expr3() throws RecognitionException {
		Expr3Context _localctx = new Expr3Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr3);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new Single3Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				expr4();
				}
				break;
			case 2:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				expr4();
				setState(132);
				match(DIV);
				setState(133);
				expr4();
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
	public static class Expr4Context extends ParserRuleContext {
		public Expr4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr4; }
	 
		public Expr4Context() { }
		public void copyFrom(Expr4Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParContext extends Expr4Context {
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public ParContext(Expr4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitPar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TointContext extends Expr4Context {
		public TerminalNode TOINT() { return getToken(WolaczParser.TOINT, 0); }
		public Expr4Context expr4() {
			return getRuleContext(Expr4Context.class,0);
		}
		public TointContext(Expr4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterToint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitToint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitToint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctioncallContext extends Expr4Context {
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public FunctioncallContext(Expr4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitFunctioncall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitFunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Id1Context extends Expr4Context {
		public TerminalNode ID() { return getToken(WolaczParser.ID, 0); }
		public Id1Context(Expr4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterId1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitId1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitId1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Float64Context extends Expr4Context {
		public TerminalNode FLOAT64() { return getToken(WolaczParser.FLOAT64, 0); }
		public Float64Context(Expr4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterFloat64(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitFloat64(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitFloat64(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatContext extends Expr4Context {
		public TerminalNode FLOAT() { return getToken(WolaczParser.FLOAT, 0); }
		public FloatContext(Expr4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrElemContext extends Expr4Context {
		public TerminalNode ID() { return getToken(WolaczParser.ID, 0); }
		public TerminalNode INT() { return getToken(WolaczParser.INT, 0); }
		public ArrElemContext(Expr4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterArrElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitArrElem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitArrElem(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TofloatContext extends Expr4Context {
		public TerminalNode TOFLOAT() { return getToken(WolaczParser.TOFLOAT, 0); }
		public Expr4Context expr4() {
			return getRuleContext(Expr4Context.class,0);
		}
		public TofloatContext(Expr4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterTofloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitTofloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitTofloat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends Expr4Context {
		public TerminalNode INT() { return getToken(WolaczParser.INT, 0); }
		public IntContext(Expr4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr4Context expr4() throws RecognitionException {
		Expr4Context _localctx = new Expr4Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr4);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(INT);
				}
				break;
			case 2:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(FLOAT);
				}
				break;
			case 3:
				_localctx = new Float64Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				match(FLOAT64);
				}
				break;
			case 4:
				_localctx = new Id1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				match(ID);
				}
				break;
			case 5:
				_localctx = new TointContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(141);
				match(TOINT);
				setState(142);
				expr4();
				}
				break;
			case 6:
				_localctx = new TofloatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(143);
				match(TOFLOAT);
				setState(144);
				expr4();
				}
				break;
			case 7:
				_localctx = new FunctioncallContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(145);
				funccall();
				}
				break;
			case 8:
				_localctx = new ParContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(146);
				match(T__1);
				setState(147);
				expr0();
				setState(148);
				match(T__2);
				}
				break;
			case 9:
				_localctx = new ArrElemContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(150);
				match(ID);
				setState(151);
				match(T__4);
				setState(152);
				match(INT);
				setState(153);
				match(T__5);
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
	public static class FunccallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(WolaczParser.ID, 0); }
		public List<Expr4Context> expr4() {
			return getRuleContexts(Expr4Context.class);
		}
		public Expr4Context expr4(int i) {
			return getRuleContext(Expr4Context.class,i);
		}
		public FunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterFunccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitFunccall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitFunccall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funccall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(ID);
			setState(157);
			match(T__1);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1006657540L) != 0)) {
				{
				setState(158);
				expr4();
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(159);
					match(T__7);
					setState(160);
					expr4();
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(168);
			match(T__2);
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
	public static class BoolExpr0Context extends ParserRuleContext {
		public BoolExpr0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr0; }
	 
		public BoolExpr0Context() { }
		public void copyFrom(BoolExpr0Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends BoolExpr0Context {
		public List<BoolExpr1Context> boolExpr1() {
			return getRuleContexts(BoolExpr1Context.class);
		}
		public BoolExpr1Context boolExpr1(int i) {
			return getRuleContext(BoolExpr1Context.class,i);
		}
		public TerminalNode AND() { return getToken(WolaczParser.AND, 0); }
		public AndContext(BoolExpr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Singlebool0Context extends BoolExpr0Context {
		public BoolExpr1Context boolExpr1() {
			return getRuleContext(BoolExpr1Context.class,0);
		}
		public Singlebool0Context(BoolExpr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterSinglebool0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitSinglebool0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitSinglebool0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExpr0Context boolExpr0() throws RecognitionException {
		BoolExpr0Context _localctx = new BoolExpr0Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_boolExpr0);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new Singlebool0Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				boolExpr1();
				}
				break;
			case 2:
				_localctx = new AndContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				boolExpr1();
				setState(172);
				match(AND);
				setState(173);
				boolExpr1();
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
	public static class BoolExpr1Context extends ParserRuleContext {
		public BoolExpr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr1; }
	 
		public BoolExpr1Context() { }
		public void copyFrom(BoolExpr1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrContext extends BoolExpr1Context {
		public List<BoolExpr2Context> boolExpr2() {
			return getRuleContexts(BoolExpr2Context.class);
		}
		public BoolExpr2Context boolExpr2(int i) {
			return getRuleContext(BoolExpr2Context.class,i);
		}
		public TerminalNode OR() { return getToken(WolaczParser.OR, 0); }
		public OrContext(BoolExpr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Singlebool1Context extends BoolExpr1Context {
		public BoolExpr2Context boolExpr2() {
			return getRuleContext(BoolExpr2Context.class,0);
		}
		public Singlebool1Context(BoolExpr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterSinglebool1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitSinglebool1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitSinglebool1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExpr1Context boolExpr1() throws RecognitionException {
		BoolExpr1Context _localctx = new BoolExpr1Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_boolExpr1);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new Singlebool1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				boolExpr2();
				}
				break;
			case 2:
				_localctx = new OrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				boolExpr2();
				setState(179);
				match(OR);
				setState(180);
				boolExpr2();
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
	public static class BoolExpr2Context extends ParserRuleContext {
		public BoolExpr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr2; }
	 
		public BoolExpr2Context() { }
		public void copyFrom(BoolExpr2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Singlebool2Context extends BoolExpr2Context {
		public BoolExpr3Context boolExpr3() {
			return getRuleContext(BoolExpr3Context.class,0);
		}
		public Singlebool2Context(BoolExpr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterSinglebool2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitSinglebool2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitSinglebool2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class XorContext extends BoolExpr2Context {
		public List<BoolExpr3Context> boolExpr3() {
			return getRuleContexts(BoolExpr3Context.class);
		}
		public BoolExpr3Context boolExpr3(int i) {
			return getRuleContext(BoolExpr3Context.class,i);
		}
		public TerminalNode XOR() { return getToken(WolaczParser.XOR, 0); }
		public XorContext(BoolExpr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitXor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitXor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExpr2Context boolExpr2() throws RecognitionException {
		BoolExpr2Context _localctx = new BoolExpr2Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_boolExpr2);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new Singlebool2Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				boolExpr3();
				}
				break;
			case 2:
				_localctx = new XorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				boolExpr3();
				setState(186);
				match(XOR);
				setState(187);
				boolExpr3();
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
	public static class BoolExpr3Context extends ParserRuleContext {
		public BoolExpr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr3; }
	 
		public BoolExpr3Context() { }
		public void copyFrom(BoolExpr3Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Singlebool3Context extends BoolExpr3Context {
		public BoolExpr4Context boolExpr4() {
			return getRuleContext(BoolExpr4Context.class,0);
		}
		public Singlebool3Context(BoolExpr3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterSinglebool3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitSinglebool3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitSinglebool3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegContext extends BoolExpr3Context {
		public TerminalNode NEG() { return getToken(WolaczParser.NEG, 0); }
		public BoolExpr4Context boolExpr4() {
			return getRuleContext(BoolExpr4Context.class,0);
		}
		public NegContext(BoolExpr3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitNeg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExpr3Context boolExpr3() throws RecognitionException {
		BoolExpr3Context _localctx = new BoolExpr3Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_boolExpr3);
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case BOOL:
			case ID:
				_localctx = new Singlebool3Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				boolExpr4();
				}
				break;
			case NEG:
				_localctx = new NegContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(NEG);
				setState(193);
				boolExpr4();
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
	public static class BoolExpr4Context extends ParserRuleContext {
		public BoolExpr4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr4; }
	 
		public BoolExpr4Context() { }
		public void copyFrom(BoolExpr4Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends BoolExpr4Context {
		public TerminalNode BOOL() { return getToken(WolaczParser.BOOL, 0); }
		public BoolContext(BoolExpr4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Id2Context extends BoolExpr4Context {
		public TerminalNode ID() { return getToken(WolaczParser.ID, 0); }
		public Id2Context(BoolExpr4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterId2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitId2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitId2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolparContext extends BoolExpr4Context {
		public BoolExpr0Context boolExpr0() {
			return getRuleContext(BoolExpr0Context.class,0);
		}
		public BoolparContext(BoolExpr4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterBoolpar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitBoolpar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitBoolpar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExpr4Context boolExpr4() throws RecognitionException {
		BoolExpr4Context _localctx = new BoolExpr4Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_boolExpr4);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(BOOL);
				}
				break;
			case ID:
				_localctx = new Id2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(ID);
				}
				break;
			case T__1:
				_localctx = new BoolparContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				match(T__1);
				setState(199);
				boolExpr0();
				setState(200);
				match(T__2);
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
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(WolaczParser.FUNCTION, 0); }
		public FnameContext fname() {
			return getRuleContext(FnameContext.class,0);
		}
		public FparamContext fparam() {
			return getRuleContext(FparamContext.class,0);
		}
		public FblockContext fblock() {
			return getRuleContext(FblockContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(WolaczParser.NEWLINE, 0); }
		public TerminalNode ENDFUNCTION() { return getToken(WolaczParser.ENDFUNCTION, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(FUNCTION);
			setState(205);
			fname();
			setState(206);
			match(T__1);
			setState(207);
			fparam();
			setState(208);
			match(T__8);
			setState(209);
			fblock();
			setState(210);
			match(NEWLINE);
			setState(211);
			match(ENDFUNCTION);
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
	public static class FnameContext extends ParserRuleContext {
		public TerminalNode FTYPE() { return getToken(WolaczParser.FTYPE, 0); }
		public TerminalNode ID() { return getToken(WolaczParser.ID, 0); }
		public FnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterFname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitFname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitFname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnameContext fname() throws RecognitionException {
		FnameContext _localctx = new FnameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(FTYPE);
			setState(214);
			match(ID);
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
	public static class FparamContext extends ParserRuleContext {
		public List<TerminalNode> FTYPE() { return getTokens(WolaczParser.FTYPE); }
		public TerminalNode FTYPE(int i) {
			return getToken(WolaczParser.FTYPE, i);
		}
		public List<TerminalNode> ID() { return getTokens(WolaczParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(WolaczParser.ID, i);
		}
		public FparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterFparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitFparam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitFparam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FparamContext fparam() throws RecognitionException {
		FparamContext _localctx = new FparamContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fparam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FTYPE) {
				{
				setState(216);
				match(FTYPE);
				setState(217);
				match(ID);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(218);
					match(T__7);
					setState(219);
					match(FTYPE);
					setState(220);
					match(ID);
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class FblockContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(WolaczParser.ID, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(WolaczParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(WolaczParser.NEWLINE, i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public FblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterFblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitFblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitFblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FblockContext fblock() throws RecognitionException {
		FblockContext _localctx = new FblockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 274950461440L) != 0)) {
				{
				{
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72554496L) != 0)) {
					{
					setState(228);
					operation();
					}
				}

				setState(231);
				match(NEWLINE);
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			match(T__9);
			setState(238);
			match(ID);
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
	public static class ArrayTypeContext extends ParserRuleContext {
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WolaczListener ) ((WolaczListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WolaczVisitor ) return ((WolaczVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arrayType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\'\u00f3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0003\u00013\b\u0001\u0001\u0001\u0005\u00016\b\u0001\n\u0001\f\u0001"+
		"9\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"W\b\u0002\n\u0002\f\u0002Z\t\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"^\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004"+
		"d\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007r\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\bz\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0081\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0088\b\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u009b\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00a2\b"+
		"\f\n\f\f\f\u00a5\t\f\u0003\f\u00a7\b\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0003\r\u00b0\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00b7\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00be\b\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00c3\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00cb"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u00de\b\u0014\n\u0014\f\u0014\u00e1\t\u0014\u0003\u0014\u00e3\b"+
		"\u0014\u0001\u0015\u0003\u0015\u00e6\b\u0015\u0001\u0015\u0005\u0015\u00e9"+
		"\b\u0015\n\u0015\f\u0015\u00ec\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0000\u0000\u0017\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,\u0000\u0002\u0001\u0000\u001b\u001c\u0001\u0000\u000b\f\u00ff\u0000"+
		".\u0001\u0000\u0000\u0000\u00027\u0001\u0000\u0000\u0000\u0004]\u0001"+
		"\u0000\u0000\u0000\u0006_\u0001\u0000\u0000\u0000\bc\u0001\u0000\u0000"+
		"\u0000\ne\u0001\u0000\u0000\u0000\fg\u0001\u0000\u0000\u0000\u000eq\u0001"+
		"\u0000\u0000\u0000\u0010y\u0001\u0000\u0000\u0000\u0012\u0080\u0001\u0000"+
		"\u0000\u0000\u0014\u0087\u0001\u0000\u0000\u0000\u0016\u009a\u0001\u0000"+
		"\u0000\u0000\u0018\u009c\u0001\u0000\u0000\u0000\u001a\u00af\u0001\u0000"+
		"\u0000\u0000\u001c\u00b6\u0001\u0000\u0000\u0000\u001e\u00bd\u0001\u0000"+
		"\u0000\u0000 \u00c2\u0001\u0000\u0000\u0000\"\u00ca\u0001\u0000\u0000"+
		"\u0000$\u00cc\u0001\u0000\u0000\u0000&\u00d5\u0001\u0000\u0000\u0000("+
		"\u00e2\u0001\u0000\u0000\u0000*\u00ea\u0001\u0000\u0000\u0000,\u00f0\u0001"+
		"\u0000\u0000\u0000./\u0003\u0002\u0001\u0000/\u0001\u0001\u0000\u0000"+
		"\u000003\u0003\u0004\u0002\u000013\u0003$\u0012\u000020\u0001\u0000\u0000"+
		"\u000021\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0001\u0000"+
		"\u0000\u000046\u0005&\u0000\u000052\u0001\u0000\u0000\u000069\u0001\u0000"+
		"\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008\u0003"+
		"\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:;\u0005\u0014\u0000"+
		"\u0000;<\u0003\u0006\u0003\u0000<=\u0005\u0001\u0000\u0000=>\u0003\u0002"+
		"\u0001\u0000>?\u0005\u0015\u0000\u0000?^\u0001\u0000\u0000\u0000@A\u0005"+
		"\u0016\u0000\u0000AB\u0003\f\u0006\u0000BC\u0005\u0001\u0000\u0000CD\u0003"+
		"\n\u0005\u0000DE\u0005\u0017\u0000\u0000E^\u0001\u0000\u0000\u0000FG\u0005"+
		"\u0010\u0000\u0000GH\u0005\u0002\u0000\u0000HI\u0005\u001a\u0000\u0000"+
		"I^\u0005\u0003\u0000\u0000JK\u0005\u001a\u0000\u0000KL\u0005\u0004\u0000"+
		"\u0000L^\u0003\u000e\u0007\u0000MN\u0005\u0011\u0000\u0000NO\u0005\u0002"+
		"\u0000\u0000OP\u0005\u001a\u0000\u0000P^\u0005\u0003\u0000\u0000QR\u0003"+
		",\u0016\u0000RS\u0005\u001a\u0000\u0000ST\u0005\u0004\u0000\u0000TX\u0005"+
		"\u0005\u0000\u0000UW\u0007\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000"+
		"WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[\\\u0005\u0006"+
		"\u0000\u0000\\^\u0001\u0000\u0000\u0000]:\u0001\u0000\u0000\u0000]@\u0001"+
		"\u0000\u0000\u0000]F\u0001\u0000\u0000\u0000]J\u0001\u0000\u0000\u0000"+
		"]M\u0001\u0000\u0000\u0000]Q\u0001\u0000\u0000\u0000^\u0005\u0001\u0000"+
		"\u0000\u0000_`\u0003\b\u0004\u0000`\u0007\u0001\u0000\u0000\u0000ad\u0005"+
		"\u001a\u0000\u0000bd\u0005\u001b\u0000\u0000ca\u0001\u0000\u0000\u0000"+
		"cb\u0001\u0000\u0000\u0000d\t\u0001\u0000\u0000\u0000ef\u0003\u0002\u0001"+
		"\u0000f\u000b\u0001\u0000\u0000\u0000gh\u0005\u001a\u0000\u0000hi\u0005"+
		"\u0007\u0000\u0000ij\u0005\u001b\u0000\u0000j\r\u0001\u0000\u0000\u0000"+
		"kr\u0003\u0010\b\u0000lm\u0003\u0010\b\u0000mn\u0005\u001e\u0000\u0000"+
		"no\u0003\u0010\b\u0000or\u0001\u0000\u0000\u0000pr\u0003\u001a\r\u0000"+
		"qk\u0001\u0000\u0000\u0000ql\u0001\u0000\u0000\u0000qp\u0001\u0000\u0000"+
		"\u0000r\u000f\u0001\u0000\u0000\u0000sz\u0003\u0012\t\u0000tz\u0005\u0018"+
		"\u0000\u0000uv\u0003\u0012\t\u0000vw\u0005\u001f\u0000\u0000wx\u0003\u0012"+
		"\t\u0000xz\u0001\u0000\u0000\u0000ys\u0001\u0000\u0000\u0000yt\u0001\u0000"+
		"\u0000\u0000yu\u0001\u0000\u0000\u0000z\u0011\u0001\u0000\u0000\u0000"+
		"{\u0081\u0003\u0014\n\u0000|}\u0003\u0014\n\u0000}~\u0005!\u0000\u0000"+
		"~\u007f\u0003\u0014\n\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080"+
		"{\u0001\u0000\u0000\u0000\u0080|\u0001\u0000\u0000\u0000\u0081\u0013\u0001"+
		"\u0000\u0000\u0000\u0082\u0088\u0003\u0016\u000b\u0000\u0083\u0084\u0003"+
		"\u0016\u000b\u0000\u0084\u0085\u0005 \u0000\u0000\u0085\u0086\u0003\u0016"+
		"\u000b\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087\u0082\u0001\u0000"+
		"\u0000\u0000\u0087\u0083\u0001\u0000\u0000\u0000\u0088\u0015\u0001\u0000"+
		"\u0000\u0000\u0089\u009b\u0005\u001b\u0000\u0000\u008a\u009b\u0005\u001c"+
		"\u0000\u0000\u008b\u009b\u0005\u001d\u0000\u0000\u008c\u009b\u0005\u001a"+
		"\u0000\u0000\u008d\u008e\u0005\r\u0000\u0000\u008e\u009b\u0003\u0016\u000b"+
		"\u0000\u008f\u0090\u0005\u000e\u0000\u0000\u0090\u009b\u0003\u0016\u000b"+
		"\u0000\u0091\u009b\u0003\u0018\f\u0000\u0092\u0093\u0005\u0002\u0000\u0000"+
		"\u0093\u0094\u0003\u000e\u0007\u0000\u0094\u0095\u0005\u0003\u0000\u0000"+
		"\u0095\u009b\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u001a\u0000\u0000"+
		"\u0097\u0098\u0005\u0005\u0000\u0000\u0098\u0099\u0005\u001b\u0000\u0000"+
		"\u0099\u009b\u0005\u0006\u0000\u0000\u009a\u0089\u0001\u0000\u0000\u0000"+
		"\u009a\u008a\u0001\u0000\u0000\u0000\u009a\u008b\u0001\u0000\u0000\u0000"+
		"\u009a\u008c\u0001\u0000\u0000\u0000\u009a\u008d\u0001\u0000\u0000\u0000"+
		"\u009a\u008f\u0001\u0000\u0000\u0000\u009a\u0091\u0001\u0000\u0000\u0000"+
		"\u009a\u0092\u0001\u0000\u0000\u0000\u009a\u0096\u0001\u0000\u0000\u0000"+
		"\u009b\u0017\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u001a\u0000\u0000"+
		"\u009d\u00a6\u0005\u0002\u0000\u0000\u009e\u00a3\u0003\u0016\u000b\u0000"+
		"\u009f\u00a0\u0005\b\u0000\u0000\u00a0\u00a2\u0003\u0016\u000b\u0000\u00a1"+
		"\u009f\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6"+
		"\u009e\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0003\u0000\u0000\u00a9"+
		"\u0019\u0001\u0000\u0000\u0000\u00aa\u00b0\u0003\u001c\u000e\u0000\u00ab"+
		"\u00ac\u0003\u001c\u000e\u0000\u00ac\u00ad\u0005\"\u0000\u0000\u00ad\u00ae"+
		"\u0003\u001c\u000e\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00aa"+
		"\u0001\u0000\u0000\u0000\u00af\u00ab\u0001\u0000\u0000\u0000\u00b0\u001b"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b7\u0003\u001e\u000f\u0000\u00b2\u00b3"+
		"\u0003\u001e\u000f\u0000\u00b3\u00b4\u0005#\u0000\u0000\u00b4\u00b5\u0003"+
		"\u001e\u000f\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b2\u0001\u0000\u0000\u0000\u00b7\u001d\u0001"+
		"\u0000\u0000\u0000\u00b8\u00be\u0003 \u0010\u0000\u00b9\u00ba\u0003 \u0010"+
		"\u0000\u00ba\u00bb\u0005$\u0000\u0000\u00bb\u00bc\u0003 \u0010\u0000\u00bc"+
		"\u00be\u0001\u0000\u0000\u0000\u00bd\u00b8\u0001\u0000\u0000\u0000\u00bd"+
		"\u00b9\u0001\u0000\u0000\u0000\u00be\u001f\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c3\u0003\"\u0011\u0000\u00c0\u00c1\u0005%\u0000\u0000\u00c1\u00c3"+
		"\u0003\"\u0011\u0000\u00c2\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c3!\u0001\u0000\u0000\u0000\u00c4\u00cb\u0005\u0019"+
		"\u0000\u0000\u00c5\u00cb\u0005\u001a\u0000\u0000\u00c6\u00c7\u0005\u0002"+
		"\u0000\u0000\u00c7\u00c8\u0003\u001a\r\u0000\u00c8\u00c9\u0005\u0003\u0000"+
		"\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca\u00c4\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c5\u0001\u0000\u0000\u0000\u00ca\u00c6\u0001\u0000\u0000"+
		"\u0000\u00cb#\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u0012\u0000\u0000"+
		"\u00cd\u00ce\u0003&\u0013\u0000\u00ce\u00cf\u0005\u0002\u0000\u0000\u00cf"+
		"\u00d0\u0003(\u0014\u0000\u00d0\u00d1\u0005\t\u0000\u0000\u00d1\u00d2"+
		"\u0003*\u0015\u0000\u00d2\u00d3\u0005&\u0000\u0000\u00d3\u00d4\u0005\u0013"+
		"\u0000\u0000\u00d4%\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u000f\u0000"+
		"\u0000\u00d6\u00d7\u0005\u001a\u0000\u0000\u00d7\'\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0005\u000f\u0000\u0000\u00d9\u00df\u0005\u001a\u0000\u0000"+
		"\u00da\u00db\u0005\b\u0000\u0000\u00db\u00dc\u0005\u000f\u0000\u0000\u00dc"+
		"\u00de\u0005\u001a\u0000\u0000\u00dd\u00da\u0001\u0000\u0000\u0000\u00de"+
		"\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1"+
		"\u00df\u0001\u0000\u0000\u0000\u00e2\u00d8\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e3)\u0001\u0000\u0000\u0000\u00e4\u00e6"+
		"\u0003\u0004\u0002\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e9"+
		"\u0005&\u0000\u0000\u00e8\u00e5\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0005\n\u0000\u0000\u00ee\u00ef\u0005\u001a"+
		"\u0000\u0000\u00ef+\u0001\u0000\u0000\u0000\u00f0\u00f1\u0007\u0001\u0000"+
		"\u0000\u00f1-\u0001\u0000\u0000\u0000\u001527X]cqy\u0080\u0087\u009a\u00a3"+
		"\u00a6\u00af\u00b6\u00bd\u00c2\u00ca\u00df\u00e2\u00e5\u00ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}