package ast.abstracts;

import visitor.ASTVisitor;

public abstract class ATypes extends DclAssign{

    @Override
    public void accept(ASTVisitor v) {
        super.accept(v);
    }
}
