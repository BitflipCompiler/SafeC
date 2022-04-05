public class ASTDivisionNode extends ASTAexpr{
    public ASTNode leftChild;
    public ASTNode rightChild;

    public ASTDivisionNode(ASTNode leftChild, ASTNode rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
