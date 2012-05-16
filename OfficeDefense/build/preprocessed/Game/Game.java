package Game;

import java.io.IOException;
import javax.microedition.lcdui.*;
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.lcdui.game.Sprite;

public class Game extends GameCanvas {
    //<editor-fold defaultstate="collapsed" desc="Main Variables">

    private Midlet m;
    private Display display;
    private GameDesign gameDesign;
    private static int RESOLUTION;
    private Image spriteSheet;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Game Variables">
    public Level level;
    private int currentLevel;
    private int selectedTile;
    private static final int MAX_TILES = 6;
    //</editor-fold>

    public Game(Midlet _m) {
        super(true);
        super.setFullScreenMode(true);

        m = _m;

        this.display = Display.getDisplay(m);
        display.setCurrent(this);

        if (this.getWidth() == 240) {
            RESOLUTION = 240;
        }
        if (this.getWidth() == 320) {
            RESOLUTION = 320;
        }
        
        init();
    }

    private void init() {
        gameDesign = new GameDesign();

        try {
            spriteSheet = Image.createImage("/Sprites.png");
        } catch (Exception e) {
        }

        currentLevel = 1;
        selectedTile = 1;
        level = new Level(1, spriteSheet);
        repaint();
    }

    public void keyPressed(int keycode) {
        int gameAction = this.getGameAction(keycode);

//        if (gameAction == KEY_POUND || gameAction == KEY_STAR || gameAction == KEY_NUM0) {
//            //pause/menu
//            //display.setCurrent(null);
//        }

        if (RESOLUTION == 240) {
            /*
            * IF 240x320, screen becomes landscape AND keyboard is on RIGHT
            */
            if (gameAction == UP || gameAction == KEY_NUM6) ;
            if (gameAction == LEFT || gameAction == KEY_NUM2) {
                this.currentLevel = 1;
            }
            if (gameAction == DOWN || gameAction == KEY_NUM8) ;
            if (gameAction == RIGHT || gameAction == KEY_NUM4) {
                this.currentLevel= 2;
            }
            
            repaint();
        }

        if (RESOLUTION == 320) {
            if (gameAction == UP || gameAction == KEY_NUM2) ;
            if (gameAction == LEFT || gameAction == KEY_NUM4) ;
            if (gameAction == DOWN || gameAction == KEY_NUM8) ;
            if (gameAction == RIGHT || gameAction == KEY_NUM6) ;
            
            repaint();
        }
    }

    //<editor-fold defaultstate="collapsed" desc="Paint">
    public void paint(Graphics g) {
        paintLevel(g);
    }

    public void paintLevel(Graphics g) {
        try {
            if (RESOLUTION == 240) {
                switch (currentLevel) {
                    case 1:
                        this.flushGraphics();
                        gameDesign.getL1_240x320().paint(g);
                        break;
                    case 2:
                        this.flushGraphics();
                        gameDesign.getL2_240x320().paint(g);
                        break;
                }
            }

            if (RESOLUTION == 320) {
                switch (currentLevel) {
                    case 1:
                        gameDesign.getL1_320x240().paint(g);
                        break;
                    case 2:
                        gameDesign.getL2_320x240().paint(g);
                        break;
                }
            }
        } catch (IOException ex) {
        }
    }
    //</editor-fold>

    public void commandAction(Command c, Displayable d) {
    }

    public void setCurrentLevel(int x) {
        this.currentLevel = x;
    }

    public int getRESOLUTION() {
        return RESOLUTION;
    }
}
