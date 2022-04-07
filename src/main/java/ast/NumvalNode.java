package ast;

import ast.abstracts.Numberval;
import visitor.ASTVisitor;

public class NumvalNode extends Numberval {
    public String value;

    public NumvalNode(String value) {
        this.value = value;
    }

    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
