package ast.abstracts;

import visitor.ASTVisitor;

public abstract class Numberval extends expr {
    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
