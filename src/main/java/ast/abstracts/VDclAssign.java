package ast.abstracts;

import visitor.ASTVisitor;

public abstract class VDclAssign extends SafeDeclaration{

    @Override
    public void accept(ASTVisitor v) {
        super.accept(v);
    }
}
