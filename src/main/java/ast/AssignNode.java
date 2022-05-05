package ast;

import ast.abstracts.ATypes;
import ast.abstracts.Dcl;
import ast.abstracts.DclAssign;
import ast.abstracts.Node;
import visitor.ASTVisitor;

public class AssignNode extends DclAssign {
    public IdNode id;
    public Node atypes;

    public AssignNode(IdNode id, Node atypes) {
        this.id = id;
        this.atypes = atypes;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
