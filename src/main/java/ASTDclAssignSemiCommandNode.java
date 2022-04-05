public class ASTDclAssignSemiCommandNode extends ASTNode{
    ASTNode actual;
    ASTNode recursion;

    public ASTDclAssignSemiCommandNode(ASTNode actual, ASTNode recursion) {
        this.actual = actual;
        this.recursion = recursion;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
