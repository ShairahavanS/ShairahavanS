import java.util.*;

/*
   CheckLine.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 18th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program evaluates the slope and length of two lines using their vertexes and 
   then tells the length and slope of the two lines, if they have the same length, 
   and if they are parallel or perpendicular.
*/

public class CheckLine
{
   public static void main(String[] args) 
   {
      int line1x1, line1y1, line1x2, line1y2, line2x1, line2y1, line2x2, line2y2; // to get the values of all the vertexes
      double lengthLine1, slopeLine1, lengthLine2, slopeLine2;    // to store the calculated values (length and slope) for both line
      
      Scanner sc = new Scanner (System.in);
      
      
      // get the values for the first line
      System.out.println("Please enter the two coordinates of line 1:");  
      
      // get the values for vertex 1 
      System.out.print("Vertex 1 x-value:	"); 
      line1x1 = sc.nextInt();
      System.out.print("Vertex 1 y-value:	");
      line1y1 = sc.nextInt();
      
      // get the values for vertex 2
      System.out.print("\nVertex 2 x-value:	");
      line1x2 = sc.nextInt();
      System.out.print("Vertex 2 y-value:	");
      line1y2 = sc.nextInt();
      
      
      // using these values, plug them and use the methods from Line.java to find the length and slope of line 1
      lengthLine1 = Line.length(line1x1, line1y1, line1x2, line1y2);
      slopeLine1 = Line.slope(line1x1, line1y1, line1x2, line1y2);
      
      
      // get the values for the second line
      System.out.println("\nPlease enter the two coordinates of line 2:");
      
      // get the values for vertex 1
      System.out.print("Vertex 1 x-value:	");
      line2x1 = sc.nextInt();
      System.out.print("Vertex 1 y-value:	");
      line2y1 = sc.nextInt();
      
      // get the values for vertex 2
      System.out.print("\nVertex 2 x-value:	");
      line2x2 = sc.nextInt();
      System.out.print("Vertex 2 y-value:	");
      line2y2 = sc.nextInt();
      
      
      // using these values, plug them and use the methods from Line.java to find the length and slope of line 1
      lengthLine2 = Line.length(line2x1, line2y1, line2x2, line2y2);
      slopeLine2 = Line.slope(line2x1, line2y1, line2x2, line2y2);
      
      
      // print the length and slope of line 1
      System.out.println();
      System.out.println("The length of line 1 is " + lengthLine1 + " units.");
      System.out.println("The slope of line 1 is " + slopeLine1 + ".");
      
      
      // print the length and slope of line 2
      System.out.println();
      System.out.println("The length of line 2 is " + lengthLine2 + " units.");
      System.out.println("The slope of line 2 is " + slopeLine2 + ".");
      
      System.out.println();
      
      
      if (lengthLine1 == lengthLine2)  // if they have the same length, print a line indicating that
      {
         System.out.println("The two lines have the same length.");
      }
      else if (lengthLine1 != lengthLine2)// if they don't have the same length, print a line indicating that
      {
         System.out.println("The two lines do not have the same length.");
      }
      
      if (slopeLine1 == slopeLine2) // if they have the same slope, print a line indicating that they are parallel
      {
         System.out.println("The two lines are parallel.");
      }
      
      else if (slopeLine1 == -(1/slopeLine2) || (1/slopeLine1) == -slopeLine2)  // if they are perpendicular (are negative reciprocals), print a line indicating that
      {
         System.out.println("The two lines are perpendicular.");
      }
      else  // if they aren't parallel or perpendicular, print a line indicating that
      {
         System.out.println("The two lines are neither parallel or perpendicular.");
      }
   }
}