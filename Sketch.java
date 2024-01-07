import processing.core.PApplet;
import processing.core.PImage;

/**
 * A program that has a bouncing circle, a pumpkin moving in a circular motion, and edge detection. 
 * @author: L. Wong
 */
public class Sketch extends PApplet {
	
  // declaring and setting global variables 
	PImage imgPumpkin; 
  PImage imgBackground; 

  float fltPumpkinX = 150;
  float fltPumpkinY = 50; 

  float fltPumpkinRadius;
  float fltPumpkinAngle;
  float fltPumpkinSpeed = (float) 0.05;

  float fltBackgroundX = 0;
  float fltBackgroundY = 0; 
  
  float fltCircleX = 200; 
  float fltCircleY = 200;
  float fltCircleSpeedY = 3; 

  /**
   * Indicating the size call 
   */
  public void settings() {
    size(400, 400);
  }

  /** 
   * The initial set up values here, 
   * e.g. background, images, etc. 
   */
  public void setup() {
    // loading the pumpkin image and resizing it
    imgPumpkin = loadImage("pumpkin.png");
    imgPumpkin.resize(50, 50); 

    // loading the background and resizing it
    imgBackground = loadImage("background.png");
    imgBackground.resize(700, 400); 
  }

  /**
   * Anything drawn to the screen.
   * The background, pumpkin, and the ellipse.
   * Calculates edge detection so that the ellipse and pumpkin do not move off the screen. 
   */
   public void draw() {

    image(imgBackground, fltBackgroundX, fltBackgroundY); // draw the background
    image(imgPumpkin, fltPumpkinX, fltPumpkinY); // draw the pumpkin
   
    fill(194, 99, 21); 
    ellipse(fltCircleX, fltCircleY, 50, 50); // draw the circle

    // Indicating basic edge detection and movement for the ellipse. 
    fltCircleY += fltCircleSpeedY;
    if (fltCircleY <= 25  || fltCircleY >= height - 25) {
      fltCircleSpeedY *= -1;
    }
    
    // Draw and move the pumpkin in a circular motion. 
    fltPumpkinX += width / 3 * cos(fltPumpkinAngle) * fltPumpkinSpeed;
    fltPumpkinY += height / 3 * sin(fltPumpkinAngle) * fltPumpkinSpeed;
 
    // Constrain pumpkin position to stay within the screen.
    fltPumpkinX = constrain(fltPumpkinX, 0, width - 50);
    fltPumpkinY = constrain(fltPumpkinY, 0, height - 50);
    fltPumpkinAngle += fltPumpkinSpeed;
  }
}
  



