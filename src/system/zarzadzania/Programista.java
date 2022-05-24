package system.zarzadzania;

import system.zarzadzania.exceptions.NoJavaProgrammersHere;

import java.util.*;

public class Programista {
    private String imie;
    private String nazwisko;
    private double pensja;
    private List<Jezyki> jezyki;

    private static List<Programista> programisci = new ArrayList<>();

    public Programista(String imie, String nazwisko, double pensja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pensja = pensja;
        programisci.add(this);
    }

    public static List<Programista> topN(List<Programista> programisci, int n){
        Set<Programista> result = new TreeSet<>();
        for (Programista p : programisci) {
            if(p.jezyki.contains(Jezyki.JAVA)){
                result.add(p);
            }
        }
        if(result.isEmpty()){
            throw new NoJavaProgrammersHere("Brak programistow");
        }

        return result.stream().toList().subList(0, n);

    }

    public static List<Programista> getProgramisci() {
        return programisci;
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

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    public List<Jezyki> getJezyki() {
        return jezyki;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Programista that = (Programista) o;
        return Double.compare(that.pensja, pensja) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pensja);
    }


}
