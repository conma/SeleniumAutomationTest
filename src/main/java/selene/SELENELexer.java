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
		T__9=10, T__10=11, T__11=12, DIGITS=13, HEX=14, STRING=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "DIGITS", "HEX", "STRING", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'begin'", "'end'", "'get'", "'://'", "':'", "'/'", "'.'", "'@'", 
		"'#'", "'?'", "'&'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "DIGITS", "HEX", "STRING", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22a\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\6\16G"+
		"\n\16\r\16\16\16H\3\17\3\17\3\17\6\17N\n\17\r\17\16\17O\3\20\3\20\5\20"+
		"T\n\20\3\20\3\20\7\20X\n\20\f\20\16\20[\13\20\3\21\6\21^\n\21\r\21\16"+
		"\21_\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22\3\2\7\3\2\62;\5\2\62;CHch\6\2\62;C\\c|\u0080\u0080"+
		"\6\2/\60\62;C\\c|\4\2\f\f\17\17\2f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5)\3\2\2\2\7-\3\2\2\2\t\61\3\2\2"+
		"\2\13\65\3\2\2\2\r\67\3\2\2\2\179\3\2\2\2\21;\3\2\2\2\23=\3\2\2\2\25?"+
		"\3\2\2\2\27A\3\2\2\2\31C\3\2\2\2\33F\3\2\2\2\35M\3\2\2\2\37S\3\2\2\2!"+
		"]\3\2\2\2#$\7d\2\2$%\7g\2\2%&\7i\2\2&\'\7k\2\2\'(\7p\2\2(\4\3\2\2\2)*"+
		"\7g\2\2*+\7p\2\2+,\7f\2\2,\6\3\2\2\2-.\7i\2\2./\7g\2\2/\60\7v\2\2\60\b"+
		"\3\2\2\2\61\62\7<\2\2\62\63\7\61\2\2\63\64\7\61\2\2\64\n\3\2\2\2\65\66"+
		"\7<\2\2\66\f\3\2\2\2\678\7\61\2\28\16\3\2\2\29:\7\60\2\2:\20\3\2\2\2;"+
		"<\7B\2\2<\22\3\2\2\2=>\7%\2\2>\24\3\2\2\2?@\7A\2\2@\26\3\2\2\2AB\7(\2"+
		"\2B\30\3\2\2\2CD\7?\2\2D\32\3\2\2\2EG\t\2\2\2FE\3\2\2\2GH\3\2\2\2HF\3"+
		"\2\2\2HI\3\2\2\2I\34\3\2\2\2JK\7\'\2\2KL\t\3\2\2LN\t\3\2\2MJ\3\2\2\2N"+
		"O\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\36\3\2\2\2QT\t\4\2\2RT\5\35\17\2SQ\3\2"+
		"\2\2SR\3\2\2\2TY\3\2\2\2UX\t\5\2\2VX\5\35\17\2WU\3\2\2\2WV\3\2\2\2X[\3"+
		"\2\2\2YW\3\2\2\2YZ\3\2\2\2Z \3\2\2\2[Y\3\2\2\2\\^\t\6\2\2]\\\3\2\2\2^"+
		"_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\"\3\2\2\2\t\2HOSWY_\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}