package ast;

import ast.abstracts.Selective;
import ast.abstracts.Node;
import visitor.ASTVisitor;

public class IfStatementNode extends Selective {
    public Node iflogic;
    public Node ifThenBlock;
    public Node elseBlock;

    public IfStatementNode(Node iflogic, Node ifThenBlock, Node elseBlock) {
        this.iflogic = iflogic;
        this.ifThenBlock = ifThenBlock;
        this.elseBlock = elseBlock;
    }


    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
