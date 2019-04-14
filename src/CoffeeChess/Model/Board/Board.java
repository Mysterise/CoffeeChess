package CoffeeChess.Model.Board;

import CoffeeChess.Model.Piece.*;
import CoffeeChess.Model.Position;

public class Board {

    public static final int NUM_ROWS = 8;
    public static final int NUM_COLUMNS = 8;

    public static class Col {
        public static final int A = 0, B = 1, C = 2, D = 3, E = 4, F = 5, G = 6, H = 7;
    }

    private Piece[][] state = new Piece[NUM_ROWS][NUM_COLUMNS];

    public Board() {
        setupInitialBoardState();
    }

    private void setupInitialBoardState() {
        state = new Piece[NUM_ROWS][NUM_COLUMNS];

        final int WHITE_ROW = 0, WHITE_PAWN_ROW = WHITE_ROW + 1;
        final int BLACK_ROW = NUM_ROWS - 1, BLACK_PAWN_ROW = BLACK_ROW - 1;

        /* Setup Pawns */
        for (int col = 0; col < NUM_COLUMNS; col++) {
            state[WHITE_PAWN_ROW][col] = new Pawn(true, new Position(WHITE_PAWN_ROW, col));
            state[BLACK_PAWN_ROW][col] = new Pawn(false, new Position(BLACK_PAWN_ROW, col));
        }

        /* Setup Rooks */
        state[WHITE_ROW][Col.A] = new Rook(true, new Position(WHITE_ROW, Col.A));
        state[WHITE_ROW][Col.H] = new Rook(true, new Position(WHITE_ROW, Col.H));
        state[BLACK_ROW][Col.A] = new Rook(false, new Position(BLACK_ROW, Col.A));
        state[BLACK_ROW][Col.H] = new Rook(false, new Position(BLACK_ROW, Col.H));

        /* Setup Knights */
        state[WHITE_ROW][Col.B] = new Knight(true, new Position(WHITE_ROW, Col.B));
        state[WHITE_ROW][Col.G] = new Knight(true, new Position(WHITE_ROW, Col.G));
        state[BLACK_ROW][Col.B] = new Knight(false, new Position(BLACK_ROW, Col.B));
        state[BLACK_ROW][Col.G] = new Knight(false, new Position(BLACK_ROW, Col.G));

        /* Setup Bishops */
        state[WHITE_ROW][Col.C] = new Bishop(true, new Position(WHITE_ROW, Col.C));
        state[WHITE_ROW][Col.F] = new Bishop(true, new Position(WHITE_ROW, Col.F));
        state[BLACK_ROW][Col.C] = new Bishop(false, new Position(BLACK_ROW, Col.C));
        state[BLACK_ROW][Col.F] = new Bishop(false, new Position(BLACK_ROW, Col.F));

        /* Setup Queens */
        state[WHITE_ROW][Col.D] = new Queen(true, new Position(WHITE_ROW, Col.D));
        state[BLACK_ROW][Col.D] = new Queen(false, new Position(BLACK_ROW, Col.D));

        /* Setup Kings */
        state[WHITE_ROW][Col.E] = new King(true, new Position(WHITE_ROW, Col.E));
        state[BLACK_ROW][Col.E] = new King(false, new Position(BLACK_ROW, Col.E));
    }

    public Piece[][] getState() {
        return state;
    }
}
