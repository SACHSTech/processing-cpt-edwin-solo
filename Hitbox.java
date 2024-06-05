import processing.core.PApplet;

public class Hitbox {
    float x, y;
    Hitbox(float X, float Y){
        x = X;
        y = Y;
    }

    class HitCircle extends Hitbox{
        float d;
        HitCircle(float X, float Y, float Diameter){
            super(X, Y);
            d = Diameter;
        }
    }
}
