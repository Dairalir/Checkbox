module com.example.checkbox {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.checkbox to javafx.fxml;
    exports com.example.checkbox;
    exports com.example.checkbox.GUI;
    opens com.example.checkbox.GUI to javafx.fxml;
}