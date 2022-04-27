package ast.abstracts;

import visitor.ASTVisitor;

public abstract class Dcl extends Node {
    public boolean isGlobal;
    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
