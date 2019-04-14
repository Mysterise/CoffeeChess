package CoffeeChess.UI.Board.Pieces;

import CoffeeChess.Model.Piece.Piece;
import CoffeeChess.UI.Board.BoardPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PieceImageView extends ImageView {

    private static final String PATH = "CoffeeChess/UI/Board/Pieces/PNGs/";
    private static final String FILE_EXT = ".png";

    public PieceImageView(Piece piece) {
        if (piece == null) return;
        Image img = new Image(PATH + piece.toString() + FILE_EXT);
        setImage(img);
        setFitHeight(BoardPane.SQUARE_SIZE);
        setFitWidth(BoardPane.SQUARE_SIZE);
    }
}
