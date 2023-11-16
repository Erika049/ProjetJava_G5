package model;

import entity.element.IElement;
import entity.element.IMap;
import entity.element.mobile.MobileElementFactory;
import entity.element.motionless.MotionlessElementFactory;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * <h1>The Map Class.</h1>
 * The Map class represents the game map and includes methods for loading map data from a file and managing elements on the map.
 * It extends the Observable class to notify observers of changes.
 *
 * @author GROUPE 5
 */
class Map extends Observable implements IMap {

    /** The width of the map. */
    private int width;

    /** The height of the map. */
    private int height;

    /** The 2D array representing elements on the map. */
    private IElement[][] onTheMap;

    /** Indicates whether the map is in the correct format. */
    private boolean isCorrect = true;

    /** A list of coordinates that have changed on the map. */
    private List<Integer> hasChanged = new ArrayList<>();

    /**
     * Instantiates a new map with the content of the file fileName.
     *
     * @param fileName the file name where the map is
     * @throws IOException Signals that an I/O exception has occurred.
     */
    Map(final String fileName) throws IOException {
        super();
        this.loadFile(fileName);
    }

    /**
     * Loads file.
     *
     * @param fileName the file name
     * @throws IOException Signals that an I/O exception has occurred.
     */
    private void loadFile(final String fileName) throws IOException {
        final BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        String line;

        try {
            line = buffer.readLine();
            this.setWidth(Integer.parseInt(line));
            line = buffer.readLine();
            this.setHeight(Integer.parseInt(line));
        } catch (Exception | Error e) {
            isCorrect = false;
        }

        if (isCorrect) {
            this.onTheMap = new IElement[this.getWidth()][this.getHeight()];

            int y = 0;
            line = buffer.readLine();
            while (line != null) {
                if (line.toCharArray().length == this.width) {
                    for (int x = 0; x < line.toCharArray().length; x++) {
                        if (line.toCharArray()[x] == 'R' || line.toCharArray()[x] == 'B' || line.toCharArray()[x] == 'D') {
                            this.setOnTheMapXY(MobileElementFactory.getFromFileSymbol(line.toCharArray()[x]), x, y);
                        } else {
                            this.setOnTheMapXY(MotionlessElementFactory.getFromFileSymbol(line.toCharArray()[x]), x, y);
                        }
                    }
                } else {
                    this.isCorrect = false;
                }
                line = buffer.readLine();
                y++;
            }
            buffer.close();

            if (y != this.height) {
                this.isCorrect = false;
            }
        }
    }

    /**
     * Gets element on the map at specified coordinates (x, y).
     *
     * @param x the x coordinate
     * @param y the y coordinate
     * @return the element on the map at coordinates (x, y)
     */
    @Override
    public final IElement getOnTheMapXY(final int x, final int y) {
        return this.onTheMap[x][y];
    }

    /**
     * Sets the element on the map at specified coordinates (x, y).
     *
     * @param element the element to set
     * @param x       the x coordinate
     * @param y       the y coordinate
     */
    public void setOnTheMapXY(IElement element, int x, int y) {
        this.onTheMap[x][y] = element;
        this.hasChanged.add(x);
        this.hasChanged.add(y);
    }

    /**
     * Notifies observers that mobile elements on the map have changed.
     */
    @Override
    public final void setMobileHasChanged() {
        this.setChanged();
        this.notifyObservers();
    }

    /**
     * Gets the width of the map.
     *
     * @return the width of the map
     */
    @Override
    public final int getWidth() {
        return this.width;
    }

    /**
     * Sets the width of the map.
     *
     * @param width the new width
     */
    private void setWidth(final int width) {
        this.width = width;
    }

    /**
     * Gets the height of the map.
     *
     * @return the height of the map
     */
    @Override
    public final int getHeight() {
        return this.height;
    }

    /**
     * Sets the height of the map.
     *
     * @param height the new height
     */
    private void setHeight(final int height) {
        this.height = height;
    }

    /**
     * Gets the observable for observing map changes.
     *
     * @return the observable
     */
    @Override
    public Observable getObservable() {
        return this;
    }

    /**
     * Checks if the map is in the correct format.
     *
     * @return true if the map is correct, false otherwise
     */
    public boolean isCorrect() {
        return isCorrect;
    }

    /**
     * Gets the list of coordinates that have changed on the map.
     *
     * @return the list of changed coordinates
     */
    public List<Integer> getHasChanged() {
        return hasChanged;
    }
}
