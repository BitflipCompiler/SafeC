package exceptions;

public class AssignTypeCheckException extends TypeCheckException{
    String typeA;
    String typeB;
    String superType;

    public AssignTypeCheckException(String message, int lineNumber, String typeA, String typeB, String superType) {
        super(message, lineNumber);
        this.typeA = typeA;
        this.typeB = typeB;
        this.superType = superType;
    }
}
