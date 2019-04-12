package CoffeeChess.UI.Board;

import CoffeeChess.UI.Board.Pieces.PieceDisplay;
import CoffeeChess.Model.Piece.Position;
import CoffeeChess.UI.Display;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;

public class SquareDisplay extends StackPane {
    private static final int size = BoardDisplay.SQUARE_SIZE;

    private Rectangle squareCell;
    private PieceDisplay pieceDisplay;

    public SquareDisplay(boolean light, Position pos) {
        squareCell = new Rectangle();
        squareCell.setWidth(size);
        squareCell.setHeight(size);
        squareCell.setFill(light ? Display.ColorPalette.FLAT_WHITE : Display.ColorPalette.LATTE);

        pieceDisplay = new PieceDisplay();

        getChildren().addAll(squareCell, pieceDisplay);

        // size * (BoardDisplay.NUM_ROWS - 1) - pos.getRow() * size
        // This is to have the coordinates be like cartesian coordinates where (0,0) represents the bottom-left,
        // rather than the top-left.
        relocate(pos.getColumn() * size, size * (BoardDisplay.NUM_ROWS - 1) - pos.getRow() * size);
    }

    public boolean hasPiece() {
        return pieceDisplay != null;
    }

    public PieceDisplay getPieceDisplay() {
        return pieceDisplay;
    }

    public void setPiece() {
        this.pieceDisplay = pieceDisplay;
    }
}
