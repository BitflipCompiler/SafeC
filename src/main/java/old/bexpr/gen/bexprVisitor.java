// Generated from C:/Users/Mandrup/Documents/GitHub/ANTLR/src/main/java/bexpr\bexpr.g4 by ANTLR 4.9.2
package bexpr.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link bexprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface bexprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code BoolValNode}
	 * labeled alternative in {@link bexprParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolValNode(bexprParser.BoolValNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BexprNode}
	 * labeled alternative in {@link bexprParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexprNode(bexprParser.BexprNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BTermNode}
	 * labeled alternative in {@link bexprParser#bterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBTermNode(bexprParser.BTermNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BPartNode}
	 * labeled alternative in {@link bexprParser#bterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBPartNode(bexprParser.BPartNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BpartNode}
	 * labeled alternative in {@link bexprParser#bpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBpartNode(bexprParser.BpartNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BPieceNode}
	 * labeled alternative in {@link bexprParser#bpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBPieceNode(bexprParser.BPieceNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotNode}
	 * labeled alternative in {@link bexprParser#bpiece}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotNode(bexprParser.NotNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlastNode}
	 * labeled alternative in {@link bexprParser#bpiece}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlastNode(bexprParser.BlastNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParexprNode}
	 * labeled alternative in {@link bexprParser#blast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParexprNode(bexprParser.ParexprNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdBlastNode}
	 * labeled alternative in {@link bexprParser#blast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdBlastNode(bexprParser.IdBlastNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermNode}
	 * labeled alternative in {@link bexprParser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermNode(bexprParser.TermNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PartNode}
	 * labeled alternative in {@link bexprParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartNode(bexprParser.PartNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PartAexprNode}
	 * labeled alternative in {@link bexprParser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartAexprNode(bexprParser.PartAexprNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdPartNode}
	 * labeled alternative in {@link bexprParser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdPartNode(bexprParser.IdPartNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberValNode}
	 * labeled alternative in {@link bexprParser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberValNode(bexprParser.NumberValNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PartBoolNode}
	 * labeled alternative in {@link bexprParser#partbool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartBoolNode(bexprParser.PartBoolNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumValNode}
	 * labeled alternative in {@link bexprParser#numberval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumValNode(bexprParser.NumValNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PiNode}
	 * labeled alternative in {@link bexprParser#numberval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPiNode(bexprParser.PiNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndNode}
	 * labeled alternative in {@link bexprParser#bop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndNode(bexprParser.AndNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrNode}
	 * labeled alternative in {@link bexprParser#bop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrNode(bexprParser.OrNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualNode}
	 * labeled alternative in {@link bexprParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualNode(bexprParser.EqualNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEqualNode}
	 * labeled alternative in {@link bexprParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualNode(bexprParser.NotEqualNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterEqualNode}
	 * labeled alternative in {@link bexprParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterEqualNode(bexprParser.GreaterEqualNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LesseEqualNode}
	 * labeled alternative in {@link bexprParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLesseEqualNode(bexprParser.LesseEqualNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LesserNode}
	 * labeled alternative in {@link bexprParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLesserNode(bexprParser.LesserNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterNode}
	 * labeled alternative in {@link bexprParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterNode(bexprParser.GreaterNodeContext ctx);
}