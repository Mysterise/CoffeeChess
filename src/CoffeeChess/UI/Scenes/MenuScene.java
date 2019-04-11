package CoffeeChess.UI.Scenes;

import CoffeeChess.UI.Display;
import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

/**
 * Coffee Chess Main Menu Scene
 *
 * Contains the core navigational structure to the rest of Coffee Chess.
 */
public class MenuScene extends SceneBase {

    public MenuScene () {

        /* Title */
        Label titleLabel = new Label("Coffee Chess");
        titleLabel.setTextFill(Display.TEXT_COLOR);
        titleLabel.setFont(Display.TITLE_FONT);

        /* Analysis Button*/
        Button analysisButton = new Button();
        analysisButton.setText("Analysis Board");
        analysisButton.setOnAction(e -> startAnalysis());

        /* Quit Button */
        Button closeButton = new Button();
        closeButton.setText("Quit");
        closeButton.setOnAction(e -> Platform.exit());

        /* Creating Layout */
        VBox menuLayout = new VBox(20);
        menuLayout.setStyle("-fx-background-color: " + Display.ColourToStringHex(Display.BACKGROUND_COLOR));
        menuLayout.setPadding(new Insets(30, 30, 30, 30));
        menuLayout.setAlignment(Pos.CENTER);

        // Adding all nodes to menuLayout
        menuLayout.getChildren().addAll(titleLabel, analysisButton, closeButton);
        // Modifying all nodes
        for (Node menuChild : menuLayout.getChildren()) {
            if (menuChild.getClass().getName().equals("javafx.scene.control.Button")) {
                Button button = (Button) menuChild;
                button.setPrefSize(250, 60);
                button.setStyle("-fx-background-color: " + Display.ColourToStringHex(Display.BUTTON_COLOR));
                button.setTextFill(Display.TEXT_COLOR);
                button.setFont(Display.NORMAL_FONT);
            }
        }

        stage.setScene(new Scene(menuLayout, screenWidth, screenHeight));
        stage.show();
    }

    private void startAnalysis() {
        new AnalysisScene();
    }
}
