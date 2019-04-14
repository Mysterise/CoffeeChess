package CoffeeChess.Model.Piece;

import CoffeeChess.Model.Position;

public class Rook extends Piece {

    public Rook(boolean isWhite, Position pos) {
        super(isWhite, pos);
    }

    protected String getName() {
        return "rook";
    }
}
