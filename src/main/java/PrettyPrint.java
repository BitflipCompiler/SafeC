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
}
