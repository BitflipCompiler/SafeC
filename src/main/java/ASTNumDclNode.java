public class ASTNumDclNode extends ASTDcl{

    String id;

    public ASTNumDclNode(String id) {
        this.id = id;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
