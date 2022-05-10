package exceptions;

public class TypeCheckException extends RuntimeException{
    int lineNumber;

    public TypeCheckException(String message, int lineNumber) {
        super(message);
        this.lineNumber = lineNumber;
    }
}
