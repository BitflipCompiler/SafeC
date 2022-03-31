public class ASTRelopEqualNode extends ASTBexpr{
    ASTNode leftChild;
    ASTNode rightChild;

    public ASTRelopEqualNode(ASTNode leftChild, ASTNode rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}
