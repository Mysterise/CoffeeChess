package CoffeeChess.UI.Board;

import CoffeeChess.Model.Piece.Piece;
import CoffeeChess.UI.Board.Pieces.PieceImageView;
import CoffeeChess.Model.Position;
import CoffeeChess.UI.DisplayConfig;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;

public class SquareStackPane extends StackPane {
    private static final int size = BoardPane.SQUARE_SIZE;

    private Rectangle squareCell;
    private PieceImageView pieceImageView;

    public SquareStackPane(boolean light, Position pos, Piece piece) {
        squareCell = new Rectangle();
        squareCell.setWidth(size);
        squareCell.setHeight(size);
        squareCell.setFill(light ? DisplayConfig.ColorPalette.FLAT_WHITE : DisplayConfig.ColorPalette.LATTE);

        pieceImageView = new PieceImageView(piece);

        getChildren().addAll(squareCell, pieceImageView);

        // size * (BoardPane.NUM_ROWS - 1) - pos.getRow() * size
        // This is to have the coordinates be like cartesian coordinates where (0,0) represents the bottom-left,
        // rather than the top-left.
        relocate(pos.getColumn() * size, size * (BoardPane.NUM_ROWS - 1) - pos.getRow() * size);
    }

    public boolean hasPiece() {
        return pieceImageView != null;
    }

    public PieceImageView getPieceImageView() {
        return pieceImageView;
    }

    public void setPiece() {
        this.pieceImageView = pieceImageView;
    }
}
