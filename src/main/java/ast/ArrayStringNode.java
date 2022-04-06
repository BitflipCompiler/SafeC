package ast;

import ast.abstracts.ASTArray;
import ast.abstracts.Node;
import visitor.ASTVisitor;

public class ArrayStringNode extends ASTArray {
    public String id;
    public Node stringArray;

    public ArrayStringNode(String id, Node stringArray) {
        this.id = id;
        this.stringArray = stringArray;
    }


    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
