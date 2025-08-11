package com.example.calculadorasimples;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller006pontodois {

    @FXML
    private Label nameLabel;

    @FXML
    public void displayName(String name){
        nameLabel.setText("Eae irmao: "+name);
    }


}
