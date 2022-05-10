package ast;

import ast.abstracts.VDcl;
import visitor.ASTVisitor;

public class NumDclNode extends VDcl {

    public String id;

    public NumDclNode(String id) {
        this.id = id;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }

    @Override
    public String toString() {
        return "NumDclNode{" +
                "id='" + id + '\'' +
                '}';
    }
}
