package OsobaSklep.Exceptions;

public class NoHomoHereException extends RuntimeException {
    public NoHomoHereException() {

    }

    public NoHomoHereException(String message) {
        super(message);
    }
}
