package com.example.calculadorasimples;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ex001 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("interfaceEx001.fxml"));
        Scene scene = new Scene(root);

        String css = this.getClass().getResource("ex001.css").toExternalForm();
        scene.getStylesheets().add(css);

        stage.setTitle("Convertor de Temperaturas");

        stage.setScene(scene);
        stage.show();
    }
}
