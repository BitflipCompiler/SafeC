package ast;

import ast.abstracts.Node;
import ast.abstracts.VDclAssign;
import visitor.ASTVisitor;

public class StringDclAssignNode extends VDclAssign {
    public StringDclNode stringdcl;
    public StringValNode stringval;

    public StringDclAssignNode(Node stringdcl, StringValNode stringval) {
        this.stringdcl = (StringDclNode) stringdcl;
        this.stringval = stringval;
    }


    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
