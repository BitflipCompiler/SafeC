package ast;

import ast.abstracts.Node;
import ast.abstracts.Selective;
import visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class SwitchStatementNode extends Selective {
    public String id;
    public List<Node> scases = new ArrayList<>();
    public Node defcase;

    public SwitchStatementNode(String id, List<Node> scases, Node defcase) {
        this.id = id;
        this.scases = scases;
        this.defcase = defcase;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
