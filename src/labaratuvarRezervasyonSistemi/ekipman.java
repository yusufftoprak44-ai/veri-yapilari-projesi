package labaratuvarRezervasyonSistemi;

public class ekipman {
	private String ekipmanKodu;       // sayi cok buyuk olabiliceginden veya kodda
	                                  //karakter de olabileceginden String tercih ettim
	private String ekipmanAdi;
	private String ekipmanKategori; // burada  bilgisyar,fizik,kimya,biyoloji gibi 
	                                //her dalın ekipmanini siniflandirmak icin


public ekipman(String ekipmanKodu,String ekipmanAdi, String ekipmanKategori) {
	this.ekipmanKodu=ekipmanKodu;
	this.ekipmanAdi=ekipmanAdi;
	this.ekipmanKategori=ekipmanKategori;
	
}
// getter ve setter metotlari
public String ekipmanKodu() {
	return ekipmanKodu();
}

public void setekipmanKodu(String ekipmanKodu) {
	this.ekipmanKodu=ekipmanKodu;
}
public String ekipmanAdi() {
	return ekipmanAdi();
}
public void setekipmanAdi(String ekipmanAdi) {
	this.ekipmanAdi=ekipmanAdi;
}
public String ekipmanKategori() {
	return ekipmanKategori();
}
public void setekipmanKategori(String ekipmanKategori) {
	this.ekipmanKategori=ekipmanKategori;
}
@ Override
public String toString() {
	return ekipmanAdi+"-- Ekipman kodu:"+ekipmanKodu+" --"+" Ekipman Kategori: "+ekipmanKategori;
} // buradaki toString arayuzde kodun nesnelerin daha duzgun gorunmelerini saglıyor.
 


}