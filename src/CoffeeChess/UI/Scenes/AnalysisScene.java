package CoffeeChess.UI.Scenes;

import CoffeeChess.UI.Board.BoardPane;
import CoffeeChess.UI.DisplayConfig;
import CoffeeChess.UI.UIManager;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class AnalysisScene extends SceneBase {

    public AnalysisScene(UIManager UIManager) {
        this.UIManager = UIManager;

        /* Title */
        Label titleLabel = new Label("Analysis Board");
        titleLabel.setTextFill(DisplayConfig.TEXT_COLOR);
        titleLabel.setFont(DisplayConfig.HEADING_FONT);

        /* Menu Button */
        Button menuButton = new Button();
        menuButton.setText("Menu");
        menuButton.setOnAction(e -> UIManager.startMenuScene());

        BoardPane boardPane = new BoardPane();

        /* Creating Layout */
        FlowPane analysisLayout = new FlowPane();
        analysisLayout.setStyle("-fx-background-color: " + DisplayConfig.ColourToHexString(DisplayConfig.BACKGROUND_COLOR));
        analysisLayout.setPadding(new Insets(30, 30, 30, 30));
        analysisLayout.setAlignment(Pos.CENTER);

        // Adding all nodes to analysisLayout
        analysisLayout.getChildren().addAll(titleLabel, boardPane, menuButton);
        // Modifying all button nodes
        for (Node menuChild : analysisLayout.getChildren()) {
            if (menuChild.getClass().getName().equals("javafx.scene.control.Button")) {
                Button button = (Button) menuChild;
                button.setPrefSize(250, 60);
                button.setStyle("-fx-background-color: " + DisplayConfig.ColourToHexString(DisplayConfig.BUTTON_COLOR));
                button.setTextFill(DisplayConfig.TEXT_COLOR);
                button.setFont(DisplayConfig.NORMAL_FONT);
            }
        }

        this.scene = new Scene(analysisLayout, UIManager.screenWidth, UIManager.screenHeight);
    }
}
