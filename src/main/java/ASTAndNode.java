public class ASTAndNode extends ASTBexpr{
    ASTNode leftChild;
    ASTNode rightChild;

    public ASTAndNode(ASTNode leftChild, ASTNode rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
