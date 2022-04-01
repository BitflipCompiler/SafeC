public class ASTStructNode extends ASTNode{
    String id;
    ASTNode structBlock;

    public ASTStructNode(String id, ASTNode structBlock) {
        this.id = id;
        this.structBlock = structBlock;
    }

    @Override
    public void accept(ASTVisitor v) {

    }
}
