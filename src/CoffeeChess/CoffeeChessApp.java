package CoffeeChess;

import CoffeeChess.Display.MenuScene;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Coffee Chess Application entry-point
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

        new MenuScene(stage);
    }
}
