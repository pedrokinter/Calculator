package com.example.calculadorasimples;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ex001 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent builder = FXMLLoader.load(getClass().getResource("ex001.fxml"));
        Scene scene = new Scene(builder);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
