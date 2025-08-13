package com.example.calculadorasimples;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // é um metodo q pode executar qualquer codigo encontrado dentro dps q o ROOT ja foi implementado
    }
}
