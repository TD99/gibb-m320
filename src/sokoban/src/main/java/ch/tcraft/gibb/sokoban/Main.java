package ch.tcraft.gibb.sokoban;

import ch.tcraft.gibb.sokoban.io.LevelReader;
import ch.tcraft.gibb.sokoban.menu.MainMenu;
import ch.tcraft.gibb.sokoban.tiles.entities.Player;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    private static Stage mainStage;

    @Override
    public void start(Stage stage) throws Exception {
        mainStage = stage;
        Scene scene = new Scene(new MainMenu().create());
        mainStage.setScene(scene);
        mainStage.initStyle(StageStyle.DECORATED);
        mainStage.setTitle("Sokoban Game");
        mainStage.show();
        mainStage.setMinWidth(720);
        mainStage.setMinHeight(480);
        mainStage.setWidth(1080);
        mainStage.setHeight(720);
        mainStage.setX((Screen.getPrimary().getBounds().getWidth()-mainStage.getWidth())/2);
        mainStage.setY((Screen.getPrimary().getBounds().getHeight()-mainStage.getHeight())/2);
        LevelReader levelReader = new LevelReader();
        try {
            levelReader.readFile("C:/Users/vmAdmin/Desktop/level1.xml");
        } catch (Exception e) {
            e.printStackTrace(); // Not Production!!!
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static Stage getMainStage() {
        return mainStage;
    }
    public static void setMainStage(Stage mainStage) {
        Main.mainStage = mainStage;
    }

}
