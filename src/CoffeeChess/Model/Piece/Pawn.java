package CoffeeChess.Model.Piece;

import CoffeeChess.Model.Position;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pawn extends Piece {

    protected Set<Position> relativeMoveSet = new HashSet<>(Arrays.asList(
            new Position(1, 0), // standard one-step move
            new Position(2, 0), // double-step move only for starting square
            // diagonal taking (including en passant)
            new Position(1, 1),
            new Position(1, -1)
    ));

    public Pawn (boolean isWhite, Position pos) {
        super(isWhite, pos);
        if (!isWhite) reverseRelativeMoveSet();
    }

    /**
     * Vertically reverses the Relative Move Set for this Pawn piece.
     * Called when Pawn is Black.
     * Enables the one-directional movement property for Pawns in Chess to be maintained without needing to create separate classes for White and Black Pawns.
     */
    private void reverseRelativeMoveSet() {
        for (Position relativeMove : relativeMoveSet) {
            relativeMove.setRow(-relativeMove.getRow());
        }
    }
}
