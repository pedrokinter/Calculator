package com.example.calculadorasimples;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class aula005 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent builder = FXMLLoader.load(getClass().getResource("interface05.fxml"));
        Scene scene = new Scene(builder);
        stage.setScene(scene);
        stage.show();
    }
}
