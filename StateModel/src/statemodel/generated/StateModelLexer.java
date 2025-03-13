// Generated from D:/Documents/modell/modell-hf1/StateModel/src/statemodel/StateModel.g4 by ANTLR 4.13.2
package statemodel.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class StateModelLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STATES=1, TRANSITIONS=2, INITIAL=3, ERROR=4, NORMAL=5, COLON=6, ARROW=7, 
		TRANS=8, ID=9, LCURLY=10, RCURLY=11, COMMA=12, LINE_COMMENT=13, BLOCK_COMMENT=14, 
		WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"STATES", "TRANSITIONS", "INITIAL", "ERROR", "NORMAL", "COLON", "ARROW", 
			"TRANS", "ID", "LCURLY", "RCURLY", "COMMA", "LINE_COMMENT", "BLOCK_COMMENT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'states'", "'transitions'", "'initial'", "'error'", "'normal'", 
			"':'", "'->'", "'trans'", null, "'{'", "'}'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STATES", "TRANSITIONS", "INITIAL", "ERROR", "NORMAL", "COLON", 
			"ARROW", "TRANS", "ID", "LCURLY", "RCURLY", "COMMA", "LINE_COMMENT", 
			"BLOCK_COMMENT", "WS"
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


	public StateModelLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "StateModel.g4"; }

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
		"\u0004\u0000\u000f|\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005\bU\b\b\n\b\f\bX\t"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\fd\b\f\n\f\f\fg\t\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0005\ro\b\r\n\r\f\rr\t\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001p\u0000"+
		"\u000f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u0001\u0000\u0004\u0002\u0000AZaz\u0003\u000009AZaz\u0002"+
		"\u0000\n\n\r\r\u0003\u0000\t\n\r\r  ~\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001\u001f"+
		"\u0001\u0000\u0000\u0000\u0003&\u0001\u0000\u0000\u0000\u00052\u0001\u0000"+
		"\u0000\u0000\u0007:\u0001\u0000\u0000\u0000\t@\u0001\u0000\u0000\u0000"+
		"\u000bG\u0001\u0000\u0000\u0000\rI\u0001\u0000\u0000\u0000\u000fL\u0001"+
		"\u0000\u0000\u0000\u0011R\u0001\u0000\u0000\u0000\u0013Y\u0001\u0000\u0000"+
		"\u0000\u0015[\u0001\u0000\u0000\u0000\u0017]\u0001\u0000\u0000\u0000\u0019"+
		"_\u0001\u0000\u0000\u0000\u001bj\u0001\u0000\u0000\u0000\u001dx\u0001"+
		"\u0000\u0000\u0000\u001f \u0005s\u0000\u0000 !\u0005t\u0000\u0000!\"\u0005"+
		"a\u0000\u0000\"#\u0005t\u0000\u0000#$\u0005e\u0000\u0000$%\u0005s\u0000"+
		"\u0000%\u0002\u0001\u0000\u0000\u0000&\'\u0005t\u0000\u0000\'(\u0005r"+
		"\u0000\u0000()\u0005a\u0000\u0000)*\u0005n\u0000\u0000*+\u0005s\u0000"+
		"\u0000+,\u0005i\u0000\u0000,-\u0005t\u0000\u0000-.\u0005i\u0000\u0000"+
		"./\u0005o\u0000\u0000/0\u0005n\u0000\u000001\u0005s\u0000\u00001\u0004"+
		"\u0001\u0000\u0000\u000023\u0005i\u0000\u000034\u0005n\u0000\u000045\u0005"+
		"i\u0000\u000056\u0005t\u0000\u000067\u0005i\u0000\u000078\u0005a\u0000"+
		"\u000089\u0005l\u0000\u00009\u0006\u0001\u0000\u0000\u0000:;\u0005e\u0000"+
		"\u0000;<\u0005r\u0000\u0000<=\u0005r\u0000\u0000=>\u0005o\u0000\u0000"+
		">?\u0005r\u0000\u0000?\b\u0001\u0000\u0000\u0000@A\u0005n\u0000\u0000"+
		"AB\u0005o\u0000\u0000BC\u0005r\u0000\u0000CD\u0005m\u0000\u0000DE\u0005"+
		"a\u0000\u0000EF\u0005l\u0000\u0000F\n\u0001\u0000\u0000\u0000GH\u0005"+
		":\u0000\u0000H\f\u0001\u0000\u0000\u0000IJ\u0005-\u0000\u0000JK\u0005"+
		">\u0000\u0000K\u000e\u0001\u0000\u0000\u0000LM\u0005t\u0000\u0000MN\u0005"+
		"r\u0000\u0000NO\u0005a\u0000\u0000OP\u0005n\u0000\u0000PQ\u0005s\u0000"+
		"\u0000Q\u0010\u0001\u0000\u0000\u0000RV\u0007\u0000\u0000\u0000SU\u0007"+
		"\u0001\u0000\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000W\u0012\u0001\u0000"+
		"\u0000\u0000XV\u0001\u0000\u0000\u0000YZ\u0005{\u0000\u0000Z\u0014\u0001"+
		"\u0000\u0000\u0000[\\\u0005}\u0000\u0000\\\u0016\u0001\u0000\u0000\u0000"+
		"]^\u0005,\u0000\u0000^\u0018\u0001\u0000\u0000\u0000_`\u0005/\u0000\u0000"+
		"`a\u0005/\u0000\u0000ae\u0001\u0000\u0000\u0000bd\b\u0002\u0000\u0000"+
		"cb\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000"+
		"\u0000ef\u0001\u0000\u0000\u0000fh\u0001\u0000\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000hi\u0006\f\u0000\u0000i\u001a\u0001\u0000\u0000\u0000jk\u0005"+
		"/\u0000\u0000kl\u0005*\u0000\u0000lp\u0001\u0000\u0000\u0000mo\t\u0000"+
		"\u0000\u0000nm\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000st\u0005*\u0000\u0000tu\u0005/\u0000\u0000u"+
		"v\u0001\u0000\u0000\u0000vw\u0006\r\u0000\u0000w\u001c\u0001\u0000\u0000"+
		"\u0000xy\u0007\u0003\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0006\u000e"+
		"\u0000\u0000{\u001e\u0001\u0000\u0000\u0000\u0004\u0000Vep\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}