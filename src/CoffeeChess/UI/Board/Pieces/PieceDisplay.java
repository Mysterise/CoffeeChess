package CoffeeChess.UI.Board.Pieces;

import CoffeeChess.UI.Board.BoardDisplay;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PieceDisplay extends ImageView {

    public PieceDisplay() {
        Image img = new Image("CoffeeChess/UI/Board/Pieces/PNGs/b_king.png");
        setImage(img);
        setFitHeight(BoardDisplay.SQUARE_SIZE);
        setFitWidth(BoardDisplay.SQUARE_SIZE);
    }
}
