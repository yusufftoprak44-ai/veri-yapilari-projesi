package main;
import model.ekipman;
import model.rezervasyon;
import datastructere.rezervasyonYonetimi;

public class main {

	public static void main(String[] args) {
		// ekipman b1=new ekipman("4588445","bilgisayar1","pc labaratuari");
		// rezervasyon r1=new rezervasyon("274  ","4879455","pazartesi","12.30");
        // System.out.println(b1);
        // System.out.println(r1);  // burada dogrudan tostring() cagirir

		rezervasyonYonetimi rezervasyonYonetimi = new rezervasyonYonetimi();
		boolean rezervasyonEklendi1 = rezervasyonYonetimi.rezervasyonEkle("274", "4879455", "pazartesi", "12.30");
		boolean rezervasyonEklendi2 = rezervasyonYonetimi.rezervasyonEkle("275", "4879455", "pazartesi", "12.30");

		System.out.println("Rezervasyon 1 eklendi mi? " + rezervasyonEklendi1);
		System.out.println("Rezervasyon 2 eklendi mi? " + rezervasyonEklendi2);

		for (rezervasyon r : rezervasyonYonetimi.getRezervasyonListesi()) {
			System.out.println(r);
		}
	}

}
