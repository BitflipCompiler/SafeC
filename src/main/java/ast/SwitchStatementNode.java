package ast;

import ast.abstracts.Node;
import ast.abstracts.Selective;
import visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class SwitchStatementNode extends Selective {
    public String id;
    public List<ScaseNode> scases;
    public DefCaseNode defcase;

    public SwitchStatementNode(String id, List<ScaseNode> scases, Node defcase) {
        this.id = id;
        this.scases = scases;
        this.defcase = (DefCaseNode) defcase;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
