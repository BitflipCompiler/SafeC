package nodes;

import nodes.abstracts.ASTBexpr;
import visitor.ASTVisitor;

public class ASTBoolValNode extends ASTBexpr {
    public String value;

    public ASTBoolValNode(String value) {
        this.value = value;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
