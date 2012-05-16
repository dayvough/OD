package Game;

import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.Sprite;

public class Level {
    private Tower tower1 = null;
    private Tower tower2 = null;
    private Tower tower3 = null;
    private Tower tower4 = null;
    private Tower tower5 = null;
    private Tower tower6 = null;
    private Entity[] entities;
    
    private int currentLevel;
    
    public Level(int levelNumber, Image spriteSheet) {
        this.currentLevel = levelNumber;
        
        //initEntities();
        
        /* STOPPED LAST HERE */
        //towers = new Tower[] { new Tower("Type1", )
        /* STOPPED LAST HERE */
    }
    
    public void initEntities(){ 
        if(currentLevel == 1) {
            //create static entities waves
        }
    }
    
    public void addTower(int num, String type) {
        if(currentLevel == 1) {
            
        }
    }
}