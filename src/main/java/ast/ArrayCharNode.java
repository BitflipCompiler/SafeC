package ast;

import ast.abstracts.ArrayDclAssign;
import ast.abstracts.Node;
import visitor.ASTVisitor;

public class ArrayCharNode extends ArrayDclAssign {
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
