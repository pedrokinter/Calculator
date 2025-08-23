package com.calculadora.app.testes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class testCalculadora extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/calculadora.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Calculadora");
        Image image = new Image(getClass().getResourceAsStream("/images/pngtree-vector-calculator-icon-png-image_319747.jpg"));
        stage.getIcons().add(image);

        stage.show();
    }
}
