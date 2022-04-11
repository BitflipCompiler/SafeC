package ast.abstracts;

import visitor.ASTVisitor;

public abstract class Numberval extends Expr {
    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
