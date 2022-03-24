// Generated from C:/Users/Mandrup/Documents/GitHub/ANTLR/src/main/java/SafeCTwo\SafeCTwo.g4 by ANTLR 4.9.2
package SafeCTwo.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SafeCTwoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SafeCTwoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code DeclarationNode}
	 * labeled alternative in {@link SafeCTwoParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationNode(SafeCTwoParser.DeclarationNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DclAssignSemiNode}
	 * labeled alternative in {@link SafeCTwoParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDclAssignSemiNode(SafeCTwoParser.DclAssignSemiNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructDclNode}
	 * labeled alternative in {@link SafeCTwoParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDclNode(SafeCTwoParser.StructDclNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncDclNode}
	 * labeled alternative in {@link SafeCTwoParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDclNode(SafeCTwoParser.FuncDclNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructDclBlockNode}
	 * labeled alternative in {@link SafeCTwoParser#structdcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDclBlockNode(SafeCTwoParser.StructDclBlockNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructBlockNode}
	 * labeled alternative in {@link SafeCTwoParser#structblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructBlockNode(SafeCTwoParser.StructBlockNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SafeDeclVAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#dclassignsemi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSafeDeclVAssignNode(SafeCTwoParser.SafeDeclVAssignNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DclAssignSemiCommandNode}
	 * labeled alternative in {@link SafeCTwoParser#dclassignsemicommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDclAssignSemiCommandNode(SafeCTwoParser.DclAssignSemiCommandNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SafeDeclNode}
	 * labeled alternative in {@link SafeCTwoParser#safedeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSafeDeclNode(SafeCTwoParser.SafeDeclNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParamsNode}
	 * labeled alternative in {@link SafeCTwoParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamsNode(SafeCTwoParser.ParamsNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockNode}
	 * labeled alternative in {@link SafeCTwoParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockNode(SafeCTwoParser.BlockNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CaseBlockNode}
	 * labeled alternative in {@link SafeCTwoParser#caseblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBlockNode(SafeCTwoParser.CaseBlockNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumVDclNode}
	 * labeled alternative in {@link SafeCTwoParser#vdcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumVDclNode(SafeCTwoParser.NumVDclNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharVDclNode}
	 * labeled alternative in {@link SafeCTwoParser#vdcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharVDclNode(SafeCTwoParser.CharVDclNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringVDclNode}
	 * labeled alternative in {@link SafeCTwoParser#vdcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringVDclNode(SafeCTwoParser.StringVDclNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolVDclNode}
	 * labeled alternative in {@link SafeCTwoParser#vdcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVDclNode(SafeCTwoParser.BoolVDclNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDclNode}
	 * labeled alternative in {@link SafeCTwoParser#vdcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDclNode(SafeCTwoParser.ArrayDclNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDeclNode}
	 * labeled alternative in {@link SafeCTwoParser#arraydecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclNode(SafeCTwoParser.ArrayDeclNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDclTypeNumDclNode}
	 * labeled alternative in {@link SafeCTwoParser#arrdcltype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDclTypeNumDclNode(SafeCTwoParser.ArrayDclTypeNumDclNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDclTypeCharDclNode}
	 * labeled alternative in {@link SafeCTwoParser#arrdcltype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDclTypeCharDclNode(SafeCTwoParser.ArrayDclTypeCharDclNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDclTypeStringDclNode}
	 * labeled alternative in {@link SafeCTwoParser#arrdcltype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDclTypeStringDclNode(SafeCTwoParser.ArrayDclTypeStringDclNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDclTypeBoolDclNode}
	 * labeled alternative in {@link SafeCTwoParser#arrdcltype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDclTypeBoolDclNode(SafeCTwoParser.ArrayDclTypeBoolDclNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#vassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVAssignNode(SafeCTwoParser.VAssignNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumVDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#vdclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumVDclAssignNode(SafeCTwoParser.NumVDclAssignNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharVDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#vdclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharVDclAssignNode(SafeCTwoParser.CharVDclAssignNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringVDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#vdclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringVDclAssignNode(SafeCTwoParser.StringVDclAssignNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolVDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#vdclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVDclAssignNode(SafeCTwoParser.BoolVDclAssignNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#vdclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDclAssignNode(SafeCTwoParser.ArrayDclAssignNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumArrayDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#arraydclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumArrayDclAssignNode(SafeCTwoParser.NumArrayDclAssignNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharArrayDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#arraydclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharArrayDclAssignNode(SafeCTwoParser.CharArrayDclAssignNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringArrayDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#arraydclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringArrayDclAssignNode(SafeCTwoParser.StringArrayDclAssignNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolArrayDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#arraydclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolArrayDclAssignNode(SafeCTwoParser.BoolArrayDclAssignNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumArrayDclAssignNumArrayNode}
	 * labeled alternative in {@link SafeCTwoParser#numarraydclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumArrayDclAssignNumArrayNode(SafeCTwoParser.NumArrayDclAssignNumArrayNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharArrayDclAssignCharArrayNode}
	 * labeled alternative in {@link SafeCTwoParser#chararraydclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharArrayDclAssignCharArrayNode(SafeCTwoParser.CharArrayDclAssignCharArrayNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringArrayDclAssignStringArrayNode}
	 * labeled alternative in {@link SafeCTwoParser#stringarraydclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringArrayDclAssignStringArrayNode(SafeCTwoParser.StringArrayDclAssignStringArrayNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolArrayDclAssignBoolArrayNode}
	 * labeled alternative in {@link SafeCTwoParser#boolarraydclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolArrayDclAssignBoolArrayNode(SafeCTwoParser.BoolArrayDclAssignBoolArrayNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumDclDatatypeNode}
	 * labeled alternative in {@link SafeCTwoParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumDclDatatypeNode(SafeCTwoParser.NumDclDatatypeNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharDclDatatypeNode}
	 * labeled alternative in {@link SafeCTwoParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharDclDatatypeNode(SafeCTwoParser.CharDclDatatypeNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringDclDatatypeNode}
	 * labeled alternative in {@link SafeCTwoParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringDclDatatypeNode(SafeCTwoParser.StringDclDatatypeNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolDclDatatypeNode}
	 * labeled alternative in {@link SafeCTwoParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolDclDatatypeNode(SafeCTwoParser.BoolDclDatatypeNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VoidDclDatatypeNode}
	 * labeled alternative in {@link SafeCTwoParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidDclDatatypeNode(SafeCTwoParser.VoidDclDatatypeNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ATypeAexprNode}
	 * labeled alternative in {@link SafeCTwoParser#atypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitATypeAexprNode(SafeCTwoParser.ATypeAexprNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ATypeBexprNode}
	 * labeled alternative in {@link SafeCTwoParser#atypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitATypeBexprNode(SafeCTwoParser.ATypeBexprNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ATypeCharValNode}
	 * labeled alternative in {@link SafeCTwoParser#atypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitATypeCharValNode(SafeCTwoParser.ATypeCharValNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ATypeStrValNode}
	 * labeled alternative in {@link SafeCTwoParser#atypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitATypeStrValNode(SafeCTwoParser.ATypeStrValNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ATypeFuncCallsNode}
	 * labeled alternative in {@link SafeCTwoParser#atypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitATypeFuncCallsNode(SafeCTwoParser.ATypeFuncCallsNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ATypeArrayAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#atypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitATypeArrayAssignNode(SafeCTwoParser.ATypeArrayAssignNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#arrayassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignNode(SafeCTwoParser.ArrayAssignNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumArrayDataNode}
	 * labeled alternative in {@link SafeCTwoParser#arraydata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumArrayDataNode(SafeCTwoParser.NumArrayDataNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharArrayDataNode}
	 * labeled alternative in {@link SafeCTwoParser#arraydata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharArrayDataNode(SafeCTwoParser.CharArrayDataNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringArrayDataNode}
	 * labeled alternative in {@link SafeCTwoParser#arraydata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringArrayDataNode(SafeCTwoParser.StringArrayDataNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolArrayDataNode}
	 * labeled alternative in {@link SafeCTwoParser#arraydata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolArrayDataNode(SafeCTwoParser.BoolArrayDataNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumArrayNode}
	 * labeled alternative in {@link SafeCTwoParser#numarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumArrayNode(SafeCTwoParser.NumArrayNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharArrayNode}
	 * labeled alternative in {@link SafeCTwoParser#chararray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharArrayNode(SafeCTwoParser.CharArrayNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringArrayNode}
	 * labeled alternative in {@link SafeCTwoParser#strarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringArrayNode(SafeCTwoParser.StringArrayNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolArrayNode}
	 * labeled alternative in {@link SafeCTwoParser#boolarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolArrayNode(SafeCTwoParser.BoolArrayNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ControlstructNode}
	 * labeled alternative in {@link SafeCTwoParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlstructNode(SafeCTwoParser.ControlstructNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctioncallsNode}
	 * labeled alternative in {@link SafeCTwoParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncallsNode(SafeCTwoParser.FunctioncallsNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallParametersNode}
	 * labeled alternative in {@link SafeCTwoParser#funccalls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallParametersNode(SafeCTwoParser.CallParametersNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncDclBlockNode}
	 * labeled alternative in {@link SafeCTwoParser#funcdcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDclBlockNode(SafeCTwoParser.FuncDclBlockNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncBlockNode}
	 * labeled alternative in {@link SafeCTwoParser#funcblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncBlockNode(SafeCTwoParser.FuncBlockNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallParamsValsNode}
	 * labeled alternative in {@link SafeCTwoParser#callparams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallParamsValsNode(SafeCTwoParser.CallParamsValsNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectiveNode}
	 * labeled alternative in {@link SafeCTwoParser#ctrlstruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectiveNode(SafeCTwoParser.SelectiveNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IterativeNode}
	 * labeled alternative in {@link SafeCTwoParser#ctrlstruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterativeNode(SafeCTwoParser.IterativeNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStmtNode}
	 * labeled alternative in {@link SafeCTwoParser#iterative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmtNode(SafeCTwoParser.ForStmtNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStmtNode}
	 * labeled alternative in {@link SafeCTwoParser#iterative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmtNode(SafeCTwoParser.WhileStmtNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStmtNode}
	 * labeled alternative in {@link SafeCTwoParser#selective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmtNode(SafeCTwoParser.IfStmtNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SwitchStmtNode}
	 * labeled alternative in {@link SafeCTwoParser#selective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStmtNode(SafeCTwoParser.SwitchStmtNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BtermNode}
	 * labeled alternative in {@link SafeCTwoParser#iflogic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBtermNode(SafeCTwoParser.BtermNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForParamsNode}
	 * labeled alternative in {@link SafeCTwoParser#forparams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForParamsNode(SafeCTwoParser.ForParamsNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SCaseNode}
	 * labeled alternative in {@link SafeCTwoParser#scase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSCaseNode(SafeCTwoParser.SCaseNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefCaseNode}
	 * labeled alternative in {@link SafeCTwoParser#defcase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefCaseNode(SafeCTwoParser.DefCaseNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumDeclNode}
	 * labeled alternative in {@link SafeCTwoParser#numdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumDeclNode(SafeCTwoParser.NumDeclNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolDeclNode}
	 * labeled alternative in {@link SafeCTwoParser#booldecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolDeclNode(SafeCTwoParser.BoolDeclNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharDeclNode}
	 * labeled alternative in {@link SafeCTwoParser#chardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharDeclNode(SafeCTwoParser.CharDeclNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringDeclNode}
	 * labeled alternative in {@link SafeCTwoParser#stringdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringDeclNode(SafeCTwoParser.StringDeclNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#numdclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumDclAssignNode(SafeCTwoParser.NumDclAssignNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#chardclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharDclAssignNode(SafeCTwoParser.CharDclAssignNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#stringdclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringDclAssignNode(SafeCTwoParser.StringDclAssignNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#booldclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolDclAssignNode(SafeCTwoParser.BoolDclAssignNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolValNode}
	 * labeled alternative in {@link SafeCTwoParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolValNode(SafeCTwoParser.BoolValNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BexprNode}
	 * labeled alternative in {@link SafeCTwoParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexprNode(SafeCTwoParser.BexprNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BTermNode}
	 * labeled alternative in {@link SafeCTwoParser#bterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBTermNode(SafeCTwoParser.BTermNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BPartNode}
	 * labeled alternative in {@link SafeCTwoParser#bterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBPartNode(SafeCTwoParser.BPartNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BpartNode}
	 * labeled alternative in {@link SafeCTwoParser#bpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBpartNode(SafeCTwoParser.BpartNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BPieceNode}
	 * labeled alternative in {@link SafeCTwoParser#bpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBPieceNode(SafeCTwoParser.BPieceNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotNode}
	 * labeled alternative in {@link SafeCTwoParser#bpiece}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotNode(SafeCTwoParser.NotNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlastNode}
	 * labeled alternative in {@link SafeCTwoParser#bpiece}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlastNode(SafeCTwoParser.BlastNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParexprNode}
	 * labeled alternative in {@link SafeCTwoParser#blast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParexprNode(SafeCTwoParser.ParexprNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdBlastNode}
	 * labeled alternative in {@link SafeCTwoParser#blast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdBlastNode(SafeCTwoParser.IdBlastNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermNode}
	 * labeled alternative in {@link SafeCTwoParser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermNode(SafeCTwoParser.TermNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PartNode}
	 * labeled alternative in {@link SafeCTwoParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartNode(SafeCTwoParser.PartNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PartAexprNode}
	 * labeled alternative in {@link SafeCTwoParser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartAexprNode(SafeCTwoParser.PartAexprNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdPartNode}
	 * labeled alternative in {@link SafeCTwoParser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdPartNode(SafeCTwoParser.IdPartNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberValNode}
	 * labeled alternative in {@link SafeCTwoParser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberValNode(SafeCTwoParser.NumberValNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PartBoolNode}
	 * labeled alternative in {@link SafeCTwoParser#partbool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartBoolNode(SafeCTwoParser.PartBoolNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndNode}
	 * labeled alternative in {@link SafeCTwoParser#bop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndNode(SafeCTwoParser.AndNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrNode}
	 * labeled alternative in {@link SafeCTwoParser#bop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrNode(SafeCTwoParser.OrNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValsNumberValsNode}
	 * labeled alternative in {@link SafeCTwoParser#vals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValsNumberValsNode(SafeCTwoParser.ValsNumberValsNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValsCharValsNode}
	 * labeled alternative in {@link SafeCTwoParser#vals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValsCharValsNode(SafeCTwoParser.ValsCharValsNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValsStrValsNode}
	 * labeled alternative in {@link SafeCTwoParser#vals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValsStrValsNode(SafeCTwoParser.ValsStrValsNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValsBoolValsNode}
	 * labeled alternative in {@link SafeCTwoParser#vals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValsBoolValsNode(SafeCTwoParser.ValsBoolValsNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValsIdValsNode}
	 * labeled alternative in {@link SafeCTwoParser#vals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValsIdValsNode(SafeCTwoParser.ValsIdValsNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumValNode}
	 * labeled alternative in {@link SafeCTwoParser#numberval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumValNode(SafeCTwoParser.NumValNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PiNode}
	 * labeled alternative in {@link SafeCTwoParser#numberval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPiNode(SafeCTwoParser.PiNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualNode}
	 * labeled alternative in {@link SafeCTwoParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualNode(SafeCTwoParser.EqualNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEqualNode}
	 * labeled alternative in {@link SafeCTwoParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualNode(SafeCTwoParser.NotEqualNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterEqualNode}
	 * labeled alternative in {@link SafeCTwoParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterEqualNode(SafeCTwoParser.GreaterEqualNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LesserEqualNode}
	 * labeled alternative in {@link SafeCTwoParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLesserEqualNode(SafeCTwoParser.LesserEqualNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LesserNode}
	 * labeled alternative in {@link SafeCTwoParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLesserNode(SafeCTwoParser.LesserNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterNode}
	 * labeled alternative in {@link SafeCTwoParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterNode(SafeCTwoParser.GreaterNodeContext ctx);
}