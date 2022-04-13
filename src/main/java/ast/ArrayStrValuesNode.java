package ast;

import ast.abstracts.ArrayData;
import ast.abstracts.Node;
import visitor.ASTVisitor;
import java.util.ArrayList;
import java.util.List;

public class ArrayStrValuesNode extends ArrayData {
    public List<StringValNode> strValues = new ArrayList<>();

    public ArrayStrValuesNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
