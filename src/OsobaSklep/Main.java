package OsobaSklep;

// Stworz klase Osoba (imie, nazwisko, miasto, wiek) oraz Sklep (nazwa, miasto)
// - metoda co zwraca najstarsza kobiete lub NoWomenException jesli brak kobiet na liscie
// - kobiety chodza do sklepow, mezczyzni nie, zatem powiazania ze sklepem moga miec tylko kobiety, w przypadku próby dodania powiazania mezyczyzna
//   sklep rzuc wyjatkiem ShopsAreOnlyForWomenException()
// - osoby moga sie umawiac na randki, ale jestesmy homofobami, nie akceptujemy par homo, dodaj osobie plec
// przy probie umowienia sie na randke pary homo rzuc wyjatkiem NoHomoHereException()
// - nasz system przechowuje tylko osoby pełnoletnie, zatem wiek > 18, pryz próbie tworzenia osoby która ma mniej niz 18 lat
// progarm powinien to naprawic, ustawiajac danej osobie 18 lat (uzyc wyjatki IllegalArgumentException())
public class Main {
    public static void main(String[] args) {


        Osoba o1 = new Osoba("Ala", "Celna", "Warszawa",16, Plec.KOBIETA );
        System.out.println(o1.getWiek());
        Osoba o2 = new Osoba("Basia", "Mazurek", "Gdansk", 19, Plec.KOBIETA);

        Randka r = new Randka(o1,o2);
    }
}
