package nodes;

import visitor.ASTVisitor;

import nodes.abstracts.ASTBexpr;

public class ASTIdBoolValNode extends ASTBexpr {
    public String id;
    public String boolVal;

    public ASTIdBoolValNode(String id, String boolVal) {
        this.id = id;
        this.boolVal = boolVal;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
