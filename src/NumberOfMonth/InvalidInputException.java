package NumberOfMonth;

/**
 * Created by Elizaveta Naimark on 18.09.2016.
 */
public class InvalidInputException extends RuntimeException {
    public InvalidInputException() {
        super();
    }

    public InvalidInputException(String message) {
        super(message);
    }
}
