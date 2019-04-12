package CoffeeChess.UI.Scenes;

import CoffeeChess.UI.Display;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class AnalysisScene extends SceneBase {

    public AnalysisScene(SceneManager sceneManager) {
        this.sceneManager = sceneManager;

        /* Title */
        Label titleLabel = new Label("Coffee Chess");
        titleLabel.setTextFill(Display.TEXT_COLOR);
        titleLabel.setFont(Display.TITLE_FONT);

        /* Quit Button */
        Button closeButton = new Button();
        closeButton.setText("Quit");
        closeButton.setOnAction(e -> Platform.exit());

        /* Creating Layout */
        VBox menuLayout = new VBox(20);
        menuLayout.setStyle("-fx-background-color: " + Display.ColourToHexString(Display.BACKGROUND_COLOR));
        menuLayout.setPadding(new Insets(30, 30, 30, 30));
        menuLayout.setAlignment(Pos.CENTER);

        // Adding all nodes to menuLayout
        menuLayout.getChildren().addAll(titleLabel, closeButton);
        // Modifying all nodes
        for (Node menuChild : menuLayout.getChildren()) {
            if (menuChild.getClass().getName().equals("javafx.scene.control.Button")) {
                Button button = (Button) menuChild;
                button.setPrefSize(250, 60);
                button.setStyle("-fx-background-color: " + Display.ColourToHexString(Display.BUTTON_COLOR));
                button.setTextFill(Display.TEXT_COLOR);
                button.setFont(Display.NORMAL_FONT);
            }
        }

        root = menuLayout;
    }
}
