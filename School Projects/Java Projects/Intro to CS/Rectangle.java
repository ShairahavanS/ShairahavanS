import java.util.*;

/*
   Rectangle.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 7th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program uses a nested loop to creates a rectangle using asterisks
   with the inputted values from the user for rows and columns.
*/

public class Rectangle
{
   public static void main(String[] args) 
   {
      int width, height;   // creates integer variables; width stores the number of columns inputted by user; height stores number of rows inputted by user
      Scanner sc = new Scanner(System.in);   // creates scanner
   
      System.out.print("Enter # of rows: "); // prompts user for input
      height = sc.nextInt();     // integer is inputted; stored in height
      
      System.out.print("Enter # of columns: "); // prompts user for input
      width = sc.nextInt();      // integer is inputted; stored in width
      System.out.println();      // blank line
      
      for (int i = 1; i <= height; i++)   // loops to print <height> number of rows
      {
         for (int j = 1; j <= width; j++) // loop continues <width> many times and prints <width> many asterisks
         {
            System.out.print("*");     // prints an asterisk
         }
         System.out.println();      // prints a blank line to go to next line
      }
   }
}