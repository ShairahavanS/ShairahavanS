import java.util.*;

/*
   TimeTable.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 7th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program uses a for loop to create a multiplication table of a number inputted by a user until the number is multiplied by itself
*/

public class TimeTable
{
   public static void main(String[] args) 
   {
      int n, product; // creates integer variables; n stores number inputted by user that will be used to create the n-times table; product stores the value of n times i in the loop
      Scanner sc = new Scanner(System.in);   // creates scanner

      System.out.print("Enter a number: ");  // prompts user for input
      n = sc.nextInt();    // gets integer input; stores in n 
      
      for (int i = 1; i <= n; i++) // creates a loop where i takes the value of all integers until n
      {
         product = n*i;     //multiplies i by n
         System.out.printf("%d X %d = %d%n", n, i, product);   // formats the line into a multiplication equation
      }
   }
}