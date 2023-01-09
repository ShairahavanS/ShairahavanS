import java.util.*;

/*
   TableOfNumbers.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 7th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program uses a nested loop to creates a rectangle using increasing numbers
   with the inputted values from the user for rows and columns.
*/

public class TableOfNumbers
{
   public static void main(String[] args) 
   {
      int width, height;      // creates integer variables; width stores the number of columns inputted by user; height stores number of rows inputted by user
      Scanner sc = new Scanner(System.in);      // creates scanner
   
      System.out.print("Enter x: ");   // prompts user for input
      height = sc.nextInt();  // gets integer input; stored in height
      
      System.out.print("Enter y: ");   // prompts user for input
      width = sc.nextInt();   // gets integer input; stored in width
      System.out.println();   // blank line
      
      for (int i = 1; i <= height; i++)   // creates <height> number of rows
      {
         for (int j = 1; j <= width; j++) // j becomes numbers 1 to <width> in the full loop
         {
            System.out.print(j + " ");    // prints j and a space
         }
         System.out.println();      // takes the next set of printing to the next line
      }
   }
}