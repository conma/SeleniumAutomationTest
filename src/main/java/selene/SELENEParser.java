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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, URL=16, ID=17, 
		NAME=18, VARIABLENAME=19, LINKTEXT=20, ELEMENT=21, PARTIALLINKTEXT=22, 
		TEXT=23, TITLE=24, NUMBER=25, WS=26;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_get = 2, RULE_quit = 3, RULE_findElementById = 4, 
		RULE_findElementByName = 5, RULE_findElementByLinkText = 6, RULE_findElementByPartialLinkText = 7, 
		RULE_clear = 8, RULE_sendKeys = 9, RULE_click = 10, RULE_assertText = 11, 
		RULE_assertTitle = 12, RULE_verifyText = 13, RULE_verifyTitle = 14;
	public static final String[] ruleNames = {
		"program", "statement", "get", "quit", "findElementById", "findElementByName", 
		"findElementByLinkText", "findElementByPartialLinkText", "clear", "sendKeys", 
		"click", "assertText", "assertTitle", "verifyText", "verifyTitle"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'begin'", "'end'", "'get'", "'quit'", "'findElementById'", "'findElementByName'", 
		"'findElementByLinkText'", "'findElementByPartialLinkText'", "'clear'", 
		"'sendKeys'", "'click'", "'assertText'", "'assertTitle'", "'verifyText'", 
		"'verifyTitle'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "URL", "ID", "NAME", "VARIABLENAME", "LINKTEXT", 
		"ELEMENT", "PARTIALLINKTEXT", "TEXT", "TITLE", "NUMBER", "WS"
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
			setState(30);
			match(T__0);
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				statement();
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0) );
			setState(36);
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
		public QuitContext quit() {
			return getRuleContext(QuitContext.class,0);
		}
		public FindElementByIdContext findElementById() {
			return getRuleContext(FindElementByIdContext.class,0);
		}
		public FindElementByNameContext findElementByName() {
			return getRuleContext(FindElementByNameContext.class,0);
		}
		public FindElementByLinkTextContext findElementByLinkText() {
			return getRuleContext(FindElementByLinkTextContext.class,0);
		}
		public FindElementByPartialLinkTextContext findElementByPartialLinkText() {
			return getRuleContext(FindElementByPartialLinkTextContext.class,0);
		}
		public ClearContext clear() {
			return getRuleContext(ClearContext.class,0);
		}
		public SendKeysContext sendKeys() {
			return getRuleContext(SendKeysContext.class,0);
		}
		public ClickContext click() {
			return getRuleContext(ClickContext.class,0);
		}
		public AssertTextContext assertText() {
			return getRuleContext(AssertTextContext.class,0);
		}
		public AssertTitleContext assertTitle() {
			return getRuleContext(AssertTitleContext.class,0);
		}
		public VerifyTextContext verifyText() {
			return getRuleContext(VerifyTextContext.class,0);
		}
		public VerifyTitleContext verifyTitle() {
			return getRuleContext(VerifyTitleContext.class,0);
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
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				get();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				quit();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				findElementById();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				findElementByName();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				findElementByLinkText();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(43);
				findElementByPartialLinkText();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 7);
				{
				setState(44);
				clear();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 8);
				{
				setState(45);
				sendKeys();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 9);
				{
				setState(46);
				click();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 10);
				{
				setState(47);
				assertText();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 11);
				{
				setState(48);
				assertTitle();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 12);
				{
				setState(49);
				verifyText();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 13);
				{
				setState(50);
				verifyTitle();
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
		public TerminalNode URL() { return getToken(SELENEParser.URL, 0); }
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
			setState(53);
			match(T__2);
			setState(54);
			match(URL);
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
		enterRule(_localctx, 6, RULE_quit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__3);
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

	public static class FindElementByIdContext extends ParserRuleContext {
		public TerminalNode VARIABLENAME() { return getToken(SELENEParser.VARIABLENAME, 0); }
		public TerminalNode ID() { return getToken(SELENEParser.ID, 0); }
		public FindElementByIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_findElementById; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterFindElementById(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitFindElementById(this);
		}
	}

	public final FindElementByIdContext findElementById() throws RecognitionException {
		FindElementByIdContext _localctx = new FindElementByIdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_findElementById);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__4);
			setState(59);
			match(VARIABLENAME);
			setState(60);
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

	public static class FindElementByNameContext extends ParserRuleContext {
		public TerminalNode VARIABLENAME() { return getToken(SELENEParser.VARIABLENAME, 0); }
		public TerminalNode NAME() { return getToken(SELENEParser.NAME, 0); }
		public FindElementByNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_findElementByName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterFindElementByName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitFindElementByName(this);
		}
	}

	public final FindElementByNameContext findElementByName() throws RecognitionException {
		FindElementByNameContext _localctx = new FindElementByNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_findElementByName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__5);
			setState(63);
			match(VARIABLENAME);
			setState(64);
			match(NAME);
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

	public static class FindElementByLinkTextContext extends ParserRuleContext {
		public TerminalNode VARIABLENAME() { return getToken(SELENEParser.VARIABLENAME, 0); }
		public TerminalNode LINKTEXT() { return getToken(SELENEParser.LINKTEXT, 0); }
		public FindElementByLinkTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_findElementByLinkText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterFindElementByLinkText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitFindElementByLinkText(this);
		}
	}

	public final FindElementByLinkTextContext findElementByLinkText() throws RecognitionException {
		FindElementByLinkTextContext _localctx = new FindElementByLinkTextContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_findElementByLinkText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__6);
			setState(67);
			match(VARIABLENAME);
			setState(68);
			match(LINKTEXT);
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

	public static class FindElementByPartialLinkTextContext extends ParserRuleContext {
		public TerminalNode VARIABLENAME() { return getToken(SELENEParser.VARIABLENAME, 0); }
		public TerminalNode PARTIALLINKTEXT() { return getToken(SELENEParser.PARTIALLINKTEXT, 0); }
		public FindElementByPartialLinkTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_findElementByPartialLinkText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterFindElementByPartialLinkText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitFindElementByPartialLinkText(this);
		}
	}

	public final FindElementByPartialLinkTextContext findElementByPartialLinkText() throws RecognitionException {
		FindElementByPartialLinkTextContext _localctx = new FindElementByPartialLinkTextContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_findElementByPartialLinkText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__7);
			setState(71);
			match(VARIABLENAME);
			setState(72);
			match(PARTIALLINKTEXT);
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

	public static class ClearContext extends ParserRuleContext {
		public TerminalNode ELEMENT() { return getToken(SELENEParser.ELEMENT, 0); }
		public ClearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clear; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterClear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitClear(this);
		}
	}

	public final ClearContext clear() throws RecognitionException {
		ClearContext _localctx = new ClearContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_clear);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__8);
			setState(75);
			match(ELEMENT);
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
		public TerminalNode TEXT() { return getToken(SELENEParser.TEXT, 0); }
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
		enterRule(_localctx, 18, RULE_sendKeys);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__9);
			setState(78);
			match(TEXT);
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
		public TerminalNode ELEMENT() { return getToken(SELENEParser.ELEMENT, 0); }
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
		enterRule(_localctx, 20, RULE_click);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__10);
			setState(81);
			match(ELEMENT);
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

	public static class AssertTextContext extends ParserRuleContext {
		public TerminalNode ELEMENT() { return getToken(SELENEParser.ELEMENT, 0); }
		public TerminalNode TEXT() { return getToken(SELENEParser.TEXT, 0); }
		public AssertTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterAssertText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitAssertText(this);
		}
	}

	public final AssertTextContext assertText() throws RecognitionException {
		AssertTextContext _localctx = new AssertTextContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assertText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__11);
			setState(84);
			match(ELEMENT);
			setState(85);
			match(TEXT);
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

	public static class AssertTitleContext extends ParserRuleContext {
		public TerminalNode TITLE() { return getToken(SELENEParser.TITLE, 0); }
		public AssertTitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertTitle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).enterAssertTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SELENEListener ) ((SELENEListener)listener).exitAssertTitle(this);
		}
	}

	public final AssertTitleContext assertTitle() throws RecognitionException {
		AssertTitleContext _localctx = new AssertTitleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assertTitle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__12);
			setState(88);
			match(TITLE);
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
		public TerminalNode ELEMENT() { return getToken(SELENEParser.ELEMENT, 0); }
		public TerminalNode TEXT() { return getToken(SELENEParser.TEXT, 0); }
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
		enterRule(_localctx, 26, RULE_verifyText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__13);
			setState(91);
			match(ELEMENT);
			setState(92);
			match(TEXT);
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
		public TerminalNode TITLE() { return getToken(SELENEParser.TITLE, 0); }
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
		enterRule(_localctx, 28, RULE_verifyTitle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__14);
			setState(95);
			match(TITLE);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34d\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\6\2#\n\2\r\2\16\2"+
		"$\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\66\n"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\2\2\21\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36\2\2\2a\2 \3\2\2\2\4\65\3\2\2\2\6\67"+
		"\3\2\2\2\b:\3\2\2\2\n<\3\2\2\2\f@\3\2\2\2\16D\3\2\2\2\20H\3\2\2\2\22L"+
		"\3\2\2\2\24O\3\2\2\2\26R\3\2\2\2\30U\3\2\2\2\32Y\3\2\2\2\34\\\3\2\2\2"+
		"\36`\3\2\2\2 \"\7\3\2\2!#\5\4\3\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3"+
		"\2\2\2%&\3\2\2\2&\'\7\4\2\2\'\3\3\2\2\2(\66\5\6\4\2)\66\5\b\5\2*\66\5"+
		"\n\6\2+\66\5\f\7\2,\66\5\16\b\2-\66\5\20\t\2.\66\5\22\n\2/\66\5\24\13"+
		"\2\60\66\5\26\f\2\61\66\5\30\r\2\62\66\5\32\16\2\63\66\5\34\17\2\64\66"+
		"\5\36\20\2\65(\3\2\2\2\65)\3\2\2\2\65*\3\2\2\2\65+\3\2\2\2\65,\3\2\2\2"+
		"\65-\3\2\2\2\65.\3\2\2\2\65/\3\2\2\2\65\60\3\2\2\2\65\61\3\2\2\2\65\62"+
		"\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\5\3\2\2\2\678\7\5\2\289\7\22\2"+
		"\29\7\3\2\2\2:;\7\6\2\2;\t\3\2\2\2<=\7\7\2\2=>\7\25\2\2>?\7\23\2\2?\13"+
		"\3\2\2\2@A\7\b\2\2AB\7\25\2\2BC\7\24\2\2C\r\3\2\2\2DE\7\t\2\2EF\7\25\2"+
		"\2FG\7\26\2\2G\17\3\2\2\2HI\7\n\2\2IJ\7\25\2\2JK\7\30\2\2K\21\3\2\2\2"+
		"LM\7\13\2\2MN\7\27\2\2N\23\3\2\2\2OP\7\f\2\2PQ\7\31\2\2Q\25\3\2\2\2RS"+
		"\7\r\2\2ST\7\27\2\2T\27\3\2\2\2UV\7\16\2\2VW\7\27\2\2WX\7\31\2\2X\31\3"+
		"\2\2\2YZ\7\17\2\2Z[\7\32\2\2[\33\3\2\2\2\\]\7\20\2\2]^\7\27\2\2^_\7\31"+
		"\2\2_\35\3\2\2\2`a\7\21\2\2ab\7\32\2\2b\37\3\2\2\2\4$\65";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}