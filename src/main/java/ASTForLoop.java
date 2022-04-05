public class ASTForLoop extends ASTIterative{

    ASTNode forparams;
    ASTNode block;

    public ASTForLoop(ASTNode forparams, ASTNode block) {
        this.forparams = forparams;
        this.block = block;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
