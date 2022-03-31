public class ASTRelopLessNode extends ASTBexpr{
    ASTNode leftChild;
    ASTNode rightChild;

    public ASTRelopLessNode(ASTNode leftChild, ASTNode rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}
