import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	
	PImage imgPumpkin; 
  PImage imgBackground; 

  float fltPumpkinX = 100;
  float fltPumpkinY = 100; 

  float fltBackgroundX;
  float fltBackgroundY; 

  float fltSpeedX = 5; 
  float fltSpeedY = 4; 

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {

    imgPumpkin = loadImage("pumpkin.png");
    imgPumpkin.resize(50, 50); 

  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  background(0);
    image(imgPumpkin, fltPumpkinX, fltPumpkinY);
   
    fltPumpkinX += fltSpeedX;
    fltPumpkinY += fltSpeedY;
    
    if (fltPumpkinX == 0 || fltPumpkinX > width - 50) {
      fltSpeedX *= -1;
    }
    if (fltPumpkinY == 0  || fltPumpkinY > height - 50) {
      fltSpeedY *= -1;
    }

}
  }
  
  // define other methods down here.


