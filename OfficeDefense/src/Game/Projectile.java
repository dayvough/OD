package Game;

import javax.microedition.lcdui.Graphics;

public class Projectile {
    
    private int x;
    private int y;
    
    //private Sprite sprite;
    
    public Projectile(int _x, int _y) {
        this.x = _x;
        this.y = _y;
    }
    
    public void paint(Graphics g) {
        //g.drawImage(sprite);
        //OR
        //sprite.paint(g);
    }
    
    //both x and y coordinates must be CENTREPOINTS of position and target
    public boolean hitTarget(int position_x, int position_y, int target_x, int target_y, float speed) {
        if(!(position_x == target_x || position_y == target_y)) {
            float p_x = position_x;
            float p_y = position_y;
            float t_x = target_x - 50; //50 ?= displacement?
            float t_y = target_y - 50;
            
            //java.lang.Math.sqrt(x);
            
            return false;
        }
        else return true;
    }
}