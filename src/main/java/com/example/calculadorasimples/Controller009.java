package com.example.calculadorasimples;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller009 {

    @FXML
    TextField myTextField;
    @FXML
    Button myButton;
    @FXML
    Label myLabel;


    private int age;
    public void ageTextField(ActionEvent event) {
        if(Double.parseDouble(myTextField.getText()) < 18) {
            myLabel.setText("You are younger than 18 years");
        } else {
            myLabel.setText("You are older than 18 years");
        }
    }

    public void confirmar(ActionEvent event) {
        try {
            age = Integer.parseInt(myTextField.getText());
            // integra qualquer texto da variavel pra int
            if(age >= 18) {
                myLabel.setText("You are older than 18 years");
            } else {
                myLabel.setText("You are younger than 18 years");
            }

        } catch (NumberFormatException e) {
            myLabel.setText("You entered an invalid number or letters, plz try again");
        }
    }
}
