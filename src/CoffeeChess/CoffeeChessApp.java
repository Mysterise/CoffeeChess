package CoffeeChess;

import CoffeeChess.Display.MenuScene;
import CoffeeChess.Display.SceneBase;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Coffee Chess Application entry-point.
 *
 * Initialises the base application stage window.
 */
public class CoffeeChessApp extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Coffee Chess");
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setResizable(false);

        SceneBase.setStage(stage);
        new MenuScene();
    }
}
