package ast;

import ast.abstracts.ArrayData;
import ast.abstracts.Node;
import visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ArrayCharValuesNode extends ArrayData {
    public List<Node> charvalues = new ArrayList<>();

    public ArrayCharValuesNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
