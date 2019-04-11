package CoffeeChess;

import CoffeeChess.Display.MenuScene;
import CoffeeChess.Display.SceneBase;
import javafx.application.Application;
import javafx.stage.Stage;

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
        SceneBase.setStage(stage);
        SceneBase.initStage();
        new MenuScene();
    }
}
