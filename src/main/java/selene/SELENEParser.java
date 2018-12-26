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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		DIGITS=25, HEX=26, STRING=27, QUOTATION_MARKS=28, UNDERSCORE=29, WS=30;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_updateTCs = 2, RULE_testcaseId = 3, 
		RULE_testcaseAuto = 4, RULE_get = 5, RULE_access = 6, RULE_click = 7, 
		RULE_sendKeys = 8, RULE_verifyText = 9, RULE_verifyTitle = 10, RULE_hover = 11, 
		RULE_verifyEnable = 12, RULE_endTC = 13, RULE_quit = 14, RULE_url = 15, 
		RULE_url_with_q = 16, RULE_uri = 17, RULE_scheme = 18, RULE_host = 19, 
		RULE_hostname = 20, RULE_hostnumber = 21, RULE_port = 22, RULE_path = 23, 
		RULE_user = 24, RULE_login = 25, RULE_password = 26, RULE_frag = 27, RULE_query = 28, 
		RULE_search = 29, RULE_searchparameter = 30, RULE_element = 31, RULE_element_with_q = 32, 
		RULE_title = 33, RULE_string = 34, RULE_string_with_q = 35;
	public static final String[] ruleNames = {
		"program", "statement", "updateTCs", "testcaseId", "testcaseAuto", "get", 
		"access", "click", "sendKeys", "verifyText", "verifyTitle", "hover", "verifyEnable", 
		"endTC", "quit", "url", "url_with_q", "uri", "scheme", "host", "hostname", 
		"hostnumber", "port", "path", "user", "login", "password", "frag", "query", 
		"search", "searchparameter", "element", "element_with_q", "title", "string", 
		"string_with_q"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'begin'", "'end'", "'updateTCs'", "'testcaseId'", "'testcaseAuto'", 
		"'get'", "'access'", "'click'", "'sendKeys'", "'verifyText'", "'verifyTitle'", 
		"'hover'", "'verifyEnable'", "'endTC'", "'quit'", "'://'", "':'", "'/'", 
		"'.'", "'@'", "'#'", "'?'", "'&'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "DIGITS", "HEX", "STRING", "QUOTATION_MARKS", "UNDERSCORE", "WS"
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
			setState(72);
			match(T__0);
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				statement();
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0) );
			setState(78);
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
		public UpdateTCsContext updateTCs() {
			return getRuleContext(UpdateTCsContext.class,0);
		}
		public TestcaseAutoContext testcaseAuto() {
			return getRuleContext(TestcaseAutoContext.class,0);
		}
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
		public TestcaseIdContext testcaseId() {
			return getRuleContext(TestcaseIdContext.class,0);
		}
		public HoverContext hover() {
			return getRuleContext(HoverContext.class,0);
		}
		public VerifyEnableContext verifyEnable() {
			return getRuleContext(VerifyEnableContext.class,0);
		}
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public EndTCContext endTC() {
			return getRuleContext(EndTCContext.class,0);
		}
		public QuitContext quit() {
			return getRuleContext(QuitContext.class,0);
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
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				updateTCs();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				testcaseAuto();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				get();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				click();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				sendKeys();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				verifyText();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 7);
				{
				setState(86);
				verifyTitle();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 8);
				{
				setState(87);
				testcaseId();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 9);
				{
				setState(88);
				hover();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 10);
				{
				setState(89);
				verifyEnable();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 11);
				{
				setState(90);
				access();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 12);
				{
				setState(91);
				endTC();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 13);
				{
				setState(92);
				quit();
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
			setState(95);
			match(T__2);
			setState(96);
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
		enterRule(_localctx, 6, RULE_testcaseId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__3);
			setState(99);
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
		enterRule(_localctx, 8, RULE_testcaseAuto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__4);
			setState(102);
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
		enterRule(_localctx, 10, RULE_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__5);
			setState(105);
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

	public static class AccessContext extends ParserRuleContext {
		public Url_with_qContext url_with_q() {
			return getRuleContext(Url_with_qContext.class,0);
		}
		public AccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitAccess(this);
		}
	}

	public final AccessContext access() throws RecognitionException {
		AccessContext _localctx = new AccessContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__6);
			setState(108);
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
		public Element_with_qContext element_with_q() {
			return getRuleContext(Element_with_qContext.class,0);
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
		enterRule(_localctx, 14, RULE_click);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__7);
			setState(111);
			element_with_q();
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
		enterRule(_localctx, 16, RULE_sendKeys);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__8);
			setState(114);
			element_with_q();
			setState(115);
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
		enterRule(_localctx, 18, RULE_verifyText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__9);
			setState(118);
			element_with_q();
			setState(119);
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
		enterRule(_localctx, 20, RULE_verifyTitle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__10);
			setState(122);
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

	public static class HoverContext extends ParserRuleContext {
		public Element_with_qContext element_with_q() {
			return getRuleContext(Element_with_qContext.class,0);
		}
		public HoverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hover; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterHover(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitHover(this);
		}
	}

	public final HoverContext hover() throws RecognitionException {
		HoverContext _localctx = new HoverContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_hover);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__11);
			setState(125);
			element_with_q();
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

	public static class VerifyEnableContext extends ParserRuleContext {
		public Element_with_qContext element_with_q() {
			return getRuleContext(Element_with_qContext.class,0);
		}
		public VerifyEnableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verifyEnable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterVerifyEnable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitVerifyEnable(this);
		}
	}

	public final VerifyEnableContext verifyEnable() throws RecognitionException {
		VerifyEnableContext _localctx = new VerifyEnableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_verifyEnable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__12);
			setState(128);
			element_with_q();
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

	public static class EndTCContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public EndTCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endTC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterEndTC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitEndTC(this);
		}
	}

	public final EndTCContext endTC() throws RecognitionException {
		EndTCContext _localctx = new EndTCContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_endTC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__13);
			setState(131);
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

	public static class QuitContext extends ParserRuleContext {
		public QuitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterQuit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitQuit(this);
		}
	}

	public final QuitContext quit() throws RecognitionException {
		QuitContext _localctx = new QuitContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_quit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
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
		enterRule(_localctx, 30, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
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
		enterRule(_localctx, 32, RULE_url_with_q);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(QUOTATION_MARKS);
			setState(138);
			uri();
			setState(139);
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
		enterRule(_localctx, 34, RULE_uri);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			scheme();
			setState(142);
			match(T__15);
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(143);
				login();
				}
				break;
			}
			setState(146);
			host();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(147);
				match(T__16);
				setState(148);
				port();
				}
			}

			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(151);
				match(T__17);
				setState(152);
				path();
				}
			}

			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(155);
				query();
				}
			}

			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(158);
				frag();
				}
			}

			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(161);
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
		enterRule(_localctx, 36, RULE_scheme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
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
		enterRule(_localctx, 38, RULE_host);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(166);
				match(T__17);
				}
			}

			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(169);
				hostname();
				}
				break;
			case DIGITS:
				{
				setState(170);
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
		enterRule(_localctx, 40, RULE_hostname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			string();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(174);
				match(T__18);
				setState(175);
				string();
				}
				}
				setState(180);
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
		enterRule(_localctx, 42, RULE_hostnumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(DIGITS);
			setState(182);
			match(T__18);
			setState(183);
			match(DIGITS);
			setState(184);
			match(T__18);
			setState(185);
			match(DIGITS);
			setState(186);
			match(T__18);
			setState(187);
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
		enterRule(_localctx, 44, RULE_port);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
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
		enterRule(_localctx, 46, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			string();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(192);
				match(T__17);
				setState(193);
				string();
				}
				}
				setState(198);
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
		enterRule(_localctx, 48, RULE_user);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
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
		enterRule(_localctx, 50, RULE_login);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			user();
			setState(202);
			match(T__16);
			setState(203);
			password();
			setState(204);
			match(T__19);
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
		enterRule(_localctx, 52, RULE_password);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
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
		enterRule(_localctx, 54, RULE_frag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(208);
			match(T__20);
			setState(209);
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
		enterRule(_localctx, 56, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(211);
			match(T__21);
			setState(212);
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
		enterRule(_localctx, 58, RULE_search);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			searchparameter();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(215);
				match(T__22);
				setState(216);
				searchparameter();
				}
				}
				setState(221);
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
		enterRule(_localctx, 60, RULE_searchparameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			string();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(223);
				match(T__23);
				setState(227);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(224);
					string();
					}
					break;
				case DIGITS:
					{
					setState(225);
					match(DIGITS);
					}
					break;
				case HEX:
					{
					setState(226);
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
		enterRule(_localctx, 62, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
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
		enterRule(_localctx, 64, RULE_element_with_q);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(QUOTATION_MARKS);
			setState(234);
			string();
			setState(235);
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
		enterRule(_localctx, 66, RULE_title);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(237);
				string();
				}
				}
				setState(240); 
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
		enterRule(_localctx, 68, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
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
		enterRule(_localctx, 70, RULE_string_with_q);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(QUOTATION_MARKS);
			setState(245);
			match(STRING);
			setState(246);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00fb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\6\2M\n\2\r\2\16\2N\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3`\n\3\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u0093"+
		"\n\23\3\23\3\23\3\23\5\23\u0098\n\23\3\23\3\23\5\23\u009c\n\23\3\23\5"+
		"\23\u009f\n\23\3\23\5\23\u00a2\n\23\3\23\5\23\u00a5\n\23\3\24\3\24\3\25"+
		"\5\25\u00aa\n\25\3\25\3\25\5\25\u00ae\n\25\3\26\3\26\3\26\7\26\u00b3\n"+
		"\26\f\26\16\26\u00b6\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\31\7\31\u00c5\n\31\f\31\16\31\u00c8\13\31\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\7\37\u00dc\n\37\f\37\16\37\u00df\13\37\3 \3 \3 \3 \3 \5 \u00e6"+
		"\n \5 \u00e8\n \3!\3!\3\"\3\"\3\"\3\"\3#\6#\u00f1\n#\r#\16#\u00f2\3$\3"+
		"$\3%\3%\3%\3%\3%\2\2&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BDFH\2\2\2\u00f2\2J\3\2\2\2\4_\3\2\2\2\6a\3\2\2\2\bd"+
		"\3\2\2\2\ng\3\2\2\2\fj\3\2\2\2\16m\3\2\2\2\20p\3\2\2\2\22s\3\2\2\2\24"+
		"w\3\2\2\2\26{\3\2\2\2\30~\3\2\2\2\32\u0081\3\2\2\2\34\u0084\3\2\2\2\36"+
		"\u0087\3\2\2\2 \u0089\3\2\2\2\"\u008b\3\2\2\2$\u008f\3\2\2\2&\u00a6\3"+
		"\2\2\2(\u00a9\3\2\2\2*\u00af\3\2\2\2,\u00b7\3\2\2\2.\u00bf\3\2\2\2\60"+
		"\u00c1\3\2\2\2\62\u00c9\3\2\2\2\64\u00cb\3\2\2\2\66\u00d0\3\2\2\28\u00d2"+
		"\3\2\2\2:\u00d5\3\2\2\2<\u00d8\3\2\2\2>\u00e0\3\2\2\2@\u00e9\3\2\2\2B"+
		"\u00eb\3\2\2\2D\u00f0\3\2\2\2F\u00f4\3\2\2\2H\u00f6\3\2\2\2JL\7\3\2\2"+
		"KM\5\4\3\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7\4\2\2"+
		"Q\3\3\2\2\2R`\5\6\4\2S`\5\n\6\2T`\5\f\7\2U`\5\20\t\2V`\5\22\n\2W`\5\24"+
		"\13\2X`\5\26\f\2Y`\5\b\5\2Z`\5\30\r\2[`\5\32\16\2\\`\5\16\b\2]`\5\34\17"+
		"\2^`\5\36\20\2_R\3\2\2\2_S\3\2\2\2_T\3\2\2\2_U\3\2\2\2_V\3\2\2\2_W\3\2"+
		"\2\2_X\3\2\2\2_Y\3\2\2\2_Z\3\2\2\2_[\3\2\2\2_\\\3\2\2\2_]\3\2\2\2_^\3"+
		"\2\2\2`\5\3\2\2\2ab\7\5\2\2bc\5F$\2c\7\3\2\2\2de\7\6\2\2ef\5F$\2f\t\3"+
		"\2\2\2gh\7\7\2\2hi\5F$\2i\13\3\2\2\2jk\7\b\2\2kl\5\"\22\2l\r\3\2\2\2m"+
		"n\7\t\2\2no\5\"\22\2o\17\3\2\2\2pq\7\n\2\2qr\5B\"\2r\21\3\2\2\2st\7\13"+
		"\2\2tu\5B\"\2uv\5H%\2v\23\3\2\2\2wx\7\f\2\2xy\5B\"\2yz\5H%\2z\25\3\2\2"+
		"\2{|\7\r\2\2|}\5H%\2}\27\3\2\2\2~\177\7\16\2\2\177\u0080\5B\"\2\u0080"+
		"\31\3\2\2\2\u0081\u0082\7\17\2\2\u0082\u0083\5B\"\2\u0083\33\3\2\2\2\u0084"+
		"\u0085\7\20\2\2\u0085\u0086\5F$\2\u0086\35\3\2\2\2\u0087\u0088\7\21\2"+
		"\2\u0088\37\3\2\2\2\u0089\u008a\5$\23\2\u008a!\3\2\2\2\u008b\u008c\7\36"+
		"\2\2\u008c\u008d\5$\23\2\u008d\u008e\7\36\2\2\u008e#\3\2\2\2\u008f\u0090"+
		"\5&\24\2\u0090\u0092\7\22\2\2\u0091\u0093\5\64\33\2\u0092\u0091\3\2\2"+
		"\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0097\5(\25\2\u0095\u0096"+
		"\7\23\2\2\u0096\u0098\5.\30\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2"+
		"\u0098\u009b\3\2\2\2\u0099\u009a\7\24\2\2\u009a\u009c\5\60\31\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009f\5:"+
		"\36\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0"+
		"\u00a2\58\35\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2"+
		"\2\2\u00a3\u00a5\7 \2\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"%\3\2\2\2\u00a6\u00a7\5F$\2\u00a7\'\3\2\2\2\u00a8\u00aa\7\24\2\2\u00a9"+
		"\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00ae\5*"+
		"\26\2\u00ac\u00ae\5,\27\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae"+
		")\3\2\2\2\u00af\u00b4\5F$\2\u00b0\u00b1\7\25\2\2\u00b1\u00b3\5F$\2\u00b2"+
		"\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5+\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7\33\2\2\u00b8\u00b9"+
		"\7\25\2\2\u00b9\u00ba\7\33\2\2\u00ba\u00bb\7\25\2\2\u00bb\u00bc\7\33\2"+
		"\2\u00bc\u00bd\7\25\2\2\u00bd\u00be\7\33\2\2\u00be-\3\2\2\2\u00bf\u00c0"+
		"\7\33\2\2\u00c0/\3\2\2\2\u00c1\u00c6\5F$\2\u00c2\u00c3\7\24\2\2\u00c3"+
		"\u00c5\5F$\2\u00c4\u00c2\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2"+
		"\2\u00c6\u00c7\3\2\2\2\u00c7\61\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca"+
		"\5F$\2\u00ca\63\3\2\2\2\u00cb\u00cc\5\62\32\2\u00cc\u00cd\7\23\2\2\u00cd"+
		"\u00ce\5\66\34\2\u00ce\u00cf\7\26\2\2\u00cf\65\3\2\2\2\u00d0\u00d1\5F"+
		"$\2\u00d1\67\3\2\2\2\u00d2\u00d3\7\27\2\2\u00d3\u00d4\5F$\2\u00d49\3\2"+
		"\2\2\u00d5\u00d6\7\30\2\2\u00d6\u00d7\5<\37\2\u00d7;\3\2\2\2\u00d8\u00dd"+
		"\5> \2\u00d9\u00da\7\31\2\2\u00da\u00dc\5> \2\u00db\u00d9\3\2\2\2\u00dc"+
		"\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de=\3\2\2\2"+
		"\u00df\u00dd\3\2\2\2\u00e0\u00e7\5F$\2\u00e1\u00e5\7\32\2\2\u00e2\u00e6"+
		"\5F$\2\u00e3\u00e6\7\33\2\2\u00e4\u00e6\7\34\2\2\u00e5\u00e2\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e1\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8?\3\2\2\2\u00e9\u00ea\5F$\2\u00eaA\3\2\2"+
		"\2\u00eb\u00ec\7\36\2\2\u00ec\u00ed\5F$\2\u00ed\u00ee\7\36\2\2\u00eeC"+
		"\3\2\2\2\u00ef\u00f1\5F$\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3E\3\2\2\2\u00f4\u00f5\7\35\2\2"+
		"\u00f5G\3\2\2\2\u00f6\u00f7\7\36\2\2\u00f7\u00f8\7\35\2\2\u00f8\u00f9"+
		"\7\36\2\2\u00f9I\3\2\2\2\22N_\u0092\u0097\u009b\u009e\u00a1\u00a4\u00a9"+
		"\u00ad\u00b4\u00c6\u00dd\u00e5\u00e7\u00f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}