package CoffeeChess.UI;

import CoffeeChess.UI.Scenes.AnalysisScene;
import CoffeeChess.UI.Scenes.MenuScene;
import CoffeeChess.UI.Scenes.SceneBase;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class UIManager extends DisplayConfig {

    public static int screenWidth = 1440;
    public static int screenHeight = 960;

    private static Stage stage;

    private MenuScene menuScene = new MenuScene(this);
    private AnalysisScene analysisScene = new AnalysisScene(this);

    public UIManager(Stage stage) {
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
        stage.setScene(sceneBase.getScene());
        stage.show();
    }
}
