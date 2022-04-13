package ast;

import ast.abstracts.ArrayDclAssign;
import ast.abstracts.Node;
import visitor.ASTVisitor;

public class ArrayNumNode extends ArrayDclAssign {
    public String id;
    public ArrayNumValuesNode numArray;

    public ArrayNumNode(String id, Node numArray) {
        this.id = id;
        this.numArray = (ArrayNumValuesNode) numArray;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
