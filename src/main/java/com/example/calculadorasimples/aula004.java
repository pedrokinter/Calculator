package com.example.calculadorasimples;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class aula004 extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent builder = FXMLLoader.load(getClass().getResource("interface04.fxml"));
        Scene scene = new Scene(builder);
        //scene.getStylesheets().add(getClass().getResource("aula004.css").toExternalForm());
        // se eu quiser adicionar
        // mais de 1 css style pra uma cena, é melhor eu quebrar isso em dois
        // do jeito abaixo
        String css = this.getClass().getResource("aula004.css").toExternalForm();
        scene.getStylesheets().add(css);

        stage.setScene(scene);
        stage.show();
    }


}
