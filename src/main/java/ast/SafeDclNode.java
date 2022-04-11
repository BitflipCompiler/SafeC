package ast;

import ast.abstracts.Dcl;
import ast.abstracts.DclAssign;
import ast.abstracts.Node;
import visitor.ASTVisitor;

public class SafeDclNode extends DclAssign {
    public String safety;
    public Node variable;

    public SafeDclNode(String safety, Node variable) {
        this.safety = safety;
        this.variable = variable;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
