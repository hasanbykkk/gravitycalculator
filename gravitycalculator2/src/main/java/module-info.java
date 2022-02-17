module com.example.gravitycalculator2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gravitycalculator2 to javafx.fxml;
    exports com.example.gravitycalculator2;
}