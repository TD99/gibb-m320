package ch.tcraft.gibb.sokoban.menu.buttons;

import ch.tcraft.gibb.sokoban.menu.MenuItem;

public class ExitButton extends MenuItem {
    public ExitButton() {
        setMenuItemName("BEENDEN");
        setOnMouseClicked(event -> System.exit(0));
    }
}
