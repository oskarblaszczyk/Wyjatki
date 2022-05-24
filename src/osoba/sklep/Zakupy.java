package osoba.sklep;

import osoba.sklep.exceptions.ShopsAreOnlyForWomenException;

public class Zakupy {
    private Sklep sklep;
    private Osoba osoba;

    public Zakupy(Sklep sklep, Osoba osoba) {
        if (osoba.getPlec().equals(Plec.MEZCZYZNA)) {
            throw new ShopsAreOnlyForWomenException("Sklepy tylko dla Kobiet");
        }
        this.osoba = osoba;
        this.sklep = sklep;

    }

}
