import java.util.ArrayList;

public class Map {
    static ArrayList <Enemies> enemies;
    static Tile[][] map;

    Map(int XTiles, int YTiles){
        map = new Tile[XTiles][YTiles];

        for (int i = 0; i < XTiles; i++){
            for (int j = 0; j < YTiles; j++){
                if (0 == i || XTiles == i || 0 == j || YTiles == j){
                    map[i][j] = new Tile(i, j, "wall");
                } else {
                    map[i][j] = new Tile(i, j, "floor");
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



}
