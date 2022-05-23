package zamowienie;

public class ProductNullException extends RuntimeException{
    public ProductNullException() {
    }

    public ProductNullException(String message) {
        super(message);
    }
}
