package ast.abstracts;

import visitor.ASTVisitor;

public abstract class ArrayDclAssign extends DclAssign{
    @Override
    public void accept(ASTVisitor v) {
        super.accept(v);
    }
}
