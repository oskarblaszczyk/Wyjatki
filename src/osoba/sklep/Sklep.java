package osoba.sklep;

public class Sklep {
    private String nazwa;
    private final String miasto;

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

    @Override
    public String toString() {
        return "Sklep{" +
                "nazwa='" + nazwa + '\'' +
                ", miasto='" + miasto + '\'' +
                '}';
    }
}
