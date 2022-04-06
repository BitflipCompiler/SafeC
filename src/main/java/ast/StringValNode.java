package ast;

import ast.abstracts.Vals;
import visitor.ASTVisitor;

public class StringValNode extends Vals {
    public String value;

    public StringValNode(String value) {
        this.value = value;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
