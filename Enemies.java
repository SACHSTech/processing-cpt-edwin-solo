import processing.core.PApplet;
import processing.core.PImage;

public class Enemies {
    int x, y;
    int hp;
    int move;
    int attack;
    int attackTime;
    long spawnTime;
    Enemies(int Xposition, int Yposition, long millis){
        x = Xposition;
        y = Yposition;
        spawnTime = millis;
    }

    // 1 "move" || "attackTime" == wait 250 millis before action

    class Skeleton extends Enemies{
        Skeleton(int Xposition, int Yposition, long millis){
            super(Xposition, Yposition, millis);
            hp = 2;
            move = 4;
            attack = 2;
            attackTime = 4;
        }
    }

    class Zombie extends Enemies{
        Zombie(int Xposition, int Yposition, long millis){
            super(Xposition, Yposition, millis);
            hp = 8;
            move = 6;
            attack = 2;
            attackTime = 4;
        }
    }

    class Bat extends Enemies{
        Bat(int Xposition, int Yposition, long millis){
            super(Xposition, Yposition, millis);
            hp = 1;
            move = 2;
            attack = 1;
            attackTime = 2;
        }
    }

    class Knight extends Enemies{
        Knight(int Xposition, int Yposition, long millis){
            super(Xposition, Yposition, millis);
            hp = 5;
            move = 4;
            attack = 3;
            attackTime = 2;
        }
    }

    class SheildKnight extends Enemies{
        SheildKnight(int Xposition, int Yposition, long millis){
            super(Xposition, Yposition, millis);
            hp = 7;
            move = 6;
            attack = 1;
            attackTime = 2;
        }
    }

    class SpearKnight extends Enemies{
        SpearKnight(int Xposition, int Yposition, long millis){
            super(Xposition, Yposition, millis);
            hp = 5;
            move = 4;
            attack = 3;
            attackTime = 4;
        }
    }
    
    class Brute extends Enemies{
        Brute(int Xposition, int Yposition, long millis) {
            super(Xposition, Yposition, millis);
            hp = 10;
            move = 8;
            attack = 5;
            attackTime = 6;
        }
        
    }

}
