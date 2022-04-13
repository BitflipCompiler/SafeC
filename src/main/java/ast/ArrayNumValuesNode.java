package ast;

import ast.abstracts.ArrayData;
import ast.abstracts.Node;
import visitor.ASTVisitor;
import java.util.ArrayList;
import java.util.List;

public class ArrayNumValuesNode extends ArrayData {
    public List<NumvalNode> numValues = new ArrayList<>();

    public ArrayNumValuesNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
