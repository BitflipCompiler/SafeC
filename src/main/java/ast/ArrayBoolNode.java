package ast;

import ast.abstracts.ArrayDclAssign;
import ast.abstracts.Node;
import visitor.ASTVisitor;

public class ArrayBoolNode extends ArrayDclAssign {
    public String id;
    public Node boolArray;

    public ArrayBoolNode(String id, Node boolArray) {
        this.id = id;
        this.boolArray = boolArray;
    }


    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
