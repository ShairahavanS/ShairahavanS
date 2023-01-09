import java.util.*;

/*
   StarTable.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 13th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program creates an array which has element store an asterisk
   and prints out a rectangle of asterisks based on the user's input.
*/

public class StarTable
{
   public static void main(String[] args) 
   {
      int maxRows, maxColumns;   // creates integer variables; used to store input from the user; number of rows and columns for the box and size of array
      
      Scanner sc = new Scanner(System.in);   // creates scanner
      
      System.out.print("How many rows: ");   // prompts user for number of rows
      maxRows = sc.nextInt();    // gets integer input; stored in maxRows; number of rows in array and box
      
      System.out.print("How many columns: ");      // prompts user for number of columns
      maxColumns = sc.nextInt();    // gets integer input; stored in maxColumns; number of columns in array and box
      System.out.println();
      
      String[][] star = new String[maxRows][maxColumns]; // create String array star with dimensions of the user's input
      
      for (int i = 0; i < maxRows; i++)      // to get all the rows of the array
      {
         for (int j = 0; j < maxColumns; j++)      // to get all the columns of the array
         {
            star[i][j] = "*";    // stores asterisk in all elements
            System.out.print(star[i][j]);    // prints all elements
         }
         System.out.println();   // after row is printed, next set of output goes on next line
      }
   }
}