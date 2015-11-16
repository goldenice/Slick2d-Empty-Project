package game.resources;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

public class Resources {

    //public static final Image SOME_IMAGE = loadImage("path/img.png");
    //public static final Sound SOME_SOUND = loadSound("path/sound.wav");
    //public static final Sprite SOME_SPRITE = loadSprite("path/spritesheet.png", 32, 32);

    /**
     * Loads an image from disk
     * @param path Path to load the image from
     * @return Image resource
     */
    private static Image loadImage(String path) {
        try {
            return new Image(path, false, Image.FILTER_NEAREST);
        } catch (SlickException e) {
            System.err.println("Cannot load image resource " + path);
            return null;
        }
    }

    /**
     * Loads a spritesheet from disk
     * @param path Path to load
     * @param tileWidth Width of tile
     * @param tileHeight Height of tile
     * @return Spritesheet resource
     */
    private static SpriteSheet loadSprite(String path, int tileWidth, int tileHeight) {
        try {
            return new SpriteSheet(path, tileWidth, tileHeight);
        } catch (SlickException e) {
            System.err.println("Cannot load image resource " + path);
            return null;
        }
    }

    /**
     * Loads a sound from disk
     * @param path Path to load sound from
     * @return Sound resource
     * @throws SlickException
     */
    private static Image loadSound(String path) {
        try {
            return new Image(path, false, Image.FILTER_NEAREST);
        } catch (SlickException e) {
            System.err.println("Cannot load image resource " + path);
            return null;
        }
    }

}
