package aulas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import org.controlsfx.control.action.Action;

import java.io.IOException;

public class ControllerEx001 {
    @FXML
    TextField textCelsius;
    @FXML
    private Label labelKelvin;
    @FXML
    private Label labelFahrenheit;

    @FXML
    public double returnKelvin() {

        return Double.parseDouble(textCelsius.getText()) + 273.15;

    }

    public double returnFahrenheit() {

        return Double.parseDouble(textCelsius.getText()) * 1.8 + 32;
    }

    @FXML
    public void kelvinLabel() throws IOException {
        textCelsius.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ENTER) {
                labelKelvin.setText("Kelvin:" + returnKelvin());
            }
        });
    }

    @FXML
    public void fahrenheitLabel() throws IOException {

        textCelsius.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ENTER) {
                labelFahrenheit.setText(String.valueOf(returnFahrenheit() + "°F"));
                labelKelvin.setText(String.valueOf(returnKelvin()) + "°K");

            }
        });
    }
    double cont = 0;
    @FXML
    public void mostrarTemperaturas() throws IOException {
        fahrenheitLabel();

    }



}
