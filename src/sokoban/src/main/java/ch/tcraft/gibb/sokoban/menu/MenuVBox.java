package ch.tcraft.gibb.sokoban.menu;

import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class MenuVBox extends VBox {
    public MenuVBox(MenuItem... items) {
        getChildren().add(insertSeparator());

        for (MenuItem item : items) {
            getChildren().addAll(item, insertSeparator());
        }
    }

    private Line insertSeparator() {
        Line lineSeparator = new Line();
        lineSeparator.setEndX(220);
        lineSeparator.setStroke(Color.DARKGRAY);
        return lineSeparator;
    }
}
