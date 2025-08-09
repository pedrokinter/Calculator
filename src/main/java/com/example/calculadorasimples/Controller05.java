package com.example.calculadorasimples;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller05 {
    private Stage stage;
    private Scene scene;
    private Parent builder;

    public void trocarParaCenaUm (ActionEvent e) throws IOException {
        Parent builder = FXMLLoader.load(getClass().getResource("interface05.fxml"));
        // aq a gente vai pegar a fonte desse evento e lançar(cast) em um node.
        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(builder);
        stage.setScene(scene);
        stage.show();

    }

    public void trocarParaCenaDois (ActionEvent e) throws IOException {
        Parent builder = FXMLLoader.load(getClass().getResource("interface05pontodois.fxml"));
        // aq a gente vai pegar a fonte desse evento e lançar(cast) em um node.
        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(builder);
        stage.setScene(scene);
        stage.show();
    }
}
