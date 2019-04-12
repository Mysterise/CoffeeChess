package CoffeeChess.Model;

import CoffeeChess.Model.Board.Board;

public class ModelManager {
    private Board board = new Board();

    public ModelManager() {
        board = new Board();
    }

    public Board getBoard() {
        return board;
    }
}
