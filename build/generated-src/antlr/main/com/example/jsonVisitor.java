// Generated from com/example/json.g4 by ANTLR 4.7

package com.example;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link jsonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface jsonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link jsonParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(jsonParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsonParser#jsonObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonObject(jsonParser.JsonObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsonParser#propertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyList(jsonParser.PropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsonParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(jsonParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsonParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(jsonParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsonParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(jsonParser.BooleanLiteralContext ctx);
}