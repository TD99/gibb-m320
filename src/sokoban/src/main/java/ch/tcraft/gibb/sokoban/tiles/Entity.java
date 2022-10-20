package ch.tcraft.gibb.sokoban.tiles;

import javafx.scene.image.Image;

public abstract class Entity {
    private static int[] coord; // opt
    private static char symbol;
    private static Image image;

    public Entity(int[] coord, char symbol, Image image) {
        this.coord = coord;
        this.symbol = symbol;
        this.image = image;
    }

    public static int[] getCoord() {
        return coord;
    }
    public static void setCoord(int[] coord) {
        Entity.coord = coord;
    }

    public char getSymbol() {
        return symbol;
    }
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public Image getImage() {
        return image;
    }
    public void setImage(Image image) {
        this.image = image;
    }
}
