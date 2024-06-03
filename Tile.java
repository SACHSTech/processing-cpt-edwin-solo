import processing.core.PApplet;
import processing.core.PImage;

public class Tile extends PApplet{

    PImage floor, backWall, rightWall, leftWall, rightCorner, leftCorner;

    public void setup() {
        floor = loadImage("DungeonTile");
        backWall = loadImage("DungeonBackWall");
        rightWall = loadImage("DungeonRightWall");
        leftWall = loadImage("DungeonLeftWall");
        rightCorner = loadImage("DungeonRightCornerWall");
        leftCorner = loadImage("DungeonLeftCornerWall");
    }

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

        class Floor extends Tile{
            Floor(int XCord, int YCord, String TileType){
            super(XCord, YCord, TileType);
            tileSprite = floor;
            }
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

    public PImage getTileSprite() {
        return tileSprite;
    }

}
