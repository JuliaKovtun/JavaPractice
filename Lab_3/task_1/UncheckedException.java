package task_1;

public class UncheckedException extends RuntimeException{
    private StatusCode statusCode;

    public UncheckedException(String message, StatusCode statusCode) {
        super(message);
        this.statusCode = statusCode;
    }

    public StatusCode getErrorCode() {
        return statusCode;
    }
}
