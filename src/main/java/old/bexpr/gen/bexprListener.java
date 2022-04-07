// Generated from C:/Users/Mandrup/Documents/GitHub/ANTLR/src/main/java/bexpr\bexpr.g4 by ANTLR 4.9.2
package bexpr.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link bexprParser}.
 */
public interface bexprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code BoolValNode}
	 * labeled alternative in {@link bexprParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolValNode(bexprParser.BoolValNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolValNode}
	 * labeled alternative in {@link bexprParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolValNode(bexprParser.BoolValNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BexprNode}
	 * labeled alternative in {@link bexprParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBexprNode(bexprParser.BexprNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BexprNode}
	 * labeled alternative in {@link bexprParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBexprNode(bexprParser.BexprNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BTermNode}
	 * labeled alternative in {@link bexprParser#bterm}.
	 * @param ctx the parse tree
	 */
	void enterBTermNode(bexprParser.BTermNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BTermNode}
	 * labeled alternative in {@link bexprParser#bterm}.
	 * @param ctx the parse tree
	 */
	void exitBTermNode(bexprParser.BTermNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BPartNode}
	 * labeled alternative in {@link bexprParser#bterm}.
	 * @param ctx the parse tree
	 */
	void enterBPartNode(bexprParser.BPartNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BPartNode}
	 * labeled alternative in {@link bexprParser#bterm}.
	 * @param ctx the parse tree
	 */
	void exitBPartNode(bexprParser.BPartNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BpartNode}
	 * labeled alternative in {@link bexprParser#bpart}.
	 * @param ctx the parse tree
	 */
	void enterBpartNode(bexprParser.BpartNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BpartNode}
	 * labeled alternative in {@link bexprParser#bpart}.
	 * @param ctx the parse tree
	 */
	void exitBpartNode(bexprParser.BpartNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BPieceNode}
	 * labeled alternative in {@link bexprParser#bpart}.
	 * @param ctx the parse tree
	 */
	void enterBPieceNode(bexprParser.BPieceNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BPieceNode}
	 * labeled alternative in {@link bexprParser#bpart}.
	 * @param ctx the parse tree
	 */
	void exitBPieceNode(bexprParser.BPieceNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotNode}
	 * labeled alternative in {@link bexprParser#bpiece}.
	 * @param ctx the parse tree
	 */
	void enterNotNode(bexprParser.NotNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotNode}
	 * labeled alternative in {@link bexprParser#bpiece}.
	 * @param ctx the parse tree
	 */
	void exitNotNode(bexprParser.NotNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlastNode}
	 * labeled alternative in {@link bexprParser#bpiece}.
	 * @param ctx the parse tree
	 */
	void enterBlastNode(bexprParser.BlastNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlastNode}
	 * labeled alternative in {@link bexprParser#bpiece}.
	 * @param ctx the parse tree
	 */
	void exitBlastNode(bexprParser.BlastNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParexprNode}
	 * labeled alternative in {@link bexprParser#blast}.
	 * @param ctx the parse tree
	 */
	void enterParexprNode(bexprParser.ParexprNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParexprNode}
	 * labeled alternative in {@link bexprParser#blast}.
	 * @param ctx the parse tree
	 */
	void exitParexprNode(bexprParser.ParexprNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdBlastNode}
	 * labeled alternative in {@link bexprParser#blast}.
	 * @param ctx the parse tree
	 */
	void enterIdBlastNode(bexprParser.IdBlastNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdBlastNode}
	 * labeled alternative in {@link bexprParser#blast}.
	 * @param ctx the parse tree
	 */
	void exitIdBlastNode(bexprParser.IdBlastNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermNode}
	 * labeled alternative in {@link bexprParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterTermNode(bexprParser.TermNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermNode}
	 * labeled alternative in {@link bexprParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitTermNode(bexprParser.TermNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PartNode}
	 * labeled alternative in {@link bexprParser#term}.
	 * @param ctx the parse tree
	 */
	void enterPartNode(bexprParser.PartNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PartNode}
	 * labeled alternative in {@link bexprParser#term}.
	 * @param ctx the parse tree
	 */
	void exitPartNode(bexprParser.PartNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PartAexprNode}
	 * labeled alternative in {@link bexprParser#part}.
	 * @param ctx the parse tree
	 */
	void enterPartAexprNode(bexprParser.PartAexprNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PartAexprNode}
	 * labeled alternative in {@link bexprParser#part}.
	 * @param ctx the parse tree
	 */
	void exitPartAexprNode(bexprParser.PartAexprNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdPartNode}
	 * labeled alternative in {@link bexprParser#part}.
	 * @param ctx the parse tree
	 */
	void enterIdPartNode(bexprParser.IdPartNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdPartNode}
	 * labeled alternative in {@link bexprParser#part}.
	 * @param ctx the parse tree
	 */
	void exitIdPartNode(bexprParser.IdPartNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberValNode}
	 * labeled alternative in {@link bexprParser#part}.
	 * @param ctx the parse tree
	 */
	void enterNumberValNode(bexprParser.NumberValNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberValNode}
	 * labeled alternative in {@link bexprParser#part}.
	 * @param ctx the parse tree
	 */
	void exitNumberValNode(bexprParser.NumberValNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PartBoolNode}
	 * labeled alternative in {@link bexprParser#partbool}.
	 * @param ctx the parse tree
	 */
	void enterPartBoolNode(bexprParser.PartBoolNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PartBoolNode}
	 * labeled alternative in {@link bexprParser#partbool}.
	 * @param ctx the parse tree
	 */
	void exitPartBoolNode(bexprParser.PartBoolNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumValNode}
	 * labeled alternative in {@link bexprParser#numberval}.
	 * @param ctx the parse tree
	 */
	void enterNumValNode(bexprParser.NumValNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumValNode}
	 * labeled alternative in {@link bexprParser#numberval}.
	 * @param ctx the parse tree
	 */
	void exitNumValNode(bexprParser.NumValNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PiNode}
	 * labeled alternative in {@link bexprParser#numberval}.
	 * @param ctx the parse tree
	 */
	void enterPiNode(bexprParser.PiNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PiNode}
	 * labeled alternative in {@link bexprParser#numberval}.
	 * @param ctx the parse tree
	 */
	void exitPiNode(bexprParser.PiNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndNode}
	 * labeled alternative in {@link bexprParser#bop}.
	 * @param ctx the parse tree
	 */
	void enterAndNode(bexprParser.AndNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndNode}
	 * labeled alternative in {@link bexprParser#bop}.
	 * @param ctx the parse tree
	 */
	void exitAndNode(bexprParser.AndNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrNode}
	 * labeled alternative in {@link bexprParser#bop}.
	 * @param ctx the parse tree
	 */
	void enterOrNode(bexprParser.OrNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrNode}
	 * labeled alternative in {@link bexprParser#bop}.
	 * @param ctx the parse tree
	 */
	void exitOrNode(bexprParser.OrNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualNode}
	 * labeled alternative in {@link bexprParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterEqualNode(bexprParser.EqualNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualNode}
	 * labeled alternative in {@link bexprParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitEqualNode(bexprParser.EqualNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEqualNode}
	 * labeled alternative in {@link bexprParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualNode(bexprParser.NotEqualNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqualNode}
	 * labeled alternative in {@link bexprParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualNode(bexprParser.NotEqualNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterEqualNode}
	 * labeled alternative in {@link bexprParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterGreaterEqualNode(bexprParser.GreaterEqualNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterEqualNode}
	 * labeled alternative in {@link bexprParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitGreaterEqualNode(bexprParser.GreaterEqualNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LesseEqualNode}
	 * labeled alternative in {@link bexprParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterLesseEqualNode(bexprParser.LesseEqualNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LesseEqualNode}
	 * labeled alternative in {@link bexprParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitLesseEqualNode(bexprParser.LesseEqualNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LesserNode}
	 * labeled alternative in {@link bexprParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterLesserNode(bexprParser.LesserNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LesserNode}
	 * labeled alternative in {@link bexprParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitLesserNode(bexprParser.LesserNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterNode}
	 * labeled alternative in {@link bexprParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterGreaterNode(bexprParser.GreaterNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterNode}
	 * labeled alternative in {@link bexprParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitGreaterNode(bexprParser.GreaterNodeContext ctx);
}