package com.example.calculadorasimples;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller014 implements Initializable {
    @FXML
    private ChoiceBox<String> myChoiceBox;

    @FXML
    private Label myLabel;

    private String[] choices = {"pedro", "maria", "ramen"};

    @FXML
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        myChoiceBox.getItems().addAll(choices);
        myChoiceBox.setOnAction(this::testeLabel);
        // os :: é para fazer referencia ao metodo testeLabel
    }
    @FXML
    public void testeLabel(ActionEvent event) {
        String myChoice = myChoiceBox.getValue();
        myLabel.setText(myChoice);
    }


}
