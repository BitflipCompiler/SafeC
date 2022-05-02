package ast.abstracts;

import visitor.ASTVisitor;

public abstract class VDclAssign extends SafeDeclaration{
    public boolean isGlobal;

    @Override
    public void accept(ASTVisitor v) {
        super.accept(v);
    }
}
