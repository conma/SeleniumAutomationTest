// Generated from SELENE.g4 by ANTLR 4.7.1
package selene;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SELENELexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, DIGITS=19, HEX=20, STRING=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "DIGITS", "HEX", "STRING", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'begin'", "'end'", "'updateTCs'", "'get'", "'click'", "'sendKeys'", 
		"'verifyText'", "'verifyTitle'", "'updateDB'", "'://'", "':'", "'/'", 
		"'.'", "'@'", "'#'", "'?'", "'&'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "DIGITS", "HEX", "STRING", "WS"
	};
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


	public SELENELexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SELENE.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00a8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\6\24\u008c\n\24\r\24\16\24\u008d\3\25\3\25\3\25\6"+
		"\25\u0093\n\25\r\25\16\25\u0094\3\26\3\26\5\26\u0099\n\26\3\26\3\26\7"+
		"\26\u009d\n\26\f\26\16\26\u00a0\13\26\3\27\6\27\u00a3\n\27\r\27\16\27"+
		"\u00a4\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\7\3\2\62"+
		";\5\2\62;CHch\6\2\62;C\\c|\u0080\u0080\6\2/\60\62;C\\c|\4\2\f\f\17\17"+
		"\2\u00ad\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\3/\3\2\2\2\5\65\3\2\2\2\79\3\2\2\2\tC\3\2\2\2\13G\3\2\2\2\rM\3\2\2\2"+
		"\17V\3\2\2\2\21a\3\2\2\2\23m\3\2\2\2\25v\3\2\2\2\27z\3\2\2\2\31|\3\2\2"+
		"\2\33~\3\2\2\2\35\u0080\3\2\2\2\37\u0082\3\2\2\2!\u0084\3\2\2\2#\u0086"+
		"\3\2\2\2%\u0088\3\2\2\2\'\u008b\3\2\2\2)\u0092\3\2\2\2+\u0098\3\2\2\2"+
		"-\u00a2\3\2\2\2/\60\7d\2\2\60\61\7g\2\2\61\62\7i\2\2\62\63\7k\2\2\63\64"+
		"\7p\2\2\64\4\3\2\2\2\65\66\7g\2\2\66\67\7p\2\2\678\7f\2\28\6\3\2\2\29"+
		":\7w\2\2:;\7r\2\2;<\7f\2\2<=\7c\2\2=>\7v\2\2>?\7g\2\2?@\7V\2\2@A\7E\2"+
		"\2AB\7u\2\2B\b\3\2\2\2CD\7i\2\2DE\7g\2\2EF\7v\2\2F\n\3\2\2\2GH\7e\2\2"+
		"HI\7n\2\2IJ\7k\2\2JK\7e\2\2KL\7m\2\2L\f\3\2\2\2MN\7u\2\2NO\7g\2\2OP\7"+
		"p\2\2PQ\7f\2\2QR\7M\2\2RS\7g\2\2ST\7{\2\2TU\7u\2\2U\16\3\2\2\2VW\7x\2"+
		"\2WX\7g\2\2XY\7t\2\2YZ\7k\2\2Z[\7h\2\2[\\\7{\2\2\\]\7V\2\2]^\7g\2\2^_"+
		"\7z\2\2_`\7v\2\2`\20\3\2\2\2ab\7x\2\2bc\7g\2\2cd\7t\2\2de\7k\2\2ef\7h"+
		"\2\2fg\7{\2\2gh\7V\2\2hi\7k\2\2ij\7v\2\2jk\7n\2\2kl\7g\2\2l\22\3\2\2\2"+
		"mn\7w\2\2no\7r\2\2op\7f\2\2pq\7c\2\2qr\7v\2\2rs\7g\2\2st\7F\2\2tu\7D\2"+
		"\2u\24\3\2\2\2vw\7<\2\2wx\7\61\2\2xy\7\61\2\2y\26\3\2\2\2z{\7<\2\2{\30"+
		"\3\2\2\2|}\7\61\2\2}\32\3\2\2\2~\177\7\60\2\2\177\34\3\2\2\2\u0080\u0081"+
		"\7B\2\2\u0081\36\3\2\2\2\u0082\u0083\7%\2\2\u0083 \3\2\2\2\u0084\u0085"+
		"\7A\2\2\u0085\"\3\2\2\2\u0086\u0087\7(\2\2\u0087$\3\2\2\2\u0088\u0089"+
		"\7?\2\2\u0089&\3\2\2\2\u008a\u008c\t\2\2\2\u008b\u008a\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e(\3\2\2\2\u008f"+
		"\u0090\7\'\2\2\u0090\u0091\t\3\2\2\u0091\u0093\t\3\2\2\u0092\u008f\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"*\3\2\2\2\u0096\u0099\t\4\2\2\u0097\u0099\5)\25\2\u0098\u0096\3\2\2\2"+
		"\u0098\u0097\3\2\2\2\u0099\u009e\3\2\2\2\u009a\u009d\t\5\2\2\u009b\u009d"+
		"\5)\25\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f,\3\2\2\2\u00a0\u009e\3\2\2\2"+
		"\u00a1\u00a3\t\6\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\b\27\2\2"+
		"\u00a7.\3\2\2\2\t\2\u008d\u0094\u0098\u009c\u009e\u00a4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}