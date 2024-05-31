import processing.core.PApplet;
import processing.core.PImage;

public class Tile {
    int x, y;
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

    public void update(){
        
        if (TileX.player == x && TileY.player == y){}
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void displayTile() {
        
    }

}
