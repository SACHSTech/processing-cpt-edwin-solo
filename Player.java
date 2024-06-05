import processing.core.PApplet;

public class Player {
    float x, y, xVel, yVel;
    double moveSpeed = 5;
    int TileX;
    int TileY;
    int hp;
    Drops weapon;
    int lastDamaged;
    Player(int XPos, int YPos){
        x = XPos;
        y = YPos;
        hp = 10;
        xVel = 0;
        yVel = 0;
    }

    public void update(){
        x += xVel;
        y += yVel;
        TileX = (int)(x / 50);
        TileY = (int)( (y - 25) / 50);
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getTileX() {
        return TileX;
    }
    
    public int getTileY() {
        return TileY;
    }

    public Tile getTile(float XDis, float YDis){
        TileX = (int)( (x + XDis) / 50);
        TileY = (int)( (y + YDis - 25) / 50);
        return Map.getTile(TileX, TileY);
    }
}
