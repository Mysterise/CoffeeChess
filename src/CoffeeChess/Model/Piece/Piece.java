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

//    public abstract boolean move(Position pos);

}
