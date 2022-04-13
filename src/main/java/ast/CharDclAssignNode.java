package ast;

import ast.abstracts.DclAssign;
import ast.abstracts.Node;
import ast.abstracts.VDclAssign;
import visitor.ASTVisitor;

public class CharDclAssignNode extends VDclAssign {
    public CharDclNode charDcl;
    public CharValNode charval;

    public CharDclAssignNode(Node charDcl, CharValNode charval) {
        this.charDcl = (CharDclNode) charDcl;
        this.charval = charval;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
