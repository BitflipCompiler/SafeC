public class ASTNumbervalNode extends ASTNode{
    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
