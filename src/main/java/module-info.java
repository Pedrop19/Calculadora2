module com.calculadora {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;

    opens com.calculadora to javafx.fxml;
    exports com.calculadora;
}
