import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {

  Player player = new Player(500, 400);

  Map map = new Map(15, 10);

  PImage[] tileSprites;
  PImage[] enemySprites;

  boolean clicked = false;
	
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
      loadImage("sprites/DungeonRightCornerWall.png"),  // id 4
      loadImage("sprites/DungeonLeftCornerWall.png"),   
      loadImage("sprites/Pillar.png")                   // id 6
    };

    enemySprites = new PImage[]{                
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
    if (LEFT == mouseButton && !clicked){
      clicked = true;
      pushMatrix();
      translate(player.x, player.y);
      rotate( (float)getAngle(player.x, player.y, mouseX, mouseY) );
      square(0, 20, 20);
      popMatrix();
    }
  }

  public void mouseReleased(){
    if (LEFT == mouseButton){
      clicked = false;
    }
  }
  
  public void displayPlayer(){
    fill(255);
    circle( (int)player.getX(), (int)player.getY(), 30);
  }

  public void displayEntities(){

  }

  public void mapSetup(){
    float mapSizeMulti;
    if ( (map.getXLength() * 50) / width < ( (map.YLength * 50) + 25) / height){
      mapSizeMulti = width / (map.getXLength() * 50);
    } else {
      mapSizeMulti = height / ( (map.YLength * 50) + 25);
    }
    for (Map.Tile[] row : map.getMap()){
      for (Map.Tile tile : row){
        PImage sprite = tileSprites[tile.getSpriteID()];
        sprite.resize( (int)(sprite.width * mapSizeMulti), 0);
      }
    }
  }

  public void displayMap(){
    for (Map.Tile[] row : map.getMap()){
      for (Map.Tile tile : row){
        PImage sprite = tileSprites[tile.getSpriteID()];
        image(sprite, tile.getX() * 50, (tile.getY() * 50) + (25 - (sprite.height % 50) ) );
        tile.update(player);
        if (tile.playerSpace){
          fill(0,255,0,50);
          rect(tile.getX() * 50, (tile.getY() * 50) + 25, 50, 50);
        }
      }
    }

    //for (Enemies enemy : Map.getEnemies() ){}
  }

  /**
   * gets the angle of 2 points
   * 
   * @param x1 x position of the first point
   * @param y1 y position of the first point
   * @param x2 x position of the second point
   * @param y2 y position of the second point
   * @return the angle of the first point and the second point relitive to the x axis
   */
  public double getAngle(float x1, float y1, float x2, float y2){
    double angle;
    angle = Math.asin( (x1 - x2) / (Math.sqrt( Math.pow( (x1 - x2), 2) + Math.pow( (y1 - y2), 2) ) ) );
    return angle;
  }

  /**
   * gets the X vector of another vector
   * 
   * @param magnitude hypotnuse or magnitude of the vector
   * @param angle the angle of the vector
   * @return the x vector of the main vector
   */
  public double getXVector(float magnitude, double angle){
    double xVector;
    xVector = magnitude * Math.cos(angle);
    return xVector;
  }

  /**
   * gets the Y vector of another vector
   * 
   * @param magnitude hypotnuse or magnitude of the vector
   * @param angle the angle of the vector
   * @return the Y vector of the main vector
   */
  public double getYVector(float magnitude, double angle){
    double yVector;
    yVector = magnitude * Math.sin(angle);
    return yVector;
  }

  

}