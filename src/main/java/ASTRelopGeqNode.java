public class ASTRelopGeqNode extends ASTBexpr{
    ASTNode leftChild;
    ASTNode rightChild;

    public ASTRelopGeqNode(ASTNode leftChild, ASTNode rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}
