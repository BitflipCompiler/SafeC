package ast;

import ast.abstracts.Datatype;
import visitor.ASTVisitor;

public class StringLitteralNode extends Datatype {

    public StringLitteralNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
