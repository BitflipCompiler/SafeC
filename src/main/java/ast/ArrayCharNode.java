package ast;

import ast.abstracts.ASTArray;
import ast.abstracts.Node;
import visitor.ASTVisitor;

public class ArrayCharNode extends ASTArray {
    public String id;
    public Node charArray;

    public ArrayCharNode(String id, Node charArray) {
        this.id = id;
        this.charArray = charArray;
    }


    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
