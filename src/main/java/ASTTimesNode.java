public class ASTTimesNode extends ASTAexpr{
    public ASTNode leftChild;
    public ASTNode rightChild;

    public ASTTimesNode(ASTNode leftChild, ASTNode rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
