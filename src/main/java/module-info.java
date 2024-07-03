module com.example.javafxcssdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxcssdemo to javafx.fxml;
    exports com.example.javafxcssdemo;
}