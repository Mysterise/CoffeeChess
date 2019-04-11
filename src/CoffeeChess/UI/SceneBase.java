package CoffeeChess.UI;

import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Base class for all CoffeeChess Scenes to inherit.
 *
 * Contains a static stage reference for the application's only stage window.
 */
public abstract class SceneBase extends Display {

    public static int screenWidth = 1440;
    public static int screenHeight = 960;

    protected static Stage stage;

    public static void setStage(Stage stage) {
        SceneBase.stage = stage;
    }

    public static void initStage() {
        stage.setTitle("Coffee Chess");
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setResizable(false);
        /* Closing game */
        stage.setOnCloseRequest(e->{
            e.consume();
            Platform.exit();
            System.exit(0);
        });
    }
}
