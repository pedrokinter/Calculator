package com.example.calculadorasimples;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class Controller011 {
    @FXML
    private Label myLabel;
    @FXML
    private RadioButton radioButton1;
    @FXML
    private RadioButton radioButton2;
    @FXML
    private RadioButton radioButton3;

    public void trocar(ActionEvent event) {
        if (radioButton1.isSelected()) {
            myLabel.setText(radioButton1.getText());

        } else if (radioButton2.isSelected()) {
            myLabel.setText(radioButton2.getText());

        } else if (radioButton3.isSelected()) {
            myLabel.setText(radioButton3.getText());
        }
    }
}
