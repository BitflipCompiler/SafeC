package ast.abstracts;

import visitor.ASTVisitor;

public abstract class Selective extends CtrlStruct {

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
