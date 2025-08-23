module java {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens aulas to javafx.fxml;
    exports aulas;

    opens com.calculadora.app.testes to javafx.fxml;
    exports com.calculadora.app.testes;

    opens com.calculadora.app.controllers to javafx.fxml;
    exports com.calculadora.app.controllers;
}

