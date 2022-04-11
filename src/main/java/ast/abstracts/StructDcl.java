package ast.abstracts;

import visitor.ASTVisitor;

public abstract class StructDcl extends Dcl{
    @Override
    public void accept(ASTVisitor v) {
        super.accept(v);
    }
}
