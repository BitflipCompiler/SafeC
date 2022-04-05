public class ASTStringDclNode extends ASTDcl{
    String id;

    public ASTStringDclNode(String id) {
        this.id = id;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
