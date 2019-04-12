package CoffeeChess;

import CoffeeChess.UI.UIManager;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Coffee Chess Application entry-point.
 *
 * Initialises the base application stage window.
 */
public class CoffeeChessApp extends Application {

    UIManager UIManager;

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        UIManager = new UIManager(stage);
        UIManager.startMenuScene();
    }
}
