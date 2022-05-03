package ast;

import ast.abstracts.Bexpr;
import visitor.ASTVisitor;

public class IdBoolValNode extends Bexpr {
    public IdNode id;
    public BoolValNode boolVal;

    public IdBoolValNode(IdNode id, BoolValNode boolVal) {
        this.id = id;
        this.boolVal = boolVal;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
