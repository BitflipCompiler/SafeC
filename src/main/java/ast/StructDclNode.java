package ast;

import ast.abstracts.StructDcl;
import visitor.ASTVisitor;

public class StructDclNode extends StructDcl {
    public String id;

    public StructBlockNode structBlock;

    public StructDclNode(String id, StructBlockNode structBlock) {
        this.id = id;
        this.structBlock = structBlock;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
