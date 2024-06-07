import java.util.ArrayList;
import processing.core.PApplet;

public class Map extends PApplet{
    static ArrayList <Enemies> enemies;
    static Tile[][] map;

    Map(int XTiles, int YTiles){
        map = new Tile[XTiles][YTiles];

        for (int i = 0; i < XTiles; i++){
            for (int j = 0; j < YTiles; j++){
                
                if (0 == j && !(0 == i || XTiles == i + 1) ){
                    map[i][j] = new Tile(i, j, false, 1);
                } else if (0 == i && !(0 == j) ){
                    map[i][j] = new Tile(i, j, false, 3);
                } else if (XTiles == i + 1 && !(0 == j) ){
                    map[i][j] = new Tile(i, j, false, 2);
                } else if (0 == i && 0 == j){
                    map[i][j] = new Tile(i, j, false, 5);
                } else if (XTiles == i + 1 && 0 == j){
                    map[i][j] = new Tile(i, j, false, 4);
                } else {
                    map[i][j] = new Tile(i, j, true, 0);
                }
            }
        }
    }

    public static Tile getTile(int X, int Y){
        return map[X][Y];
    }

    public Tile[][] getMap() {
        return map;
    }

    public class Tile{

        int x, y;
        boolean playerSpace, walkable;
        Enemies enemy;
        Drops loot;
        int spriteID;
        Tile(int XCord, int YCord, boolean accessable, int ID){
            x = XCord;
            y = YCord;
            walkable = accessable;
            spriteID = ID;
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
    
        public int getSpriteID() {
            return spriteID;
        }
    
    }
    
}
