package game;

import game.logic.World;
import org.newdawn.slick.*;

import java.io.File;

public class Engine extends BasicGame {

    public static final String NAME = "Testgame";
    public static boolean _APPLET;

    private static final int TARGET_FPS = 60;
    private static final String NATIVE_PATH = "natives";
    private static final boolean FULLSCREEN = false;

    private World world;

    public Engine() {
        super(NAME);
    }

    public static void main(String[] args) {
        _APPLET = false;

        // Set natives folder
        File f = new File(NATIVE_PATH);
        if (f.exists()) System.setProperty("org.lwjgl.librarypath", f.getAbsolutePath());

        // Start the main game code and create the screen
        try {
            AppGameContainer game = new AppGameContainer(new Engine());
            if (FULLSCREEN) {
                game.setDisplayMode(game.getScreenWidth(), game.getScreenHeight(), true);
            } else {
                game.setDisplayMode(Window.WIDTH, Window.HEIGHT, false);
            }
            game.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        gc.setTargetFrameRate(TARGET_FPS);
        gc.setAlwaysRender(true);
        gc.setMaximumLogicUpdateInterval(TARGET_FPS);
        gc.setVSync(true);
        gc.setShowFPS(true);
        // setWorld( /* TODO: Create a world */ );
    }

    @Override
    public void update(GameContainer gc, int i) throws SlickException {
        if (world != null) world.update(gc, i);
    }

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
        if (world != null) world.render(gc, graphics);
    }

    public void setWorld(World world) {
        this.world = world;
    }
}
