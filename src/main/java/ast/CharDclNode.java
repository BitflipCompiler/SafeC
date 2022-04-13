package ast;

import ast.abstracts.Dcl;
import ast.abstracts.VDcl;
import visitor.ASTVisitor;

public class CharDclNode extends VDcl {

    public String id;

    public CharDclNode(String id) {
        this.id = id;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
