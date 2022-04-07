package ast;

import ast.abstracts.Dcl;
import visitor.ASTVisitor;

public class BoolDclNode extends Dcl {

    public String id;

    public BoolDclNode(String id) {
        this.id = id;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
