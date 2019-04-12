package CoffeeChess.UI.Board;

import CoffeeChess.CoffeeChessApp;
import CoffeeChess.Model.Board.Board;
import CoffeeChess.Model.Piece.Piece;
import CoffeeChess.Model.Position;
import javafx.scene.Group;
import javafx.scene.layout.Pane;

public class BoardPane extends Pane {

    public static final int SQUARE_SIZE = 100;
    public static final int NUM_ROWS = Board.NUM_ROWS;
    public static final int NUM_COLUMNS = Board.NUM_COLUMNS;

    private Group squareGroup = new Group();

    public BoardPane() {
        Piece[][] pieces = CoffeeChessApp.ModelManager.getBoard().getState();
        this.getChildren().add(squareGroup);
        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLUMNS; col++) {
                SquareStackPane squareStackPane = new SquareStackPane((row + col) % 2 == 0, new Position(row, col), pieces[row][col]);
                squareGroup.getChildren().add(squareStackPane);
            }
        }
    }
}
