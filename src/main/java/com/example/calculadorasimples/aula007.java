package com.example.calculadorasimples;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class aula007 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("interface07.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        stage.setOnCloseRequest(event -> {
            event.consume(); // aq vai fazer com q quando eu aperte em cancel o programa nao feche
            logout(stage);
        });
        // aq chama pra qnd apertar o x la em cima na janela, ele perguntar do logout
    }

    public void logout(Stage stage) {
        // inves de passar um action event eu passo um stage, pq o stage nao é reconhecido
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);

        alert.setTitle("Logout");
        alert.setHeaderText("voce vai sair do programa");
        alert.setContentText("voce deseja salvar antes de sair?: ");

        if (alert.showAndWait().get() == ButtonType.OK) {
            System.out.println("programa fechadao");
            stage.close();
            // e eu tiro o get window pq a scene e o stage la em cima ja estao mostrando a janela atual
        }
    }
}
