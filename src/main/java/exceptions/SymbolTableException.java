package exceptions;

public class SymbolTableException extends RuntimeException{
    int lineNumber;

    public SymbolTableException(String message, int lineNumber) {
        super(message);
        this.lineNumber = lineNumber;
    }
}
