package CoffeeChess.UI.Board;

import CoffeeChess.Model.Board.Board;
import CoffeeChess.Model.Position;
import javafx.scene.Group;
import javafx.scene.layout.Pane;

public class BoardPane extends Pane {

    public static final int SQUARE_SIZE = 100;
    public static final int NUM_ROWS = Board.NUM_ROWS;
    public static final int NUM_COLUMNS = Board.NUM_COLUMNS;

    private Group squareGroup = new Group();

    public BoardPane() {
        this.getChildren().add(squareGroup);
        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLUMNS; col++) {
                SquareStackPane squareStackPane = new SquareStackPane((col + row) % 2 == 0, new Position(col, row));
                squareGroup.getChildren().add(squareStackPane);
            }
        }
    }
}
