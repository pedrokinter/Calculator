package aulas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller010 {
    @FXML
    private Label labelTrocar;
    @FXML
    private CheckBox checkBox;
    @FXML
    private ImageView imageTroca;

    Image myImage = new Image("caa.jpg");
    Image myImage2 = new Image("sur.png");

    public void trocarImagem(ActionEvent event) {
        if(checkBox.isSelected()) {
            labelTrocar.setText("CARTIIIIIII");
            imageTroca.setImage(myImage);
        } else {
            labelTrocar.setText("SURFISTAAAAAAA");
            imageTroca.setImage(myImage2);
        }
    }
}
