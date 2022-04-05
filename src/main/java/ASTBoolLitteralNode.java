public class ASTBoolLitteralNode extends ASTDatatype{

    public ASTBoolLitteralNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
