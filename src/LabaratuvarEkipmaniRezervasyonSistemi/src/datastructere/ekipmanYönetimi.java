package datastructere;
import model.ekipman;
import model.rezervasyon;
import java.util.ArrayList;
import java.util.List;
 public class ekipmanYönetimi{
	 //buradaki kodlar bizim verilerimizi RAM da tutmak için
	private List<ekipman>ekipmanListesi; // buradaki listeler dinamik dizi şeklinde 
	private List<rezervasyon>rezervasyonListesi; //bir ekipman silmek istedigimizde ekipmana 
	                                           //rezervasyon kontrolu varmi onu kontrol ederiz
	public ekipmanYönetimi(List<rezervasyon>rezervasyonListesi) {//burada bunu paremetre olarak gostermesydik
		                                                         //ekimanlara yapılan rezervasyonlari gormezdik
		this.ekipmanListesi = new ArrayList<>();
        this.rezervasyonListesi = rezervasyonListesi;
        }
	
        public List<ekipman> getekipmanListesi() {//burada listeyi private yaptigimiz için getter metodu ile
            return ekipmanListesi;                // diğer sınıflara listeyi paylaşmak için oluşturduk
	}
}
/*
 
 burada da kendi bagli listemizi olusturuyoruz
 
 public class ekipmanYönetimi {
		    private bagliliste ekipmanListesi; 
	    private bagliliste rezervasyonListesi; //  rezervasyonlar için  bir liste

	    public ekipmanYönetimi() {
	        this.ekipmanListesi = new bagliliste(); // Kendi bağlı listemiz
	    }
	    
	    public void yeniEkipmanEkle(int ekipmanId) {
	       
	        ekipmanListesi.elemanekle(ekipmanId); 
	    }
	}*/