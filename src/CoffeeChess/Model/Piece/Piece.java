package CoffeeChess.Model.Piece;

import CoffeeChess.Model.Position;

import java.util.Set;

public abstract class Piece {

    public boolean isWhite;

    protected Position pos;
    protected Set<Position> relativeMoveSet;

    public Piece (boolean isWhite, Position pos) {
        this.isWhite = isWhite;
        this.pos = pos;
    }

    @Override
    public abstract String toString();

    /**
     * Helper method for toString()
     * @return 'w' or 'b' depending on isWhite
     */
    protected char colorNotation() {
        return this.isWhite ? 'w' : 'b';
    }

//    public abstract boolean move(Position pos);

}
