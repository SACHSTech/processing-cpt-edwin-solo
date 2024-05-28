import processing.core.PApplet;

public class Tiles {
    int x, y;
    Enemies enemy;
    String type;
    Tiles(int XCord, int YCord, String TileType){
        x = XCord;
        y = YCord;
        type = TileType;
    }
}
