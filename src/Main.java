import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        //  https://www.protechtraining.com/static/bookshelf/java_fundamentals_tutorial/images/ExceptionClassHierarchy.png
        double sal = 0;

        try {
            sal = pensja(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("niepoprawna pensja");
            sal = 2500;
        } finally {
            System.out.println("wykonam sie zawsze");
        }

        System.out.println(sal);
        int wynik = 0;
        try {
            wynik = dzielenie(12, 0);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println(wynik);

        //Stworz program ktory pozwoli odczytac z pliku zawarte informacje.
        //Jesli plik nie istnieje to obsluz ta sytuacje is tworz go (createNewFile() z klasy FIle tworzy nowy plik)

        File file = new File("plik");
        FileReader fr = null;
        try {
            fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("Tworzymy plik");
            file.createNewFile();
        }
        // Stwórz liste i dodaj jej 3 eleemtny np Stringi. Losujemy liczbe z zakrezu 0-5
        // i do zmiennej typu String
        // przypisujemy wylosowany element listy, obsluz sytuacje gdy wylosowana wartosc
        // jest poza zakresem listy

        List<String> listaS = new ArrayList<>(Arrays.asList("Kot", "Pies", "Mysz"));
        Random r = new Random();
        int liczba = r.nextInt(5);
        String wynik2 = "";
        try{
            wynik2 = listaS.get(liczba) + liczba;
            System.out.println(wynik2);
        }catch(IndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("liczba poza zakresem");
        }
        //Stworz asocjacje pomiedzy klientem i produktem 1*-. Obsluz sytuacje gdy produkt jest nullem, wtedy automatycznie ustwiamy
        //klientowi ze zamowil lamborghini za 10000000

    }


    public static int dzielenie(int a, int b) {
        if (a == 10) {
            throw new IllegalArgumentException("licznik rowny 10");
        }
        return a / b;
    }

    public static double pensja(int liczbaGodzin) {
        if (liczbaGodzin < 0) {
            throw new IllegalArgumentException("Liczba godzin < 0");
        }
        return liczbaGodzin * 50;
    }
}
