public class ASTVoidLitteralNode extends ASTDatatype{

    public ASTVoidLitteralNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
