package ast;

import ast.abstracts.Bexpr;
import visitor.ASTVisitor;

public class BoolValNode extends Bexpr {
    public String value;
    public boolean isGlobal;

    public BoolValNode(String value) {
        this.value = value;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
