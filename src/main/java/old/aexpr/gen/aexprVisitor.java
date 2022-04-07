// Generated from C:/Users/Mandrup/Documents/GitHub/ANTLR/src/main/java/aexpr\aexpr.g4 by ANTLR 4.9.2
package old.aexpr.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link aexprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface aexprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code TermNode}
	 * labeled alternative in {@link aexprParser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermNode(aexprParser.TermNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PartNode}
	 * labeled alternative in {@link aexprParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartNode(aexprParser.PartNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PartAexprNode}
	 * labeled alternative in {@link aexprParser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartAexprNode(aexprParser.PartAexprNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdPartNode}
	 * labeled alternative in {@link aexprParser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdPartNode(aexprParser.IdPartNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberValNode}
	 * labeled alternative in {@link aexprParser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberValNode(aexprParser.NumberValNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumValNode}
	 * labeled alternative in {@link aexprParser#numberval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumValNode(aexprParser.NumValNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PiNode}
	 * labeled alternative in {@link aexprParser#numberval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPiNode(aexprParser.PiNodeContext ctx);
}