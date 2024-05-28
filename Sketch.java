import java.util.ArrayList;

import processing.core.PApplet;

public class Sketch extends PApplet {
	
  int[][] tiles = new int[20][15];

  ArrayList <Enemies> enemies;


	
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

    enemies.add(new Enemies.Skeleton(4, 4, millis()) ); // Joe

    for (){

    }

  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    for () {
      
    }
  }
  
  public void buttonPressed(){
    if (ESC == keyCode){

    }
    if ('e' == key){

    }
  }

  public void mousePressed(){
    if (LEFT == mouseButton){

    }
  }
  // define other methods down here.
}