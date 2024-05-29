import java.util.ArrayList;

public class Map {
    static ArrayList <Enemies> enemies;
    static Tiles[][] map;
    Map(int XTiles, int YTiles){
        map = new Tiles[XTiles][YTiles];

        for (int i = 0; i < XTiles; i++){
            for (int j = 0; j < YTiles; j++){
                if (0 == i || XTiles == i || 0 == j){
                    map[i][j] = new Tiles(i, j, "wall");
                } else {
                    map[i][j] = new Tiles(i, j, "floor");
                }
            }
        }
    }

    public static Tiles getTile(int X, int Y){
        return map[X][Y];
    }

}
