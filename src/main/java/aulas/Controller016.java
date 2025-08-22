package aulas;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller016 implements Initializable {
    @FXML
    private Button myButton;
    @FXML
    private Label myLabel;
    @FXML
    private ProgressBar myProgressBar;

    // é uma classe da biblioteca java math q da ao usuario controle total sobre o arredondamento dos numeros

    BigDecimal progress = new BigDecimal(String.format("%.2f", 0.0)); //o 2f é pra falar qnts casa vai sair na label
    // e o 0.0 é pra falar qnt q vai começar o progress

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myProgressBar.setStyle("-fx-accent: #00FF00;");
    }

    @FXML
    public void increaseProgress() {
        if (progress.doubleValue() < 1){
            progress = new BigDecimal(String.format("%.2f", progress.doubleValue() + 1)); // eu tenho q fzr isso
            // pq big decimal é imutavel
            myProgressBar.setProgress(progress.doubleValue());
            myLabel.setText(Integer.toString(progress.intValue()));
            // aq eu integro o progress pra int pra n ficar dando erro pq o double nao é preciso

        }
    }
}
