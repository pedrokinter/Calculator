package com.example.calculadorasimples;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Controller012 {

    @FXML
    private DatePicker myDate;
    @FXML
    private Label myLabel;

    public void setLabelData() {
        LocalDate localDate = myDate.getValue();
        // aq eu pego e crio um localdate com o valor do date picker
        String myFormattedDate = localDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        // se eu quiser o nome do mes eu uso 3 MMM inves de 2 MM
        // aq eu formato pro tipo de calendario usado por PESSOAS NORMAIS e nao americanos burros

        myLabel.setText(myFormattedDate);
        // e aq eu seto a label com o texto da data ja formatada
    }
}
