package ast.abstracts;

import visitor.ASTVisitor;

public abstract class DclAssign extends Dcl {

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
