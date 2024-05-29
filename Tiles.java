import processing.core.PApplet;

public class Tiles {
    int x, y;
    boolean player;
    Enemies enemy;
    Drops loot;
    String type;
    Tiles(int XCord, int YCord, String TileType){
        x = XCord;
        y = YCord;
        type = TileType;
    }

}
