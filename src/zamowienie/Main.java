package zamowienie;

public class Main {
    public static void main(String[] args) {
        //Stworz asocjacje pomiedzy klientem i produktem 1*-. Obsluz sytuacje gdy produkt jest nullem, wtedy automatycznie ustwiamy
        //klientowi ze zamowil lamborghini za 10000000
        Klient k = new Klient();
        Produkt p = null;
        Produkt r = new Produkt("Lamborgini", 10000000);
        try{
            k.dodajProdukt(p);
        }catch(ProductNullException e){
            k.dodajProdukt(r);
        }catch(IllegalArgumentException e){
            e.printStackTrace();
        }
// Stworz klase Osoba (imie, nazwisko, miasto, wiek) oraz Sklep (nazwa, miasto)
        // - metoda co zwraca najstarsza kobiete lub NoWomenException jesli brak kobiet na liscie
        // - kobiety chodza do sklepow, mezczyzni nie, zatem powiazania ze sklepem moga miec tylko kobiety, w przypadku próby dodania powiazania mezyczyzna
        //   sklep rzuc wyjatkiem ShopsAreOnlyForWomenException()
        // - osoby moga sie umawiac na randki, ale jestesmy homofobami, nie akceptujemy par homo, dodaj osobie plec
        // przy probie umowienia sie na randke pary homo rzuc wyjatkiem NoHomoHereException()
        // - nasz system przechowuje tylko osoby pełnoletnie, zatem wiek > 18, pryz próbie tworzenia osoby która ma mniej niz 18 lat
        // progarm powinien to naprawic, ustawiajac danej osobie 18 lat (uzyc wyjatki IllegalArgumentException())

        /*
         * Stworz krotki system do zarzadzania programistami i ich partnerkami
         *
         * Programista ma imie, nazwisko, pensje oraz lsite jezykow jakie zna
         *
         * Kobieta ma imie, nazwsiko, rozmiar biustu oraz IQ
         *
         * Napisz metode ktora znajduje top n programistow (jesli chodzi o zarobki)
         * ktorzy kodza w javie. Jesli nie jestes w stanie tego zrobic rzuc wyjatkiem
         * NoJavaPorgrammerHere
         *
         * Programista moze chodzic na Randke(nazwa, miejsce, kobieta). Napisz metode
         * ktora wylicza % szanse na zaliczenie na randce. Algorytm zalezy odm iejsca np
         * restuaracja +10%, kino +20% itd oraz od kobiety, rozmiar A + 10%, B+ 20% itd
         * oraz od IQ wzor IQ/1000. Jesli szansa na zaliczenie wynosi over 100%
         * programista jest zapewny siebie i jego szanse spdaja, zatem obslugujemy
         * wyajtek i ustawiamy szanse na zaliczenie do 30%
         *
         * Dodaj kobiecie atrybut ulubione miejsce, ktore jest losowane z listy miejsc.
         * Jesli wylosowane ulubione miejsce kobiety jest inne niz to w ktorym zabral je
         * programista powstaje konflikt, BadPlaceForDateException z zastrzezeniem ze
         * moze przyjac on wiadomosc dla programisty od kobiety albo zostac pusty
         */

    }
}
