module com.example.bank_system_fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bank_system_fx to javafx.fxml;
    exports com.example.bank_system_fx;
}