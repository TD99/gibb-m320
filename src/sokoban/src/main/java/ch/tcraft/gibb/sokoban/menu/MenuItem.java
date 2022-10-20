package ch.tcraft.gibb.sokoban.menu;

import ch.tcraft.gibb.sokoban.Main;
import javafx.scene.Cursor;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class MenuItem extends StackPane {
    private String menuItemName;
    private Text text;

    public MenuItem() {
        Rectangle rectangleBorder = new Rectangle(280, 50);
        rectangleBorder.setOpacity(0.4);

        text = new Text();
        text.setFill(Color.WHITE);
        text.setFont(Font.font("Segoe UI", 39));

        getChildren().addAll(rectangleBorder, text);

        setOnMouseEntered(event -> hoverEffect(text));

        setOnMouseExited(event -> blurEffect(text));
    }

    public void setMenuItemName(String menuItemName) {
        this.menuItemName = menuItemName;
        text.setText(menuItemName);
    }

    public void hoverEffect(Text t) {
        t.setFill(Color.LIGHTGREY);
        Main.getMainStage().getScene().setCursor(Cursor.HAND);
    }

    public void blurEffect(Text t) {
        t.setFill(Color.WHITE);
        Main.getMainStage().getScene().setCursor(Cursor.DEFAULT);
    }
}
