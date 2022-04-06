package ast;

import ast.abstracts.Dcl;
import visitor.ASTVisitor;

public class CharDclNode extends Dcl {

    public String id;

    public CharDclNode(String id) {
        this.id = id;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
