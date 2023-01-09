import java.util.*;

/*
   Height2.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 13th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program gets the height of 20 people using arrays 
   and outputs the average of the heights.
*/

public class Height2
{
   public static void main(String[] args) 
   {
      final int PEOPLE = 20;     // size of array; number of people
      double[] height = new double[PEOPLE];  // double array to store all 20 heights
      double average = 0.0;      // create and initialize double that will be used to calculate average
      double total = 0.0;        // create and initialize double used to store the total height
      Scanner sc = new Scanner(System.in);   // create scanner
      
      for (int i = 0; i < PEOPLE; i++) // create loop from 0-19
      {
         System.out.print("Enter height #" + (i+1) + ": "); // prompt user for height
         height[i] = sc.nextDouble();  // gets double input; stores in height[i] so the array has 20 elements after the loop is complete
         total = total + height[i];    // add height[i] to total to eventually get the total height that will be used to calculate average
      }
      
      average = total/(double)PEOPLE;   // calculate average by dividing the total height by the number of people
      
      System.out.printf("%nThe average of the 20 heights entered is %.2f.", average);  // print statement declaring average of the 20 heights
   }
}