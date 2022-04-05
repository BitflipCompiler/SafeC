public class ASTNumberLitteralNode extends ASTDatatype{

    public ASTNumberLitteralNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
