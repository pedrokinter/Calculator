package com.example.calculadorasimples;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.util.converter.IntegerStringConverter;

import java.util.Objects;

public class ControllerEx003 {
    @FXML
    private TextField nomeField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField idadeField;

    TextFormatter<String> formatterIdade = new TextFormatter<>(change -> {
        String text = change.getControlNewText();

        if (text.length() > 3){
            return null;
        }

        for(char c : text.toCharArray()){
            if (!Character.isDigit(c)){
                return null;
            }
        }

        return change;
    });

    TextFormatter<String> formatterNome = new TextFormatter<>(change -> {
        String text = change.getControlNewText();

        if (text.isEmpty()) {
            return null;
        }

        if (!text.contains("@")){
            return null;
        }

       return change;
    });


    @FXML
    public void checkEmail(ActionEvent event) {

            emailField.setPromptText("Digite um email");
            emailField.getPromptText();
//            emailField.setTextFormatter(formatterNome);

    }

    @FXML
    public void checkIdade(ActionEvent event) {
        idadeField.setPromptText("Digite um idade");
        idadeField.getPromptText();
        idadeField.setTextFormatter(formatterIdade);





    }

    @FXML
    public void checkNome(ActionEvent event) {
        if (nomeField.getText().isEmpty()){
            nomeField.setPromptText("Digite um nome");
            nomeField.getPromptText();
        }
    }


}
