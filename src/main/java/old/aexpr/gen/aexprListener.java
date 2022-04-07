// Generated from C:/Users/Mandrup/Documents/GitHub/ANTLR/src/main/java/aexpr\aexpr.g4 by ANTLR 4.9.2
package old.aexpr.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link aexprParser}.
 */
public interface aexprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code TermNode}
	 * labeled alternative in {@link aexprParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterTermNode(aexprParser.TermNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermNode}
	 * labeled alternative in {@link aexprParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitTermNode(aexprParser.TermNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PartNode}
	 * labeled alternative in {@link aexprParser#term}.
	 * @param ctx the parse tree
	 */
	void enterPartNode(aexprParser.PartNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PartNode}
	 * labeled alternative in {@link aexprParser#term}.
	 * @param ctx the parse tree
	 */
	void exitPartNode(aexprParser.PartNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PartAexprNode}
	 * labeled alternative in {@link aexprParser#part}.
	 * @param ctx the parse tree
	 */
	void enterPartAexprNode(aexprParser.PartAexprNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PartAexprNode}
	 * labeled alternative in {@link aexprParser#part}.
	 * @param ctx the parse tree
	 */
	void exitPartAexprNode(aexprParser.PartAexprNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdPartNode}
	 * labeled alternative in {@link aexprParser#part}.
	 * @param ctx the parse tree
	 */
	void enterIdPartNode(aexprParser.IdPartNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdPartNode}
	 * labeled alternative in {@link aexprParser#part}.
	 * @param ctx the parse tree
	 */
	void exitIdPartNode(aexprParser.IdPartNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberValNode}
	 * labeled alternative in {@link aexprParser#part}.
	 * @param ctx the parse tree
	 */
	void enterNumberValNode(aexprParser.NumberValNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberValNode}
	 * labeled alternative in {@link aexprParser#part}.
	 * @param ctx the parse tree
	 */
	void exitNumberValNode(aexprParser.NumberValNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumValNode}
	 * labeled alternative in {@link aexprParser#numberval}.
	 * @param ctx the parse tree
	 */
	void enterNumValNode(aexprParser.NumValNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumValNode}
	 * labeled alternative in {@link aexprParser#numberval}.
	 * @param ctx the parse tree
	 */
	void exitNumValNode(aexprParser.NumValNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PiNode}
	 * labeled alternative in {@link aexprParser#numberval}.
	 * @param ctx the parse tree
	 */
	void enterPiNode(aexprParser.PiNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PiNode}
	 * labeled alternative in {@link aexprParser#numberval}.
	 * @param ctx the parse tree
	 */
	void exitPiNode(aexprParser.PiNodeContext ctx);
}