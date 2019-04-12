package CoffeeChess.Model.Board;

import CoffeeChess.Model.Piece.Pawn;
import CoffeeChess.Model.Piece.Piece;
import CoffeeChess.Model.Position;

public class Board {

    public static final int NUM_ROWS = 8;
    public static final int NUM_COLUMNS = 8;

    private Piece[][] board;

    public Board() {
        setupInitialBoardState();
    }

    private void setupInitialBoardState() {
        board = new Piece[NUM_ROWS][NUM_COLUMNS];

        final int WHITE_ROW = 0, WHITE_PAWN_ROW = WHITE_ROW + 1;
        final int BLACK_ROW = NUM_ROWS - 1, BLACK_PAWN_ROW = BLACK_ROW - 1;

        /* Setup pawns */
        for (int col = 0; col < NUM_COLUMNS; col++) {
            board[WHITE_PAWN_ROW][col] = new Pawn(true, new Position(WHITE_PAWN_ROW, col));
            board[BLACK_PAWN_ROW][col] = new Pawn(false, new Position(BLACK_PAWN_ROW, col));
        }
    }
}
