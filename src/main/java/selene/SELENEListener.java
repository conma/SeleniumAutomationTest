// Generated from SELENE.g4 by ANTLR 4.7.1
package selene;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SELENEParser}.
 */
public interface SELENEListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SELENEParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SELENEParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SELENEParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SELENEParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SELENEParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#updateTCs}.
	 * @param ctx the parse tree
	 */
	void enterUpdateTCs(SELENEParser.UpdateTCsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#updateTCs}.
	 * @param ctx the parse tree
	 */
	void exitUpdateTCs(SELENEParser.UpdateTCsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#get}.
	 * @param ctx the parse tree
	 */
	void enterGet(SELENEParser.GetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#get}.
	 * @param ctx the parse tree
	 */
	void exitGet(SELENEParser.GetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#click}.
	 * @param ctx the parse tree
	 */
	void enterClick(SELENEParser.ClickContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#click}.
	 * @param ctx the parse tree
	 */
	void exitClick(SELENEParser.ClickContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#sendKeys}.
	 * @param ctx the parse tree
	 */
	void enterSendKeys(SELENEParser.SendKeysContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#sendKeys}.
	 * @param ctx the parse tree
	 */
	void exitSendKeys(SELENEParser.SendKeysContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#verifyText}.
	 * @param ctx the parse tree
	 */
	void enterVerifyText(SELENEParser.VerifyTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#verifyText}.
	 * @param ctx the parse tree
	 */
	void exitVerifyText(SELENEParser.VerifyTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#verifyTitle}.
	 * @param ctx the parse tree
	 */
	void enterVerifyTitle(SELENEParser.VerifyTitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#verifyTitle}.
	 * @param ctx the parse tree
	 */
	void exitVerifyTitle(SELENEParser.VerifyTitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#updateDB}.
	 * @param ctx the parse tree
	 */
	void enterUpdateDB(SELENEParser.UpdateDBContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#updateDB}.
	 * @param ctx the parse tree
	 */
	void exitUpdateDB(SELENEParser.UpdateDBContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#testcaseId}.
	 * @param ctx the parse tree
	 */
	void enterTestcaseId(SELENEParser.TestcaseIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#testcaseId}.
	 * @param ctx the parse tree
	 */
	void exitTestcaseId(SELENEParser.TestcaseIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(SELENEParser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(SELENEParser.UrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#uri}.
	 * @param ctx the parse tree
	 */
	void enterUri(SELENEParser.UriContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#uri}.
	 * @param ctx the parse tree
	 */
	void exitUri(SELENEParser.UriContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#scheme}.
	 * @param ctx the parse tree
	 */
	void enterScheme(SELENEParser.SchemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#scheme}.
	 * @param ctx the parse tree
	 */
	void exitScheme(SELENEParser.SchemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#host}.
	 * @param ctx the parse tree
	 */
	void enterHost(SELENEParser.HostContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#host}.
	 * @param ctx the parse tree
	 */
	void exitHost(SELENEParser.HostContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#hostname}.
	 * @param ctx the parse tree
	 */
	void enterHostname(SELENEParser.HostnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#hostname}.
	 * @param ctx the parse tree
	 */
	void exitHostname(SELENEParser.HostnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#hostnumber}.
	 * @param ctx the parse tree
	 */
	void enterHostnumber(SELENEParser.HostnumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#hostnumber}.
	 * @param ctx the parse tree
	 */
	void exitHostnumber(SELENEParser.HostnumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(SELENEParser.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(SELENEParser.PortContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(SELENEParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(SELENEParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#user}.
	 * @param ctx the parse tree
	 */
	void enterUser(SELENEParser.UserContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#user}.
	 * @param ctx the parse tree
	 */
	void exitUser(SELENEParser.UserContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#login}.
	 * @param ctx the parse tree
	 */
	void enterLogin(SELENEParser.LoginContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#login}.
	 * @param ctx the parse tree
	 */
	void exitLogin(SELENEParser.LoginContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#password}.
	 * @param ctx the parse tree
	 */
	void enterPassword(SELENEParser.PasswordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#password}.
	 * @param ctx the parse tree
	 */
	void exitPassword(SELENEParser.PasswordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#frag}.
	 * @param ctx the parse tree
	 */
	void enterFrag(SELENEParser.FragContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#frag}.
	 * @param ctx the parse tree
	 */
	void exitFrag(SELENEParser.FragContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(SELENEParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(SELENEParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#search}.
	 * @param ctx the parse tree
	 */
	void enterSearch(SELENEParser.SearchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#search}.
	 * @param ctx the parse tree
	 */
	void exitSearch(SELENEParser.SearchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#searchparameter}.
	 * @param ctx the parse tree
	 */
	void enterSearchparameter(SELENEParser.SearchparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#searchparameter}.
	 * @param ctx the parse tree
	 */
	void exitSearchparameter(SELENEParser.SearchparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(SELENEParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(SELENEParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(SELENEParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(SELENEParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(SELENEParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(SELENEParser.StringContext ctx);
}