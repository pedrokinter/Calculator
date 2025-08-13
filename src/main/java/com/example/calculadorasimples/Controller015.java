package com.example.calculadorasimples;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller015 implements Initializable {

    @FXML
    private Label myLabel;

    @FXML
    private Slider mySlider;

    int myTemperature;
    // vai ser usado pra mudar a temperatura

    @FXML
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // é um metodo q pode executar qualquer codigo encontrado dentro dps q o ROOT ja foi implementado
        myTemperature = (int)mySlider.getValue();
        myLabel.setText(myTemperature + "C");
        // aq a temperatura fica aonde o slider ja ta colocado

        mySlider.valueProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
                // e aq é o metodo q faz o slider mudar de temperatura
                myTemperature = (int)mySlider.getValue();
                myLabel.setText(myTemperature + "C");
            }
        });
    }
}
