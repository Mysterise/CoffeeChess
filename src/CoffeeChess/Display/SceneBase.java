package CoffeeChess.Display;

import javafx.stage.Stage;

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
}
