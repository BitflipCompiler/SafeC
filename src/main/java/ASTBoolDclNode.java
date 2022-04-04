public class ASTBoolDclNode extends ASTNode{

    String id;

    public ASTBoolDclNode(String id) {
        this.id = id;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
