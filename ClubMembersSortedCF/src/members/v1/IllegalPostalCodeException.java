package members.v1;

public class IllegalPostalCodeException extends RuntimeException{
    public IllegalPostalCodeException(String message) {
        super(message);
    }
}
