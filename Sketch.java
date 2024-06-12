import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {

  Player player = new Player(500, 400);

  Map map = new Map(20, 10);

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
      loadImage("sprites/DungeonTile.png"),             // id 0
      loadImage("sprites/DungeonBackWall.png"),         
      loadImage("sprites/DungeonRightWall.png"),        
      loadImage("sprites/DungeonLeftWall.png"),         
      loadImage("sprites/DungeonRightCornerWall.png"),  
      loadImage("sprites/DungeonLeftCornerWall.png"),   // id 5
      loadImage("sprites/Skeleton.png"),                // id 6
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
    fill(255);
    circle( (int)player.getX(), (int)player.getY(), 30);
  }

  public void displayEnemies(){

  }

  public void displayMap(){
    float mapSizeMulti;
    //if (){}
    for (Map.Tile[] row : map.getMap()){ // would Tiles[] row be the rows or colunms?
      for (Map.Tile tile : row){
        image(sprites[tile.getSpriteID()], tile.getX() * 50, (tile.getY() * 50) + (25 - (sprites[tile.getSpriteID()].height % 50) ) );
        tile.update(player);
        if (tile.playerSpace){
          fill(0,255,0,50);
          rect(tile.getX() * 50, (tile.getY() * 50) + 25, 50, 50);
        }
      }
    }
  }

  // projectile calculatons
  public void projectilecalc(){
    double pAngle;
    double pXVel, pYVel;
    int pSpeed = 10;
  
    pAngle = Math.asin( (player.getY() - mouseY) / (Math.sqrt( Math.pow( (player.getX() - mouseX), 2) + Math.pow( (player.getY() - mouseY), 2) ) ) );
    pXVel = pSpeed * Math.sin(90-pAngle);
    pYVel = pSpeed * Math.sin(pAngle);
    if (player.getX() - mouseX < 0){pXVel *= -1;}
  }
   
  
}