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
		DIGITS=18, HEX=19, STRING=20, WS=21;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_get = 2, RULE_click = 3, RULE_sendKeys = 4, 
		RULE_verifyText = 5, RULE_verifyTitle = 6, RULE_updateDB = 7, RULE_url = 8, 
		RULE_uri = 9, RULE_scheme = 10, RULE_host = 11, RULE_hostname = 12, RULE_hostnumber = 13, 
		RULE_port = 14, RULE_path = 15, RULE_user = 16, RULE_login = 17, RULE_password = 18, 
		RULE_frag = 19, RULE_query = 20, RULE_search = 21, RULE_searchparameter = 22, 
		RULE_element = 23, RULE_title = 24, RULE_string = 25;
	public static final String[] ruleNames = {
		"program", "statement", "get", "click", "sendKeys", "verifyText", "verifyTitle", 
		"updateDB", "url", "uri", "scheme", "host", "hostname", "hostnumber", 
		"port", "path", "user", "login", "password", "frag", "query", "search", 
		"searchparameter", "element", "title", "string"
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
			setState(52);
			match(T__0);
			setState(54); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53);
				statement();
				}
				}
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) );
			setState(58);
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
		public UpdateDBContext updateDB() {
			return getRuleContext(UpdateDBContext.class,0);
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
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				get();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				click();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				sendKeys();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				verifyText();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				verifyTitle();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				updateDB();
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

	public static class GetContext extends ParserRuleContext {
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
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
		enterRule(_localctx, 4, RULE_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__2);
			setState(69);
			url();
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
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
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
		enterRule(_localctx, 6, RULE_click);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__3);
			setState(72);
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

	public static class SendKeysContext extends ParserRuleContext {
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
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
		enterRule(_localctx, 8, RULE_sendKeys);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__4);
			setState(75);
			string();
			setState(76);
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

	public static class VerifyTextContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
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
		enterRule(_localctx, 10, RULE_verifyText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__5);
			setState(79);
			element();
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

	public static class VerifyTitleContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
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
		enterRule(_localctx, 12, RULE_verifyTitle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__6);
			setState(83);
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

	public static class UpdateDBContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public UpdateDBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateDB; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterUpdateDB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitUpdateDB(this);
		}
	}

	public final UpdateDBContext updateDB() throws RecognitionException {
		UpdateDBContext _localctx = new UpdateDBContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_updateDB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__7);
			setState(86);
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
		enterRule(_localctx, 16, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
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
		enterRule(_localctx, 18, RULE_uri);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			scheme();
			setState(91);
			match(T__8);
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(92);
				login();
				}
				break;
			}
			setState(95);
			host();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(96);
				match(T__9);
				setState(97);
				port();
				}
			}

			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(100);
				match(T__10);
				setState(101);
				path();
				}
			}

			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(104);
				query();
				}
			}

			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(107);
				frag();
				}
			}

			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(110);
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
		enterRule(_localctx, 20, RULE_scheme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
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
		enterRule(_localctx, 22, RULE_host);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(115);
				match(T__10);
				}
			}

			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(118);
				hostname();
				}
				break;
			case DIGITS:
				{
				setState(119);
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
		enterRule(_localctx, 24, RULE_hostname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			string();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(123);
				match(T__11);
				setState(124);
				string();
				}
				}
				setState(129);
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
		enterRule(_localctx, 26, RULE_hostnumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(DIGITS);
			setState(131);
			match(T__11);
			setState(132);
			match(DIGITS);
			setState(133);
			match(T__11);
			setState(134);
			match(DIGITS);
			setState(135);
			match(T__11);
			setState(136);
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
		enterRule(_localctx, 28, RULE_port);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
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
		enterRule(_localctx, 30, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			string();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(141);
				match(T__10);
				setState(142);
				string();
				}
				}
				setState(147);
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
		enterRule(_localctx, 32, RULE_user);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
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
		enterRule(_localctx, 34, RULE_login);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			user();
			setState(151);
			match(T__9);
			setState(152);
			password();
			setState(153);
			match(T__12);
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
		enterRule(_localctx, 36, RULE_password);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
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
		enterRule(_localctx, 38, RULE_frag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(157);
			match(T__13);
			setState(158);
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
		enterRule(_localctx, 40, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(160);
			match(T__14);
			setState(161);
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
		enterRule(_localctx, 42, RULE_search);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			searchparameter();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(164);
				match(T__15);
				setState(165);
				searchparameter();
				}
				}
				setState(170);
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
		enterRule(_localctx, 44, RULE_searchparameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			string();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(172);
				match(T__16);
				setState(176);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(173);
					string();
					}
					break;
				case DIGITS:
					{
					setState(174);
					match(DIGITS);
					}
					break;
				case HEX:
					{
					setState(175);
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
		enterRule(_localctx, 46, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
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
		enterRule(_localctx, 48, RULE_title);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182);
				string();
				}
				}
				setState(185); 
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
		enterRule(_localctx, 50, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u00c0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\6\29\n\2\r\2\16\2:\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3E\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\5\13`\n\13\3\13"+
		"\3\13\3\13\5\13e\n\13\3\13\3\13\5\13i\n\13\3\13\5\13l\n\13\3\13\5\13o"+
		"\n\13\3\13\5\13r\n\13\3\f\3\f\3\r\5\rw\n\r\3\r\3\r\5\r{\n\r\3\16\3\16"+
		"\3\16\7\16\u0080\n\16\f\16\16\16\u0083\13\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\7\21\u0092\n\21\f\21\16\21\u0095"+
		"\13\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\7\27\u00a9\n\27\f\27\16\27\u00ac\13\27\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u00b3\n\30\5\30\u00b5\n\30\3\31\3\31\3\32\6"+
		"\32\u00ba\n\32\r\32\16\32\u00bb\3\33\3\33\3\33\2\2\34\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\2\2\u00ba\2\66\3\2\2\2\4D\3"+
		"\2\2\2\6F\3\2\2\2\bI\3\2\2\2\nL\3\2\2\2\fP\3\2\2\2\16T\3\2\2\2\20W\3\2"+
		"\2\2\22Z\3\2\2\2\24\\\3\2\2\2\26s\3\2\2\2\30v\3\2\2\2\32|\3\2\2\2\34\u0084"+
		"\3\2\2\2\36\u008c\3\2\2\2 \u008e\3\2\2\2\"\u0096\3\2\2\2$\u0098\3\2\2"+
		"\2&\u009d\3\2\2\2(\u009f\3\2\2\2*\u00a2\3\2\2\2,\u00a5\3\2\2\2.\u00ad"+
		"\3\2\2\2\60\u00b6\3\2\2\2\62\u00b9\3\2\2\2\64\u00bd\3\2\2\2\668\7\3\2"+
		"\2\679\5\4\3\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\7"+
		"\4\2\2=\3\3\2\2\2>E\5\6\4\2?E\5\b\5\2@E\5\n\6\2AE\5\f\7\2BE\5\16\b\2C"+
		"E\5\20\t\2D>\3\2\2\2D?\3\2\2\2D@\3\2\2\2DA\3\2\2\2DB\3\2\2\2DC\3\2\2\2"+
		"E\5\3\2\2\2FG\7\5\2\2GH\5\22\n\2H\7\3\2\2\2IJ\7\6\2\2JK\5\64\33\2K\t\3"+
		"\2\2\2LM\7\7\2\2MN\5\64\33\2NO\5\64\33\2O\13\3\2\2\2PQ\7\b\2\2QR\5\60"+
		"\31\2RS\5\64\33\2S\r\3\2\2\2TU\7\t\2\2UV\5\64\33\2V\17\3\2\2\2WX\7\n\2"+
		"\2XY\5\64\33\2Y\21\3\2\2\2Z[\5\24\13\2[\23\3\2\2\2\\]\5\26\f\2]_\7\13"+
		"\2\2^`\5$\23\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ad\5\30\r\2bc\7\f\2\2ce\5"+
		"\36\20\2db\3\2\2\2de\3\2\2\2eh\3\2\2\2fg\7\r\2\2gi\5 \21\2hf\3\2\2\2h"+
		"i\3\2\2\2ik\3\2\2\2jl\5*\26\2kj\3\2\2\2kl\3\2\2\2ln\3\2\2\2mo\5(\25\2"+
		"nm\3\2\2\2no\3\2\2\2oq\3\2\2\2pr\7\27\2\2qp\3\2\2\2qr\3\2\2\2r\25\3\2"+
		"\2\2st\5\64\33\2t\27\3\2\2\2uw\7\r\2\2vu\3\2\2\2vw\3\2\2\2wz\3\2\2\2x"+
		"{\5\32\16\2y{\5\34\17\2zx\3\2\2\2zy\3\2\2\2{\31\3\2\2\2|\u0081\5\64\33"+
		"\2}~\7\16\2\2~\u0080\5\64\33\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\33\3\2\2\2\u0083\u0081\3\2\2\2"+
		"\u0084\u0085\7\24\2\2\u0085\u0086\7\16\2\2\u0086\u0087\7\24\2\2\u0087"+
		"\u0088\7\16\2\2\u0088\u0089\7\24\2\2\u0089\u008a\7\16\2\2\u008a\u008b"+
		"\7\24\2\2\u008b\35\3\2\2\2\u008c\u008d\7\24\2\2\u008d\37\3\2\2\2\u008e"+
		"\u0093\5\64\33\2\u008f\u0090\7\r\2\2\u0090\u0092\5\64\33\2\u0091\u008f"+
		"\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"!\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\5\64\33\2\u0097#\3\2\2\2\u0098"+
		"\u0099\5\"\22\2\u0099\u009a\7\f\2\2\u009a\u009b\5&\24\2\u009b\u009c\7"+
		"\17\2\2\u009c%\3\2\2\2\u009d\u009e\5\64\33\2\u009e\'\3\2\2\2\u009f\u00a0"+
		"\7\20\2\2\u00a0\u00a1\5\64\33\2\u00a1)\3\2\2\2\u00a2\u00a3\7\21\2\2\u00a3"+
		"\u00a4\5,\27\2\u00a4+\3\2\2\2\u00a5\u00aa\5.\30\2\u00a6\u00a7\7\22\2\2"+
		"\u00a7\u00a9\5.\30\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab-\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00b4\5\64\33\2\u00ae\u00b2\7\23\2\2\u00af\u00b3\5\64\33\2\u00b0\u00b3"+
		"\7\24\2\2\u00b1\u00b3\7\25\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2"+
		"\u00b2\u00b1\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5/\3\2\2\2\u00b6\u00b7\5\64\33\2\u00b7\61\3\2\2\2\u00b8\u00ba"+
		"\5\64\33\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2"+
		"\u00bb\u00bc\3\2\2\2\u00bc\63\3\2\2\2\u00bd\u00be\7\26\2\2\u00be\65\3"+
		"\2\2\2\22:D_dhknqvz\u0081\u0093\u00aa\u00b2\u00b4\u00bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}