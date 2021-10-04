module com.example.datepickerexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.datepickerexample to javafx.fxml;
    exports com.example.datepickerexample;
}