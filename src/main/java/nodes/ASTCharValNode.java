package nodes;

import nodes.abstracts.ASTVals;
import visitor.ASTVisitor;

public class ASTCharValNode extends ASTVals {
    public String value;

    public ASTCharValNode(String value) {
        this.value = value;
    }


    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
