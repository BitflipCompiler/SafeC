public class ASTTimesNode extends ASTNode{
    ASTNode leftChild;
    ASTNode rightChild;

    public ASTTimesNode(ASTNode leftChild, ASTNode rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
