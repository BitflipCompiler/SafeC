package visitor;

import nodes.*;
import nodes.abstracts.*;

public abstract class ASTVisitor {

    public void visit(ASTNode ctx){
        ctx.accept(this);
    }

    public abstract void visit(ASTNotNode ctx);

    public abstract void visit(ASTAndNode ctx);

    public abstract void visit(ASTRelopEqualNode ctx);

    public abstract void visit(ASTRelopNotEqualNode ctx);

    public abstract void visit(ASTRelopLeqNode ctx);

    public abstract void visit(ASTRelopGeqNode ctx);

    public abstract void visit(ASTRelopLessNode ctx);

    public abstract void visit(ASTRelopGreaterNode ctx);

    public abstract void visit(ASTIdBoolValNode ctx);

    public abstract void visit(ASTBoolValNode ctx);

    public abstract void visit(ASTDivisionNode ctx);

    public abstract void visit(ASTIdNode ctx);

    public abstract void visit(ASTMinusNode ctx);

    public abstract void visit(ASTModNode ctx);

    public abstract void visit(ASTNumberval ctx);

    public abstract void visit(ASTNumvalNode ctx);

    public abstract void visit(ASTPiNode ctx);

    public abstract void visit(ASTPlusNode ctx);

    public abstract void visit(ASTTimesNode ctx);

    public abstract void visit(ASTActualParamsNode ctx);

    public abstract void visit(ASTArrayBoolNode ctx);

    public abstract void visit(ASTArrayBoolValuesNode ctx);

    public abstract void visit(ASTArrayCharNode ctx);

    public abstract void visit(ASTArrayCharValuesNode ctx);

    public abstract void visit(ASTArrayDeclNode ctx);

    public abstract void visit(ASTArrayNumNode ctx);

    public abstract void visit(ASTArrayNumValuesNode ctx);

    public abstract void visit(ASTArrayStringNode ctx);

    public abstract void visit(ASTArrayStrValuesNode ctx);

    public abstract void visit(ASTAssignNode ctx);

    public abstract void visit(ASTBexpr ctx);

    public abstract void visit(ASTBoolDclAssignNode ctx);

    public abstract void visit(ASTBoolDclNode ctx);

    public abstract void visit(ASTBoolLitteralNode ctx);

    public abstract void visit(ASTCaseBlockNode ctx);

    public abstract void visit(ASTCharDclAssignNode ctx);

    public abstract void visit(ASTCharDclNode ctx);

    public abstract void visit(ASTCharValNode ctx);

    public abstract void visit(ASTDclAssignSemiCommandNode ctx);

    public abstract void visit(ASTDefCaseNode ctx);

    public abstract void visit(ASTForLoop ctx);

    public abstract void visit(ASTFormalParamsNode ctx);

    public abstract void visit(ASTForParams ctx);

    public abstract void visit(ASTFuncBlockNode ctx);

    public abstract void visit(ASTFuncCalls ctx);

    public abstract void visit(ASTFuncDcl ctx);

    public abstract void visit(ASTIfStatementNode ctx);

    public abstract void visit(ASTNumberLitteralNode ctx);

    public abstract void visit(ASTNumDclAssignNode ctx);

    public abstract void visit(ASTNumDclNode ctx);

    public abstract void visit(ASTOrNode ctx);

    public abstract void visit(ASTProgNode ctx);

    public abstract void visit(ASTSafeDclNode ctx);

    public abstract void visit(ASTScaseNode ctx);

    public abstract void visit(ASTStringDclAssignNode ctx);

    public abstract void visit(ASTStringDclNode ctx);

    public abstract void visit(ASTStringLitteralNode ctx);

    public abstract void visit(ASTStringValNode ctx);

    public abstract void visit(ASTStructBlockNode ctx);

    public abstract void visit(ASTStructNode ctx);

    public abstract void visit(ASTSwitchStatementNode ctx);

    public abstract void visit(ASTVoidLitteralNode ctx);

    public abstract void visit(ASTWhileLoop ctx);



}
