package zamowienie;

import java.util.ArrayList;
import java.util.List;

public class Klient {
    private List<Produkt> produkty = new ArrayList<>();

    public List<Produkt> getProdukty() {
        return produkty;
    }

    public void dodajProdukt(Produkt p){
        if(p == null){
            throw new ProductNullException("Produkt jest nullem");
        }
        if(p.getKlient() != null) {
            throw new IllegalArgumentException("Produkt juz sprzedany");
        }
        getProdukty().add(p);
        p.setKlient(this);

    }
}
