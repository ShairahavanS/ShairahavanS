import java.util.*;

/*
   PythagoreanTriples.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 7th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program first prompts the user for a positive integer and then
   finds and prints all Pythagorean triplets whose largest member is 
   less than or equal to that integer using nested loops.
*/

public class PythagoreanTriples
{
   public static void main(String[] args) 
   {
      int number;   // creates integer variable; stores integer inputted by user
      Scanner sc = new Scanner(System.in);   // creates scanner
   
      System.out.print("Enter a number: ");  // prompts user for input
      number = sc.nextInt();        // gets integer input; stored in number
      System.out.println();    // blank line  
      
      for (int i = 3; i <= number; i++)  // c has to be the biggest; loops 3-<number> times
      {
         for (int j = 2; j < number; j++) // b has to be the second biggest; loops 2-(<number>-1) times
         {
            for (int k = 1; k < (number-1); k++) // a has to be the second biggest; loops 2-(<number>-1) times
            {
               if (((k*k+j*j) == i*i) && k<j && j<i && k<i) // condition that it has to be a pythagorean triple and make sure that a<b<c
               {
                  System.out.println(k+"^2 + "+j+"^2 = "+i+"^2"); // prints in pythagorean theorem format
               }
            }
         }
      }
   }
}