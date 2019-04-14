package CoffeeChess.Model.Piece;

import CoffeeChess.Model.Position;

public class King extends Piece {

    public King(boolean isWhite, Position pos) {
        super(isWhite, pos);
    }

    @Override
    protected String getName() {
        return "king";
    }
}
