import processing.core.PApplet;

public class Drops {
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
