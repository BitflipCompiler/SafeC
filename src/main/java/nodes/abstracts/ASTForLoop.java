package nodes.abstracts;

import visitor.ASTVisitor;

public class ASTForLoop extends ASTIterative{

    public ASTNode forparams;
    public ASTNode block;

    public ASTForLoop(ASTNode forparams, ASTNode block) {
        this.forparams = forparams;
        this.block = block;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
