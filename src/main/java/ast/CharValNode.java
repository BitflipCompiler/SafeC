package ast;

import ast.abstracts.Vals;
import visitor.ASTVisitor;

public class CharValNode extends Vals {
    public String value;

    public CharValNode(String value) {
        this.value = value;
    }


    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
