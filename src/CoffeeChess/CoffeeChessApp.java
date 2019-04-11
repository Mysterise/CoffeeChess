package CoffeeChess;

import CoffeeChess.Board.Square;
import CoffeeChess.Piece.Position;
import javafx.application.Application;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class CoffeeChessApp extends Application {

    public static final int SCREEN_WIDTH = 1440;
    public static final int SCREEN_HEIGHT = 960;

    public static final int SQUARE_SIZE = 100;
    public static final int NUM_COLUMNS = 8;
    public static final int NUM_ROWS = 8;

    private Stage primaryStage;

    public Pane chessBoard;

    private Group squareGroup = new Group();
    private Group pieceGroup = new Group();

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Coffee Chess");
        primaryStage.initStyle(StageStyle.DECORATED);

        Parent root = FXMLLoader.load(getClass().getResource("FXML/menuScene.fxml"));
        Scene menuScene = new Scene(root, SCREEN_WIDTH, SCREEN_HEIGHT);
        menuScene.getStylesheets().add(getClass().getResource("FXML/menuScene.css").toExternalForm());

        primaryStage.setScene(menuScene);
        primaryStage.show();
    }

    @FXML
    public void enterAnalysisScene(Event e) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/analysisScene.fxml"));
        loader.setController(this);
        Parent root = loader.load();

        Scene analysisScene = new Scene(root, SCREEN_WIDTH, SCREEN_HEIGHT);
        analysisScene.getStylesheets().add(getClass().getResource("FXML/menuScene.css").toExternalForm());

        chessBoard.getChildren().addAll(squareGroup, pieceGroup);
        for (int row = 0; row < NUM_ROWS; row++) {
            for (int column = 0; column < NUM_COLUMNS; column++) {
                Square square = new Square((column + row) % 2 == 0, new Position(column, row));
                squareGroup.getChildren().add(square);
            }
        }

        Stage window = getPrimaryStageFromEvent(e);
        window.setScene(analysisScene);
        window.show();
    }

    private Stage getPrimaryStageFromEvent(Event e) {
        return (Stage)((Node)e.getSource()).getScene().getWindow();
    }
}
