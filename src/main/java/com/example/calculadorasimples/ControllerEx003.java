package com.example.calculadorasimples;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.CheckBoxTreeCell;
import javafx.util.converter.IntegerStringConverter;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class ControllerEx003 implements Initializable {
    @FXML
    private TextField nomeField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField idadeField;

    @FXML
    private Button salvarButton;

    @FXML
    private TreeView<String> treeView = new TreeView<>();

    TextFormatter<String> formatterIdade = new TextFormatter<>(change -> {
        String text = change.getControlNewText();

        if (text.length() > 3){
            return null;
        }

        for(char c : text.toCharArray()){
            if (!Character.isDigit(c)){
                return null;
            }
        }

        return change;
    });

    TextFormatter<String> formatterNome = new TextFormatter<>(change -> {
        String text = change.getControlNewText();

        if (text.isEmpty()) {
            return null;
        }

        if (!text.contains("@")){
            return null;
        }

       return change;
    });

    @FXML
    public void idadeFormatter() {
        idadeField.setTextFormatter(formatterIdade);

    }

    @FXML
    public void checkEmail(ActionEvent event) {

            emailField.setPromptText("Digite um email");
            emailField.getPromptText();
            emailField.setTextFormatter(formatterNome);

    }

    @FXML
    public void checkIdade(ActionEvent event) {
        idadeField.setPromptText("Digite um idade");
        idadeField.getPromptText();



    }

    @FXML
    public void checkNome(ActionEvent event) {
        if (nomeField.getText().isEmpty()){
            nomeField.setPromptText("Digite um nome");
            nomeField.getPromptText();
        }
    }

    @FXML
    public void salvarCheck(ActionEvent event) {
        if (nomeField.getText().isEmpty() || emailField.getText().isEmpty() || idadeField.getText().isEmpty()) {
            salvarButton.setDisable(true);
        } else {
            salvarButton.setDisable(false);
        }

    }

    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        CheckBoxTreeItem<String> desenhar = new CheckBoxTreeItem<>("Desenhar");
        CheckBoxTreeItem<String> treinar = new CheckBoxTreeItem<>("Desenhar");
        CheckBoxTreeItem<String> cheirar = new CheckBoxTreeItem<>("Cheirar");

        CheckBoxTreeItem<String> Hobbies = new CheckBoxTreeItem<>("Hobbies");

        Hobbies.setExpanded(true);
        Hobbies.getChildren().add(desenhar);
        Hobbies.getChildren().add(treinar);


        treeView.setRoot(Hobbies);
        treeView.setCellFactory(CheckBoxTreeCell.<String>forTreeView());

        int contador = 0;





    }

    }



