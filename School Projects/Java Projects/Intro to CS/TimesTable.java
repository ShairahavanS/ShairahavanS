import java.util.*;

/*
   TimesTable.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 13th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program creates a 12x12 times table using arrays.
*/

public class TimesTable
{
   public static void main(String[] args) 
   {
      final int MAX_LENGTH = 12;    // length of the array on both sides
      
      int[][] table = new int[MAX_LENGTH][MAX_LENGTH];   // create 12 x 12 integer array
      
      for (int i = 0; i < MAX_LENGTH; i++)      // for all rows of the array
      {
         for (int j = 0; j < MAX_LENGTH; j++)   // for all the columns of the array
         {
            table[i][j] = (i+1)*(j+1);       // store the value of i*j in element table[i][j]
         }
      }
      
      System.out.printf("%-4s|", "");
      
      for (int i = 0; i < MAX_LENGTH; i++)   // to get all the values of 1 to 12 to create the table
      {
         System.out.printf("%-4d|", table[i][0]);   // prints numbers 1-12
      }
      
      System.out.println();   // next output begins on next line
      
      for (int i = 1; i <= 65; i++)     // for 65 dashes between rows
      {
         System.out.print("-");   // prints dashes to divide the table to look like a table
      }
      
      System.out.println();   // next output begins on next line
      
      for (int i = 0; i < MAX_LENGTH; i++)      // all the rows of the array
      {
         System.out.printf("%-4d|", table[i][0]);   // prints row number before the row of values is printed
         
         for (int j = 0; j < MAX_LENGTH; j++)      // all the columns of the array
         {
            System.out.printf("%-4d|", table[i][j]);   // prints value of table[i][j] which is the value of i*j; formatted to make a 4 space box
         }
         
         System.out.println();   // next underline begins on next line
         
         for (int k = 1; k <= 65; k++)     // for 65 dashes between rows
         {
            System.out.print("-");   // prints dashes to divide the table to look like a table
         }
         
         System.out.println();   // next set of numbers begins on next line
      }
   }
}