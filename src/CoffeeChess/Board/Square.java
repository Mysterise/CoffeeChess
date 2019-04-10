package CoffeeChess.Board;

import CoffeeChess.CoffeeChessApp;
import CoffeeChess.Piece.Piece;
import CoffeeChess.Piece.Position;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Square extends Rectangle {
    private Piece piece;

    public Square(boolean light, Position pos) {
        setWidth(CoffeeChessApp.SQUARE_SIZE);
        setHeight(CoffeeChessApp.SQUARE_SIZE);
        relocate(pos.x * CoffeeChessApp.SQUARE_SIZE, pos.y * CoffeeChessApp.SQUARE_SIZE);
        setFill(light ? Color.WHITE : Color.BROWN);
    }

    public boolean hasPiece() {
        return piece != null;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece() {
        this.piece = piece;
    }
}
