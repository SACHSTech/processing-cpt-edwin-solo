import processing.core.PApplet;

public class Player {
    float x, y, xVel, yVel;
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
        TileX = (int)(x / 50);
        TileY = (int)( (25 + y) / 50);
        Map.getTile(TileX, TileY).player = true;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public Tile getTile(){
        return Map.getTile(TileX, TileY);
    }
}
