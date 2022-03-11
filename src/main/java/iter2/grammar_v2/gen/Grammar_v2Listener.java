package iter2.grammar_v2.gen;// Generated from Grammar_v2.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Grammar_v2Parser}.
 */
public interface Grammar_v2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(Grammar_v2Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(Grammar_v2Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(Grammar_v2Parser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(Grammar_v2Parser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(Grammar_v2Parser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(Grammar_v2Parser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(Grammar_v2Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(Grammar_v2Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#safedeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSafedeclaration(Grammar_v2Parser.SafedeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#safedeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSafedeclaration(Grammar_v2Parser.SafedeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#reassign}.
	 * @param ctx the parse tree
	 */
	void enterReassign(Grammar_v2Parser.ReassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#reassign}.
	 * @param ctx the parse tree
	 */
	void exitReassign(Grammar_v2Parser.ReassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(Grammar_v2Parser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(Grammar_v2Parser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Grammar_v2Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Grammar_v2Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#caseblock}.
	 * @param ctx the parse tree
	 */
	void enterCaseblock(Grammar_v2Parser.CaseblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#caseblock}.
	 * @param ctx the parse tree
	 */
	void exitCaseblock(Grammar_v2Parser.CaseblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#vdcl}.
	 * @param ctx the parse tree
	 */
	void enterVdcl(Grammar_v2Parser.VdclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#vdcl}.
	 * @param ctx the parse tree
	 */
	void exitVdcl(Grammar_v2Parser.VdclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#vassign}.
	 * @param ctx the parse tree
	 */
	void enterVassign(Grammar_v2Parser.VassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#vassign}.
	 * @param ctx the parse tree
	 */
	void exitVassign(Grammar_v2Parser.VassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#vdclassign}.
	 * @param ctx the parse tree
	 */
	void enterVdclassign(Grammar_v2Parser.VdclassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#vdclassign}.
	 * @param ctx the parse tree
	 */
	void exitVdclassign(Grammar_v2Parser.VdclassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(Grammar_v2Parser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(Grammar_v2Parser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#funccalls}.
	 * @param ctx the parse tree
	 */
	void enterFunccalls(Grammar_v2Parser.FunccallsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#funccalls}.
	 * @param ctx the parse tree
	 */
	void exitFunccalls(Grammar_v2Parser.FunccallsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#funcdcl}.
	 * @param ctx the parse tree
	 */
	void enterFuncdcl(Grammar_v2Parser.FuncdclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#funcdcl}.
	 * @param ctx the parse tree
	 */
	void exitFuncdcl(Grammar_v2Parser.FuncdclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#callparams}.
	 * @param ctx the parse tree
	 */
	void enterCallparams(Grammar_v2Parser.CallparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#callparams}.
	 * @param ctx the parse tree
	 */
	void exitCallparams(Grammar_v2Parser.CallparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#ctrlstruct}.
	 * @param ctx the parse tree
	 */
	void enterCtrlstruct(Grammar_v2Parser.CtrlstructContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#ctrlstruct}.
	 * @param ctx the parse tree
	 */
	void exitCtrlstruct(Grammar_v2Parser.CtrlstructContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#iterative}.
	 * @param ctx the parse tree
	 */
	void enterIterative(Grammar_v2Parser.IterativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#iterative}.
	 * @param ctx the parse tree
	 */
	void exitIterative(Grammar_v2Parser.IterativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#selective}.
	 * @param ctx the parse tree
	 */
	void enterSelective(Grammar_v2Parser.SelectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#selective}.
	 * @param ctx the parse tree
	 */
	void exitSelective(Grammar_v2Parser.SelectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#iflogic}.
	 * @param ctx the parse tree
	 */
	void enterIflogic(Grammar_v2Parser.IflogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#iflogic}.
	 * @param ctx the parse tree
	 */
	void exitIflogic(Grammar_v2Parser.IflogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#scase}.
	 * @param ctx the parse tree
	 */
	void enterScase(Grammar_v2Parser.ScaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#scase}.
	 * @param ctx the parse tree
	 */
	void exitScase(Grammar_v2Parser.ScaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#defcase}.
	 * @param ctx the parse tree
	 */
	void enterDefcase(Grammar_v2Parser.DefcaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#defcase}.
	 * @param ctx the parse tree
	 */
	void exitDefcase(Grammar_v2Parser.DefcaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#forparams}.
	 * @param ctx the parse tree
	 */
	void enterForparams(Grammar_v2Parser.ForparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#forparams}.
	 * @param ctx the parse tree
	 */
	void exitForparams(Grammar_v2Parser.ForparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#boolassignment}.
	 * @param ctx the parse tree
	 */
	void enterBoolassignment(Grammar_v2Parser.BoolassignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#boolassignment}.
	 * @param ctx the parse tree
	 */
	void exitBoolassignment(Grammar_v2Parser.BoolassignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#booldclassign}.
	 * @param ctx the parse tree
	 */
	void enterBooldclassign(Grammar_v2Parser.BooldclassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#booldclassign}.
	 * @param ctx the parse tree
	 */
	void exitBooldclassign(Grammar_v2Parser.BooldclassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#booldecl}.
	 * @param ctx the parse tree
	 */
	void enterBooldecl(Grammar_v2Parser.BooldeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#booldecl}.
	 * @param ctx the parse tree
	 */
	void exitBooldecl(Grammar_v2Parser.BooldeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#numassignment}.
	 * @param ctx the parse tree
	 */
	void enterNumassignment(Grammar_v2Parser.NumassignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#numassignment}.
	 * @param ctx the parse tree
	 */
	void exitNumassignment(Grammar_v2Parser.NumassignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#numdclassign}.
	 * @param ctx the parse tree
	 */
	void enterNumdclassign(Grammar_v2Parser.NumdclassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#numdclassign}.
	 * @param ctx the parse tree
	 */
	void exitNumdclassign(Grammar_v2Parser.NumdclassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#numdecl}.
	 * @param ctx the parse tree
	 */
	void enterNumdecl(Grammar_v2Parser.NumdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#numdecl}.
	 * @param ctx the parse tree
	 */
	void exitNumdecl(Grammar_v2Parser.NumdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#charassignment}.
	 * @param ctx the parse tree
	 */
	void enterCharassignment(Grammar_v2Parser.CharassignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#charassignment}.
	 * @param ctx the parse tree
	 */
	void exitCharassignment(Grammar_v2Parser.CharassignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#chardclassign}.
	 * @param ctx the parse tree
	 */
	void enterChardclassign(Grammar_v2Parser.ChardclassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#chardclassign}.
	 * @param ctx the parse tree
	 */
	void exitChardclassign(Grammar_v2Parser.ChardclassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#chardecl}.
	 * @param ctx the parse tree
	 */
	void enterChardecl(Grammar_v2Parser.ChardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#chardecl}.
	 * @param ctx the parse tree
	 */
	void exitChardecl(Grammar_v2Parser.ChardeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#stringassignment}.
	 * @param ctx the parse tree
	 */
	void enterStringassignment(Grammar_v2Parser.StringassignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#stringassignment}.
	 * @param ctx the parse tree
	 */
	void exitStringassignment(Grammar_v2Parser.StringassignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#stringdclassign}.
	 * @param ctx the parse tree
	 */
	void enterStringdclassign(Grammar_v2Parser.StringdclassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#stringdclassign}.
	 * @param ctx the parse tree
	 */
	void exitStringdclassign(Grammar_v2Parser.StringdclassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#stringdecl}.
	 * @param ctx the parse tree
	 */
	void enterStringdecl(Grammar_v2Parser.StringdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#stringdecl}.
	 * @param ctx the parse tree
	 */
	void exitStringdecl(Grammar_v2Parser.StringdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBexpr(Grammar_v2Parser.BexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBexpr(Grammar_v2Parser.BexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterAexpr(Grammar_v2Parser.AexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitAexpr(Grammar_v2Parser.AexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(Grammar_v2Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(Grammar_v2Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#part}.
	 * @param ctx the parse tree
	 */
	void enterPart(Grammar_v2Parser.PartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#part}.
	 * @param ctx the parse tree
	 */
	void exitPart(Grammar_v2Parser.PartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#bop}.
	 * @param ctx the parse tree
	 */
	void enterBop(Grammar_v2Parser.BopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#bop}.
	 * @param ctx the parse tree
	 */
	void exitBop(Grammar_v2Parser.BopContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#vals}.
	 * @param ctx the parse tree
	 */
	void enterVals(Grammar_v2Parser.ValsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#vals}.
	 * @param ctx the parse tree
	 */
	void exitVals(Grammar_v2Parser.ValsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#numberval}.
	 * @param ctx the parse tree
	 */
	void enterNumberval(Grammar_v2Parser.NumbervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#numberval}.
	 * @param ctx the parse tree
	 */
	void exitNumberval(Grammar_v2Parser.NumbervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar_v2Parser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(Grammar_v2Parser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar_v2Parser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(Grammar_v2Parser.RelopContext ctx);
}