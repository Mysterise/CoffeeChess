package CoffeeChess.Display;

import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Base class for all CoffeeChess Scenes to inherit.
 */
public abstract class SceneBase extends Display {

    public static int screenWidth = 1440;
    public static int screenHeight = 960;

    private Stage stage;

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
