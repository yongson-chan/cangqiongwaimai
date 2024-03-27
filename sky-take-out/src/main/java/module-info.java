module com.example.skytakeout {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.skytakeout to javafx.fxml;
    exports com.example.skytakeout;
}