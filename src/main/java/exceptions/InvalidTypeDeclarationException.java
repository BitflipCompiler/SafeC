package exceptions;

public class InvalidTypeDeclarationException extends SymbolTableException{
    String datatype;

    public InvalidTypeDeclarationException(String message, int lineNumber, String datatype) {
        super(message, lineNumber);
        this.datatype = datatype;
    }
}
