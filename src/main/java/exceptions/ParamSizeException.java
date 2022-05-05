package exceptions;

public class ParamSizeException extends TypeCheckException {
    int actualParamSize;
    int formalParamSize;

    public ParamSizeException(String message, int lineNumber, int actualParamSize, int formalParamSize) {
        super(message, lineNumber);
        this.actualParamSize = actualParamSize;
        this.formalParamSize = formalParamSize;
    }
}
