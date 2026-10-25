package labaratuvarRezervasyonSistemi;

public class rezervasyon {
private String ogrenciNo;
private String ekipmanKodu; // buradaki ile ekipman sinifindaki  ekipmanKodu aynı
private String gun;
private String saatDilimi;

public rezervasyon(String ogrenciNo,String ekipmanKodu,String gun,String saatDilimi ) {
	this.ekipmanKodu=ekipmanKodu;
	this.ogrenciNo=ogrenciNo;
	this.gun=gun;
	this.saatDilimi=saatDilimi;
	
}
// getter setter metotlar
public String ogrenciNo() {
	return ogrenciNo();
}
public void setogreciNo(String ogrenciNo) {
	this.ogrenciNo=ogrenciNo;
	
}

public String ekipmanKodu() {
	return ekipmanKodu();
}
public void setekipmanKodu(String ekipmanKodu) {
	this.ekipmanKodu=ekipmanKodu;
}
	public String gun () {
		return gun();
	}
	public void setgun(String gun) {
		this.gun=gun;
	}
	public String saatDilimi () {
		return saatDilimi();
	}
	public void setsaatDilimi(String saatDilimi) {
		this.saatDilimi=saatDilimi;
	}
	public String toString() {
		return ogrenciNo+"nolu ögrenci "+ekipmanKodu+"  "+gun+"/"+saatDilimi ;
	}// buradaki toString arayuzde kodun  daha duzgun gorunmelerini saglıyor.
}
