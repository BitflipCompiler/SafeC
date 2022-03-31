public class ASTVariable extends ASTNode{
    String safety;
    String id;
    Type type;
    String value;

    public ASTVariable(String safety, String id, Type type) {
        this.safety = safety;
        this.id = id;
        this.type = type;
    }

    public ASTVariable(String safety, String id, Type type, String value) {
        this.safety = safety;
        this.id = id;
        this.type = type;
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void accept(ASTVisitor v) {

    }
}
