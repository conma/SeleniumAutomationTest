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
	 * Enter a parse tree produced by {@link SELENEParser#quit}.
	 * @param ctx the parse tree
	 */
	void enterQuit(SELENEParser.QuitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#quit}.
	 * @param ctx the parse tree
	 */
	void exitQuit(SELENEParser.QuitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#findElementById}.
	 * @param ctx the parse tree
	 */
	void enterFindElementById(SELENEParser.FindElementByIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#findElementById}.
	 * @param ctx the parse tree
	 */
	void exitFindElementById(SELENEParser.FindElementByIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#findElementByName}.
	 * @param ctx the parse tree
	 */
	void enterFindElementByName(SELENEParser.FindElementByNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#findElementByName}.
	 * @param ctx the parse tree
	 */
	void exitFindElementByName(SELENEParser.FindElementByNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#findElementByLinkText}.
	 * @param ctx the parse tree
	 */
	void enterFindElementByLinkText(SELENEParser.FindElementByLinkTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#findElementByLinkText}.
	 * @param ctx the parse tree
	 */
	void exitFindElementByLinkText(SELENEParser.FindElementByLinkTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#findElementByPartialLinkText}.
	 * @param ctx the parse tree
	 */
	void enterFindElementByPartialLinkText(SELENEParser.FindElementByPartialLinkTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#findElementByPartialLinkText}.
	 * @param ctx the parse tree
	 */
	void exitFindElementByPartialLinkText(SELENEParser.FindElementByPartialLinkTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#clear}.
	 * @param ctx the parse tree
	 */
	void enterClear(SELENEParser.ClearContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#clear}.
	 * @param ctx the parse tree
	 */
	void exitClear(SELENEParser.ClearContext ctx);
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
	 * Enter a parse tree produced by {@link SELENEParser#assertText}.
	 * @param ctx the parse tree
	 */
	void enterAssertText(SELENEParser.AssertTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#assertText}.
	 * @param ctx the parse tree
	 */
	void exitAssertText(SELENEParser.AssertTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link SELENEParser#assertTitle}.
	 * @param ctx the parse tree
	 */
	void enterAssertTitle(SELENEParser.AssertTitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SELENEParser#assertTitle}.
	 * @param ctx the parse tree
	 */
	void exitAssertTitle(SELENEParser.AssertTitleContext ctx);
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
}