public class ASTRelopNotEqualNode extends ASTBexpr{
    ASTNode leftChild;
    ASTNode rightChild;

    public ASTRelopNotEqualNode(ASTNode leftChild, ASTNode rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}
