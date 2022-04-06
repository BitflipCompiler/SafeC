package nodes.abstracts;

import visitor.ASTVisitor;

public abstract class ASTNode {
    public abstract void accept(ASTVisitor v);
}
