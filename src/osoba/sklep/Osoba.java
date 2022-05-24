package osoba.sklep;

import osoba.sklep.exceptions.NoWomenException;

import java.util.ArrayList;
import java.util.List;

public class Osoba {
    private String imie;
    private String nazwisko;
    private String miasto;
    private int wiek;
    private Plec plec;

    private static List<Osoba> osoby = new ArrayList<>();

    public Osoba(String imie, String nazwisko, String miasto, int wiek, Plec plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miasto = miasto;
        this.plec = plec;
        try {
            ustawWiek(wiek);
        } catch (IllegalArgumentException e) {
            ustawWiek(18);
        }
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public Plec getPlec() {
        return plec;
    }

    public void setPlec(Plec plec) {
        this.plec = plec;
    }

    public static Osoba najstarszaKobieta(List<Osoba> osoby) {
        if (osoby == null || osoby.isEmpty()) {
            throw new NoWomenException("Brak Kobiet");
        }
        Osoba najstarsza = osoby.get(0);
        for (Osoba o : osoby) {
            if (o.getWiek() > najstarsza.getWiek()) {
                najstarsza = o;
            }
        }
        return najstarsza;
    }

    private void ustawWiek(int wiek) {
        if (wiek < 18) {
            throw new IllegalArgumentException("Wiek ponizej granicy");
        }
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
