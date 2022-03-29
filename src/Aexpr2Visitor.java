// Generated from C:/Users/mymay/Dropbox/AAU/Programmering/P4/ANTLR/grammar\Aexpr2.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Aexpr2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Aexpr2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexpr(Aexpr2Parser.AexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(Aexpr2Parser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart(Aexpr2Parser.PartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#numberval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberval(Aexpr2Parser.NumbervalContext ctx);
}