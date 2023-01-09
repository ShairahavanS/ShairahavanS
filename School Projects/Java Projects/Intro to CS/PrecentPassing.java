import java.util.*;

/*
   PrecentPassing.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 7th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program asks the user for a set of scores and calculates
   the percentage of scores above 70% and terminates with a negative number.
*/

public class PrecentPassing
{
   public static void main(String[] args) 
   {
      double mark = 0.0;         // create and initialize mark to prevent error; stores mark inputted by user
      double goodMarks = 0.0;    // create and initialize double variable; stores number of good marks
      double total = 0.0;        // create and initialize double variable; stores number of marks entered
      double percent;            // create double variable; used to store the calculated percentage
      Scanner sc = new Scanner(System.in);   // create scanner
      
      // prints notice to user
      System.out.println("Enter a negative number to terminate program.\n");
      
      while (mark >= 0)          // marks must not be a negative so that the loop ends when a negative number is entered
		{
			System.out.print("Enter a mark: ");    // prompts user for input
         mark = sc.nextInt();    // gets double input; stores in mark
         
         if (mark > 100)         // marks out of range
         {
            System.out.println("Invalid Mark.");   // prints notice
         }
         else if (mark >= 70)    // marks 70 and above
         {
            goodMarks++;         // increases total marks entered that are 70+ by 1   
            total++;             // increases total marks entered by 1
         }
         else if (mark < 0)      // so that the negative number doesn't count as a mark that was entered
         {
         }
         else 
         {
            total++;    // increases total marks entered by 1
         }
      }
      
      percent = 100.0*(goodMarks/total);     // calculates percent of marks 70 or above
      System.out.printf("%.2f%s of the scores are above 70.", percent, "%");  // prints info
   }
}