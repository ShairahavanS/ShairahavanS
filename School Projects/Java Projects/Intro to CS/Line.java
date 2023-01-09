import java.util.*;

/*
   Line.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 18th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program contains 2 classes used to find the length and slope of lines.
*/

public class Line
{  
   /*
   ---------------------------------------
   Method Name: double length (int x1, int y1, int x2, int y2)
   Return Type: returns double - the length of the line after calculating it using the points of the line
   Parameters: x1 = the x-value of the first point of the line
               y1 = the y-value of the first point of the line
               x2 = the x-value of the second point of the line
               y2 = the y-value of the second point of the line
               
   This method takes a name and number and returns a welcome message.
   ---------------------------------------
   */
   public static double length (int x1, int y1, int x2, int y2)
   {
      double lengthLine;   // create return double
      
      lengthLine = (double)(Math.sqrt((y2-y1)*(y2-y1) + (x2-x1)*(x2-x1))); // initialize return double with formula for length with the parameters representing the variables that matched
      
      return lengthLine;   // return double
   }
   
   /*
   ---------------------------------------
   Method Name: double slope (int x1, int y1, int x2, int y2)
   Return Type: the slope of the line after calculating it using the points of the line
   Parameters: x1 = the x-value of the first point of the line
               y1 = the y-value of the first point of the line
               x2 = the x-value of the second point of the line
               y2 = the y-value of the second point of the line
   
   This method takes a name and number and returns a welcome message.
   ---------------------------------------
   */
   public static double slope (int x1, int y1, int x2, int y2)
   {
      double slopeLine; // create return double
      
      slopeLine = (y2-y1)/(double)(x2-x1);   // initialize double with formula for slope using the parameters representing the variables that matched
      
      return slopeLine; // return double
   }
}