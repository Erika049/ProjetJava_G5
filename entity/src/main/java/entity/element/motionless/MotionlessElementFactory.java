package entity.element.motionless;

import entity.element.IElement;

import java.io.IOException;

/**
 * The MotionlessElementFactory class is a factory to create MotionlessElement objects.
 * It provides methods to create specific motionless elements such as wall, door, background, and ground.
 * It also allows getting the appropriate MotionlessElement based on a file symbol.
 *
 * @author GROUPE 5

 */
public abstract class MotionlessElementFactory {

    /** The wall. */
    private static final Wall wall = new Wall();

    /** The door. */
    private static final Door door = new Door();

    /** The background. */
    private static final Space background = new Space();

    /** The ground. */
    private static final Ground ground = new Ground();

    /** The motionless elements array, containing all possible MotionlessElement objects. */
    private static MotionlessElement[] motionlessElements = { wall, background, door, ground };

    /**
     * Creates a wall.
     *
     * @return the created wall
     */
    public static MotionlessElement createWall() {
        return wall;
    }

    /**
     * Creates a door.
     *
     * @return the created door
     */
    public static MotionlessElement createDoor() {
        return door;
    }

    /**
     * Creates a background.
     *
     * @return the created background
     */
    public static MotionlessElement createBackground() {
        return background;
    }

    /**
     * Creates a ground.
     *
     * @return the created ground
     */
    public static MotionlessElement createGround() {
        return ground;
    }

    /**
     * Gets the appropriate MotionlessElement from a file symbol.
     *
     * @param fileSymbol the file symbol
     * @return the corresponding MotionlessElement
     */
    public static MotionlessElement getFromFileSymbol(final char fileSymbol) {
        for (final MotionlessElement motionlessElement : motionlessElements) {
            if (motionlessElement.getSprite().getConsoleImage() == fileSymbol) {
                return motionlessElement;
            }
        }
        return background;
    }
}
