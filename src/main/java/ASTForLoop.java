public class ASTForLoop extends ASTNode{

    ASTNode forparams;
    ASTNode block;

    public ASTForLoop(ASTNode forparams, ASTNode block) {
        this.forparams = forparams;
        this.block = block;
    }

    @Override
    public void accept(ASTVisitor v) {

    }
}
