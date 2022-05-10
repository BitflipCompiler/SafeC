package ast;

import ast.abstracts.VDcl;
import visitor.ASTVisitor;

public class BoolDclNode extends VDcl {

    public String id;

    public BoolDclNode(String id) {
        this.id = id;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
