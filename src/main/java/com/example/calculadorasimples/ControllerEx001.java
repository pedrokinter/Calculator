package com.example.calculadorasimples;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControllerEx001 {
    @FXML
    private TextField textGrausCelsius;
    private double GrausCelsius;
    private Label labelKelvin;
    private Label labelFahrenheit;

    @FXML
    public void setTextGrausCelsius(TextField textGrausCelsius) {
        this.textGrausCelsius = textGrausCelsius;
        this.GrausCelsius = Double.parseDouble(textGrausCelsius.getText());
    }


    public void setKelvin() {
        this.labelKelvin.setText(textGrausCelsius.getText());
    }



}
