package CoffeeChess.Model.Piece;

import CoffeeChess.Model.Position;

public class Queen extends Piece {

    public Queen(boolean isWhite, Position pos) {
        super(isWhite, pos);
    }

    @Override
    protected String getName() {
        return "queen";
    }
}
