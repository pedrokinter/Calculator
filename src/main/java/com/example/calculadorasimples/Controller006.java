package com.example.calculadorasimples;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller006 {
    @FXML
    TextField nameTextField;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public void login(ActionEvent e) throws IOException {
        String name = nameTextField.getText();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("interface06pontodois.fxml"));
        root = fxmlLoader.load();

        Controller006pontodois controllerDois = fxmlLoader.getController();
        controllerDois.displayName(name);


        //Parent builder = FXMLLoader.load(getClass().getResource("interface06.fxml"));

        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
