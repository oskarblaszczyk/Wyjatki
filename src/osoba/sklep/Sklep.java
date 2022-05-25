package osoba.sklep;

import java.util.ArrayList;
import java.util.List;

public class Sklep {
    private String nazwa;
    private final String miasto;
    private List<Osoba> osoby = new ArrayList<>();

    public Sklep(String nazwa, String miasto) {
        this.nazwa = nazwa;
        this.miasto = miasto;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getMiasto() {
        return miasto;
    }

    public List<Osoba> getOsoby() {
        return osoby;
    }

    @Override
    public String toString() {
        return "Sklep{" +
                "nazwa='" + nazwa + '\'' +
                ", miasto='" + miasto + '\'' +
                '}';
    }
}
