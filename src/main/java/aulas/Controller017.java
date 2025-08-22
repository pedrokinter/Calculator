package aulas;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller017 implements Initializable {

    @FXML
    private Spinner<Integer> spinner;

    @FXML
    private Label myLabel;

    int currentValue;

    @FXML
    public void initialize(URL url, ResourceBundle rb) {

        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100);


        valueFactory.setValue(0);

        spinner.setValueFactory(valueFactory);

        currentValue = spinner.getValue();

        myLabel.setText(String.valueOf(currentValue));
        // aq so serve pra setar por fora, pra deixar o valor inicial definido

        spinner.valueProperty().addListener(new ChangeListener<Number>() {

            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {

                currentValue = spinner.getValue();
                // qnd a gente interagir com o spinner, vai atualizar a label atraves desses metodos no changed
                myLabel.setText(String.valueOf(currentValue));
                // aq q atualiza de vdd
            }
        });
    }
}
