package exceptions;

public class IdTypeCheckException extends TypeCheckException{
    String id;

    public IdTypeCheckException(String message, int lineNumber, String id) {
        super(message, lineNumber);
        this.id = id;
    }
}
