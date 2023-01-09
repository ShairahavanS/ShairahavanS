import java.util.*;

/*
   TriangleOfNumbers.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 7th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program uses a nested loop to creates a triangle using increasing numbers
   with the inputted values from the user for rows and columns.
*/

public class TriangleOfNumbers
{
   public static void main(String[] args) 
   {
      int number;    // creates integer variable; stores integer inputted by user; number of rows in the triangle and highest number in triangle
      Scanner sc = new Scanner(System.in);   // creates scanner
   
      System.out.print("Enter a number: ");  // prompts user for input
      number = sc.nextInt();  // gets integer input; stores in number
      System.out.println();   // blank line
      
      for (int i = 1; i <= number; i++) // prints <number> number of rows
      {
         for (int j = 1; j <= i; j++) // loops i many times so that each subsequent row has one extra number till the max number of rows is reached
         {
            System.out.print(j); // prints j
         }
         System.out.println();   // prints blank line so that the next set of printing starts on next line
      }
   }
}