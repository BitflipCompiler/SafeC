// Generated from C:/Users/Mandrup/Documents/GitHub/ANTLR/src/main/java/SafeCTwo\SafeCTwo.g4 by ANTLR 4.9.2
package old.SafeCTwo.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SafeCTwoParser}.
 */
public interface SafeCTwoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code DeclarationNode}
	 * labeled alternative in {@link SafeCTwoParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationNode(SafeCTwoParser.DeclarationNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclarationNode}
	 * labeled alternative in {@link SafeCTwoParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationNode(SafeCTwoParser.DeclarationNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DclAssignSemiNode}
	 * labeled alternative in {@link SafeCTwoParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDclAssignSemiNode(SafeCTwoParser.DclAssignSemiNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DclAssignSemiNode}
	 * labeled alternative in {@link SafeCTwoParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDclAssignSemiNode(SafeCTwoParser.DclAssignSemiNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructDclNode}
	 * labeled alternative in {@link SafeCTwoParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDclNode(SafeCTwoParser.StructDclNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructDclNode}
	 * labeled alternative in {@link SafeCTwoParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDclNode(SafeCTwoParser.StructDclNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncDclNode}
	 * labeled alternative in {@link SafeCTwoParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterFuncDclNode(SafeCTwoParser.FuncDclNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncDclNode}
	 * labeled alternative in {@link SafeCTwoParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitFuncDclNode(SafeCTwoParser.FuncDclNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructDclBlockNode}
	 * labeled alternative in {@link SafeCTwoParser#structdcl}.
	 * @param ctx the parse tree
	 */
	void enterStructDclBlockNode(SafeCTwoParser.StructDclBlockNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructDclBlockNode}
	 * labeled alternative in {@link SafeCTwoParser#structdcl}.
	 * @param ctx the parse tree
	 */
	void exitStructDclBlockNode(SafeCTwoParser.StructDclBlockNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructBlockNode}
	 * labeled alternative in {@link SafeCTwoParser#structblock}.
	 * @param ctx the parse tree
	 */
	void enterStructBlockNode(SafeCTwoParser.StructBlockNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructBlockNode}
	 * labeled alternative in {@link SafeCTwoParser#structblock}.
	 * @param ctx the parse tree
	 */
	void exitStructBlockNode(SafeCTwoParser.StructBlockNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SafeDeclVAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#dclassignsemi}.
	 * @param ctx the parse tree
	 */
	void enterSafeDeclVAssignNode(SafeCTwoParser.SafeDeclVAssignNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SafeDeclVAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#dclassignsemi}.
	 * @param ctx the parse tree
	 */
	void exitSafeDeclVAssignNode(SafeCTwoParser.SafeDeclVAssignNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DclAssignSemiCommandNode}
	 * labeled alternative in {@link SafeCTwoParser#dclassignsemicommand}.
	 * @param ctx the parse tree
	 */
	void enterDclAssignSemiCommandNode(SafeCTwoParser.DclAssignSemiCommandNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DclAssignSemiCommandNode}
	 * labeled alternative in {@link SafeCTwoParser#dclassignsemicommand}.
	 * @param ctx the parse tree
	 */
	void exitDclAssignSemiCommandNode(SafeCTwoParser.DclAssignSemiCommandNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SafeDeclNode}
	 * labeled alternative in {@link SafeCTwoParser#safedeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSafeDeclNode(SafeCTwoParser.SafeDeclNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SafeDeclNode}
	 * labeled alternative in {@link SafeCTwoParser#safedeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSafeDeclNode(SafeCTwoParser.SafeDeclNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParamsNode}
	 * labeled alternative in {@link SafeCTwoParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParamsNode(SafeCTwoParser.ParamsNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParamsNode}
	 * labeled alternative in {@link SafeCTwoParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParamsNode(SafeCTwoParser.ParamsNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockNode}
	 * labeled alternative in {@link SafeCTwoParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockNode(SafeCTwoParser.BlockNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockNode}
	 * labeled alternative in {@link SafeCTwoParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockNode(SafeCTwoParser.BlockNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CaseBlockNode}
	 * labeled alternative in {@link SafeCTwoParser#caseblock}.
	 * @param ctx the parse tree
	 */
	void enterCaseBlockNode(SafeCTwoParser.CaseBlockNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CaseBlockNode}
	 * labeled alternative in {@link SafeCTwoParser#caseblock}.
	 * @param ctx the parse tree
	 */
	void exitCaseBlockNode(SafeCTwoParser.CaseBlockNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumVDclNode}
	 * labeled alternative in {@link SafeCTwoParser#vdcl}.
	 * @param ctx the parse tree
	 */
	void enterNumVDclNode(SafeCTwoParser.NumVDclNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumVDclNode}
	 * labeled alternative in {@link SafeCTwoParser#vdcl}.
	 * @param ctx the parse tree
	 */
	void exitNumVDclNode(SafeCTwoParser.NumVDclNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharVDclNode}
	 * labeled alternative in {@link SafeCTwoParser#vdcl}.
	 * @param ctx the parse tree
	 */
	void enterCharVDclNode(SafeCTwoParser.CharVDclNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharVDclNode}
	 * labeled alternative in {@link SafeCTwoParser#vdcl}.
	 * @param ctx the parse tree
	 */
	void exitCharVDclNode(SafeCTwoParser.CharVDclNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringVDclNode}
	 * labeled alternative in {@link SafeCTwoParser#vdcl}.
	 * @param ctx the parse tree
	 */
	void enterStringVDclNode(SafeCTwoParser.StringVDclNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringVDclNode}
	 * labeled alternative in {@link SafeCTwoParser#vdcl}.
	 * @param ctx the parse tree
	 */
	void exitStringVDclNode(SafeCTwoParser.StringVDclNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolVDclNode}
	 * labeled alternative in {@link SafeCTwoParser#vdcl}.
	 * @param ctx the parse tree
	 */
	void enterBoolVDclNode(SafeCTwoParser.BoolVDclNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolVDclNode}
	 * labeled alternative in {@link SafeCTwoParser#vdcl}.
	 * @param ctx the parse tree
	 */
	void exitBoolVDclNode(SafeCTwoParser.BoolVDclNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayDclNode}
	 * labeled alternative in {@link SafeCTwoParser#vdcl}.
	 * @param ctx the parse tree
	 */
	void enterArrayDclNode(SafeCTwoParser.ArrayDclNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayDclNode}
	 * labeled alternative in {@link SafeCTwoParser#vdcl}.
	 * @param ctx the parse tree
	 */
	void exitArrayDclNode(SafeCTwoParser.ArrayDclNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayDeclNode}
	 * labeled alternative in {@link SafeCTwoParser#arraydecl}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclNode(SafeCTwoParser.ArrayDeclNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayDeclNode}
	 * labeled alternative in {@link SafeCTwoParser#arraydecl}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclNode(SafeCTwoParser.ArrayDeclNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayDclTypeNumDclNode}
	 * labeled alternative in {@link SafeCTwoParser#arrdcltype}.
	 * @param ctx the parse tree
	 */
	void enterArrayDclTypeNumDclNode(SafeCTwoParser.ArrayDclTypeNumDclNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayDclTypeNumDclNode}
	 * labeled alternative in {@link SafeCTwoParser#arrdcltype}.
	 * @param ctx the parse tree
	 */
	void exitArrayDclTypeNumDclNode(SafeCTwoParser.ArrayDclTypeNumDclNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayDclTypeCharDclNode}
	 * labeled alternative in {@link SafeCTwoParser#arrdcltype}.
	 * @param ctx the parse tree
	 */
	void enterArrayDclTypeCharDclNode(SafeCTwoParser.ArrayDclTypeCharDclNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayDclTypeCharDclNode}
	 * labeled alternative in {@link SafeCTwoParser#arrdcltype}.
	 * @param ctx the parse tree
	 */
	void exitArrayDclTypeCharDclNode(SafeCTwoParser.ArrayDclTypeCharDclNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayDclTypeStringDclNode}
	 * labeled alternative in {@link SafeCTwoParser#arrdcltype}.
	 * @param ctx the parse tree
	 */
	void enterArrayDclTypeStringDclNode(SafeCTwoParser.ArrayDclTypeStringDclNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayDclTypeStringDclNode}
	 * labeled alternative in {@link SafeCTwoParser#arrdcltype}.
	 * @param ctx the parse tree
	 */
	void exitArrayDclTypeStringDclNode(SafeCTwoParser.ArrayDclTypeStringDclNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayDclTypeBoolDclNode}
	 * labeled alternative in {@link SafeCTwoParser#arrdcltype}.
	 * @param ctx the parse tree
	 */
	void enterArrayDclTypeBoolDclNode(SafeCTwoParser.ArrayDclTypeBoolDclNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayDclTypeBoolDclNode}
	 * labeled alternative in {@link SafeCTwoParser#arrdcltype}.
	 * @param ctx the parse tree
	 */
	void exitArrayDclTypeBoolDclNode(SafeCTwoParser.ArrayDclTypeBoolDclNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#vassign}.
	 * @param ctx the parse tree
	 */
	void enterVAssignNode(SafeCTwoParser.VAssignNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#vassign}.
	 * @param ctx the parse tree
	 */
	void exitVAssignNode(SafeCTwoParser.VAssignNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumVDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#vdclassign}.
	 * @param ctx the parse tree
	 */
	void enterNumVDclAssignNode(SafeCTwoParser.NumVDclAssignNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumVDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#vdclassign}.
	 * @param ctx the parse tree
	 */
	void exitNumVDclAssignNode(SafeCTwoParser.NumVDclAssignNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharVDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#vdclassign}.
	 * @param ctx the parse tree
	 */
	void enterCharVDclAssignNode(SafeCTwoParser.CharVDclAssignNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharVDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#vdclassign}.
	 * @param ctx the parse tree
	 */
	void exitCharVDclAssignNode(SafeCTwoParser.CharVDclAssignNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringVDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#vdclassign}.
	 * @param ctx the parse tree
	 */
	void enterStringVDclAssignNode(SafeCTwoParser.StringVDclAssignNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringVDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#vdclassign}.
	 * @param ctx the parse tree
	 */
	void exitStringVDclAssignNode(SafeCTwoParser.StringVDclAssignNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolVDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#vdclassign}.
	 * @param ctx the parse tree
	 */
	void enterBoolVDclAssignNode(SafeCTwoParser.BoolVDclAssignNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolVDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#vdclassign}.
	 * @param ctx the parse tree
	 */
	void exitBoolVDclAssignNode(SafeCTwoParser.BoolVDclAssignNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#vdclassign}.
	 * @param ctx the parse tree
	 */
	void enterArrayDclAssignNode(SafeCTwoParser.ArrayDclAssignNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#vdclassign}.
	 * @param ctx the parse tree
	 */
	void exitArrayDclAssignNode(SafeCTwoParser.ArrayDclAssignNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumArrayDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#arraydclassign}.
	 * @param ctx the parse tree
	 */
	void enterNumArrayDclAssignNode(SafeCTwoParser.NumArrayDclAssignNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumArrayDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#arraydclassign}.
	 * @param ctx the parse tree
	 */
	void exitNumArrayDclAssignNode(SafeCTwoParser.NumArrayDclAssignNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharArrayDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#arraydclassign}.
	 * @param ctx the parse tree
	 */
	void enterCharArrayDclAssignNode(SafeCTwoParser.CharArrayDclAssignNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharArrayDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#arraydclassign}.
	 * @param ctx the parse tree
	 */
	void exitCharArrayDclAssignNode(SafeCTwoParser.CharArrayDclAssignNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringArrayDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#arraydclassign}.
	 * @param ctx the parse tree
	 */
	void enterStringArrayDclAssignNode(SafeCTwoParser.StringArrayDclAssignNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringArrayDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#arraydclassign}.
	 * @param ctx the parse tree
	 */
	void exitStringArrayDclAssignNode(SafeCTwoParser.StringArrayDclAssignNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolArrayDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#arraydclassign}.
	 * @param ctx the parse tree
	 */
	void enterBoolArrayDclAssignNode(SafeCTwoParser.BoolArrayDclAssignNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolArrayDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#arraydclassign}.
	 * @param ctx the parse tree
	 */
	void exitBoolArrayDclAssignNode(SafeCTwoParser.BoolArrayDclAssignNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumArrayDclAssignNumArrayNode}
	 * labeled alternative in {@link SafeCTwoParser#numarraydclassign}.
	 * @param ctx the parse tree
	 */
	void enterNumArrayDclAssignNumArrayNode(SafeCTwoParser.NumArrayDclAssignNumArrayNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumArrayDclAssignNumArrayNode}
	 * labeled alternative in {@link SafeCTwoParser#numarraydclassign}.
	 * @param ctx the parse tree
	 */
	void exitNumArrayDclAssignNumArrayNode(SafeCTwoParser.NumArrayDclAssignNumArrayNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharArrayDclAssignCharArrayNode}
	 * labeled alternative in {@link SafeCTwoParser#chararraydclassign}.
	 * @param ctx the parse tree
	 */
	void enterCharArrayDclAssignCharArrayNode(SafeCTwoParser.CharArrayDclAssignCharArrayNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharArrayDclAssignCharArrayNode}
	 * labeled alternative in {@link SafeCTwoParser#chararraydclassign}.
	 * @param ctx the parse tree
	 */
	void exitCharArrayDclAssignCharArrayNode(SafeCTwoParser.CharArrayDclAssignCharArrayNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringArrayDclAssignStringArrayNode}
	 * labeled alternative in {@link SafeCTwoParser#stringarraydclassign}.
	 * @param ctx the parse tree
	 */
	void enterStringArrayDclAssignStringArrayNode(SafeCTwoParser.StringArrayDclAssignStringArrayNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringArrayDclAssignStringArrayNode}
	 * labeled alternative in {@link SafeCTwoParser#stringarraydclassign}.
	 * @param ctx the parse tree
	 */
	void exitStringArrayDclAssignStringArrayNode(SafeCTwoParser.StringArrayDclAssignStringArrayNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolArrayDclAssignBoolArrayNode}
	 * labeled alternative in {@link SafeCTwoParser#boolarraydclassign}.
	 * @param ctx the parse tree
	 */
	void enterBoolArrayDclAssignBoolArrayNode(SafeCTwoParser.BoolArrayDclAssignBoolArrayNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolArrayDclAssignBoolArrayNode}
	 * labeled alternative in {@link SafeCTwoParser#boolarraydclassign}.
	 * @param ctx the parse tree
	 */
	void exitBoolArrayDclAssignBoolArrayNode(SafeCTwoParser.BoolArrayDclAssignBoolArrayNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumDclDatatypeNode}
	 * labeled alternative in {@link SafeCTwoParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterNumDclDatatypeNode(SafeCTwoParser.NumDclDatatypeNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumDclDatatypeNode}
	 * labeled alternative in {@link SafeCTwoParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitNumDclDatatypeNode(SafeCTwoParser.NumDclDatatypeNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharDclDatatypeNode}
	 * labeled alternative in {@link SafeCTwoParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterCharDclDatatypeNode(SafeCTwoParser.CharDclDatatypeNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharDclDatatypeNode}
	 * labeled alternative in {@link SafeCTwoParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitCharDclDatatypeNode(SafeCTwoParser.CharDclDatatypeNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringDclDatatypeNode}
	 * labeled alternative in {@link SafeCTwoParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterStringDclDatatypeNode(SafeCTwoParser.StringDclDatatypeNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringDclDatatypeNode}
	 * labeled alternative in {@link SafeCTwoParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitStringDclDatatypeNode(SafeCTwoParser.StringDclDatatypeNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolDclDatatypeNode}
	 * labeled alternative in {@link SafeCTwoParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterBoolDclDatatypeNode(SafeCTwoParser.BoolDclDatatypeNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolDclDatatypeNode}
	 * labeled alternative in {@link SafeCTwoParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitBoolDclDatatypeNode(SafeCTwoParser.BoolDclDatatypeNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VoidDclDatatypeNode}
	 * labeled alternative in {@link SafeCTwoParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterVoidDclDatatypeNode(SafeCTwoParser.VoidDclDatatypeNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidDclDatatypeNode}
	 * labeled alternative in {@link SafeCTwoParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitVoidDclDatatypeNode(SafeCTwoParser.VoidDclDatatypeNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ATypeAexprNode}
	 * labeled alternative in {@link SafeCTwoParser#atypes}.
	 * @param ctx the parse tree
	 */
	void enterATypeAexprNode(SafeCTwoParser.ATypeAexprNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ATypeAexprNode}
	 * labeled alternative in {@link SafeCTwoParser#atypes}.
	 * @param ctx the parse tree
	 */
	void exitATypeAexprNode(SafeCTwoParser.ATypeAexprNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ATypeBexprNode}
	 * labeled alternative in {@link SafeCTwoParser#atypes}.
	 * @param ctx the parse tree
	 */
	void enterATypeBexprNode(SafeCTwoParser.ATypeBexprNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ATypeBexprNode}
	 * labeled alternative in {@link SafeCTwoParser#atypes}.
	 * @param ctx the parse tree
	 */
	void exitATypeBexprNode(SafeCTwoParser.ATypeBexprNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ATypeCharValNode}
	 * labeled alternative in {@link SafeCTwoParser#atypes}.
	 * @param ctx the parse tree
	 */
	void enterATypeCharValNode(SafeCTwoParser.ATypeCharValNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ATypeCharValNode}
	 * labeled alternative in {@link SafeCTwoParser#atypes}.
	 * @param ctx the parse tree
	 */
	void exitATypeCharValNode(SafeCTwoParser.ATypeCharValNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ATypeStrValNode}
	 * labeled alternative in {@link SafeCTwoParser#atypes}.
	 * @param ctx the parse tree
	 */
	void enterATypeStrValNode(SafeCTwoParser.ATypeStrValNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ATypeStrValNode}
	 * labeled alternative in {@link SafeCTwoParser#atypes}.
	 * @param ctx the parse tree
	 */
	void exitATypeStrValNode(SafeCTwoParser.ATypeStrValNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ATypeFuncCallsNode}
	 * labeled alternative in {@link SafeCTwoParser#atypes}.
	 * @param ctx the parse tree
	 */
	void enterATypeFuncCallsNode(SafeCTwoParser.ATypeFuncCallsNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ATypeFuncCallsNode}
	 * labeled alternative in {@link SafeCTwoParser#atypes}.
	 * @param ctx the parse tree
	 */
	void exitATypeFuncCallsNode(SafeCTwoParser.ATypeFuncCallsNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ATypeArrayAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#atypes}.
	 * @param ctx the parse tree
	 */
	void enterATypeArrayAssignNode(SafeCTwoParser.ATypeArrayAssignNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ATypeArrayAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#atypes}.
	 * @param ctx the parse tree
	 */
	void exitATypeArrayAssignNode(SafeCTwoParser.ATypeArrayAssignNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#arrayassign}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignNode(SafeCTwoParser.ArrayAssignNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#arrayassign}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignNode(SafeCTwoParser.ArrayAssignNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumArrayDataNode}
	 * labeled alternative in {@link SafeCTwoParser#arraydata}.
	 * @param ctx the parse tree
	 */
	void enterNumArrayDataNode(SafeCTwoParser.NumArrayDataNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumArrayDataNode}
	 * labeled alternative in {@link SafeCTwoParser#arraydata}.
	 * @param ctx the parse tree
	 */
	void exitNumArrayDataNode(SafeCTwoParser.NumArrayDataNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharArrayDataNode}
	 * labeled alternative in {@link SafeCTwoParser#arraydata}.
	 * @param ctx the parse tree
	 */
	void enterCharArrayDataNode(SafeCTwoParser.CharArrayDataNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharArrayDataNode}
	 * labeled alternative in {@link SafeCTwoParser#arraydata}.
	 * @param ctx the parse tree
	 */
	void exitCharArrayDataNode(SafeCTwoParser.CharArrayDataNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringArrayDataNode}
	 * labeled alternative in {@link SafeCTwoParser#arraydata}.
	 * @param ctx the parse tree
	 */
	void enterStringArrayDataNode(SafeCTwoParser.StringArrayDataNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringArrayDataNode}
	 * labeled alternative in {@link SafeCTwoParser#arraydata}.
	 * @param ctx the parse tree
	 */
	void exitStringArrayDataNode(SafeCTwoParser.StringArrayDataNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolArrayDataNode}
	 * labeled alternative in {@link SafeCTwoParser#arraydata}.
	 * @param ctx the parse tree
	 */
	void enterBoolArrayDataNode(SafeCTwoParser.BoolArrayDataNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolArrayDataNode}
	 * labeled alternative in {@link SafeCTwoParser#arraydata}.
	 * @param ctx the parse tree
	 */
	void exitBoolArrayDataNode(SafeCTwoParser.BoolArrayDataNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumArrayNode}
	 * labeled alternative in {@link SafeCTwoParser#numarray}.
	 * @param ctx the parse tree
	 */
	void enterNumArrayNode(SafeCTwoParser.NumArrayNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumArrayNode}
	 * labeled alternative in {@link SafeCTwoParser#numarray}.
	 * @param ctx the parse tree
	 */
	void exitNumArrayNode(SafeCTwoParser.NumArrayNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharArrayNode}
	 * labeled alternative in {@link SafeCTwoParser#chararray}.
	 * @param ctx the parse tree
	 */
	void enterCharArrayNode(SafeCTwoParser.CharArrayNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharArrayNode}
	 * labeled alternative in {@link SafeCTwoParser#chararray}.
	 * @param ctx the parse tree
	 */
	void exitCharArrayNode(SafeCTwoParser.CharArrayNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringArrayNode}
	 * labeled alternative in {@link SafeCTwoParser#strarray}.
	 * @param ctx the parse tree
	 */
	void enterStringArrayNode(SafeCTwoParser.StringArrayNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringArrayNode}
	 * labeled alternative in {@link SafeCTwoParser#strarray}.
	 * @param ctx the parse tree
	 */
	void exitStringArrayNode(SafeCTwoParser.StringArrayNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolArrayNode}
	 * labeled alternative in {@link SafeCTwoParser#boolarray}.
	 * @param ctx the parse tree
	 */
	void enterBoolArrayNode(SafeCTwoParser.BoolArrayNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolArrayNode}
	 * labeled alternative in {@link SafeCTwoParser#boolarray}.
	 * @param ctx the parse tree
	 */
	void exitBoolArrayNode(SafeCTwoParser.BoolArrayNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ControlstructNode}
	 * labeled alternative in {@link SafeCTwoParser#command}.
	 * @param ctx the parse tree
	 */
	void enterControlstructNode(SafeCTwoParser.ControlstructNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ControlstructNode}
	 * labeled alternative in {@link SafeCTwoParser#command}.
	 * @param ctx the parse tree
	 */
	void exitControlstructNode(SafeCTwoParser.ControlstructNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctioncallsNode}
	 * labeled alternative in {@link SafeCTwoParser#command}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncallsNode(SafeCTwoParser.FunctioncallsNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctioncallsNode}
	 * labeled alternative in {@link SafeCTwoParser#command}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncallsNode(SafeCTwoParser.FunctioncallsNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallParametersNode}
	 * labeled alternative in {@link SafeCTwoParser#funccalls}.
	 * @param ctx the parse tree
	 */
	void enterCallParametersNode(SafeCTwoParser.CallParametersNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallParametersNode}
	 * labeled alternative in {@link SafeCTwoParser#funccalls}.
	 * @param ctx the parse tree
	 */
	void exitCallParametersNode(SafeCTwoParser.CallParametersNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncDclBlockNode}
	 * labeled alternative in {@link SafeCTwoParser#funcdcl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDclBlockNode(SafeCTwoParser.FuncDclBlockNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncDclBlockNode}
	 * labeled alternative in {@link SafeCTwoParser#funcdcl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDclBlockNode(SafeCTwoParser.FuncDclBlockNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncBlockNode}
	 * labeled alternative in {@link SafeCTwoParser#funcblock}.
	 * @param ctx the parse tree
	 */
	void enterFuncBlockNode(SafeCTwoParser.FuncBlockNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncBlockNode}
	 * labeled alternative in {@link SafeCTwoParser#funcblock}.
	 * @param ctx the parse tree
	 */
	void exitFuncBlockNode(SafeCTwoParser.FuncBlockNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallParamsValsNode}
	 * labeled alternative in {@link SafeCTwoParser#callparams}.
	 * @param ctx the parse tree
	 */
	void enterCallParamsValsNode(SafeCTwoParser.CallParamsValsNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallParamsValsNode}
	 * labeled alternative in {@link SafeCTwoParser#callparams}.
	 * @param ctx the parse tree
	 */
	void exitCallParamsValsNode(SafeCTwoParser.CallParamsValsNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectiveNode}
	 * labeled alternative in {@link SafeCTwoParser#ctrlstruct}.
	 * @param ctx the parse tree
	 */
	void enterSelectiveNode(SafeCTwoParser.SelectiveNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectiveNode}
	 * labeled alternative in {@link SafeCTwoParser#ctrlstruct}.
	 * @param ctx the parse tree
	 */
	void exitSelectiveNode(SafeCTwoParser.SelectiveNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IterativeNode}
	 * labeled alternative in {@link SafeCTwoParser#ctrlstruct}.
	 * @param ctx the parse tree
	 */
	void enterIterativeNode(SafeCTwoParser.IterativeNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IterativeNode}
	 * labeled alternative in {@link SafeCTwoParser#ctrlstruct}.
	 * @param ctx the parse tree
	 */
	void exitIterativeNode(SafeCTwoParser.IterativeNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStmtNode}
	 * labeled alternative in {@link SafeCTwoParser#iterative}.
	 * @param ctx the parse tree
	 */
	void enterForStmtNode(SafeCTwoParser.ForStmtNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStmtNode}
	 * labeled alternative in {@link SafeCTwoParser#iterative}.
	 * @param ctx the parse tree
	 */
	void exitForStmtNode(SafeCTwoParser.ForStmtNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStmtNode}
	 * labeled alternative in {@link SafeCTwoParser#iterative}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmtNode(SafeCTwoParser.WhileStmtNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStmtNode}
	 * labeled alternative in {@link SafeCTwoParser#iterative}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmtNode(SafeCTwoParser.WhileStmtNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmtNode}
	 * labeled alternative in {@link SafeCTwoParser#selective}.
	 * @param ctx the parse tree
	 */
	void enterIfStmtNode(SafeCTwoParser.IfStmtNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmtNode}
	 * labeled alternative in {@link SafeCTwoParser#selective}.
	 * @param ctx the parse tree
	 */
	void exitIfStmtNode(SafeCTwoParser.IfStmtNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SwitchStmtNode}
	 * labeled alternative in {@link SafeCTwoParser#selective}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStmtNode(SafeCTwoParser.SwitchStmtNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SwitchStmtNode}
	 * labeled alternative in {@link SafeCTwoParser#selective}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStmtNode(SafeCTwoParser.SwitchStmtNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BtermNode}
	 * labeled alternative in {@link SafeCTwoParser#iflogic}.
	 * @param ctx the parse tree
	 */
	void enterBtermNode(SafeCTwoParser.BtermNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BtermNode}
	 * labeled alternative in {@link SafeCTwoParser#iflogic}.
	 * @param ctx the parse tree
	 */
	void exitBtermNode(SafeCTwoParser.BtermNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForParamsNode}
	 * labeled alternative in {@link SafeCTwoParser#forparams}.
	 * @param ctx the parse tree
	 */
	void enterForParamsNode(SafeCTwoParser.ForParamsNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForParamsNode}
	 * labeled alternative in {@link SafeCTwoParser#forparams}.
	 * @param ctx the parse tree
	 */
	void exitForParamsNode(SafeCTwoParser.ForParamsNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SCaseNode}
	 * labeled alternative in {@link SafeCTwoParser#scase}.
	 * @param ctx the parse tree
	 */
	void enterSCaseNode(SafeCTwoParser.SCaseNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SCaseNode}
	 * labeled alternative in {@link SafeCTwoParser#scase}.
	 * @param ctx the parse tree
	 */
	void exitSCaseNode(SafeCTwoParser.SCaseNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefCaseNode}
	 * labeled alternative in {@link SafeCTwoParser#defcase}.
	 * @param ctx the parse tree
	 */
	void enterDefCaseNode(SafeCTwoParser.DefCaseNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefCaseNode}
	 * labeled alternative in {@link SafeCTwoParser#defcase}.
	 * @param ctx the parse tree
	 */
	void exitDefCaseNode(SafeCTwoParser.DefCaseNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumDeclNode}
	 * labeled alternative in {@link SafeCTwoParser#numdecl}.
	 * @param ctx the parse tree
	 */
	void enterNumDeclNode(SafeCTwoParser.NumDeclNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumDeclNode}
	 * labeled alternative in {@link SafeCTwoParser#numdecl}.
	 * @param ctx the parse tree
	 */
	void exitNumDeclNode(SafeCTwoParser.NumDeclNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolDeclNode}
	 * labeled alternative in {@link SafeCTwoParser#booldecl}.
	 * @param ctx the parse tree
	 */
	void enterBoolDeclNode(SafeCTwoParser.BoolDeclNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolDeclNode}
	 * labeled alternative in {@link SafeCTwoParser#booldecl}.
	 * @param ctx the parse tree
	 */
	void exitBoolDeclNode(SafeCTwoParser.BoolDeclNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharDeclNode}
	 * labeled alternative in {@link SafeCTwoParser#chardecl}.
	 * @param ctx the parse tree
	 */
	void enterCharDeclNode(SafeCTwoParser.CharDeclNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharDeclNode}
	 * labeled alternative in {@link SafeCTwoParser#chardecl}.
	 * @param ctx the parse tree
	 */
	void exitCharDeclNode(SafeCTwoParser.CharDeclNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringDeclNode}
	 * labeled alternative in {@link SafeCTwoParser#stringdecl}.
	 * @param ctx the parse tree
	 */
	void enterStringDeclNode(SafeCTwoParser.StringDeclNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringDeclNode}
	 * labeled alternative in {@link SafeCTwoParser#stringdecl}.
	 * @param ctx the parse tree
	 */
	void exitStringDeclNode(SafeCTwoParser.StringDeclNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#numdclassign}.
	 * @param ctx the parse tree
	 */
	void enterNumDclAssignNode(SafeCTwoParser.NumDclAssignNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#numdclassign}.
	 * @param ctx the parse tree
	 */
	void exitNumDclAssignNode(SafeCTwoParser.NumDclAssignNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#chardclassign}.
	 * @param ctx the parse tree
	 */
	void enterCharDclAssignNode(SafeCTwoParser.CharDclAssignNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#chardclassign}.
	 * @param ctx the parse tree
	 */
	void exitCharDclAssignNode(SafeCTwoParser.CharDclAssignNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#stringdclassign}.
	 * @param ctx the parse tree
	 */
	void enterStringDclAssignNode(SafeCTwoParser.StringDclAssignNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#stringdclassign}.
	 * @param ctx the parse tree
	 */
	void exitStringDclAssignNode(SafeCTwoParser.StringDclAssignNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#booldclassign}.
	 * @param ctx the parse tree
	 */
	void enterBoolDclAssignNode(SafeCTwoParser.BoolDclAssignNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolDclAssignNode}
	 * labeled alternative in {@link SafeCTwoParser#booldclassign}.
	 * @param ctx the parse tree
	 */
	void exitBoolDclAssignNode(SafeCTwoParser.BoolDclAssignNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolValNode}
	 * labeled alternative in {@link SafeCTwoParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolValNode(SafeCTwoParser.BoolValNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolValNode}
	 * labeled alternative in {@link SafeCTwoParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolValNode(SafeCTwoParser.BoolValNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BexprNode}
	 * labeled alternative in {@link SafeCTwoParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBexprNode(SafeCTwoParser.BexprNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BexprNode}
	 * labeled alternative in {@link SafeCTwoParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBexprNode(SafeCTwoParser.BexprNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BTermNode}
	 * labeled alternative in {@link SafeCTwoParser#bterm}.
	 * @param ctx the parse tree
	 */
	void enterBTermNode(SafeCTwoParser.BTermNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BTermNode}
	 * labeled alternative in {@link SafeCTwoParser#bterm}.
	 * @param ctx the parse tree
	 */
	void exitBTermNode(SafeCTwoParser.BTermNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BPartNode}
	 * labeled alternative in {@link SafeCTwoParser#bterm}.
	 * @param ctx the parse tree
	 */
	void enterBPartNode(SafeCTwoParser.BPartNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BPartNode}
	 * labeled alternative in {@link SafeCTwoParser#bterm}.
	 * @param ctx the parse tree
	 */
	void exitBPartNode(SafeCTwoParser.BPartNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BpartNode}
	 * labeled alternative in {@link SafeCTwoParser#bpart}.
	 * @param ctx the parse tree
	 */
	void enterBpartNode(SafeCTwoParser.BpartNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BpartNode}
	 * labeled alternative in {@link SafeCTwoParser#bpart}.
	 * @param ctx the parse tree
	 */
	void exitBpartNode(SafeCTwoParser.BpartNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BPieceNode}
	 * labeled alternative in {@link SafeCTwoParser#bpart}.
	 * @param ctx the parse tree
	 */
	void enterBPieceNode(SafeCTwoParser.BPieceNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BPieceNode}
	 * labeled alternative in {@link SafeCTwoParser#bpart}.
	 * @param ctx the parse tree
	 */
	void exitBPieceNode(SafeCTwoParser.BPieceNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotNode}
	 * labeled alternative in {@link SafeCTwoParser#bpiece}.
	 * @param ctx the parse tree
	 */
	void enterNotNode(SafeCTwoParser.NotNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotNode}
	 * labeled alternative in {@link SafeCTwoParser#bpiece}.
	 * @param ctx the parse tree
	 */
	void exitNotNode(SafeCTwoParser.NotNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlastNode}
	 * labeled alternative in {@link SafeCTwoParser#bpiece}.
	 * @param ctx the parse tree
	 */
	void enterBlastNode(SafeCTwoParser.BlastNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlastNode}
	 * labeled alternative in {@link SafeCTwoParser#bpiece}.
	 * @param ctx the parse tree
	 */
	void exitBlastNode(SafeCTwoParser.BlastNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParexprNode}
	 * labeled alternative in {@link SafeCTwoParser#blast}.
	 * @param ctx the parse tree
	 */
	void enterParexprNode(SafeCTwoParser.ParexprNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParexprNode}
	 * labeled alternative in {@link SafeCTwoParser#blast}.
	 * @param ctx the parse tree
	 */
	void exitParexprNode(SafeCTwoParser.ParexprNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdBlastNode}
	 * labeled alternative in {@link SafeCTwoParser#blast}.
	 * @param ctx the parse tree
	 */
	void enterIdBlastNode(SafeCTwoParser.IdBlastNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdBlastNode}
	 * labeled alternative in {@link SafeCTwoParser#blast}.
	 * @param ctx the parse tree
	 */
	void exitIdBlastNode(SafeCTwoParser.IdBlastNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermNode}
	 * labeled alternative in {@link SafeCTwoParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterTermNode(SafeCTwoParser.TermNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermNode}
	 * labeled alternative in {@link SafeCTwoParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitTermNode(SafeCTwoParser.TermNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PartNode}
	 * labeled alternative in {@link SafeCTwoParser#term}.
	 * @param ctx the parse tree
	 */
	void enterPartNode(SafeCTwoParser.PartNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PartNode}
	 * labeled alternative in {@link SafeCTwoParser#term}.
	 * @param ctx the parse tree
	 */
	void exitPartNode(SafeCTwoParser.PartNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PartAexprNode}
	 * labeled alternative in {@link SafeCTwoParser#part}.
	 * @param ctx the parse tree
	 */
	void enterPartAexprNode(SafeCTwoParser.PartAexprNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PartAexprNode}
	 * labeled alternative in {@link SafeCTwoParser#part}.
	 * @param ctx the parse tree
	 */
	void exitPartAexprNode(SafeCTwoParser.PartAexprNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdPartNode}
	 * labeled alternative in {@link SafeCTwoParser#part}.
	 * @param ctx the parse tree
	 */
	void enterIdPartNode(SafeCTwoParser.IdPartNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdPartNode}
	 * labeled alternative in {@link SafeCTwoParser#part}.
	 * @param ctx the parse tree
	 */
	void exitIdPartNode(SafeCTwoParser.IdPartNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberValNode}
	 * labeled alternative in {@link SafeCTwoParser#part}.
	 * @param ctx the parse tree
	 */
	void enterNumberValNode(SafeCTwoParser.NumberValNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberValNode}
	 * labeled alternative in {@link SafeCTwoParser#part}.
	 * @param ctx the parse tree
	 */
	void exitNumberValNode(SafeCTwoParser.NumberValNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PartBoolNode}
	 * labeled alternative in {@link SafeCTwoParser#partbool}.
	 * @param ctx the parse tree
	 */
	void enterPartBoolNode(SafeCTwoParser.PartBoolNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PartBoolNode}
	 * labeled alternative in {@link SafeCTwoParser#partbool}.
	 * @param ctx the parse tree
	 */
	void exitPartBoolNode(SafeCTwoParser.PartBoolNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndNode}
	 * labeled alternative in {@link SafeCTwoParser#bop}.
	 * @param ctx the parse tree
	 */
	void enterAndNode(SafeCTwoParser.AndNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndNode}
	 * labeled alternative in {@link SafeCTwoParser#bop}.
	 * @param ctx the parse tree
	 */
	void exitAndNode(SafeCTwoParser.AndNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrNode}
	 * labeled alternative in {@link SafeCTwoParser#bop}.
	 * @param ctx the parse tree
	 */
	void enterOrNode(SafeCTwoParser.OrNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrNode}
	 * labeled alternative in {@link SafeCTwoParser#bop}.
	 * @param ctx the parse tree
	 */
	void exitOrNode(SafeCTwoParser.OrNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValsNumberValsNode}
	 * labeled alternative in {@link SafeCTwoParser#vals}.
	 * @param ctx the parse tree
	 */
	void enterValsNumberValsNode(SafeCTwoParser.ValsNumberValsNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValsNumberValsNode}
	 * labeled alternative in {@link SafeCTwoParser#vals}.
	 * @param ctx the parse tree
	 */
	void exitValsNumberValsNode(SafeCTwoParser.ValsNumberValsNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValsCharValsNode}
	 * labeled alternative in {@link SafeCTwoParser#vals}.
	 * @param ctx the parse tree
	 */
	void enterValsCharValsNode(SafeCTwoParser.ValsCharValsNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValsCharValsNode}
	 * labeled alternative in {@link SafeCTwoParser#vals}.
	 * @param ctx the parse tree
	 */
	void exitValsCharValsNode(SafeCTwoParser.ValsCharValsNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValsStrValsNode}
	 * labeled alternative in {@link SafeCTwoParser#vals}.
	 * @param ctx the parse tree
	 */
	void enterValsStrValsNode(SafeCTwoParser.ValsStrValsNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValsStrValsNode}
	 * labeled alternative in {@link SafeCTwoParser#vals}.
	 * @param ctx the parse tree
	 */
	void exitValsStrValsNode(SafeCTwoParser.ValsStrValsNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValsBoolValsNode}
	 * labeled alternative in {@link SafeCTwoParser#vals}.
	 * @param ctx the parse tree
	 */
	void enterValsBoolValsNode(SafeCTwoParser.ValsBoolValsNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValsBoolValsNode}
	 * labeled alternative in {@link SafeCTwoParser#vals}.
	 * @param ctx the parse tree
	 */
	void exitValsBoolValsNode(SafeCTwoParser.ValsBoolValsNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValsIdValsNode}
	 * labeled alternative in {@link SafeCTwoParser#vals}.
	 * @param ctx the parse tree
	 */
	void enterValsIdValsNode(SafeCTwoParser.ValsIdValsNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValsIdValsNode}
	 * labeled alternative in {@link SafeCTwoParser#vals}.
	 * @param ctx the parse tree
	 */
	void exitValsIdValsNode(SafeCTwoParser.ValsIdValsNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumValNode}
	 * labeled alternative in {@link SafeCTwoParser#numberval}.
	 * @param ctx the parse tree
	 */
	void enterNumValNode(SafeCTwoParser.NumValNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumValNode}
	 * labeled alternative in {@link SafeCTwoParser#numberval}.
	 * @param ctx the parse tree
	 */
	void exitNumValNode(SafeCTwoParser.NumValNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PiNode}
	 * labeled alternative in {@link SafeCTwoParser#numberval}.
	 * @param ctx the parse tree
	 */
	void enterPiNode(SafeCTwoParser.PiNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PiNode}
	 * labeled alternative in {@link SafeCTwoParser#numberval}.
	 * @param ctx the parse tree
	 */
	void exitPiNode(SafeCTwoParser.PiNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualNode}
	 * labeled alternative in {@link SafeCTwoParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterEqualNode(SafeCTwoParser.EqualNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualNode}
	 * labeled alternative in {@link SafeCTwoParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitEqualNode(SafeCTwoParser.EqualNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEqualNode}
	 * labeled alternative in {@link SafeCTwoParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualNode(SafeCTwoParser.NotEqualNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqualNode}
	 * labeled alternative in {@link SafeCTwoParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualNode(SafeCTwoParser.NotEqualNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterEqualNode}
	 * labeled alternative in {@link SafeCTwoParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterGreaterEqualNode(SafeCTwoParser.GreaterEqualNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterEqualNode}
	 * labeled alternative in {@link SafeCTwoParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitGreaterEqualNode(SafeCTwoParser.GreaterEqualNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LesserEqualNode}
	 * labeled alternative in {@link SafeCTwoParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterLesserEqualNode(SafeCTwoParser.LesserEqualNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LesserEqualNode}
	 * labeled alternative in {@link SafeCTwoParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitLesserEqualNode(SafeCTwoParser.LesserEqualNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LesserNode}
	 * labeled alternative in {@link SafeCTwoParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterLesserNode(SafeCTwoParser.LesserNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LesserNode}
	 * labeled alternative in {@link SafeCTwoParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitLesserNode(SafeCTwoParser.LesserNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterNode}
	 * labeled alternative in {@link SafeCTwoParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterGreaterNode(SafeCTwoParser.GreaterNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterNode}
	 * labeled alternative in {@link SafeCTwoParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitGreaterNode(SafeCTwoParser.GreaterNodeContext ctx);
}