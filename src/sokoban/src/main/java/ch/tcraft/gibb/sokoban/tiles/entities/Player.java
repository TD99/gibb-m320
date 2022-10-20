package ch.tcraft.gibb.sokoban.tiles.entities;

import ch.tcraft.gibb.sokoban.tiles.Entity;
import javafx.scene.image.Image;

public class Player extends Entity {
    public Player(int[] coord, char symbol, Image image) {
        super(coord, symbol, image);
    }
}