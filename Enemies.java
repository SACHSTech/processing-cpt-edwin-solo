import processing.core.PApplet;

public class Enemies extends PApplet {

    int x, y, hp;
    int move, attack, attackTime;
    int spawnTime;
    int spriteID;
    Enemies(int Xposition, int Yposition, int millis){
        x = Xposition;
        y = Yposition;
        spawnTime = millis;
    }

    // 1 "move" || "attackTime" == wait 250 millis before action

    class Skeleton extends Enemies{
        Skeleton(int Xposition, int Yposition, int millis){
            super(Xposition, Yposition, millis);
            hp = 2;
            move = 4;
            attack = 2;
            attackTime = 4;
            spriteID = 6;
        }
    }

    class Zombie extends Enemies{
        Zombie(int Xposition, int Yposition, int millis){
            super(Xposition, Yposition, millis);
            hp = 8;
            move = 6;
            attack = 2;
            attackTime = 4;
        }
    }

    class Bat extends Enemies{
        Bat(int Xposition, int Yposition, int millis){
            super(Xposition, Yposition, millis);
            hp = 1;
            move = 2;
            attack = 1;
            attackTime = 2;
        }
    }

    class Knight extends Enemies{
        Knight(int Xposition, int Yposition, int millis){
            super(Xposition, Yposition, millis);
            hp = 5;
            move = 4;
            attack = 3;
            attackTime = 2;
        }
    }

    class SheildKnight extends Enemies{
        SheildKnight(int Xposition, int Yposition, int millis){
            super(Xposition, Yposition, millis);
            hp = 7;
            move = 6;
            attack = 1;
            attackTime = 2;
        }
    }

    class SpearKnight extends Enemies{
        SpearKnight(int Xposition, int Yposition, int millis){
            super(Xposition, Yposition, millis);
            hp = 5;
            move = 4;
            attack = 3;
            attackTime = 4;
        }
    }
    
    class Brute extends Enemies{
        Brute(int Xposition, int Yposition, int millis) {
            super(Xposition, Yposition, millis);
            hp = 10;
            move = 8;
            attack = 5;
            attackTime = 6;
        }
        
    }

    class Pillar extends Enemies{
        Pillar(int Xposition, int Yposition, int millis) {
            super(Xposition, Yposition, millis);
            hp = 5000;
            move = -1;
            attack = 0;
            attackTime = -1;
        }
    }

    /*
    public void moveUp(){
        if (!Map.getTile(x, (y-1) ).type.equals("wall") ){
            y--;
        } else if (Map.getTile(x, (y-1) ).enemy != null){
            Map.getTile(x, (y-1) ).enemy.hp--;
        } else if (Map.getTile(x, (y - 1) ).player){
            Player.hp -= 1;
        }
    }
    */

    public void moveDown(){
        y++;
    }

    public void moveLeft(){
        x--;
    }

    public void moveRight(){
        x++;
    }

    public int getHp() {
        return hp;
    }

    public int getSpriteID() {
        return spriteID;
    }
}
