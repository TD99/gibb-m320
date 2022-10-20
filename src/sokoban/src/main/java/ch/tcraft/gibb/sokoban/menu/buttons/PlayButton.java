package ch.tcraft.gibb.sokoban.menu.buttons;

import ch.tcraft.gibb.sokoban.Main;
import ch.tcraft.gibb.sokoban.menu.MenuItem;
import javafx.scene.layout.StackPane;

public class PlayButton extends MenuItem {
    public PlayButton() {
        setMenuItemName("SPIELEN");
        setOnMouseClicked(event -> {
            StackPane stackPane = (StackPane) Main.getMainStage().getScene().getRoot();
        });
    }
}
