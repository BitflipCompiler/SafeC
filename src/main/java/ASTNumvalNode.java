public class ASTNumvalNode extends ASTNumbervalNode{
    public String value;

    public ASTNumvalNode(String value) {
        this.value = value;
    }

    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
