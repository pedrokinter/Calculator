package com.example.calculadorasimples;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.Objects;

public class ControllerEx003 {
    @FXML
    private TextField nomeField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField idadeField;

    @FXML
    public void checkEmail(ActionEvent event) {
        if (emailField.getText().isEmpty()){
            emailField.setPromptText("Digite um email");
            emailField.getPromptText();
        }

    }

    @FXML
    public void checkIdade(ActionEvent event) {
        idadeField.setPromptText("Digite um idade");
        idadeField.getPromptText();






    }

    @FXML
    public void checkNome(ActionEvent event) {
        if (nomeField.getText().isEmpty()){
            nomeField.setPromptText("Digite um nome");
            nomeField.getPromptText();
        }
    }


}
