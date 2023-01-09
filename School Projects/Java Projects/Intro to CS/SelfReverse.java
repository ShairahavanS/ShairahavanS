import java.util.*;

/*
   SelfReverse.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 13th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program gets 10 integers inputted by the user into an array and
   stores the values in reverse order in the same array.
*/

public class SelfReverse
{
   public static void main(String[] args) 
   {
      double placeholder = 0.0;  // create and initialize placeholder used to flip the array
      int reverse, indexMax, n;  // create integer variables; 1) used to store reverse counter, 2) largest index of array, 3) used to store inputted integer from user and size of array
      
      Scanner sc = new Scanner(System.in);   // create scanner
      
      System.out.print("How many numbers you want to enter: ");   // prompts user for size of array
      n = sc.nextInt(); // gets integer; stores in n; n is now the size of the array
      indexMax = n-1;   // the largest index of the array will be n-1
      
      double[] list = new double[n];   // create double array of size n
      
      for (int i = 0; i <= indexMax; i++) // loops n times from 0-indexMax to get input for all elements
      {
         System.out.print("Enter number #" + (i+1) + ": "); // prompts user for input
         list[i] = sc.nextDouble(); // gets double input; stores in list[i]
      }
      
      System.out.println();   // blank space
      
      for (int i = 0; i <= (indexMax/2); i++)   // loops n/2 times rounded from 0-indexMax truncated
      {
         placeholder = list[i];  // placeholder momentarily gets the value of list[i]
         reverse = indexMax - i;    // reverse counter is the largest index minus value of i
         list[i] = list[reverse];   // list[i] gets value of list[reverse]; opposite element in array
         list[reverse] = placeholder;  // list[reverse] gets the original value of list[i] which was stored in placeholder
      }
      
      for (int i = 0; i <= indexMax; i++) // loops n times from 0-indexMax to print all elements
      {
         System.out.println(list[i]);  // print all elements of list, now in reverse order
      }
   }
}