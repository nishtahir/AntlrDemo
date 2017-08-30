// Generated from com/example/json.g4 by ANTLR 4.7

package com.example;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link jsonParser}.
 */
public interface jsonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link jsonParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(jsonParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsonParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(jsonParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsonParser#jsonObject}.
	 * @param ctx the parse tree
	 */
	void enterJsonObject(jsonParser.JsonObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsonParser#jsonObject}.
	 * @param ctx the parse tree
	 */
	void exitJsonObject(jsonParser.JsonObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsonParser#propertyList}.
	 * @param ctx the parse tree
	 */
	void enterPropertyList(jsonParser.PropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsonParser#propertyList}.
	 * @param ctx the parse tree
	 */
	void exitPropertyList(jsonParser.PropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsonParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(jsonParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsonParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(jsonParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsonParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(jsonParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsonParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(jsonParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsonParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(jsonParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsonParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(jsonParser.BooleanLiteralContext ctx);
}