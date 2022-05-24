package system.zarzadzania.exceptions;

public class NoJavaProgrammersHere extends RuntimeException {
    public NoJavaProgrammersHere() {
    }

    public NoJavaProgrammersHere(String message) {
        super(message);
    }
}
