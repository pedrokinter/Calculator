module com.example.calculadorasimples {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.example.calculadorasimples to javafx.fxml;
    exports com.example.calculadorasimples;
}