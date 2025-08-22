package aulas;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class aula001 extends Application {

    public static void main(String[] args) {
        launch(args); // launch metod is a static method belongs to application class

    }

    @Override
    public void start(Stage stage) throws Exception {

        Group root = new Group(); // crio um root node para orgnaizxar meus componentes, coloco ele na scene e a scene
        // eu coloco no stage;
        // a scene serve para dar resize automaticamente e não bugar a janela do stage
        Scene scene = new Scene(root, Color.BLACK); // pra ter uma scene eu preciso passar uma rootnode (layout managers)

        //Image icon = new Image();
        // seto um objeto de icon
        //stage.getIcons().add(icon);
        // do get nesse objeto (me parece um tipo de arraylist)

        stage.setTitle("Pedro cOITADO");
        stage.setWidth(450); // seto a largura
        stage.setHeight(450); // seto a altura
        stage.setResizable(false); // digo se ele vai ser resizible ou nao

        stage.setFullScreen(true); // fica em fullscreen
        stage.setFullScreenExitHint("vc n pode sair se nao apertar p"); // falo q nao da pra sair sem apertar p
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("p")); // e aq eu seto a letra p pra sair

        stage.setScene(scene); // seto a cena
        stage.show(); // é stage, scene e scene graph a ordem para a customizaçao da gui
    }
}
