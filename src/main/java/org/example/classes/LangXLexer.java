// Generated from C:/Users/Bartek/IdeaProjects/wolacz/src/main/antlr/LangX.g4 by ANTLR 4.13.2
package org.example.classes;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LangXLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, PRINT=4, READ=5, TOINT=6, TOREAL=7, ID=8, REAL=9, 
		INT=10, ADD=11, SUB=12, MULT=13, DIV=14, NEWLINE=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "PRINT", "READ", "TOINT", "TOREAL", "ID", "REAL", 
			"INT", "ADD", "SUB", "MULT", "DIV", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'print'", "'read'", "'(int)'", "'(real)'", 
			null, null, null, "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "PRINT", "READ", "TOINT", "TOREAL", "ID", "REAL", 
			"INT", "ADD", "SUB", "MULT", "DIV", "NEWLINE", "WS"
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


	public LangXLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LangX.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 15:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0010h\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0004\u0007A\b\u0007\u000b\u0007\f\u0007"+
		"B\u0001\b\u0004\bF\b\b\u000b\b\f\bG\u0001\b\u0001\b\u0004\bL\b\b\u000b"+
		"\b\f\bM\u0001\t\u0004\tQ\b\t\u000b\t\f\tR\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0003\u000e^"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0004\u000fc\b\u000f\u000b"+
		"\u000f\f\u000fd\u0001\u000f\u0001\u000f\u0000\u0000\u0010\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010\u0001\u0000\u0002\u0002\u0000AZaz\u0002\u0000\t\t  m\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0001!\u0001"+
		"\u0000\u0000\u0000\u0003#\u0001\u0000\u0000\u0000\u0005%\u0001\u0000\u0000"+
		"\u0000\u0007\'\u0001\u0000\u0000\u0000\t-\u0001\u0000\u0000\u0000\u000b"+
		"2\u0001\u0000\u0000\u0000\r8\u0001\u0000\u0000\u0000\u000f@\u0001\u0000"+
		"\u0000\u0000\u0011E\u0001\u0000\u0000\u0000\u0013P\u0001\u0000\u0000\u0000"+
		"\u0015T\u0001\u0000\u0000\u0000\u0017V\u0001\u0000\u0000\u0000\u0019X"+
		"\u0001\u0000\u0000\u0000\u001bZ\u0001\u0000\u0000\u0000\u001d]\u0001\u0000"+
		"\u0000\u0000\u001fb\u0001\u0000\u0000\u0000!\"\u0005=\u0000\u0000\"\u0002"+
		"\u0001\u0000\u0000\u0000#$\u0005(\u0000\u0000$\u0004\u0001\u0000\u0000"+
		"\u0000%&\u0005)\u0000\u0000&\u0006\u0001\u0000\u0000\u0000\'(\u0005p\u0000"+
		"\u0000()\u0005r\u0000\u0000)*\u0005i\u0000\u0000*+\u0005n\u0000\u0000"+
		"+,\u0005t\u0000\u0000,\b\u0001\u0000\u0000\u0000-.\u0005r\u0000\u0000"+
		"./\u0005e\u0000\u0000/0\u0005a\u0000\u000001\u0005d\u0000\u00001\n\u0001"+
		"\u0000\u0000\u000023\u0005(\u0000\u000034\u0005i\u0000\u000045\u0005n"+
		"\u0000\u000056\u0005t\u0000\u000067\u0005)\u0000\u00007\f\u0001\u0000"+
		"\u0000\u000089\u0005(\u0000\u00009:\u0005r\u0000\u0000:;\u0005e\u0000"+
		"\u0000;<\u0005a\u0000\u0000<=\u0005l\u0000\u0000=>\u0005)\u0000\u0000"+
		">\u000e\u0001\u0000\u0000\u0000?A\u0007\u0000\u0000\u0000@?\u0001\u0000"+
		"\u0000\u0000AB\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000C\u0010\u0001\u0000\u0000\u0000DF\u000209\u0000ED\u0001"+
		"\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IK\u0005.\u0000\u0000"+
		"JL\u000209\u0000KJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M"+
		"K\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000N\u0012\u0001\u0000"+
		"\u0000\u0000OQ\u000209\u0000PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000S\u0014\u0001"+
		"\u0000\u0000\u0000TU\u0005+\u0000\u0000U\u0016\u0001\u0000\u0000\u0000"+
		"VW\u0005-\u0000\u0000W\u0018\u0001\u0000\u0000\u0000XY\u0005*\u0000\u0000"+
		"Y\u001a\u0001\u0000\u0000\u0000Z[\u0005/\u0000\u0000[\u001c\u0001\u0000"+
		"\u0000\u0000\\^\u0005\r\u0000\u0000]\\\u0001\u0000\u0000\u0000]^\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0005\n\u0000\u0000`\u001e"+
		"\u0001\u0000\u0000\u0000ac\u0007\u0001\u0000\u0000ba\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0006\u000f\u0000\u0000g \u0001"+
		"\u0000\u0000\u0000\u0007\u0000BGMR]d\u0001\u0001\u000f\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}