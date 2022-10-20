package ch.tcraft.gibb.sokoban.menu;

import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class MenuTitle extends StackPane {
    public MenuTitle(String value) {
        Rectangle bg = new Rectangle();
        bg.setFill(Color.rgb(0, 0, 0, 0.7));

        Text text = new Text(value);
        text.setFill(Color.BLACK);
        text.setFont(Font.font("Segoe UI", FontWeight.BOLD, 50));

        setAlignment(Pos.CENTER);
        getChildren().addAll(bg, text);
    }
}
