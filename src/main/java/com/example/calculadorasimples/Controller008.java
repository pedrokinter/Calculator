package com.example.calculadorasimples;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller008 {

    // ImageView é um node usado para pintar imagens carregadas com imagens (objeto)

    // Image = fotografia

    // ImageView = o frame da fotografia/pintura/ ele segura uma imagem

    @FXML
    ImageView myImageView;
    @FXML
    Button myButton;

    Image myImage = new Image("sur.png");
    // aq cria o objeto da imagem 2 para ser adicionado na troca realizada com o button
    @FXML
    public void displayImage() {
        myImageView.setImage(myImage);
        // metodo para setar a imagem
    }
}
