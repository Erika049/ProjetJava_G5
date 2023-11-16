/**
 * The Main class serves as the entry point for the BoulderDash game.
 * It initializes the game components and starts the game loop.
 *
 * @author Laetitia, Arthur, Anthony
 * @version 1.0.8
 */
package main;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import contract.IController;
import contract.IModel;
import controller.Controller;
import model.DBConnection;
import model.Model;
import view.View;

import javax.swing.*;

/**
 * The Class Main.
 * This class contains the main method to start the BoulderDash game.
 * It initializes the game components and starts the game loop.
 * It also checks for necessary files and handles any missing files.
 *
 * @author GROUPE 5
 */
public abstract class Main {

    /** The filenames of required resources. */
    private static String[] filenames = new String[] {
            "niveau.txt", "Sprites/Space.png", "Sprites/Rock.png", "Sprites/Diamond.png",
            "Sprites/Door.png", "Sprites/Butterfly.png", "Sprites/Ground.png", "Sprites/Died.png",
            "Sprites/Down1.png", "Sprites/Left1.png", "Sprites/Stable.png", "Sprites/Right1.png",
            "Sprites/Up1.png", "Sprites/Win.png", "Sprites/Wall.png"
    };

    /** The game view. */
    private static View view;

    /** The game model. */
    private static IModel model;

    /** The game controller. */
    private static IController controller;

    /** The database connection. */
    private static DBConnection dbConnection;

    /**
     * The main method.
     *
     * @param args the command line arguments
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws InterruptedException the interrupted exception
     */
    public static void main(final String[] args) {
        file();
        checkFiles();
        game();

        System.exit(0);
    }

    /**
     * Checks for the existence of required files.
     */
    static void checkFiles() {
        File file;
        for (String filename : filenames) {
            file = new File(filename);
            if (!file.exists()) {
                JOptionPane.showMessageDialog(null, "File \"" + filename + "\" is missing.\nPlease put the file back in its place and then restart.", "BoulderDash - Error", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
                return;
            }
        }
    }

    /**
     * Creates the necessary files for the game.
     */
    static void file() {
        DBConnection db = new DBConnection();
        db.open();
        db.loadBD("map3");
        List<String> mapLines = db.loadBD("map3");
        db.saveToFile(mapLines, "niveau.txt");
        db.close();
    }

    /**
     * Initializes and starts the game loop.
     */
    static void game() {
        do {
            model = new Model(filenames[0], 1, 1);

            if (model.getMap().isCorrect()) {
                view = new View(model.getMap(), model.getMyPlayer());
                controller = new Controller(view, model);
                view.setOrderPerformer(controller.getOrderPerformer());

                controller.play();
            } else {
                JOptionPane.showMessageDialog(null, "The map isn't in the right format!\nCheck your map file (map.txt).", "BoulderDash - Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } while (true);
    }
}
