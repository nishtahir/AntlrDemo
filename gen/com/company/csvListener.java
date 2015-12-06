// Generated from /Users/Nish/Developer/git/AntlrDemo/src/com/company/csv.g4 by ANTLR 4.5.1
package com.company;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link csvParser}.
 */
public interface csvListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link csvParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(csvParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link csvParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(csvParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link csvParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(csvParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link csvParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(csvParser.LineContext ctx);
}