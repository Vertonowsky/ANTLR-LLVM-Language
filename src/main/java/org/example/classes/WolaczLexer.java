// Generated from D:/SZKOLA/Studia/PW/Semestr_I/JIFK/src/main/antlr/Wolacz.g4 by ANTLR 4.13.2
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
public class WolaczLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ADD=12, SUB=13, MUL=14, DIV=15, READ=16, PRINT=17, 
		INT=18, FLOAT=19, STRING=20, ID=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "ADD", "SUB", "MUL", "DIV", "READ", "PRINT", "INT", 
			"FLOAT", "STRING", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'['", "']'", "'('", "')'", "'int'", "'float'", "'Float32'", 
			"'Float64'", "'string'", "'+'", "'-'", "'*'", "'/'", "'read'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ADD", "SUB", "MUL", "DIV", "READ", "PRINT", "INT", "FLOAT", "STRING", 
			"ID", "WS"
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


	public WolaczLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Wolacz.g4"; }

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

	public static final String _serializedATN =
		"\u0004\u0000\u0016\u009c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0003\u0011o\b\u0011"+
		"\u0001\u0011\u0004\u0011r\b\u0011\u000b\u0011\f\u0011s\u0001\u0012\u0003"+
		"\u0012w\b\u0012\u0001\u0012\u0004\u0012z\b\u0012\u000b\u0012\f\u0012{"+
		"\u0001\u0012\u0001\u0012\u0004\u0012\u0080\b\u0012\u000b\u0012\f\u0012"+
		"\u0081\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0088"+
		"\b\u0013\n\u0013\f\u0013\u008b\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u0091\b\u0014\n\u0014\f\u0014\u0094\t\u0014\u0001"+
		"\u0015\u0004\u0015\u0097\b\u0015\u000b\u0015\f\u0015\u0098\u0001\u0015"+
		"\u0001\u0015\u0000\u0000\u0016\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016\u0001\u0000\u0005\u0001\u000009\u0002\u0000\"\""+
		"\\\\\u0003\u0000AZ__az\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  \u00a4"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0001-\u0001\u0000\u0000\u0000\u0003/"+
		"\u0001\u0000\u0000\u0000\u00051\u0001\u0000\u0000\u0000\u00073\u0001\u0000"+
		"\u0000\u0000\t5\u0001\u0000\u0000\u0000\u000b7\u0001\u0000\u0000\u0000"+
		"\r9\u0001\u0000\u0000\u0000\u000f=\u0001\u0000\u0000\u0000\u0011C\u0001"+
		"\u0000\u0000\u0000\u0013K\u0001\u0000\u0000\u0000\u0015S\u0001\u0000\u0000"+
		"\u0000\u0017Z\u0001\u0000\u0000\u0000\u0019\\\u0001\u0000\u0000\u0000"+
		"\u001b^\u0001\u0000\u0000\u0000\u001d`\u0001\u0000\u0000\u0000\u001fb"+
		"\u0001\u0000\u0000\u0000!g\u0001\u0000\u0000\u0000#n\u0001\u0000\u0000"+
		"\u0000%v\u0001\u0000\u0000\u0000\'\u0083\u0001\u0000\u0000\u0000)\u008e"+
		"\u0001\u0000\u0000\u0000+\u0096\u0001\u0000\u0000\u0000-.\u0005;\u0000"+
		"\u0000.\u0002\u0001\u0000\u0000\u0000/0\u0005=\u0000\u00000\u0004\u0001"+
		"\u0000\u0000\u000012\u0005[\u0000\u00002\u0006\u0001\u0000\u0000\u0000"+
		"34\u0005]\u0000\u00004\b\u0001\u0000\u0000\u000056\u0005(\u0000\u0000"+
		"6\n\u0001\u0000\u0000\u000078\u0005)\u0000\u00008\f\u0001\u0000\u0000"+
		"\u00009:\u0005i\u0000\u0000:;\u0005n\u0000\u0000;<\u0005t\u0000\u0000"+
		"<\u000e\u0001\u0000\u0000\u0000=>\u0005f\u0000\u0000>?\u0005l\u0000\u0000"+
		"?@\u0005o\u0000\u0000@A\u0005a\u0000\u0000AB\u0005t\u0000\u0000B\u0010"+
		"\u0001\u0000\u0000\u0000CD\u0005F\u0000\u0000DE\u0005l\u0000\u0000EF\u0005"+
		"o\u0000\u0000FG\u0005a\u0000\u0000GH\u0005t\u0000\u0000HI\u00053\u0000"+
		"\u0000IJ\u00052\u0000\u0000J\u0012\u0001\u0000\u0000\u0000KL\u0005F\u0000"+
		"\u0000LM\u0005l\u0000\u0000MN\u0005o\u0000\u0000NO\u0005a\u0000\u0000"+
		"OP\u0005t\u0000\u0000PQ\u00056\u0000\u0000QR\u00054\u0000\u0000R\u0014"+
		"\u0001\u0000\u0000\u0000ST\u0005s\u0000\u0000TU\u0005t\u0000\u0000UV\u0005"+
		"r\u0000\u0000VW\u0005i\u0000\u0000WX\u0005n\u0000\u0000XY\u0005g\u0000"+
		"\u0000Y\u0016\u0001\u0000\u0000\u0000Z[\u0005+\u0000\u0000[\u0018\u0001"+
		"\u0000\u0000\u0000\\]\u0005-\u0000\u0000]\u001a\u0001\u0000\u0000\u0000"+
		"^_\u0005*\u0000\u0000_\u001c\u0001\u0000\u0000\u0000`a\u0005/\u0000\u0000"+
		"a\u001e\u0001\u0000\u0000\u0000bc\u0005r\u0000\u0000cd\u0005e\u0000\u0000"+
		"de\u0005a\u0000\u0000ef\u0005d\u0000\u0000f \u0001\u0000\u0000\u0000g"+
		"h\u0005p\u0000\u0000hi\u0005r\u0000\u0000ij\u0005i\u0000\u0000jk\u0005"+
		"n\u0000\u0000kl\u0005t\u0000\u0000l\"\u0001\u0000\u0000\u0000mo\u0005"+
		"-\u0000\u0000nm\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000oq\u0001"+
		"\u0000\u0000\u0000pr\u0007\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000t$\u0001\u0000\u0000\u0000uw\u0005-\u0000\u0000vu\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000xz\u0007\u0000"+
		"\u0000\u0000yx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{y\u0001"+
		"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000"+
		"}\u007f\u0005.\u0000\u0000~\u0080\u0007\u0000\u0000\u0000\u007f~\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u007f\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082&\u0001\u0000"+
		"\u0000\u0000\u0083\u0089\u0005\"\u0000\u0000\u0084\u0088\b\u0001\u0000"+
		"\u0000\u0085\u0086\u0005\\\u0000\u0000\u0086\u0088\t\u0000\u0000\u0000"+
		"\u0087\u0084\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000"+
		"\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008c\u0001\u0000\u0000\u0000"+
		"\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008d\u0005\"\u0000\u0000\u008d"+
		"(\u0001\u0000\u0000\u0000\u008e\u0092\u0007\u0002\u0000\u0000\u008f\u0091"+
		"\u0007\u0003\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0094"+
		"\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0001\u0000\u0000\u0000\u0093*\u0001\u0000\u0000\u0000\u0094\u0092\u0001"+
		"\u0000\u0000\u0000\u0095\u0097\u0007\u0004\u0000\u0000\u0096\u0095\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0096\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0006\u0015\u0000\u0000\u009b,\u0001\u0000"+
		"\u0000\u0000\n\u0000nsv{\u0081\u0087\u0089\u0092\u0098\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}