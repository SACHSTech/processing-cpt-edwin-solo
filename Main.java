import processing.core.PApplet;

/**
 * Main class to execute sketch
 * @author 
 *
 */
class Main {
  public static void main(String[] args) {
    
    String[] processingArgs = {"MySketch"};
	// uncomment this out to run the other sketch files
	  Sketch mySketch = new Sketch();  // main branch
	  // Sketch1 mySketch = new Sketch1(); // test branch?
	  // Sketch2 mySketch = new Sketch2(); // ???
	  
	  PApplet.runSketch(processingArgs, mySketch);
  }
  
}
