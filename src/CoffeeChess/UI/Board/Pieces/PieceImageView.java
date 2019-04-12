package CoffeeChess.UI.Board.Pieces;

import CoffeeChess.UI.Board.BoardPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PieceImageView extends ImageView {

    public PieceImageView() {
        Image img = new Image("CoffeeChess/UI/Board/Pieces/PNGs/b_king.png");
        setImage(img);
        setFitHeight(BoardPane.SQUARE_SIZE);
        setFitWidth(BoardPane.SQUARE_SIZE);
    }
}
