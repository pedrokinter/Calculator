package aulas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller007 {

    @FXML
    private Button logoutButton;
    @FXML
    private AnchorPane scenePane;

    Stage stage;

    public void logout(ActionEvent e) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        // aq é uma janela de confirmaçao se eu quero fechar o programa
        alert.setTitle("Logout");
        alert.setHeaderText("voce vai sair do programa");
        alert.setContentText("voce deseja salvar antes de sair?: ");

        if(alert.showAndWait().get() == ButtonType.OK){
            stage = (Stage) scenePane.getScene().getWindow();
            // aq eu pego o atual estado da janela pra eu poder fechar ela, ja fechando
            stage.close();
        }

        stage = (Stage) scenePane.getScene().getWindow();

    }

}
