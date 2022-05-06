package exceptions;

public class MultipleLocalDeclarationException extends SymbolTableException{
    String id;

    public MultipleLocalDeclarationException(String message, int lineNumber, String id) {
        super(message, lineNumber);
        this.id = id;
    }
}
