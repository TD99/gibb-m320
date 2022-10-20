package ch.tcraft.gibb.sokoban.menu;

import ch.tcraft.gibb.sokoban.Main;
import ch.tcraft.gibb.sokoban.menu.buttons.ExitButton;
import ch.tcraft.gibb.sokoban.menu.buttons.PlayButton;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class MainMenu {
    public Parent create() {
        StackPane root = new StackPane();

        //root.setPrefSize(1080, 720);

        ImageView imageView = new ImageView(new Image("/warehouse.jpg"));
        imageView.fitHeightProperty().bind(root.heightProperty());
        imageView.fitWidthProperty().bind(root.widthProperty());

        root.getChildren().add(imageView);

        MenuTitle menuTitle = new MenuTitle("SOKOBAN");
        menuTitle.setTranslateY(-200);

        MenuVBox vBoxMenuBox = new MenuVBox(
            new PlayButton(), new ExitButton()
        );

        vBoxMenuBox.setAlignment(Pos.CENTER);

        root.getChildren().addAll(menuTitle, vBoxMenuBox);

        return root;
    }
}
