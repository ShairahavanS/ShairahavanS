/**
Name:
Date:
Description:
*/

import java.awt.Color;


public class TurtleMain {
  public static void main(String[] a)
  {
    Turtle bob = new Turtle();
    //Look at https://docs.oracle.com/javase/7/docs/api/java/awt/Color.html for different colours
      Turtle.bgcolor("light blue");
      bob.width(10);
      
      
      for (int i = 0; i < 1000; i++) {
         bob.speed(Math.random()*10);
         bob.forward((int)(Math.random()*100));
         bob.left((int)(Math.random()*360));
         bob.right((int)(Math.random()*360));
         bob.backward((int)(Math.random()*100));
         bob.penColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
         if (i % 2 == 0) {
            bob.outlineColor("red");
            bob.fillColor("white");
         } else { 
            bob.outlineColor("blue");
            bob.fillColor("purple");
         }
         
      }
  }
}