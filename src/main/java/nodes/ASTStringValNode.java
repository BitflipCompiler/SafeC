package nodes;

import nodes.abstracts.ASTVals;
import visitor.ASTVisitor;

public class ASTStringValNode extends ASTVals {
    public String value;

    public ASTStringValNode(String value) {
        this.value = value;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
