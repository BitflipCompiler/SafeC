// Generated from C:/Users/mymay/Dropbox/AAU/Programmering/P4/ANTLR/grammar\Aexpr2.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Aexpr2Parser}.
 */
public interface Aexpr2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code AexprTermNode}
	 * labeled alternative in {@link Aexpr2Parser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterAexprTermNode(Aexpr2Parser.AexprTermNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AexprTermNode}
	 * labeled alternative in {@link Aexpr2Parser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitAexprTermNode(Aexpr2Parser.AexprTermNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AexprAddSubNode}
	 * labeled alternative in {@link Aexpr2Parser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterAexprAddSubNode(Aexpr2Parser.AexprAddSubNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AexprAddSubNode}
	 * labeled alternative in {@link Aexpr2Parser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitAexprAddSubNode(Aexpr2Parser.AexprAddSubNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AexprPartNode}
	 * labeled alternative in {@link Aexpr2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterAexprPartNode(Aexpr2Parser.AexprPartNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AexprPartNode}
	 * labeled alternative in {@link Aexpr2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitAexprPartNode(Aexpr2Parser.AexprPartNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AexprTimesDivModNode}
	 * labeled alternative in {@link Aexpr2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterAexprTimesDivModNode(Aexpr2Parser.AexprTimesDivModNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AexprTimesDivModNode}
	 * labeled alternative in {@link Aexpr2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitAexprTimesDivModNode(Aexpr2Parser.AexprTimesDivModNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AexprParensNode}
	 * labeled alternative in {@link Aexpr2Parser#part}.
	 * @param ctx the parse tree
	 */
	void enterAexprParensNode(Aexpr2Parser.AexprParensNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AexprParensNode}
	 * labeled alternative in {@link Aexpr2Parser#part}.
	 * @param ctx the parse tree
	 */
	void exitAexprParensNode(Aexpr2Parser.AexprParensNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AexprIdNode}
	 * labeled alternative in {@link Aexpr2Parser#part}.
	 * @param ctx the parse tree
	 */
	void enterAexprIdNode(Aexpr2Parser.AexprIdNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AexprIdNode}
	 * labeled alternative in {@link Aexpr2Parser#part}.
	 * @param ctx the parse tree
	 */
	void exitAexprIdNode(Aexpr2Parser.AexprIdNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AexprNumberValNode}
	 * labeled alternative in {@link Aexpr2Parser#part}.
	 * @param ctx the parse tree
	 */
	void enterAexprNumberValNode(Aexpr2Parser.AexprNumberValNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AexprNumberValNode}
	 * labeled alternative in {@link Aexpr2Parser#part}.
	 * @param ctx the parse tree
	 */
	void exitAexprNumberValNode(Aexpr2Parser.AexprNumberValNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AexprNumValNode}
	 * labeled alternative in {@link Aexpr2Parser#numberval}.
	 * @param ctx the parse tree
	 */
	void enterAexprNumValNode(Aexpr2Parser.AexprNumValNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AexprNumValNode}
	 * labeled alternative in {@link Aexpr2Parser#numberval}.
	 * @param ctx the parse tree
	 */
	void exitAexprNumValNode(Aexpr2Parser.AexprNumValNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AexprPiNode}
	 * labeled alternative in {@link Aexpr2Parser#numberval}.
	 * @param ctx the parse tree
	 */
	void enterAexprPiNode(Aexpr2Parser.AexprPiNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AexprPiNode}
	 * labeled alternative in {@link Aexpr2Parser#numberval}.
	 * @param ctx the parse tree
	 */
	void exitAexprPiNode(Aexpr2Parser.AexprPiNodeContext ctx);
}