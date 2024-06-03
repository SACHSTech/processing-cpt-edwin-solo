import processing.core.PApplet;
import processing.core.PImage;

public class Drops extends PApplet{

    PImage bow, sword, sheild, health;
    public void setup() {
        
    }

    int x, y;
    int damage;
    Drops(int XCord, int YCord){
        x = XCord;
        y = YCord;
    }

    class Sword extends Drops{
        Sword(int XCord, int YCord){
            super(XCord, YCord);
            damage = 3;
        }
    }
}
