package ast.abstracts;

import visitor.ASTVisitor;

public abstract class SafeDeclaration extends DclAssign{

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
