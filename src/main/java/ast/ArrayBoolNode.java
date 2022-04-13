package ast;

import ast.abstracts.ArrayDclAssign;
import ast.abstracts.Bexpr;
import ast.abstracts.Node;
import visitor.ASTVisitor;

import java.util.List;

public class ArrayBoolNode extends ArrayDclAssign {
    public String id;
    public ArrayBoolValuesNode boolArray;

    public ArrayBoolNode(String id, Node boolArray) {
        this.id = id;
        this.boolArray = (ArrayBoolValuesNode) boolArray;
    }


    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
