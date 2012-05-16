package Game;

import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;

public class Midlet extends MIDlet implements CommandListener {

    /*
     * midlet.getAppProperty("MIDlet-Name");
     * midlet.getAppProperty("MIDlet-Vendor");
     * midlet.getAppProperty("MIDlet-Version");
     * 
     * 
     */
    
    //<editor-fold defaultstate="collapsed" desc="Game Variables">  
    /*
     * PALETTE HEX COLORS (Terra
     * http://www.colourlovers.com/palette/292482/Terra) E8DDCB: Neutral 1
     * CDB380: Neutral 2 036564: Aqua 033649: Mid aqua 031634: Dark aqua
     */
    private static int RESOLUTION;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Midlet Variables">  
    private Display displayable;
    private MainCanvas mainCanvas;
    private Game game;
    private boolean midletPaused;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Initializers">  
    public Midlet() {
        
    }

    private void init() {
        displayable = Display.getDisplay(this);
        midletPaused = false;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Core">
    public void startApp() {
        if (midletPaused) {
            resumeMidlet();
        } else {
            init();
            startMidlet();
        }
    }

    public void pauseApp() {
        midletPaused = true;
    }

    public void destroyApp(boolean unconditional) {
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Functions">
    public void startMidlet() {
        goToGame();
    }

    public void resumeMidlet() {
        goToGame();
    }

    public void exitMidlet() {
        displayable.setCurrent(null);
        destroyApp(true);
        notifyDestroyed();
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GoTo">
    public void goToGame() {
        displayable.setCurrent(getGame());
    }
    
    public void goToMainCanvas() {
        displayable.setCurrent(getMainCanvas());
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters">
    public Game getGame() {
        if (game == null) {
            game = new Game(this);
            RESOLUTION = game.getRESOLUTION();
        }
        return game;
    }
    
    public MainCanvas getMainCanvas() {
        if(mainCanvas == null) {
            mainCanvas = new MainCanvas(this);
        }
        
        return mainCanvas;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Actions">
    public void commandAction(Command c, Displayable d) {
        
    }
    //</editor-fold>
}
