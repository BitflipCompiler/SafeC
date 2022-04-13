package ast;

import ast.abstracts.ArrayDclAssign;
import ast.abstracts.Node;
import visitor.ASTVisitor;

public class ArrayStringNode extends ArrayDclAssign {
    public String id;
    public ArrayStrValuesNode stringArray;

    public ArrayStringNode(String id, Node stringArray) {
        this.id = id;
        this.stringArray = (ArrayStrValuesNode) stringArray;
    }


    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
