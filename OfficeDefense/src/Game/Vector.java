package Game;

//import java.lang.Math;

public class Vector {
    private int x;
    private int y;
    
    public Vector(int _x, int _y) {
        this.x = _x;
        this.y = _y;
    }
    
    public void normalize() {
        
    }

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    //</editor-fold>
    
}