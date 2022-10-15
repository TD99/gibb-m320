module ch.tcraft.gibb.sokoban {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens ch.tcraft.gibb.sokoban to javafx.fxml;
    exports ch.tcraft.gibb.sokoban;
}