import processing.core.PApplet;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  

public class Sketch extends PApplet {
	
	float RandomX, RandomY;
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  
  public void setup() {
    background(210, 255, 173);
    RandomX = random(75, 300);
    RandomY = random(0, 200);
        
    System.out.println(RandomX);
    System.out.println(RandomY);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    
    if (RandomX <= 300 && RandomY <= 175 && RandomX >= 87) {
      
      // feet
      float cornerX = RandomX - 25;
      float feetX2 = RandomX + 25;
      float feetY = RandomY + 150;
      float feetW = 30;
      float feetH = 50;
    
      fill(0, 128, RandomX);
      ellipse(cornerX, feetY, feetW, feetH);
      ellipse(feetX2, feetY, feetW, feetH);
    
      // head
      float headD = 75;
      // headD = diameter of head
    
      fill(RandomY, 128, 0);
      ellipse(RandomX, RandomY, headD, headD);
    
      // mask
      float maskY = RandomY - 10;
      float maskW = 50;
      float maskH = 20;

      // random colours based off the random integers
      fill(RandomX + RandomY, 227, 48);
      rect(cornerX, maskY, maskW, maskH); 
    
      // eyes
      float eyeD = 10;
      float eyeX1 = RandomX - 10;
      float eyeX2 = RandomX + 10;
      
      fill(0, RandomX, RandomX);
      ellipse(eyeX1, RandomY, eyeD, eyeD);
      ellipse(eyeX2, RandomY, eyeD, eyeD);
    
      // body
      float bodyX = RandomX - 37;
      float bodyY = RandomY + 37;
      float bodyH = 100;
      
      fill(RandomY, 128, 128);
      rect(bodyX, bodyY, headD, bodyH);
    
      // arms
      float armX1 = RandomX - 87;
      float armX2 = RandomX + 38;
      float armY = RandomY + 37;
      
      fill(RandomX, RandomY, 0);
      rect(armX1, armY, 50, 20);
      rect(armX2, armY, 50, 20);

      
      
    }
      
     else {
     // if randomX and randomY make a code that does not fit in the screen, the background will show a red screen
     // stop and rerun to try again with the numbers
       
     background(255, 0, 0);
     
    }
      
    int intS = second();  // Values from 0 - 59
    int intM = minute();  // Values from 0 - 59
    int intH = hour();    // Values from 0 - 23

    // for some reason the time shown is 7 hours early
    /* I would like to say that I cannot test what the time is, therefore at 8pm the only information I have is that the hours command just shows 1 instead of 8, so the command may not work for different times than 8pm, because I'm not sure how it would show up */
    
    int intHH = intH + 7;
    
    text("hours: " + intHH + ", minutes:  " + intM + ", seconds: " + intS, 30, 30);

    
  }
    
}
    
    
  
  // define other methods down here.

/*     

failed clock attempt 


    fill(255, 255, 255);
    ellipse(100, 300, 50, 50);
    ellipse(200, 300, 50, 50);
    ellipse(300, 300, 50, 50);

    int intS = second();  // Values from 0 - 59
    int intM = minute();  // Values from 0 - 59
    int intH = hour();    // Values from 0 - 23
    int intHPosX;
    int intHPosY;

    if (7 <= intH <= 9) {
      intHPosX = 300 - (intH - 6) * 5;
    } 
    else if (1 <= intH <= 3) {
      intHPosX = 300 + intH * 5;
    }
    else if (intH = 12 || intH = 6) {
      intHPosX = 300;
    }
    else if (10 = intH) {
      
    }
    }

    if (3 = intH || intH = 9) {
      intHPosY = 100;
    } 
    else if (3 <=intH < 8) {
      intHPosY = 100 + intH * 5;
    }
    else if (intH = 12 || intH = 6) {
      intHPosY = intH;

      */