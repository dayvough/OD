package Game;

public class Levels {

    class Level {
        int numOfBuildings;
        int[][] buildingCoordinates;
        
        public int getNumOfBuildings() { return numOfBuildings; }
        public void setBuildingCoordinates(int levelNum, int[][] coords) {
            
        }
    }
    
    public static int level1;
    
    public Levels() {
        level1 = 23;
    }
}