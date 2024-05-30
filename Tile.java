import processing.core.PApplet;
import processing.core.PImage;

public class Tile {
    static int x, y;
    boolean player;
    Enemies enemy;
    Drops loot;
    String type;
    PImage tileSprite;
    Tile(int XCord, int YCord, String TileType){
        x = XCord;
        y = YCord;
        type = TileType;
    }

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public void displayTile() {
        
    }

}
