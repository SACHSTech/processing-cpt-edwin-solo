import processing.core.PApplet;

public class Sketch extends PApplet {

  Player player = new Player(500, 400);

  Map map = new Map(20, 15);
	
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

  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    background(15, 0, 6);
    displayPlayer();
  }
  
  public void keyPressed(){
    if ('w' == key){player.y = 5;}
    if ('a' == key){player.x = 5;}
    if ('s' == key){player.y = 5;}
    if ('d' == key){player.x = 5;}

    if (ESC == keyCode){

    }
    if ('e' == key){

    }
  }

  public void keyReleased(){
    if ('w' == key){player.y = 5;}
    if ('a' == key){player.x = 5;}
    if ('s' == key){player.y = 5;}
    if ('d' == key){player.x = 5;}
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
        
      }
    }
  }

}