package CoffeeChess.UI;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

/**
 * Meta Class for defining display design choices
 */
public abstract class DisplayConfig {

    /*
     Colours
     */

    /**
     * Coffee-Themed Color Palette
     * [ESPRESSO, MOCHA, CAPPUCINO, LATTE, FLAT_WHITE] from https://www.color-hex.com/color-palette/30023
     *
     * Ordered from Dark -> Light
     */
    public static class ColorPalette {
        public static final Color LONG_BLACK = Color.rgb(30, 20, 10);
        public static final Color ESPRESSO = Color.rgb(56, 34, 15);
        public static final Color MOCHA = Color.rgb(99, 72, 50);
        public static final Color CAPPUCCINO = Color.rgb(150, 114, 89);
        public static final Color LATTE = Color.rgb(219, 193, 172);
        public static final Color FLAT_WHITE = Color.rgb(236, 224, 209);
    }

    public static final Color BACKGROUND_COLOR = ColorPalette.MOCHA;
    public static final Color BUTTON_COLOR = ColorPalette.ESPRESSO;
    public static final Color TEXT_COLOR = ColorPalette.FLAT_WHITE;

    public static String ColourToHexString(Color color) {
        return String.format("#%02x%02x%02x",
                (int) (color.getRed() * 255),
                (int) (color.getGreen() * 255),
                (int) (color.getBlue() * 255));
    }

    /*
     Fonts
     */

    public static final String FONT_FAMILY = "Verdana";
    public static final Font TITLE_FONT =  Font.font(FONT_FAMILY, FontWeight.BLACK, FontPosture.REGULAR, 100);
    public static final Font HEADING_FONT =  Font.font(FONT_FAMILY, FontWeight.BLACK, FontPosture.REGULAR, 75);
    public static final Font NORMAL_FONT = Font.font(FONT_FAMILY, FontWeight.SEMI_BOLD, FontPosture.REGULAR, 25);

}
