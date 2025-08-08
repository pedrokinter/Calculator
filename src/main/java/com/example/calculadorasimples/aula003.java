package com.example.calculadorasimples;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class aula003  extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Parent builder = FXMLLoader.load(getClass().getResource("interface03.fxml"));
        Scene scene = new Scene(builder);

        stage.setScene(scene);
        stage.show();

        // aaaa
    }
}
