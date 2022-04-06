package ast.abstracts;

import visitor.ASTVisitor;

public abstract class Node {
    public abstract void accept(ASTVisitor v);
}
