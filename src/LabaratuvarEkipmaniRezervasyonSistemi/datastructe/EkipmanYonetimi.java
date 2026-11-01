package com.example.labproje;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    private TextField txtEkipmanKodu;
    @FXML
    private TextField txtEkipmanAdi;
    @FXML
    private TextField txtKategori;
    @FXML
    private TableView<ekipman> tableEkipman;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private void ekle() {
        String kod = txtEkipmanKodu.getText();
        String adi = txtEkipmanAdi.getText();
        String kategori = txtKategori.getText();

        if (kod.isEmpty() || adi.isEmpty() || kategori.isEmpty()) {
            System.out.println("Lütfen tüm alanları doldurun!");
            return;
        }

        ekipman yeniEkipman = new ekipman(kod, adi, kategori);
        tableEkipman.getItems().add(yeniEkipman);

        txtEkipmanKodu.clear();
        txtEkipmanAdi.clear();
        txtKategori.clear();
    }
}
