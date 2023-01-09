import java.util.*;

/*
   Backward2.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 7th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program uses a for loop to count backwards from 100 to an inputted number by 5.
*/

public class Backward2
{
   public static void main(String[] args) 
   {
      int number;    // creates integer variable; stores number inputted by user between 50 and 100
      Scanner sc = new Scanner(System.in);      // creates scanner
      
      System.out.print("Enter a number between 50 and 100: ");    // prompts user for input
      number = sc.nextInt();     // gets integer input; stores in number
      
      for (int i = 100; i >=number; i-=5)    // i has a value of 100, the condition is that it must be greater than or equal to number, and i will decrease by 5 f the condition is met.
      {
         System.out.println(i);     // prints value of i
      }
   }
}