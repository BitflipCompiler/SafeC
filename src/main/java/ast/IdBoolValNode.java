package ast;

import ast.abstracts.Bexpr;
import visitor.ASTVisitor;

public class IdBoolValNode extends Bexpr {
    public String id;
    public String boolVal;

    public IdBoolValNode(String id, String boolVal) {
        this.id = id;
        this.boolVal = boolVal;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
