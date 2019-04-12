package CoffeeChess.UI.Scenes;

import CoffeeChess.UI.Display;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class SceneManager extends Display {

    public static int screenWidth = 1440;
    public static int screenHeight = 960;

    private static Stage stage;
    private Scene currentScene;

    private MenuScene menuScene = new MenuScene(this);
    private AnalysisScene analysisScene = new AnalysisScene(this);

    public SceneManager(Stage stage) {
        this.stage = stage;
        initStage();
    }

    private static void initStage() {
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

    public void startAnalysisScene() {
        showScene(analysisScene);
    }

    public void startMenuScene() {
        showScene(menuScene);
    }

    private void showScene(SceneBase sceneBase) {
        stage.setScene(new Scene(sceneBase.root, screenWidth, screenHeight));
        stage.show();
    }
}
