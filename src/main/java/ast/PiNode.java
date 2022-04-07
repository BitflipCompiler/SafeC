package ast;

import ast.abstracts.Numberval;
import visitor.ASTVisitor;

public class PiNode extends Numberval {

    public PiNode() {
    }

    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
