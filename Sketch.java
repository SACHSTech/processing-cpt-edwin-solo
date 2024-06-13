import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {

  Player player = new Player(500, 400);

  Map map = new Map(20, 10);

  PImage[] tileSprites;
  PImage[] enemySprites;
	
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

    tileSprites = new PImage[]{
      loadImage("sprites/DungeonTile.png"),             // id 0
      loadImage("sprites/DungeonBackWall.png"),         
      loadImage("sprites/DungeonRightWall.png"),        // id 2
      loadImage("sprites/DungeonLeftWall.png"),         
      loadImage("sprites/DungeonRightCornerWall.png"),  
      loadImage("sprites/DungeonLeftCornerWall.png"),   // id 5
      
    };

    enemySprites = new PImage[]{
      loadImage("sprites/Pillar.png"),                  
      loadImage("sprites/Skeleton.png"),                
      
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

  public void mouseReleased(){
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
    /* float mapSizeMulti;
    if ( (map.getXLength() * 50) / width <= ( (map.YLength * 50) + 25)/ height){
      mapSizeMulti = (map.getXLength() * 50) / width;
    } else {
      mapSizeMulti = ( (map.YLength * 50) + 25) / height;
    } */
    for (Map.Tile[] row : map.getMap()){ // would Tiles[] row be the rows or colunms?
      for (Map.Tile tile : row){
        // sprites[tile.getSpriteID()].resize( (int)(sprites[tile.getSpriteID()].width * mapSizeMulti), 0);
        image(tileSprites[tile.getSpriteID()], tile.getX() * 50, (tile.getY() * 50) + (25 - (tileSprites[tile.getSpriteID()].height % 50) ) );
        tile.update(player);
        if (tile.playerSpace){
          fill(0,255,0,50);
          rect(tile.getX() * 50, (tile.getY() * 50) + 25, 50, 50);
        }
      }
    }

    for (Enemies enemy : Map.getEnemies() ){

    }
  }

  // projectile calculatons
  public double getAngle(float x1, float x2, float y1, float y2){
    double angle;
    angle = Math.asin( (x1 - x2) / (Math.sqrt( Math.pow( (x1 - x2), 2) + Math.pow( (y1 - y2), 2) ) ) );
    return angle;
  }

  /**
   * gets the X vector of another vector
   * 
   * @param magnitude hypotnuse or magnitude of the vector
   * @param angle the angle of the vector
   * @return 
   */
  public double getXVector(float magnitude, double angle){
    double xVector;
    xVector = magnitude * Math.cos(angle);
    return xVector;
  }

  public double getYVector(float magnitude, double angle){
    double yVector;
    yVector = magnitude * Math.sin(angle);
    return yVector;
  }

  

}