package CoffeeChess.Model.Board;

import CoffeeChess.Model.Piece.*;
import CoffeeChess.Model.Position;

public class Board {

    public static final int NUM_ROWS = 8;
    public static final int NUM_COLUMNS = 8;

    public static final int COL_A = 0;
    public static final int COL_B = 1;
    public static final int COL_C = 2;
    public static final int COL_D = 3;
    public static final int COL_E = 4;
    public static final int COL_F = 5;
    public static final int COL_G = 6;
    public static final int COL_H = 7;

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
        state[WHITE_ROW][COL_A] = new Rook(true, new Position(WHITE_ROW, COL_A));
        state[WHITE_ROW][COL_H] = new Rook(true, new Position(WHITE_ROW, COL_H));
        state[BLACK_ROW][COL_A] = new Rook(false, new Position(BLACK_ROW, COL_A));
        state[BLACK_ROW][COL_H] = new Rook(false, new Position(BLACK_ROW, COL_H));

        /* Setup Knights */
        state[WHITE_ROW][COL_B] = new Knight(true, new Position(WHITE_ROW, COL_A));
        state[WHITE_ROW][COL_G] = new Knight(true, new Position(WHITE_ROW, COL_G));
        state[BLACK_ROW][COL_B] = new Knight(false, new Position(BLACK_ROW, COL_A));
        state[BLACK_ROW][COL_G] = new Knight(false, new Position(BLACK_ROW, COL_G));

        /* Setup Bishops */
        state[WHITE_ROW][COL_C] = new Bishop(true, new Position(WHITE_ROW, COL_C));
        state[WHITE_ROW][COL_F] = new Bishop(true, new Position(WHITE_ROW, COL_F));
        state[BLACK_ROW][COL_C] = new Bishop(false, new Position(BLACK_ROW, COL_C));
        state[BLACK_ROW][COL_F] = new Bishop(false, new Position(BLACK_ROW, COL_F));

        /* Setup Queens */
        state[WHITE_ROW][COL_D] = new Queen(true, new Position(WHITE_ROW, COL_D));
        state[BLACK_ROW][COL_D] = new Queen(false, new Position(BLACK_ROW, COL_D));

        /* Setup Kings */
        state[WHITE_ROW][COL_E] = new King(true, new Position(WHITE_ROW, COL_E));
        state[BLACK_ROW][COL_E] = new King(false, new Position(BLACK_ROW, COL_E));
    }

    public Piece[][] getState() {
        return state;
    }
}
