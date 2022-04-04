public class ASTSafeDclNode extends ASTNode{
    String safety;
    ASTNode variable;

    public ASTSafeDclNode(String safety, ASTNode variable) {
        this.safety = safety;
        this.variable = variable;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
