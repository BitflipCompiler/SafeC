package ast;

import ast.abstracts.Datatype;
import ast.abstracts.Node;
import ast.abstracts.VDcl;
import visitor.ASTVisitor;

public class ArrayDeclNode extends VDcl {
    public Datatype arrdcltype;
    public String id;

    public ArrayDeclNode(Node arrdcltype, String id) {
        this.arrdcltype = (Datatype) arrdcltype;
        this.id = id;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
