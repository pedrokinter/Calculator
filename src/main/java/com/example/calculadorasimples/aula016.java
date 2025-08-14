package com.example.calculadorasimples;

import javafx.application.Application;
import javafx.css.Style;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class aula016 extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("interface016.fxml"));
        Scene scene = new Scene(root);


        stage.setScene(scene);
        stage.setTitle("Contador Basico");
        stage.show();


    }
}
