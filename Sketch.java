import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	
	PImage imgPumpkin; 
  PImage imgBackground; 

  float fltPumpkinX = 100;
  float fltPumpkinY = 100; 

  float fltBackgroundX = 0;
  float fltBackgroundY = 0; 

  float fltCircleX = 200; 
  float fltCircleY = 200;

  float fltPumpSpeedX = 5; 
  float fltPumpSpeedY = 4; 
  
  float fltCircleSpeedY = 3; 

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

    imgBackground = loadImage("background.png");
    imgBackground.resize(700, 400); 
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    image(imgBackground, fltBackgroundX, fltBackgroundY); // draw the background

    image(imgPumpkin, fltPumpkinX, fltPumpkinY); 
   
    fltPumpkinX += fltPumpSpeedX;
    fltPumpkinY += fltPumpSpeedY;
    
    if (fltPumpkinX == 0 || fltPumpkinX > width - 50) {
      fltPumpSpeedX *= -1;
    }
    if (fltPumpkinY == 0  || fltPumpkinY > height - 50) {
      fltPumpSpeedY *= -1;
    }

    fill(194, 99, 21); 
    ellipse(fltCircleX, fltCircleY, 50, 50);

    fltCircleY += fltCircleSpeedY;
    
    if (fltCircleY <= 25  || fltCircleY >= height - 25) {
      fltCircleSpeedY *= -1;
    }


    
}
  }
  
  // define other methods down here.


