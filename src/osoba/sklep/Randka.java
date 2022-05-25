package osoba.sklep;

import osoba.sklep.exceptions.NoHomoHereException;

public class Randka {
    private Osoba osoba1;
    private Osoba osoba2;

    public Randka(Osoba osoba1, Osoba osoba2) {
        if(osoba1.getPlec() == osoba2.getPlec()){
            throw new NoHomoHereException("No homo");
        }
        this.osoba1 = osoba1;
        this.osoba2 = osoba2;
        osoba1.getRandki().add(this);
        osoba2.getRandki().add(this);
    }

}
