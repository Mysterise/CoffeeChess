package CoffeeChess.UI.Scenes;

import javafx.scene.Scene;

/**
 * Base class for all CoffeeChess Scenes to inherit.
 *
 * Contains a static stage reference for the application's only stage window.
 */
public abstract class SceneBase {
    protected SceneManager sceneManager;
    protected Scene scene;

    public Scene getScene() {
        return scene;
    }
}
