public class ASTWhileLoop extends ASTNode{
    ASTNode bexpr;
    ASTNode block;

    public ASTWhileLoop(ASTNode bexpr, ASTNode block) {
        this.bexpr = bexpr;
        this.block = block;
    }


    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
