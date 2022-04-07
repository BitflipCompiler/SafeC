package ast;

import ast.abstracts.DclAssign;
import ast.abstracts.Node;
import visitor.ASTVisitor;

public class CharDclAssignNode extends DclAssign {
    public Node charDcl;
    public CharValNode charval;

    public CharDclAssignNode(Node charDcl, CharValNode charval) {
        this.charDcl = charDcl;
        this.charval = charval;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
