package nodes.abstracts;

import visitor.ASTVisitor;

public abstract class ASTDcl extends ASTNode {

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
