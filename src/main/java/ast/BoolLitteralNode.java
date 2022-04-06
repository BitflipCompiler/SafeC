package ast;

import ast.abstracts.Datatype;
import visitor.ASTVisitor;

public class BoolLitteralNode extends Datatype {

    public BoolLitteralNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
