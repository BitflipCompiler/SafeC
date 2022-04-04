public class ASTCharDclNode extends ASTNode{

    String id;

    public ASTCharDclNode(String id) {
        this.id = id;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
