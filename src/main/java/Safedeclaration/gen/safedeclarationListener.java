// Generated from C:/Users/Mandrup/Documents/GitHub/ANTLR/src/main/java/Safedeclaration\safedeclaration.g4 by ANTLR 4.9.2
package Safedeclaration.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link safedeclarationParser}.
 */
public interface safedeclarationListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code SafeDeclNode}
	 * labeled alternative in {@link safedeclarationParser#safedeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSafeDeclNode(safedeclarationParser.SafeDeclNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SafeDeclNode}
	 * labeled alternative in {@link safedeclarationParser#safedeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSafeDeclNode(safedeclarationParser.SafeDeclNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumVDclNode}
	 * labeled alternative in {@link safedeclarationParser#vdcl}.
	 * @param ctx the parse tree
	 */
	void enterNumVDclNode(safedeclarationParser.NumVDclNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumVDclNode}
	 * labeled alternative in {@link safedeclarationParser#vdcl}.
	 * @param ctx the parse tree
	 */
	void exitNumVDclNode(safedeclarationParser.NumVDclNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharVDclNode}
	 * labeled alternative in {@link safedeclarationParser#vdcl}.
	 * @param ctx the parse tree
	 */
	void enterCharVDclNode(safedeclarationParser.CharVDclNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharVDclNode}
	 * labeled alternative in {@link safedeclarationParser#vdcl}.
	 * @param ctx the parse tree
	 */
	void exitCharVDclNode(safedeclarationParser.CharVDclNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringVDclNode}
	 * labeled alternative in {@link safedeclarationParser#vdcl}.
	 * @param ctx the parse tree
	 */
	void enterStringVDclNode(safedeclarationParser.StringVDclNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringVDclNode}
	 * labeled alternative in {@link safedeclarationParser#vdcl}.
	 * @param ctx the parse tree
	 */
	void exitStringVDclNode(safedeclarationParser.StringVDclNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolVDclNode}
	 * labeled alternative in {@link safedeclarationParser#vdcl}.
	 * @param ctx the parse tree
	 */
	void enterBoolVDclNode(safedeclarationParser.BoolVDclNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolVDclNode}
	 * labeled alternative in {@link safedeclarationParser#vdcl}.
	 * @param ctx the parse tree
	 */
	void exitBoolVDclNode(safedeclarationParser.BoolVDclNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumVDclAssignNode}
	 * labeled alternative in {@link safedeclarationParser#vdclassign}.
	 * @param ctx the parse tree
	 */
	void enterNumVDclAssignNode(safedeclarationParser.NumVDclAssignNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumVDclAssignNode}
	 * labeled alternative in {@link safedeclarationParser#vdclassign}.
	 * @param ctx the parse tree
	 */
	void exitNumVDclAssignNode(safedeclarationParser.NumVDclAssignNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharVDclAssignNode}
	 * labeled alternative in {@link safedeclarationParser#vdclassign}.
	 * @param ctx the parse tree
	 */
	void enterCharVDclAssignNode(safedeclarationParser.CharVDclAssignNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharVDclAssignNode}
	 * labeled alternative in {@link safedeclarationParser#vdclassign}.
	 * @param ctx the parse tree
	 */
	void exitCharVDclAssignNode(safedeclarationParser.CharVDclAssignNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringVDclAssignNode}
	 * labeled alternative in {@link safedeclarationParser#vdclassign}.
	 * @param ctx the parse tree
	 */
	void enterStringVDclAssignNode(safedeclarationParser.StringVDclAssignNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringVDclAssignNode}
	 * labeled alternative in {@link safedeclarationParser#vdclassign}.
	 * @param ctx the parse tree
	 */
	void exitStringVDclAssignNode(safedeclarationParser.StringVDclAssignNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolVDclAssignNode}
	 * labeled alternative in {@link safedeclarationParser#vdclassign}.
	 * @param ctx the parse tree
	 */
	void enterBoolVDclAssignNode(safedeclarationParser.BoolVDclAssignNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolVDclAssignNode}
	 * labeled alternative in {@link safedeclarationParser#vdclassign}.
	 * @param ctx the parse tree
	 */
	void exitBoolVDclAssignNode(safedeclarationParser.BoolVDclAssignNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumDeclNode}
	 * labeled alternative in {@link safedeclarationParser#numdecl}.
	 * @param ctx the parse tree
	 */
	void enterNumDeclNode(safedeclarationParser.NumDeclNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumDeclNode}
	 * labeled alternative in {@link safedeclarationParser#numdecl}.
	 * @param ctx the parse tree
	 */
	void exitNumDeclNode(safedeclarationParser.NumDeclNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolDeclNode}
	 * labeled alternative in {@link safedeclarationParser#booldecl}.
	 * @param ctx the parse tree
	 */
	void enterBoolDeclNode(safedeclarationParser.BoolDeclNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolDeclNode}
	 * labeled alternative in {@link safedeclarationParser#booldecl}.
	 * @param ctx the parse tree
	 */
	void exitBoolDeclNode(safedeclarationParser.BoolDeclNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharDeclNode}
	 * labeled alternative in {@link safedeclarationParser#chardecl}.
	 * @param ctx the parse tree
	 */
	void enterCharDeclNode(safedeclarationParser.CharDeclNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharDeclNode}
	 * labeled alternative in {@link safedeclarationParser#chardecl}.
	 * @param ctx the parse tree
	 */
	void exitCharDeclNode(safedeclarationParser.CharDeclNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringDeclNode}
	 * labeled alternative in {@link safedeclarationParser#stringdecl}.
	 * @param ctx the parse tree
	 */
	void enterStringDeclNode(safedeclarationParser.StringDeclNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringDeclNode}
	 * labeled alternative in {@link safedeclarationParser#stringdecl}.
	 * @param ctx the parse tree
	 */
	void exitStringDeclNode(safedeclarationParser.StringDeclNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumDclAssignNode}
	 * labeled alternative in {@link safedeclarationParser#numdclassign}.
	 * @param ctx the parse tree
	 */
	void enterNumDclAssignNode(safedeclarationParser.NumDclAssignNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumDclAssignNode}
	 * labeled alternative in {@link safedeclarationParser#numdclassign}.
	 * @param ctx the parse tree
	 */
	void exitNumDclAssignNode(safedeclarationParser.NumDclAssignNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharDclAssignNode}
	 * labeled alternative in {@link safedeclarationParser#chardclassign}.
	 * @param ctx the parse tree
	 */
	void enterCharDclAssignNode(safedeclarationParser.CharDclAssignNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharDclAssignNode}
	 * labeled alternative in {@link safedeclarationParser#chardclassign}.
	 * @param ctx the parse tree
	 */
	void exitCharDclAssignNode(safedeclarationParser.CharDclAssignNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringDclAssignNode}
	 * labeled alternative in {@link safedeclarationParser#stringdclassign}.
	 * @param ctx the parse tree
	 */
	void enterStringDclAssignNode(safedeclarationParser.StringDclAssignNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringDclAssignNode}
	 * labeled alternative in {@link safedeclarationParser#stringdclassign}.
	 * @param ctx the parse tree
	 */
	void exitStringDclAssignNode(safedeclarationParser.StringDclAssignNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolDclAssignNode}
	 * labeled alternative in {@link safedeclarationParser#booldclassign}.
	 * @param ctx the parse tree
	 */
	void enterBoolDclAssignNode(safedeclarationParser.BoolDclAssignNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolDclAssignNode}
	 * labeled alternative in {@link safedeclarationParser#booldclassign}.
	 * @param ctx the parse tree
	 */
	void exitBoolDclAssignNode(safedeclarationParser.BoolDclAssignNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolValNode}
	 * labeled alternative in {@link safedeclarationParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolValNode(safedeclarationParser.BoolValNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolValNode}
	 * labeled alternative in {@link safedeclarationParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolValNode(safedeclarationParser.BoolValNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BexprNode}
	 * labeled alternative in {@link safedeclarationParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBexprNode(safedeclarationParser.BexprNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BexprNode}
	 * labeled alternative in {@link safedeclarationParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBexprNode(safedeclarationParser.BexprNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BTermNode}
	 * labeled alternative in {@link safedeclarationParser#bterm}.
	 * @param ctx the parse tree
	 */
	void enterBTermNode(safedeclarationParser.BTermNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BTermNode}
	 * labeled alternative in {@link safedeclarationParser#bterm}.
	 * @param ctx the parse tree
	 */
	void exitBTermNode(safedeclarationParser.BTermNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BPartNode}
	 * labeled alternative in {@link safedeclarationParser#bterm}.
	 * @param ctx the parse tree
	 */
	void enterBPartNode(safedeclarationParser.BPartNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BPartNode}
	 * labeled alternative in {@link safedeclarationParser#bterm}.
	 * @param ctx the parse tree
	 */
	void exitBPartNode(safedeclarationParser.BPartNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BpartNode}
	 * labeled alternative in {@link safedeclarationParser#bpart}.
	 * @param ctx the parse tree
	 */
	void enterBpartNode(safedeclarationParser.BpartNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BpartNode}
	 * labeled alternative in {@link safedeclarationParser#bpart}.
	 * @param ctx the parse tree
	 */
	void exitBpartNode(safedeclarationParser.BpartNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BPieceNode}
	 * labeled alternative in {@link safedeclarationParser#bpart}.
	 * @param ctx the parse tree
	 */
	void enterBPieceNode(safedeclarationParser.BPieceNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BPieceNode}
	 * labeled alternative in {@link safedeclarationParser#bpart}.
	 * @param ctx the parse tree
	 */
	void exitBPieceNode(safedeclarationParser.BPieceNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotNode}
	 * labeled alternative in {@link safedeclarationParser#bpiece}.
	 * @param ctx the parse tree
	 */
	void enterNotNode(safedeclarationParser.NotNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotNode}
	 * labeled alternative in {@link safedeclarationParser#bpiece}.
	 * @param ctx the parse tree
	 */
	void exitNotNode(safedeclarationParser.NotNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlastNode}
	 * labeled alternative in {@link safedeclarationParser#bpiece}.
	 * @param ctx the parse tree
	 */
	void enterBlastNode(safedeclarationParser.BlastNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlastNode}
	 * labeled alternative in {@link safedeclarationParser#bpiece}.
	 * @param ctx the parse tree
	 */
	void exitBlastNode(safedeclarationParser.BlastNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParexprNode}
	 * labeled alternative in {@link safedeclarationParser#blast}.
	 * @param ctx the parse tree
	 */
	void enterParexprNode(safedeclarationParser.ParexprNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParexprNode}
	 * labeled alternative in {@link safedeclarationParser#blast}.
	 * @param ctx the parse tree
	 */
	void exitParexprNode(safedeclarationParser.ParexprNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdBlastNode}
	 * labeled alternative in {@link safedeclarationParser#blast}.
	 * @param ctx the parse tree
	 */
	void enterIdBlastNode(safedeclarationParser.IdBlastNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdBlastNode}
	 * labeled alternative in {@link safedeclarationParser#blast}.
	 * @param ctx the parse tree
	 */
	void exitIdBlastNode(safedeclarationParser.IdBlastNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermNode}
	 * labeled alternative in {@link safedeclarationParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterTermNode(safedeclarationParser.TermNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermNode}
	 * labeled alternative in {@link safedeclarationParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitTermNode(safedeclarationParser.TermNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PartNode}
	 * labeled alternative in {@link safedeclarationParser#term}.
	 * @param ctx the parse tree
	 */
	void enterPartNode(safedeclarationParser.PartNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PartNode}
	 * labeled alternative in {@link safedeclarationParser#term}.
	 * @param ctx the parse tree
	 */
	void exitPartNode(safedeclarationParser.PartNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PartAexprNode}
	 * labeled alternative in {@link safedeclarationParser#part}.
	 * @param ctx the parse tree
	 */
	void enterPartAexprNode(safedeclarationParser.PartAexprNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PartAexprNode}
	 * labeled alternative in {@link safedeclarationParser#part}.
	 * @param ctx the parse tree
	 */
	void exitPartAexprNode(safedeclarationParser.PartAexprNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdPartNode}
	 * labeled alternative in {@link safedeclarationParser#part}.
	 * @param ctx the parse tree
	 */
	void enterIdPartNode(safedeclarationParser.IdPartNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdPartNode}
	 * labeled alternative in {@link safedeclarationParser#part}.
	 * @param ctx the parse tree
	 */
	void exitIdPartNode(safedeclarationParser.IdPartNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberValNode}
	 * labeled alternative in {@link safedeclarationParser#part}.
	 * @param ctx the parse tree
	 */
	void enterNumberValNode(safedeclarationParser.NumberValNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberValNode}
	 * labeled alternative in {@link safedeclarationParser#part}.
	 * @param ctx the parse tree
	 */
	void exitNumberValNode(safedeclarationParser.NumberValNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PartBoolNode}
	 * labeled alternative in {@link safedeclarationParser#partbool}.
	 * @param ctx the parse tree
	 */
	void enterPartBoolNode(safedeclarationParser.PartBoolNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PartBoolNode}
	 * labeled alternative in {@link safedeclarationParser#partbool}.
	 * @param ctx the parse tree
	 */
	void exitPartBoolNode(safedeclarationParser.PartBoolNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumValNode}
	 * labeled alternative in {@link safedeclarationParser#numberval}.
	 * @param ctx the parse tree
	 */
	void enterNumValNode(safedeclarationParser.NumValNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumValNode}
	 * labeled alternative in {@link safedeclarationParser#numberval}.
	 * @param ctx the parse tree
	 */
	void exitNumValNode(safedeclarationParser.NumValNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PiNode}
	 * labeled alternative in {@link safedeclarationParser#numberval}.
	 * @param ctx the parse tree
	 */
	void enterPiNode(safedeclarationParser.PiNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PiNode}
	 * labeled alternative in {@link safedeclarationParser#numberval}.
	 * @param ctx the parse tree
	 */
	void exitPiNode(safedeclarationParser.PiNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndNode}
	 * labeled alternative in {@link safedeclarationParser#bop}.
	 * @param ctx the parse tree
	 */
	void enterAndNode(safedeclarationParser.AndNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndNode}
	 * labeled alternative in {@link safedeclarationParser#bop}.
	 * @param ctx the parse tree
	 */
	void exitAndNode(safedeclarationParser.AndNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrNode}
	 * labeled alternative in {@link safedeclarationParser#bop}.
	 * @param ctx the parse tree
	 */
	void enterOrNode(safedeclarationParser.OrNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrNode}
	 * labeled alternative in {@link safedeclarationParser#bop}.
	 * @param ctx the parse tree
	 */
	void exitOrNode(safedeclarationParser.OrNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualNode}
	 * labeled alternative in {@link safedeclarationParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterEqualNode(safedeclarationParser.EqualNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualNode}
	 * labeled alternative in {@link safedeclarationParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitEqualNode(safedeclarationParser.EqualNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEqualNode}
	 * labeled alternative in {@link safedeclarationParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualNode(safedeclarationParser.NotEqualNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqualNode}
	 * labeled alternative in {@link safedeclarationParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualNode(safedeclarationParser.NotEqualNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterEqualNode}
	 * labeled alternative in {@link safedeclarationParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterGreaterEqualNode(safedeclarationParser.GreaterEqualNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterEqualNode}
	 * labeled alternative in {@link safedeclarationParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitGreaterEqualNode(safedeclarationParser.GreaterEqualNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LesserEqualNode}
	 * labeled alternative in {@link safedeclarationParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterLesserEqualNode(safedeclarationParser.LesserEqualNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LesserEqualNode}
	 * labeled alternative in {@link safedeclarationParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitLesserEqualNode(safedeclarationParser.LesserEqualNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LesserNode}
	 * labeled alternative in {@link safedeclarationParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterLesserNode(safedeclarationParser.LesserNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LesserNode}
	 * labeled alternative in {@link safedeclarationParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitLesserNode(safedeclarationParser.LesserNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterNode}
	 * labeled alternative in {@link safedeclarationParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterGreaterNode(safedeclarationParser.GreaterNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterNode}
	 * labeled alternative in {@link safedeclarationParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitGreaterNode(safedeclarationParser.GreaterNodeContext ctx);
}