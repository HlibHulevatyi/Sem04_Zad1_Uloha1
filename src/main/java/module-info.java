module com.example.sem04_zad1_uloha1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sem04_zad1_uloha1 to javafx.fxml;
    exports com.example.sem04_zad1_uloha1;
}