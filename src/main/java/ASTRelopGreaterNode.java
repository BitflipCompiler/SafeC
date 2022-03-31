public class ASTRelopGreaterNode extends ASTBexpr{
    ASTNode leftChild;
    ASTNode rightChild;

    public ASTRelopGreaterNode(ASTNode leftChild, ASTNode rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}
