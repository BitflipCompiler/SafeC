package ast;

import ast.abstracts.Datatype;
import visitor.ASTVisitor;

public class VoidLitteralNode extends Datatype {

    public VoidLitteralNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
