package exceptions;

import service.Type;

public class IllegalTypeException extends TypeCheckException{
    Type typeA;
    Type typeB;

    public IllegalTypeException(String message, int lineNumber, Type typeA, Type typeB) {
        super(message, lineNumber);
        this.typeA = typeA;
        this.typeB = typeB;
    }

    public int getLineNumber() {
        return lineNumber;
    }

}
