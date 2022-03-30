public class ASTDivisionNode extends ASTNode{
    ASTNode leftChild;
    ASTNode rightChild;

    ASTDivisionNode(ASTNode leftChild, ASTNode rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
