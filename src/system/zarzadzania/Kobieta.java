package system.zarzadzania;

public class Kobieta {
    private String imie;
    private String nazwisko;
    private String rozmiarBiustu;
    private int IQ;

    public Kobieta(String imie, String nazwisko, String rozmiarBiustu, int IQ) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rozmiarBiustu = rozmiarBiustu;
        this.IQ = IQ;
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

    public String getRozmiarBiustu() {
        return rozmiarBiustu;
    }

    public void setRozmiarBiustu(String rozmiarBiustu) {
        this.rozmiarBiustu = rozmiarBiustu;
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }
}
