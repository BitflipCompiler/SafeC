package ast;

import ast.abstracts.Dcl;
import ast.abstracts.StructBlock;
import visitor.ASTVisitor;

public class StructNode extends Dcl {
    public String id;

    public StructBlock structBlock;

    public StructNode(String id, StructBlock structBlock) {
        this.id = id;
        this.structBlock = structBlock;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
