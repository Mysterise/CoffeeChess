package CoffeeChess.Model.Piece;

import CoffeeChess.Model.Position;

public class Bishop extends Piece {

    public Bishop(boolean isWhite, Position pos) {
        super(isWhite, pos);
    }

    @Override
    protected String getName() {
        return "bishop";
    }
}
