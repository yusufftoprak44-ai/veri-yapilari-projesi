module LabaratuvarEkipmaniRezervasyonSistemi {
    // JavaFX modülleri
    requires javafx.controls;
    requires javafx.fxml;

    // GUI paketini JavaFX'e aç (reflection için gerekli)
    opens veri_GIU to javafx.graphics, javafx.fxml;

    // Proje paketlerini dışa aç
    exports model;
    exports datastructere;
    exports main;
}