public class ReturnException extends EvaluationException {
    private Object returnValue;
    public ReturnException(Object value) {
        super("Function returned");
        this.returnValue = value;
    }
    public Object getReturnValue() {
        return returnValue;
    }
}