# veri-yapilari-projesi
/*
 * =====================================================================
 * PROJE ADI: VY-008 | Laboratuvar Ekipmanı Rezervasyon Sistemi
 * =====================================================================
 * 
 * 🛠️ KULLANILAN TEKNOLOJİLER:
 * - Programlama Dili: Java (https://www.java.com/)
 * - Arayüz Teknolojisi: JavaFX (https://openjfx.io/)
 * 
 * 📌 AÇIKLAMA:
 * Laboratuvar cihazları ve ortak ekipmanlar için kullanım rezervasyonlarını 
 * yöneten bir uygulamadır. Ekipmanların kullanılabilirliği gün ve zaman 
 * dilimi üzerinden gösterilir.
 * 
 * 🛠️ TEMEL FONKSİYONLAR VE GÖREVLER:
 * 1. Kaydetme: 
 *    - Ekipman, öğrenci ve seçilen zaman dilimi için rezervasyon kaydı oluşturma.
 * 
 * 2. Silme: 
 *    - Rezervasyonu silerek ilgili zaman dilimini boşaltma.
 *    - Aktif rezervasyonu bulunmayan ekipmanı sistemden kaldırma.
 * 
 * 3. Güncelleme: 
 *    - Ekipman bilgilerini, rezervasyon sahibini ve uygun olan gün-saat 
 *      seçimini değiştirme.
 * 
 * 4. Sıralama: 
 *    - Rezervasyonları tarihe veya ekipman adına göre sıralama.
 * 
 * 5. Sorgulama: 
 *    - Ekipman kodu, öğrenci numarası, gün ve boş zaman dilimleriyle arama yapma.
 * 
 * ⚠️ İŞLEYİŞ VE KRİTİK KURALLAR:
 * - Çakışma Önleme: Aynı ekipman, aynı zaman diliminde iki farklı kişiye ayrılamaz.
 * - Güvenli Güncelleme: Saat değişikliği yapılırken önce yeni aralığın 
 *   uygunluğu kontrol edilir; işlem reddedilirse eski rezervasyon kesinlikle korunur.
 * =====================================================================
 */

