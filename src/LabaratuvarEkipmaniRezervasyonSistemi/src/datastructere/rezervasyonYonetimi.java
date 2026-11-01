package datastructere;

import model.rezervasyon;
import java.util.ArrayList;
import java.util.List;

public class rezervasyonYonetimi {
    private List<rezervasyon> rezervasyonListesi;

    public rezervasyonYonetimi() {
        this.rezervasyonListesi = new ArrayList<>();
    }

    public List<rezervasyon> getRezervasyonListesi() {
        return rezervasyonListesi;
    }

    public boolean rezervasyonEkle(String ogrenciNo,String ekipmanKodu,String gun,String saatDilimi) {
        for (rezervasyon r: rezervasyonListesi){
            if (r.getekipmanKodu().equals(ekipmanKodu) && r.getgun().equals(gun) && r.getsaatDilimi().equals(saatDilimi)){
                return false;
            }
        }

        rezervasyon yeniRezervasyon = new rezervasyon(ogrenciNo, ekipmanKodu, gun, saatDilimi);
        rezervasyonListesi.add(yeniRezervasyon);
        return true;
    }
}