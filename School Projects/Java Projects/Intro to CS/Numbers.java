import java.util.*;

/*
   Numbers.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 13th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program: a) Declares an array of 6 doubles
                 b) Reads in a list of values from the user
                 c) Prints the values in reverse order
                 d) Adds 10% to each value in the array
                 e) Prints all the values that are over 50
*/

public class Numbers
{
   public static void main(String[] args) 
   {
      final int LENGTH = 6;      // size of array
      final int INDEX_MAX = 5;   // index of last element
      // a)
      double[] number = new double[LENGTH];  // create double array with a size of 6
      Scanner sc = new Scanner(System.in);   // create scanner
      
      // b)
      for (int i = 0; i < LENGTH; i++)    // loop to get all 6 elements of index 0-5
      {
         System.out.print("Enter a number " + (i+1) + ": ");   // prompt user for input
         number[i] = sc.nextDouble();  // get double input; store in number[i]
      }
      
      System.out.println(); // space to separate
      
      // c)
      for (int i = INDEX_MAX; i >= 0; i--)   // counting down from index max to 0 to print in reverse order
      {
         System.out.println(number[i]);      // print number[i]
      }
      
      System.out.println();   // space to separate
      
      // d)
      for (int i = 0; i < LENGTH; i++) // loop 6 times from 0-5 to get all elements
      {
         number[i] = number[i] * 1.1;  // increase value of each element by 10%
      }
      
      
      // e)
      for (int i = 0; i < LENGTH; i++) // loop 6 times from 0-5 to try each element in the for statement
      {
         if (number[i] > 50)  // condition that the element must be greater than 50
         {
            System.out.println(number[i]);   // print element if it is greater than 50
         }
      }
   }
}