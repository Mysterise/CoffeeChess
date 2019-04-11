package CoffeeChess.Model.Piece;

public abstract class Piece {

    private Position pos;
    private boolean isWhite;

    public Piece (boolean isWhite, Position pos) {
        this.isWhite = isWhite;
        this.pos = pos;
    }

    public abstract boolean move(Position pos);

}
