import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {

  Player player = new Player(500, 400);

  Map map = new Map(20, 15);

  PImage[] sprites;
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1000, 800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(15, 0, 6);

    sprites = new PImage[]{
      loadImage("DungeonTile"),             // id 0
      loadImage("DungeonBackWall"),         
      loadImage("DungeonRightWall"),        
      loadImage("DungeonLeftWall"),         
      loadImage("DungeonRightCornerWall"),  
      loadImage("DungeonLeftCornerWall"),   // id 5
      loadImage("Skeleton.png"),            // id 6
      null
    };
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    background(15, 0, 6);
    displayMap();
    player.update();
    displayPlayer();
  }
  
  public void keyPressed(){
    if ('w' == key){player.yVel = -5;}
    if ('a' == key){player.xVel = -5;}
    if ('s' == key){player.yVel = 5;}
    if ('d' == key){player.xVel = 5;}

    if (ESC == keyCode){

    }
    if ('e' == key){

    }
  }

  public void keyReleased(){
    if ('w' == key){player.yVel = 0;}
    if ('a' == key){player.xVel = 0;}
    if ('s' == key){player.yVel = 0;}
    if ('d' == key){player.xVel = 0;}
  }

  public void mousePressed(){
    if (LEFT == mouseButton){

    }
  }
  
  public void displayPlayer(){
    circle( (int)player.getX(), (int)player.getY(), 20);
  }

  public void displayEnemies(){

  }

  public void displayMap(){
    for (Tile[] row : map.getMap()){ // would Tiles[] row be the rows or colunms?
      for (Tile tile : row){
        image(sprites [tile.getSpriteID()], tile.getX() * 50, (tile.getY() * 50) + 25);
        tile.update(player);
        if (tile.playerSpace){
          fill(0,255,0,50);
          rect(tile.getX() * 50, (tile.getY() * 50) + 25, 50, 50);
        }
      }
    }
  }

}