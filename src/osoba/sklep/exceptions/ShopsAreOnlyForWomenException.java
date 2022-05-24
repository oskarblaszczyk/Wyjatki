package osoba.sklep.exceptions;

public class ShopsAreOnlyForWomenException extends RuntimeException{
    public ShopsAreOnlyForWomenException(){

    }
    public ShopsAreOnlyForWomenException(String message){
        super(message);
    }
}
