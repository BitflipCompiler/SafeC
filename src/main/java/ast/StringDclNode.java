package ast;

import ast.abstracts.Dcl;
import ast.abstracts.VDcl;
import visitor.ASTVisitor;

public class StringDclNode extends VDcl {
    public String id;

    public StringDclNode(String id) {
        this.id = id;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }

    @Override
    public String toString() {
        return "StringDclNode{" +
                "id='" + id + '\'' +
                '}';
    }
}
