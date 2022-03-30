public class ASTPlusNode extends ASTNode{
    ASTNode leftChild;
    ASTNode rightChild;

    public ASTPlusNode(ASTNode leftChild, ASTNode rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
