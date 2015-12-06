// Generated from /Users/Nish/Developer/git/AntlrDemo/src/com/company/csv.g4 by ANTLR 4.5.1
package com.company;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link csvParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface csvVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link csvParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(csvParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link csvParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(csvParser.LineContext ctx);
}