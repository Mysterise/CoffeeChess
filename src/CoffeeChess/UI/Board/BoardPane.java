package CoffeeChess.UI.Board;

import CoffeeChess.Model.Piece.Position;
import javafx.scene.Group;
import javafx.scene.layout.Pane;

public class BoardPane extends Pane {

    public static final int SQUARE_SIZE = 100;
    public static final int NUM_COLUMNS = 8;
    public static final int NUM_ROWS = 8;

    private Group squareGroup = new Group();

    public BoardPane() {
        this.getChildren().add(squareGroup);
        for (int row = 0; row < NUM_ROWS; row++) {
            for (int column = 0; column < NUM_COLUMNS; column++) {
                SquareStackPane squareStackPane = new SquareStackPane((column + row) % 2 == 0, new Position(column, row));
                squareGroup.getChildren().add(squareStackPane);
            }
        }
    }
}
