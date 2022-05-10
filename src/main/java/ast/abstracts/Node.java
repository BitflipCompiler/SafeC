package ast.abstracts;

import visitor.ASTVisitor;

public abstract class Node {
    private int lineNumber;
    public boolean isGlobal;

    public abstract void accept(ASTVisitor v);

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }
}


