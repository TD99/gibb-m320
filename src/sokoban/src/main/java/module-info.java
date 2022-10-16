module ch.tcraft.gibb.sokobanv1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ch.tcraft.gibb.sokoban to javafx.fxml;
    exports ch.tcraft.gibb.sokoban;
}