import processing.core.PApplet;

public class Player {
    float x, y, xVel, yVel;
    double moveSpeed = 5;
    int TileX, TileY;
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

    public Tile getTile(){
        TileX = (int)(x / 50);
        TileY = (int)( (25 + y) / 50);
        return Map.getTile(TileX, TileY);
    }
}
