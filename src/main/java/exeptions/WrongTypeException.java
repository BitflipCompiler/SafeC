package exeptions;

import service.Type;

public class WrongTypeException extends Exception{

    public WrongTypeException(Type type, Type dataType) {
    }

    public String WrongTypeException(Type typeA, Type typeB) {
        return ("Type " + typeA + " does not match with type " + typeB);

    }
}
