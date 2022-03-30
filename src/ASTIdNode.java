public class ASTIdNode extends ASTNode{
    String id;

    public ASTIdNode(String id) {
        this.id = id;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
