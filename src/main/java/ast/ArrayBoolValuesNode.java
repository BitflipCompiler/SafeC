package ast;

import ast.abstracts.ArrayData;
import ast.abstracts.Node;
import visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ArrayBoolValuesNode extends ArrayData {
    public List<Node> boolValues = new ArrayList<>();

    public ArrayBoolValuesNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
