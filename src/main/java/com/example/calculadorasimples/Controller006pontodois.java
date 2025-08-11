package com.example.calculadorasimples;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller006pontodois {

    @FXML
    private Label nameLabel;
    // aq é a label q ta no scene builder
    @FXML
    public void displayName(String name){
        nameLabel.setText("Eae irmao: "+name);
    }
    // aq eu crio um display pra mostrar o nome


}
