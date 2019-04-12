package CoffeeChess.UI.Board;

import CoffeeChess.Model.Piece.Position;
import javafx.scene.Group;
import javafx.scene.layout.Pane;

public class BoardDisplay extends Pane {

    public static final int SQUARE_SIZE = 100;
    public static final int NUM_COLUMNS = 8;
    public static final int NUM_ROWS = 8;

    private Group squareGroup = new Group();
    private Group pieceGroup = new Group();

    public BoardDisplay() {
        this.getChildren().addAll(squareGroup, pieceGroup);
        for (int row = 0; row < NUM_ROWS; row++) {
            for (int column = 0; column < NUM_COLUMNS; column++) {
                SquareDisplay squareDisplay = new SquareDisplay((column + row) % 2 == 0, new Position(column, row));
//                PieceDisplay piece = new PieceDisplay(new Position(column, row));
                squareGroup.getChildren().add(squareDisplay);
//                pieceGroup.getChildren().addAll(piece);
            }
        }
    }
}
