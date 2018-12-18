// Generated from SELENE.g4 by ANTLR 4.7.1
package selene;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SELENEParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, DIGITS=20, HEX=21, STRING=22, QUOTATION_MARKS=23, 
		WS=24;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_updateTCs = 2, RULE_get = 3, 
		RULE_click = 4, RULE_sendKeys = 5, RULE_verifyText = 6, RULE_verifyTitle = 7, 
		RULE_testcaseId = 8, RULE_testcaseAuto = 9, RULE_url = 10, RULE_url_with_q = 11, 
		RULE_uri = 12, RULE_scheme = 13, RULE_host = 14, RULE_hostname = 15, RULE_hostnumber = 16, 
		RULE_port = 17, RULE_path = 18, RULE_user = 19, RULE_login = 20, RULE_password = 21, 
		RULE_frag = 22, RULE_query = 23, RULE_search = 24, RULE_searchparameter = 25, 
		RULE_element = 26, RULE_element_with_q = 27, RULE_title = 28, RULE_string = 29, 
		RULE_string_with_q = 30;
	public static final String[] ruleNames = {
		"program", "statement", "updateTCs", "get", "click", "sendKeys", "verifyText", 
		"verifyTitle", "testcaseId", "testcaseAuto", "url", "url_with_q", "uri", 
		"scheme", "host", "hostname", "hostnumber", "port", "path", "user", "login", 
		"password", "frag", "query", "search", "searchparameter", "element", "element_with_q", 
		"title", "string", "string_with_q"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'begin'", "'end'", "'updateTCs'", "'get'", "'click'", "'sendKeys'", 
		"'verifyText'", "'verifyTitle'", "'testcaseId'", "'testcaseAuto'", "'://'", 
		"':'", "'/'", "'.'", "'@'", "'#'", "'?'", "'&'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "DIGITS", "HEX", "STRING", 
		"QUOTATION_MARKS", "WS"
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

	@Override
	public String getGrammarFileName() { return "SELENE.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SELENEParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
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
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__0);
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63);
				statement();
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0) );
			setState(68);
			match(T__1);
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

	public static class StatementContext extends ParserRuleContext {
		public GetContext get() {
			return getRuleContext(GetContext.class,0);
		}
		public ClickContext click() {
			return getRuleContext(ClickContext.class,0);
		}
		public SendKeysContext sendKeys() {
			return getRuleContext(SendKeysContext.class,0);
		}
		public VerifyTextContext verifyText() {
			return getRuleContext(VerifyTextContext.class,0);
		}
		public VerifyTitleContext verifyTitle() {
			return getRuleContext(VerifyTitleContext.class,0);
		}
		public UpdateTCsContext updateTCs() {
			return getRuleContext(UpdateTCsContext.class,0);
		}
		public TestcaseIdContext testcaseId() {
			return getRuleContext(TestcaseIdContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				get();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				click();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				sendKeys();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				verifyText();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				verifyTitle();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				updateTCs();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 7);
				{
				setState(76);
				testcaseId();
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

	public static class UpdateTCsContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public UpdateTCsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateTCs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterUpdateTCs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitUpdateTCs(this);
		}
	}

	public final UpdateTCsContext updateTCs() throws RecognitionException {
		UpdateTCsContext _localctx = new UpdateTCsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_updateTCs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__2);
			setState(80);
			string();
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

	public static class GetContext extends ParserRuleContext {
		public Url_with_qContext url_with_q() {
			return getRuleContext(Url_with_qContext.class,0);
		}
		public GetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitGet(this);
		}
	}

	public final GetContext get() throws RecognitionException {
		GetContext _localctx = new GetContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__3);
			setState(83);
			url_with_q();
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

	public static class ClickContext extends ParserRuleContext {
		public String_with_qContext string_with_q() {
			return getRuleContext(String_with_qContext.class,0);
		}
		public ClickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_click; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterClick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitClick(this);
		}
	}

	public final ClickContext click() throws RecognitionException {
		ClickContext _localctx = new ClickContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_click);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__4);
			setState(86);
			string_with_q();
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

	public static class SendKeysContext extends ParserRuleContext {
		public Element_with_qContext element_with_q() {
			return getRuleContext(Element_with_qContext.class,0);
		}
		public String_with_qContext string_with_q() {
			return getRuleContext(String_with_qContext.class,0);
		}
		public SendKeysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sendKeys; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterSendKeys(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitSendKeys(this);
		}
	}

	public final SendKeysContext sendKeys() throws RecognitionException {
		SendKeysContext _localctx = new SendKeysContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sendKeys);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__5);
			setState(89);
			element_with_q();
			setState(90);
			string_with_q();
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

	public static class VerifyTextContext extends ParserRuleContext {
		public Element_with_qContext element_with_q() {
			return getRuleContext(Element_with_qContext.class,0);
		}
		public String_with_qContext string_with_q() {
			return getRuleContext(String_with_qContext.class,0);
		}
		public VerifyTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verifyText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterVerifyText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitVerifyText(this);
		}
	}

	public final VerifyTextContext verifyText() throws RecognitionException {
		VerifyTextContext _localctx = new VerifyTextContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_verifyText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__6);
			setState(93);
			element_with_q();
			setState(94);
			string_with_q();
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

	public static class VerifyTitleContext extends ParserRuleContext {
		public String_with_qContext string_with_q() {
			return getRuleContext(String_with_qContext.class,0);
		}
		public VerifyTitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verifyTitle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterVerifyTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitVerifyTitle(this);
		}
	}

	public final VerifyTitleContext verifyTitle() throws RecognitionException {
		VerifyTitleContext _localctx = new VerifyTitleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_verifyTitle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__7);
			setState(97);
			string_with_q();
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

	public static class TestcaseIdContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TestcaseIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testcaseId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterTestcaseId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitTestcaseId(this);
		}
	}

	public final TestcaseIdContext testcaseId() throws RecognitionException {
		TestcaseIdContext _localctx = new TestcaseIdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_testcaseId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__8);
			setState(100);
			string();
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

	public static class TestcaseAutoContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TestcaseAutoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testcaseAuto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterTestcaseAuto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitTestcaseAuto(this);
		}
	}

	public final TestcaseAutoContext testcaseAuto() throws RecognitionException {
		TestcaseAutoContext _localctx = new TestcaseAutoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_testcaseAuto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__9);
			setState(103);
			string();
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

	public static class UrlContext extends ParserRuleContext {
		public UriContext uri() {
			return getRuleContext(UriContext.class,0);
		}
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitUrl(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			uri();
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

	public static class Url_with_qContext extends ParserRuleContext {
		public List<TerminalNode> QUOTATION_MARKS() { return getTokens(SELENEParser.QUOTATION_MARKS); }
		public TerminalNode QUOTATION_MARKS(int i) {
			return getToken(SELENEParser.QUOTATION_MARKS, i);
		}
		public UriContext uri() {
			return getRuleContext(UriContext.class,0);
		}
		public Url_with_qContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url_with_q; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterUrl_with_q(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitUrl_with_q(this);
		}
	}

	public final Url_with_qContext url_with_q() throws RecognitionException {
		Url_with_qContext _localctx = new Url_with_qContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_url_with_q);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(QUOTATION_MARKS);
			setState(108);
			uri();
			setState(109);
			match(QUOTATION_MARKS);
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

	public static class UriContext extends ParserRuleContext {
		public SchemeContext scheme() {
			return getRuleContext(SchemeContext.class,0);
		}
		public HostContext host() {
			return getRuleContext(HostContext.class,0);
		}
		public LoginContext login() {
			return getRuleContext(LoginContext.class,0);
		}
		public PortContext port() {
			return getRuleContext(PortContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public FragContext frag() {
			return getRuleContext(FragContext.class,0);
		}
		public TerminalNode WS() { return getToken(SELENEParser.WS, 0); }
		public UriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterUri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitUri(this);
		}
	}

	public final UriContext uri() throws RecognitionException {
		UriContext _localctx = new UriContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_uri);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			scheme();
			setState(112);
			match(T__10);
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(113);
				login();
				}
				break;
			}
			setState(116);
			host();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(117);
				match(T__11);
				setState(118);
				port();
				}
			}

			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(121);
				match(T__12);
				setState(122);
				path();
				}
			}

			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(125);
				query();
				}
			}

			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(128);
				frag();
				}
			}

			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(131);
				match(WS);
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

	public static class SchemeContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public SchemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scheme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterScheme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitScheme(this);
		}
	}

	public final SchemeContext scheme() throws RecognitionException {
		SchemeContext _localctx = new SchemeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_scheme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			string();
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

	public static class HostContext extends ParserRuleContext {
		public HostnameContext hostname() {
			return getRuleContext(HostnameContext.class,0);
		}
		public HostnumberContext hostnumber() {
			return getRuleContext(HostnumberContext.class,0);
		}
		public HostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_host; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterHost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitHost(this);
		}
	}

	public final HostContext host() throws RecognitionException {
		HostContext _localctx = new HostContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_host);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(136);
				match(T__12);
				}
			}

			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(139);
				hostname();
				}
				break;
			case DIGITS:
				{
				setState(140);
				hostnumber();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class HostnameContext extends ParserRuleContext {
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public HostnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hostname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterHostname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitHostname(this);
		}
	}

	public final HostnameContext hostname() throws RecognitionException {
		HostnameContext _localctx = new HostnameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_hostname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			string();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(144);
				match(T__13);
				setState(145);
				string();
				}
				}
				setState(150);
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

	public static class HostnumberContext extends ParserRuleContext {
		public List<TerminalNode> DIGITS() { return getTokens(SELENEParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(SELENEParser.DIGITS, i);
		}
		public HostnumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hostnumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterHostnumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitHostnumber(this);
		}
	}

	public final HostnumberContext hostnumber() throws RecognitionException {
		HostnumberContext _localctx = new HostnumberContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_hostnumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(DIGITS);
			setState(152);
			match(T__13);
			setState(153);
			match(DIGITS);
			setState(154);
			match(T__13);
			setState(155);
			match(DIGITS);
			setState(156);
			match(T__13);
			setState(157);
			match(DIGITS);
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

	public static class PortContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(SELENEParser.DIGITS, 0); }
		public PortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterPort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitPort(this);
		}
	}

	public final PortContext port() throws RecognitionException {
		PortContext _localctx = new PortContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_port);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(DIGITS);
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

	public static class PathContext extends ParserRuleContext {
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitPath(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			string();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(162);
				match(T__12);
				setState(163);
				string();
				}
				}
				setState(168);
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

	public static class UserContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public UserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterUser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitUser(this);
		}
	}

	public final UserContext user() throws RecognitionException {
		UserContext _localctx = new UserContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_user);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			string();
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

	public static class LoginContext extends ParserRuleContext {
		public UserContext user() {
			return getRuleContext(UserContext.class,0);
		}
		public PasswordContext password() {
			return getRuleContext(PasswordContext.class,0);
		}
		public LoginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_login; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterLogin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitLogin(this);
		}
	}

	public final LoginContext login() throws RecognitionException {
		LoginContext _localctx = new LoginContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_login);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			user();
			setState(172);
			match(T__11);
			setState(173);
			password();
			setState(174);
			match(T__14);
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

	public static class PasswordContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public PasswordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_password; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterPassword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitPassword(this);
		}
	}

	public final PasswordContext password() throws RecognitionException {
		PasswordContext _localctx = new PasswordContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_password);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			string();
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

	public static class FragContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public FragContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterFrag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitFrag(this);
		}
	}

	public final FragContext frag() throws RecognitionException {
		FragContext _localctx = new FragContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_frag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(178);
			match(T__15);
			setState(179);
			string();
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

	public static class QueryContext extends ParserRuleContext {
		public SearchContext search() {
			return getRuleContext(SearchContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(181);
			match(T__16);
			setState(182);
			search();
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

	public static class SearchContext extends ParserRuleContext {
		public List<SearchparameterContext> searchparameter() {
			return getRuleContexts(SearchparameterContext.class);
		}
		public SearchparameterContext searchparameter(int i) {
			return getRuleContext(SearchparameterContext.class,i);
		}
		public SearchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterSearch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitSearch(this);
		}
	}

	public final SearchContext search() throws RecognitionException {
		SearchContext _localctx = new SearchContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_search);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			searchparameter();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(185);
				match(T__17);
				setState(186);
				searchparameter();
				}
				}
				setState(191);
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

	public static class SearchparameterContext extends ParserRuleContext {
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode DIGITS() { return getToken(SELENEParser.DIGITS, 0); }
		public TerminalNode HEX() { return getToken(SELENEParser.HEX, 0); }
		public SearchparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterSearchparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitSearchparameter(this);
		}
	}

	public final SearchparameterContext searchparameter() throws RecognitionException {
		SearchparameterContext _localctx = new SearchparameterContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_searchparameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			string();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(193);
				match(T__18);
				setState(197);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(194);
					string();
					}
					break;
				case DIGITS:
					{
					setState(195);
					match(DIGITS);
					}
					break;
				case HEX:
					{
					setState(196);
					match(HEX);
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class ElementContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			string();
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

	public static class Element_with_qContext extends ParserRuleContext {
		public List<TerminalNode> QUOTATION_MARKS() { return getTokens(SELENEParser.QUOTATION_MARKS); }
		public TerminalNode QUOTATION_MARKS(int i) {
			return getToken(SELENEParser.QUOTATION_MARKS, i);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Element_with_qContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_with_q; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterElement_with_q(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitElement_with_q(this);
		}
	}

	public final Element_with_qContext element_with_q() throws RecognitionException {
		Element_with_qContext _localctx = new Element_with_qContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_element_with_q);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(QUOTATION_MARKS);
			setState(204);
			string();
			setState(205);
			match(QUOTATION_MARKS);
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

	public static class TitleContext extends ParserRuleContext {
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitTitle(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_title);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(207);
				string();
				}
				}
				setState(210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SELENEParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(STRING);
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

	public static class String_with_qContext extends ParserRuleContext {
		public List<TerminalNode> QUOTATION_MARKS() { return getTokens(SELENEParser.QUOTATION_MARKS); }
		public TerminalNode QUOTATION_MARKS(int i) {
			return getToken(SELENEParser.QUOTATION_MARKS, i);
		}
		public TerminalNode STRING() { return getToken(SELENEParser.STRING, 0); }
		public String_with_qContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_with_q; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterString_with_q(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitString_with_q(this);
		}
	}

	public final String_with_qContext string_with_q() throws RecognitionException {
		String_with_qContext _localctx = new String_with_qContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_string_with_q);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(QUOTATION_MARKS);
			setState(215);
			match(STRING);
			setState(216);
			match(QUOTATION_MARKS);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u00dd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\6\2C\n\2\r\2\16\2D\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3P\n\3\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\5\16u\n\16\3\16\3\16\3\16\5\16z\n\16\3\16\3\16\5\16~\n\16\3\16\5"+
		"\16\u0081\n\16\3\16\5\16\u0084\n\16\3\16\5\16\u0087\n\16\3\17\3\17\3\20"+
		"\5\20\u008c\n\20\3\20\3\20\5\20\u0090\n\20\3\21\3\21\3\21\7\21\u0095\n"+
		"\21\f\21\16\21\u0098\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\7\24\u00a7\n\24\f\24\16\24\u00aa\13\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\7\32\u00be\n\32\f\32\16\32\u00c1\13\32\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u00c8\n\33\5\33\u00ca\n\33\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\36\6\36\u00d3\n\36\r\36\16\36\u00d4\3\37\3\37\3 \3 \3 \3 \3 \2\2!\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\2\2\u00d3"+
		"\2@\3\2\2\2\4O\3\2\2\2\6Q\3\2\2\2\bT\3\2\2\2\nW\3\2\2\2\fZ\3\2\2\2\16"+
		"^\3\2\2\2\20b\3\2\2\2\22e\3\2\2\2\24h\3\2\2\2\26k\3\2\2\2\30m\3\2\2\2"+
		"\32q\3\2\2\2\34\u0088\3\2\2\2\36\u008b\3\2\2\2 \u0091\3\2\2\2\"\u0099"+
		"\3\2\2\2$\u00a1\3\2\2\2&\u00a3\3\2\2\2(\u00ab\3\2\2\2*\u00ad\3\2\2\2,"+
		"\u00b2\3\2\2\2.\u00b4\3\2\2\2\60\u00b7\3\2\2\2\62\u00ba\3\2\2\2\64\u00c2"+
		"\3\2\2\2\66\u00cb\3\2\2\28\u00cd\3\2\2\2:\u00d2\3\2\2\2<\u00d6\3\2\2\2"+
		">\u00d8\3\2\2\2@B\7\3\2\2AC\5\4\3\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3"+
		"\2\2\2EF\3\2\2\2FG\7\4\2\2G\3\3\2\2\2HP\5\b\5\2IP\5\n\6\2JP\5\f\7\2KP"+
		"\5\16\b\2LP\5\20\t\2MP\5\6\4\2NP\5\22\n\2OH\3\2\2\2OI\3\2\2\2OJ\3\2\2"+
		"\2OK\3\2\2\2OL\3\2\2\2OM\3\2\2\2ON\3\2\2\2P\5\3\2\2\2QR\7\5\2\2RS\5<\37"+
		"\2S\7\3\2\2\2TU\7\6\2\2UV\5\30\r\2V\t\3\2\2\2WX\7\7\2\2XY\5> \2Y\13\3"+
		"\2\2\2Z[\7\b\2\2[\\\58\35\2\\]\5> \2]\r\3\2\2\2^_\7\t\2\2_`\58\35\2`a"+
		"\5> \2a\17\3\2\2\2bc\7\n\2\2cd\5> \2d\21\3\2\2\2ef\7\13\2\2fg\5<\37\2"+
		"g\23\3\2\2\2hi\7\f\2\2ij\5<\37\2j\25\3\2\2\2kl\5\32\16\2l\27\3\2\2\2m"+
		"n\7\31\2\2no\5\32\16\2op\7\31\2\2p\31\3\2\2\2qr\5\34\17\2rt\7\r\2\2su"+
		"\5*\26\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vy\5\36\20\2wx\7\16\2\2xz\5$\23"+
		"\2yw\3\2\2\2yz\3\2\2\2z}\3\2\2\2{|\7\17\2\2|~\5&\24\2}{\3\2\2\2}~\3\2"+
		"\2\2~\u0080\3\2\2\2\177\u0081\5\60\31\2\u0080\177\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0084\5.\30\2\u0083\u0082\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0087\7\32\2\2\u0086\u0085\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\33\3\2\2\2\u0088\u0089\5<\37\2\u0089"+
		"\35\3\2\2\2\u008a\u008c\7\17\2\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2"+
		"\2\u008c\u008f\3\2\2\2\u008d\u0090\5 \21\2\u008e\u0090\5\"\22\2\u008f"+
		"\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\37\3\2\2\2\u0091\u0096\5<\37"+
		"\2\u0092\u0093\7\20\2\2\u0093\u0095\5<\37\2\u0094\u0092\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097!\3\2\2\2"+
		"\u0098\u0096\3\2\2\2\u0099\u009a\7\26\2\2\u009a\u009b\7\20\2\2\u009b\u009c"+
		"\7\26\2\2\u009c\u009d\7\20\2\2\u009d\u009e\7\26\2\2\u009e\u009f\7\20\2"+
		"\2\u009f\u00a0\7\26\2\2\u00a0#\3\2\2\2\u00a1\u00a2\7\26\2\2\u00a2%\3\2"+
		"\2\2\u00a3\u00a8\5<\37\2\u00a4\u00a5\7\17\2\2\u00a5\u00a7\5<\37\2\u00a6"+
		"\u00a4\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\'\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\5<\37\2\u00ac)\3"+
		"\2\2\2\u00ad\u00ae\5(\25\2\u00ae\u00af\7\16\2\2\u00af\u00b0\5,\27\2\u00b0"+
		"\u00b1\7\21\2\2\u00b1+\3\2\2\2\u00b2\u00b3\5<\37\2\u00b3-\3\2\2\2\u00b4"+
		"\u00b5\7\22\2\2\u00b5\u00b6\5<\37\2\u00b6/\3\2\2\2\u00b7\u00b8\7\23\2"+
		"\2\u00b8\u00b9\5\62\32\2\u00b9\61\3\2\2\2\u00ba\u00bf\5\64\33\2\u00bb"+
		"\u00bc\7\24\2\2\u00bc\u00be\5\64\33\2\u00bd\u00bb\3\2\2\2\u00be\u00c1"+
		"\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\63\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c2\u00c9\5<\37\2\u00c3\u00c7\7\25\2\2\u00c4\u00c8\5"+
		"<\37\2\u00c5\u00c8\7\26\2\2\u00c6\u00c8\7\27\2\2\u00c7\u00c4\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c3\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\65\3\2\2\2\u00cb\u00cc\5<\37\2\u00cc\67"+
		"\3\2\2\2\u00cd\u00ce\7\31\2\2\u00ce\u00cf\5<\37\2\u00cf\u00d0\7\31\2\2"+
		"\u00d09\3\2\2\2\u00d1\u00d3\5<\37\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3"+
		"\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5;\3\2\2\2\u00d6\u00d7"+
		"\7\30\2\2\u00d7=\3\2\2\2\u00d8\u00d9\7\31\2\2\u00d9\u00da\7\30\2\2\u00da"+
		"\u00db\7\31\2\2\u00db?\3\2\2\2\22DOty}\u0080\u0083\u0086\u008b\u008f\u0096"+
		"\u00a8\u00bf\u00c7\u00c9\u00d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}