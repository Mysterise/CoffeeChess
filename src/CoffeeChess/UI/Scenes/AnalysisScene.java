package CoffeeChess.UI.Scenes;

import CoffeeChess.UI.Board.BoardDisplay;
import CoffeeChess.UI.Display;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class AnalysisScene extends SceneBase {

    public AnalysisScene(SceneManager sceneManager) {
        this.sceneManager = sceneManager;

        /* Title */
        Label titleLabel = new Label("Analysis BoardDisplay");
        titleLabel.setTextFill(Display.TEXT_COLOR);
        titleLabel.setFont(Display.TITLE_FONT);

        /* Menu Button */
        Button menuButton = new Button();
        menuButton.setText("Menu");
        menuButton.setOnAction(e -> sceneManager.startMenuScene());

        BoardDisplay boardDisplay = new BoardDisplay();

        /* Creating Layout */
        FlowPane analysisLayout = new FlowPane();
        analysisLayout.setStyle("-fx-background-color: " + Display.ColourToHexString(Display.BACKGROUND_COLOR));
        analysisLayout.setPadding(new Insets(30, 30, 30, 30));
        analysisLayout.setAlignment(Pos.CENTER);

        // Adding all nodes to analysisLayout
        analysisLayout.getChildren().addAll(titleLabel, boardDisplay, menuButton);
        // Modifying all button nodes
        for (Node menuChild : analysisLayout.getChildren()) {
            if (menuChild.getClass().getName().equals("javafx.scene.control.Button")) {
                Button button = (Button) menuChild;
                button.setPrefSize(250, 60);
                button.setStyle("-fx-background-color: " + Display.ColourToHexString(Display.BUTTON_COLOR));
                button.setTextFill(Display.TEXT_COLOR);
                button.setFont(Display.NORMAL_FONT);
            }
        }

        this.scene = new Scene(analysisLayout, sceneManager.screenWidth, sceneManager.screenHeight);
    }
}
