public class ASTModNode extends ASTAexpr{
    public ASTNode leftChild;
    public ASTNode rightChild;

    public ASTModNode(ASTNode leftChild, ASTNode rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
