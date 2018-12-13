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
		DIGITS=18, HEX=19, STRING=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"DIGITS", "HEX", "STRING", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'begin'", "'end'", "'get'", "'click'", "'sendKeys'", "'verifyText'", 
		"'verifyTitle'", "'updateDB'", "'://'", "':'", "'/'", "'.'", "'@'", "'#'", 
		"'?'", "'&'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "DIGITS", "HEX", "STRING", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u009c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\6\23\u0080\n\23\r\23\16\23\u0081"+
		"\3\24\3\24\3\24\6\24\u0087\n\24\r\24\16\24\u0088\3\25\3\25\5\25\u008d"+
		"\n\25\3\25\3\25\7\25\u0091\n\25\f\25\16\25\u0094\13\25\3\26\6\26\u0097"+
		"\n\26\r\26\16\26\u0098\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"\3\2\7\3\2\62;\5\2\62;CHch\6\2\62;C\\c|\u0080\u0080\6\2/\60\62;C\\c|\4"+
		"\2\f\f\17\17\2\u00a1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\3-\3\2\2\2\5\63\3\2\2\2\7\67\3\2\2\2\t;\3\2\2\2\13A\3\2\2\2\rJ\3\2\2"+
		"\2\17U\3\2\2\2\21a\3\2\2\2\23j\3\2\2\2\25n\3\2\2\2\27p\3\2\2\2\31r\3\2"+
		"\2\2\33t\3\2\2\2\35v\3\2\2\2\37x\3\2\2\2!z\3\2\2\2#|\3\2\2\2%\177\3\2"+
		"\2\2\'\u0086\3\2\2\2)\u008c\3\2\2\2+\u0096\3\2\2\2-.\7d\2\2./\7g\2\2/"+
		"\60\7i\2\2\60\61\7k\2\2\61\62\7p\2\2\62\4\3\2\2\2\63\64\7g\2\2\64\65\7"+
		"p\2\2\65\66\7f\2\2\66\6\3\2\2\2\678\7i\2\289\7g\2\29:\7v\2\2:\b\3\2\2"+
		"\2;<\7e\2\2<=\7n\2\2=>\7k\2\2>?\7e\2\2?@\7m\2\2@\n\3\2\2\2AB\7u\2\2BC"+
		"\7g\2\2CD\7p\2\2DE\7f\2\2EF\7M\2\2FG\7g\2\2GH\7{\2\2HI\7u\2\2I\f\3\2\2"+
		"\2JK\7x\2\2KL\7g\2\2LM\7t\2\2MN\7k\2\2NO\7h\2\2OP\7{\2\2PQ\7V\2\2QR\7"+
		"g\2\2RS\7z\2\2ST\7v\2\2T\16\3\2\2\2UV\7x\2\2VW\7g\2\2WX\7t\2\2XY\7k\2"+
		"\2YZ\7h\2\2Z[\7{\2\2[\\\7V\2\2\\]\7k\2\2]^\7v\2\2^_\7n\2\2_`\7g\2\2`\20"+
		"\3\2\2\2ab\7w\2\2bc\7r\2\2cd\7f\2\2de\7c\2\2ef\7v\2\2fg\7g\2\2gh\7F\2"+
		"\2hi\7D\2\2i\22\3\2\2\2jk\7<\2\2kl\7\61\2\2lm\7\61\2\2m\24\3\2\2\2no\7"+
		"<\2\2o\26\3\2\2\2pq\7\61\2\2q\30\3\2\2\2rs\7\60\2\2s\32\3\2\2\2tu\7B\2"+
		"\2u\34\3\2\2\2vw\7%\2\2w\36\3\2\2\2xy\7A\2\2y \3\2\2\2z{\7(\2\2{\"\3\2"+
		"\2\2|}\7?\2\2}$\3\2\2\2~\u0080\t\2\2\2\177~\3\2\2\2\u0080\u0081\3\2\2"+
		"\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082&\3\2\2\2\u0083\u0084\7"+
		"\'\2\2\u0084\u0085\t\3\2\2\u0085\u0087\t\3\2\2\u0086\u0083\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089(\3\2\2\2"+
		"\u008a\u008d\t\4\2\2\u008b\u008d\5\'\24\2\u008c\u008a\3\2\2\2\u008c\u008b"+
		"\3\2\2\2\u008d\u0092\3\2\2\2\u008e\u0091\t\5\2\2\u008f\u0091\5\'\24\2"+
		"\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093*\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"\u0097\t\6\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\b\26\2\2\u009b"+
		",\3\2\2\2\t\2\u0081\u0088\u008c\u0090\u0092\u0098\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}