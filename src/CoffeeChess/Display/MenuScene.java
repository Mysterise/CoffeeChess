package CoffeeChess.Display;

import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class MenuScene extends SceneBase {

    public MenuScene (Stage stage) {
        setStage(stage);
        getStage().setTitle("Coffee Chess");

        /* Closing game */
        getStage().setOnCloseRequest(e->{
            e.consume();
            Platform.exit();
            System.exit(0);
        });

        /* Title */
        Label titleLabel = new Label("Coffee Chess");
        titleLabel.setTextFill(TEXT_COLOR);
        titleLabel.setFont(TITLE_FONT);

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
        // Adding all children
        menuLayout.getChildren().addAll(titleLabel, analysisButton, closeButton);
        menuLayout.setStyle("-fx-background-color: " + Display.ColourToStringHex(BACKGROUND_COLOR));
        menuLayout.setPadding(new Insets(30, 30, 30, 30));
        menuLayout.setAlignment(Pos.CENTER);

        for (Node menuChild : menuLayout.getChildren()) {
            if (menuChild.getClass().getName().equals("javafx.scene.control.Button")) {
                Button button = (Button) menuChild;
                button.setPrefSize(250, 60);
                button.setStyle("-fx-background-color: " + Display.ColourToStringHex(BUTTON_COLOR));
                button.setTextFill(TEXT_COLOR);
                button.setFont(NORMAL_FONT);
            }
        }

        getStage().setScene(new Scene(menuLayout, screenWidth, screenHeight));
        getStage().show();
    }

    private void startAnalysis() {
        new AnalysisScene(getStage());
    }
}
