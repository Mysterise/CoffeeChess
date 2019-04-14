package CoffeeChess.Model.Piece;

import CoffeeChess.Model.Position;

public class Knight extends Piece {

    public Knight(boolean isWhite, Position pos) {
        super(isWhite, pos);
    }

    @Override
    protected String getName() {
        return "knight";
    }
}
