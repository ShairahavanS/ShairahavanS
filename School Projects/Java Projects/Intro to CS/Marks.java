import java.util.*;

/*
   Marks.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 13th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program inputs 4 names, 4 marks, stores them in arrays 
   and allows the user to input a mark to see if someone has 
   that mark.
*/

public class Marks
{
   public static void main(String[] args) 
   {
      final int NUMBER = 4;   // size of both arrays
      double[] mark = new double[NUMBER]; // create double array with a size of 4; stores integer input
      String[] name = new String[NUMBER]; // create string array with a size of 4; stores string input
      double guess;  // double to store the guess from the user
      
      Scanner sc = new Scanner(System.in);   // create scanner
      
      for (int i = 0; i < NUMBER; i++) // loops 4 times from 0-3 to get all elements of both arrays a value
      {
         System.out.print("Enter the name of person #" + (i+1) + ": "); // prompt user for name
         name[i] = sc.nextLine();   // get string input; store in name[i]
         System.out.print("Enter the mark of person #" + (i+1) + ": "); // prompt user for mark
         mark[i] = Double.parseDouble(sc.nextLine());
         System.out.println("");    // get double input; store in mark[i]
      }
      
      System.out.print("Enter a mark: ");    // prompt user for guess
      guess = sc.nextDouble();   // gets double input; stores in guess
      System.out.println();
      
      if (guess == mark[0] || guess == mark[1] || guess == mark[2] || guess == mark[3])
      {
         for (int i = 0; i < NUMBER; i++) // loop 4 times from 0-3 for all elements
         {
            if (guess == mark[i])   // condition that the guess has to match one of the marks
            {
               System.out.println(name[i] + " has a mark of " + mark[i]);  // prints who got the mark if there is a mark that matches
            }
         }
      }
      else
      {
         System.out.println("There is no one who got this mark.");   // prints this if mark doesn't match any of the previously entered values
      }
   }
}