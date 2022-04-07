package ast.abstracts;

import visitor.ASTVisitor;

public abstract class ArrayData extends Node {

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
