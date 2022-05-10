package ast;

import ast.abstracts.DclAssign;
import ast.abstracts.Node;
import ast.abstracts.SafeDeclaration;
import visitor.ASTVisitor;

public class SafeDclNode extends DclAssign {
    public String safety;
    public SafeDeclaration variable;

    public SafeDclNode(String safety, Node variable) {
        this.safety = safety;
        this.variable = (SafeDeclaration) variable;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
