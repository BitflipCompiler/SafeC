// Generated from C:/Users/Mandrup/Documents/GitHub/ANTLR/src/main/java/Safedeclaration\safedeclaration.g4 by ANTLR 4.9.2
package Safedeclaration.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link safedeclarationParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface safedeclarationVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code SafeDeclNode}
	 * labeled alternative in {@link safedeclarationParser#safedeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSafeDeclNode(safedeclarationParser.SafeDeclNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumVDclNode}
	 * labeled alternative in {@link safedeclarationParser#vdcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumVDclNode(safedeclarationParser.NumVDclNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharVDclNode}
	 * labeled alternative in {@link safedeclarationParser#vdcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharVDclNode(safedeclarationParser.CharVDclNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringVDclNode}
	 * labeled alternative in {@link safedeclarationParser#vdcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringVDclNode(safedeclarationParser.StringVDclNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolVDclNode}
	 * labeled alternative in {@link safedeclarationParser#vdcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVDclNode(safedeclarationParser.BoolVDclNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumVDclAssignNode}
	 * labeled alternative in {@link safedeclarationParser#vdclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumVDclAssignNode(safedeclarationParser.NumVDclAssignNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharVDclAssignNode}
	 * labeled alternative in {@link safedeclarationParser#vdclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharVDclAssignNode(safedeclarationParser.CharVDclAssignNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringVDclAssignNode}
	 * labeled alternative in {@link safedeclarationParser#vdclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringVDclAssignNode(safedeclarationParser.StringVDclAssignNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolVDclAssignNode}
	 * labeled alternative in {@link safedeclarationParser#vdclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVDclAssignNode(safedeclarationParser.BoolVDclAssignNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumDeclNode}
	 * labeled alternative in {@link safedeclarationParser#numdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumDeclNode(safedeclarationParser.NumDeclNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolDeclNode}
	 * labeled alternative in {@link safedeclarationParser#booldecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolDeclNode(safedeclarationParser.BoolDeclNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharDeclNode}
	 * labeled alternative in {@link safedeclarationParser#chardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharDeclNode(safedeclarationParser.CharDeclNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringDeclNode}
	 * labeled alternative in {@link safedeclarationParser#stringdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringDeclNode(safedeclarationParser.StringDeclNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumDclAssignNode}
	 * labeled alternative in {@link safedeclarationParser#numdclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumDclAssignNode(safedeclarationParser.NumDclAssignNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharDclAssignNode}
	 * labeled alternative in {@link safedeclarationParser#chardclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharDclAssignNode(safedeclarationParser.CharDclAssignNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringDclAssignNode}
	 * labeled alternative in {@link safedeclarationParser#stringdclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringDclAssignNode(safedeclarationParser.StringDclAssignNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolDclAssignNode}
	 * labeled alternative in {@link safedeclarationParser#booldclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolDclAssignNode(safedeclarationParser.BoolDclAssignNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolValNode}
	 * labeled alternative in {@link safedeclarationParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolValNode(safedeclarationParser.BoolValNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BexprNode}
	 * labeled alternative in {@link safedeclarationParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexprNode(safedeclarationParser.BexprNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BTermNode}
	 * labeled alternative in {@link safedeclarationParser#bterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBTermNode(safedeclarationParser.BTermNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BPartNode}
	 * labeled alternative in {@link safedeclarationParser#bterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBPartNode(safedeclarationParser.BPartNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BpartNode}
	 * labeled alternative in {@link safedeclarationParser#bpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBpartNode(safedeclarationParser.BpartNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BPieceNode}
	 * labeled alternative in {@link safedeclarationParser#bpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBPieceNode(safedeclarationParser.BPieceNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotNode}
	 * labeled alternative in {@link safedeclarationParser#bpiece}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotNode(safedeclarationParser.NotNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlastNode}
	 * labeled alternative in {@link safedeclarationParser#bpiece}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlastNode(safedeclarationParser.BlastNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParexprNode}
	 * labeled alternative in {@link safedeclarationParser#blast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParexprNode(safedeclarationParser.ParexprNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdBlastNode}
	 * labeled alternative in {@link safedeclarationParser#blast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdBlastNode(safedeclarationParser.IdBlastNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermNode}
	 * labeled alternative in {@link safedeclarationParser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermNode(safedeclarationParser.TermNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PartNode}
	 * labeled alternative in {@link safedeclarationParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartNode(safedeclarationParser.PartNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PartAexprNode}
	 * labeled alternative in {@link safedeclarationParser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartAexprNode(safedeclarationParser.PartAexprNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdPartNode}
	 * labeled alternative in {@link safedeclarationParser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdPartNode(safedeclarationParser.IdPartNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberValNode}
	 * labeled alternative in {@link safedeclarationParser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberValNode(safedeclarationParser.NumberValNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PartBoolNode}
	 * labeled alternative in {@link safedeclarationParser#partbool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartBoolNode(safedeclarationParser.PartBoolNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumValNode}
	 * labeled alternative in {@link safedeclarationParser#numberval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumValNode(safedeclarationParser.NumValNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PiNode}
	 * labeled alternative in {@link safedeclarationParser#numberval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPiNode(safedeclarationParser.PiNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndNode}
	 * labeled alternative in {@link safedeclarationParser#bop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndNode(safedeclarationParser.AndNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrNode}
	 * labeled alternative in {@link safedeclarationParser#bop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrNode(safedeclarationParser.OrNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualNode}
	 * labeled alternative in {@link safedeclarationParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualNode(safedeclarationParser.EqualNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEqualNode}
	 * labeled alternative in {@link safedeclarationParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualNode(safedeclarationParser.NotEqualNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterEqualNode}
	 * labeled alternative in {@link safedeclarationParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterEqualNode(safedeclarationParser.GreaterEqualNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LesserEqualNode}
	 * labeled alternative in {@link safedeclarationParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLesserEqualNode(safedeclarationParser.LesserEqualNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LesserNode}
	 * labeled alternative in {@link safedeclarationParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLesserNode(safedeclarationParser.LesserNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterNode}
	 * labeled alternative in {@link safedeclarationParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterNode(safedeclarationParser.GreaterNodeContext ctx);
}