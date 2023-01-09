/*
   Unicode.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 7th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program uses a do while loop to print a table of numbers from 1-212 and their ASCII symbol.
*/

public class Unicode
{
   public static void main(String[] args) 
   {
      char symbol;      // create char variable; used to display unicode symbol each time
      int number = 0;   // create and initialize integer (to prevent error, it is initialized); used to count up from 0 to 212 to display number and cast into symbol
      
      System.out.println("Unicode  Symbol");    // header
      System.out.println("_______  ______");    // underline
      
      do
      {
         number++;       // increases number by 1; same as number = number + 1
         symbol = (char)number;     // casts integer number into a character in symbol
         System.out.printf("%-9d%c%n", number, symbol);  // formatted printing of unicode and symbol; used to evenly space number and symbol 
      } while (number < 212); // condition that loop continues if number is less than 212
   
   }
}