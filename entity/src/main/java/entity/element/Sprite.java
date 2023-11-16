package entity.element;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * The Sprite Class represents a game sprite with an image and a console representation.
 * It provides methods to load an image, get the console image, and manage image-related information.
 *
 * @author GROUPE 5

 */
public class Sprite {

    /** The image. */
    private Image image;

    /** The image name. */
    private String imageName;

    /** The console image. */
    private char consoleImage;

    /** The is image loaded. */
    private boolean imageLoaded;

    /**
     * Instantiates a new sprite.
     *
     * @param character the character
     * @param imageName the image name
     */
    public Sprite(final char character, final String imageName) {
        this.setConsoleImage(character);
        this.setImageName(imageName);
    }

    /**
     * Instantiates a new sprite.
     *
     * @param character the character
     */
    public Sprite(final char character) {
        this(character, "noimage.jpg");
    }

    /**
     * Gets the image.
     *
     * @return the image
     */
    public final Image getImage() {
        return this.image;
    }

    /**
     * Loads image.
     *
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public final void loadImage() throws IOException {
        this.setImage(ImageIO.read(new File("sprites\\" + this.getImageName())));
    }

    /**
     * Gets the console image.
     *
     * @return the consoleImage
     */
    public final char getConsoleImage() {
        return this.consoleImage;
    }

    /**
     * Sets the image.
     *
     * @param image the new image
     */
    private void setImage(final Image image) {
        this.image = image;
    }

    /**
     * Sets the console image.
     *
     * @param consoleImage the consoleImage to set
     */
    private void setConsoleImage(final char consoleImage) {
        this.consoleImage = consoleImage;
    }

    /**
     * Gets the image name.
     *
     * @return the imageName
     */
    public final String getImageName() {
        return this.imageName;
    }

    /**
     * Sets the image name.
     *
     * @param imageName the imageName to set
     */
    private void setImageName(final String imageName) {
        this.imageName = imageName;
    }

    /**
     * Checks if the image is loaded.
     *
     * @return true, if the image is loaded
     */
    public final boolean isImageLoaded() {
        return this.imageLoaded;
    }

    /**
     * Sets the image loaded status.
     *
     * @param isImageLoaded the new image loaded status
     */
    public final void setImageLoaded(final boolean isImageLoaded) {
        this.imageLoaded = isImageLoaded;
    }
}
