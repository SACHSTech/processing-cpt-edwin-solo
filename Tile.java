import processing.core.PApplet;
import processing.core.PImage;

public class Tile {
    int x, y;
    boolean playerSpace;
    Enemies enemy;
    Drops loot;
    String type;
    PImage tileSprite;
    Tile(int XCord, int YCord, String TileType){
        x = XCord;
        y = YCord;
        type = TileType;
    }

    public void update(Player player){
        if (player.getTileX() == x && player.getTileY() == y){
            playerSpace = true;
        } else {
            playerSpace = false;
        }
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
