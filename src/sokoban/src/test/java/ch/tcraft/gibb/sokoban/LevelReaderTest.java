package ch.tcraft.gibb.sokoban;

import ch.tcraft.gibb.sokoban.io.LevelReader;
import org.junit.jupiter.api.Test;

public class LevelReaderTest {
    LevelReader levelReader = new LevelReader();

    @Test
    void readGoodFile(){
        try {
            levelReader.readFile("src/test/resources/goodlevels.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void readBadFile(){
        try {
            levelReader.readFile("src/test/resources/badlevels.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void goodString() {
        try {
            levelReader.readText("##########\n"+
                                      "##########\n"+
                                      "#######  #\n"+
                                      "### .# #.#\n"+
                                      "#     .  #\n"+
                                      "# #  $ $ #\n"+
                                      "# #####  #\n"+
                                      "##### $$.#\n"+
                                      "### @    #\n"+
                                      "##########\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void badString() {
        try {
            levelReader.readText("##########\n"+
                                      "##########\n"+
                                      "#######  #\n"+
                                      "### .# #.#\n"+
                                      "#     .  #.\n"+ //Error width
                                      "# #  $ $ #\n"+
                                      "# #####  #\n"+
                                      "##### $$.#\n"+
                                      "### @    #\n"+
                                      "##########\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
