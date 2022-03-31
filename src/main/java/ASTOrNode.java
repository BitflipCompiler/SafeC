public class ASTOrNode extends ASTBexpr{
    ASTNode leftChild;
    ASTNode rightChild;

    public ASTOrNode(ASTNode leftChild, ASTNode rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}
