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
	 * Visit a parse tree produced by the {@code AexprTermNode}
	 * labeled alternative in {@link Aexpr2Parser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprTermNode(Aexpr2Parser.AexprTermNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AexprAddSubNode}
	 * labeled alternative in {@link Aexpr2Parser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprAddSubNode(Aexpr2Parser.AexprAddSubNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AexprPartNode}
	 * labeled alternative in {@link Aexpr2Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprPartNode(Aexpr2Parser.AexprPartNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AexprTimesDivModNode}
	 * labeled alternative in {@link Aexpr2Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprTimesDivModNode(Aexpr2Parser.AexprTimesDivModNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AexprParensNode}
	 * labeled alternative in {@link Aexpr2Parser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprParensNode(Aexpr2Parser.AexprParensNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AexprIdNode}
	 * labeled alternative in {@link Aexpr2Parser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprIdNode(Aexpr2Parser.AexprIdNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AexprNumberValNode}
	 * labeled alternative in {@link Aexpr2Parser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprNumberValNode(Aexpr2Parser.AexprNumberValNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AexprNumValNode}
	 * labeled alternative in {@link Aexpr2Parser#numberval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprNumValNode(Aexpr2Parser.AexprNumValNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AexprPiNode}
	 * labeled alternative in {@link Aexpr2Parser#numberval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprPiNode(Aexpr2Parser.AexprPiNodeContext ctx);
}