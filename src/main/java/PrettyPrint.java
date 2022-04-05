public class PrettyPrint extends ASTVisitor {

    @Override
    public void visit(ASTNotNode ctx) {
        System.out.print("!");
        visit(ctx.value);
    }

    @Override
    public void visit(ASTAndNode ctx) {
        visit(ctx.leftChild);
        System.out.println(" && ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTRelopEqualNode ctx) {
        visit(ctx.leftChild);
        System.out.println(" == ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTRelopNotEqualNode ctx) {
        visit(ctx.leftChild);
        System.out.println(" != ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTRelopLeqNode ctx) {
        visit(ctx.leftChild);
        System.out.println(" <= ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTRelopGeqNode ctx) {
        visit(ctx.leftChild);
        System.out.println(" >= ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTRelopLessNode ctx) {
        visit(ctx.leftChild);
        System.out.println(" < ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTRelopGreaterNode ctx) {
        visit(ctx.leftChild);
        System.out.println(" > ");
        visit(ctx.rightChild);

    }

    @Override
    public void visit(ASTIdBoolValNode ctx) {
        System.out.println(ctx.id);
        System.out.println(" == ");
        System.out.println(ctx.boolVal);
    }

    @Override
    public void visit(ASTBoolValNode ctx) {
        System.out.println(ctx.value);

    }

    @Override
    public void visit(ASTDivisionNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" / ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTIdNode ctx) {
        System.out.println(ctx.id);
    }

    @Override
    public void visit(ASTMinusNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" - ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTModNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" % ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTNumbervalNode ctx) {

    }

    @Override
    public void visit(ASTNumvalNode ctx) {
        System.out.print(ctx.value);
    }

    @Override
    public void visit(ASTPiNode ctx) {
        System.out.println("3.1415926535");

    }

    @Override
    public void visit(ASTPlusNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" + ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTTimesNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" * ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTActualParamsNode ctx) {

    }

    @Override
    public void visit(ASTArrayBoolNode ctx) {

    }

    @Override
    public void visit(ASTArrayBoolValuesNode ctx) {

    }

    @Override
    public void visit(ASTArrayCharNode ctx) {

    }

    @Override
    public void visit(ASTArrayCharValuesNode ctx) {

    }

    @Override
    public void visit(ASTArrayDecl ctx) {

    }

    @Override
    public void visit(ASTArrayNumNode ctx) {

    }

    @Override
    public void visit(ASTArrayNumValuesNode ctx) {

    }

    @Override
    public void visit(ASTArrayStringNode ctx) {

    }

    @Override
    public void visit(ASTArrayStrValuesNode ctx) {

    }

    @Override
    public void visit(ASTAssignNode ctx) {

    }

    @Override
    public void visit(ASTBexpr ctx) {

    }

    @Override
    public void visit(ASTBoolDclAssignNode ctx) {

    }

    @Override
    public void visit(ASTBoolDclNode ctx) {

    }

    @Override
    public void visit(ASTBoolLitteralNode ctx) {

    }

    @Override
    public void visit(ASTCaseBlockNode ctx) {

    }

    @Override
    public void visit(ASTCharDclAssignNode ctx) {

    }

    @Override
    public void visit(ASTCharDclNode ctx) {

    }

    @Override
    public void visit(ASTCharValNode ctx) {

    }

    @Override
    public void visit(ASTCommandNode ctx) {

    }

    @Override
    public void visit(ASTDclAssignSemi ctx) {

    }

    @Override
    public void visit(ASTDclAssignSemiCommandNode ctx) {

    }

    @Override
    public void visit(ASTDefCaseNode ctx) {

    }

    @Override
    public void visit(ASTForLoop ctx) {

    }

    @Override
    public void visit(ASTFormalParamsNode ctx) {

    }

    @Override
    public void visit(ASTForParams ctx) {

    }

    @Override
    public void visit(ASTFuncBlockNode ctx) {

    }

    @Override
    public void visit(ASTFuncCalls ctx) {

    }

    @Override
    public void visit(ASTFuncDcl ctx) {

    }

    @Override
    public void visit(ASTIfStatementNode ctx) {

    }

    @Override
    public void visit(ASTNumberLitteralNode ctx) {

    }

    @Override
    public void visit(ASTNumDclAssignNode ctx) {

    }

    @Override
    public void visit(ASTNumDclNode ctx) {

    }

    @Override
    public void visit(ASTOrNode ctx) {

    }

    @Override
    public void visit(ASTProgNode ctx) {

    }

    @Override
    public void visit(ASTSafeDclNode ctx) {

    }

    @Override
    public void visit(ASTScaseNode ctx) {

    }

    @Override
    public void visit(ASTStringDclAssignNode ctx) {

    }

    @Override
    public void visit(ASTStringDclNode ctx) {

    }

    @Override
    public void visit(ASTStringLitteralNode ctx) {

    }

    @Override
    public void visit(ASTStringValNode ctx) {

    }

    @Override
    public void visit(ASTStructBlockNode ctx) {

    }

    @Override
    public void visit(ASTStructNode ctx) {

    }

    @Override
    public void visit(ASTSwitchStatementNode ctx) {

    }

    @Override
    public void visit(ASTVoidLitteralNode ctx) {

    }

    @Override
    public void visit(ASTWhileLoop ctx) {

    }
}
