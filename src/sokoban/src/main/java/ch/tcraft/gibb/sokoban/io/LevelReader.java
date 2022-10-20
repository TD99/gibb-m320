package ch.tcraft.gibb.sokoban.io;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LevelReader {
    public void readFile(String path) throws Exception {
        File file = new File(path);
        DocumentBuilderFactory dbf =  DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(file);
        doc.getDocumentElement().normalize();
        if (doc.getDocumentElement().getNodeName() != "levels") {
            throw new Exception("Validation error: Root element must be named 'levels'!");
        }
        NodeList nodeList = doc.getElementsByTagName("level");
        int ignored = 0;
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName() == "level") {
                Element element = (Element) node;
                if (element.getTextContent() != "") {
                    String name = element.getAttribute("name");
                    String description = element.getAttribute("description");
                    String content = element.getTextContent();
                    content = content.substring(content.indexOf("\n")+1);
                    String[] row = content.split("\n");

                    int width = row[0].length();
                    int height = row.length;

                    for (String s : row) { // Validation of game-board width
                        if (s.length() != width) {
                            throw new Exception("The width of a level is not consistent!");
                        }
                    }

                    System.out.println("Name: " + name);
                    System.out.println("Description: " + description);
                    System.out.println("Content: " + content);
                    System.out.println("Width: " + width);
                    System.out.println("Height: " + height);
                } else {
                    ignored++;
                }
            }
        }
        if (ignored > 0) {
            System.out.println("Ignored " + ignored + " corrupt Level(s)!");
        }
    }

    public void readText(String text, String... opt) throws Exception {
        String name = (opt.length > 0)?opt[0]:""; //opt[0]
        String description = (opt.length > 1)?opt[1]:""; //opt[1]
        String content = text;
        String[] row = content.split("\n");

        int width = row[0].length();
        int height = row.length;

        for (String s : row) { // Validation of game-board width
            if (s.length() != width) {
                throw new Exception("The width of a level is not consistent!");
            }
        }

        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Content: " + content);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }
}
