package ast;

import ast.abstracts.DclAssign;
import ast.abstracts.Node;
import visitor.ASTVisitor;

public class StringDclAssignNode extends DclAssign {
    public Node stringdcl;
    public StringValNode stringval;

    public StringDclAssignNode(Node stringdcl, StringValNode stringval) {
        this.stringdcl = stringdcl;
        this.stringval = stringval;
    }


    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
