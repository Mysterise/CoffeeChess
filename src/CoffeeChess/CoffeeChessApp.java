package CoffeeChess;

import CoffeeChess.UI.Scenes.SceneManager;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Coffee Chess Application entry-point.
 *
 * Initialises the base application stage window.
 */
public class CoffeeChessApp extends Application {

    SceneManager sceneManager;

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        sceneManager = new SceneManager(stage);
        sceneManager.startMenuScene();
    }
}
