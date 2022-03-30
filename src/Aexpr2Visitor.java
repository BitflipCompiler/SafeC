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
	 * Visit a parse tree produced by the {@code AexprIdNode}
	 * labeled alternative in {@link Aexpr2Parser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprIdNode(Aexpr2Parser.AexprIdNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AexprTimesDivNode}
	 * labeled alternative in {@link Aexpr2Parser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprTimesDivNode(Aexpr2Parser.AexprTimesDivNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AexprNumbervalNode}
	 * labeled alternative in {@link Aexpr2Parser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprNumbervalNode(Aexpr2Parser.AexprNumbervalNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AexprAddSubNode}
	 * labeled alternative in {@link Aexpr2Parser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprAddSubNode(Aexpr2Parser.AexprAddSubNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AexprParensNode}
	 * labeled alternative in {@link Aexpr2Parser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprParensNode(Aexpr2Parser.AexprParensNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AexprNumvalNode}
	 * labeled alternative in {@link Aexpr2Parser#numberval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprNumvalNode(Aexpr2Parser.AexprNumvalNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AexprPiNode}
	 * labeled alternative in {@link Aexpr2Parser#numberval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprPiNode(Aexpr2Parser.AexprPiNodeContext ctx);
}