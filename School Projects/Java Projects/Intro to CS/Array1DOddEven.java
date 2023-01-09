import java.util.*;

/*
   Array1DOddEven.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 13th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program inputs 10 integers into an array and and says if all
   integers are even, if al integers are odd or they are mixed.
*/

public class Array1DOddEven
{
   public static void main(String[] args) 
   {
      final int MAX_LENGTH = 10; // size of array
      int[] table = new int[MAX_LENGTH];  // integer array of size 10; gets input from user
      int oddCounter = 0;  // create and initialize counter for odd numbers in array
      int evenCounter = 0; // create and initialize counter for even numbers in array
      int remainder; // create integer that stores remainder used to determine if number is even or odd
      
      Scanner sc = new Scanner(System.in);   // create scanner
      
      for (int i = 0; i < MAX_LENGTH; i++)   // loop 10 times from 0-9 to get input and evaluate all elements
      {
         System.out.print("Enter an integer: ");   // prompt user for input
         table[i] = sc.nextInt();   // get integer input; stores in table[i]
         
         remainder = table[i] % 2;  // find remainder of the number when divided by 2 (to find out if it's odd or even)
         
         if (remainder == 0)  // condition that if remainder is 0
         {
            evenCounter++; // even counter increases by 1
         }
         else if (remainder == 1)   // condition that if remainder is 1
         {
            oddCounter++;  // odd counter increases by 1
         }
      }
   
      if (oddCounter == 10)   // condition that if oddCounter is 10 (if all numbers are odd)
      {
         System.out.println("\nAll 10 integers inputted are odd.");  // print this statement
      }
      else if (evenCounter == 10)   // condition that if evenCounter is 10 (if all numbers are even)
      {
         System.out.println("\nAll 10 integers inputted are even."); // print this statement
      }
      else  // if it is neither all odd or all even
      {
         System.out.println("\nThey are not all even and they are not all odd.");   // print this statement
      }
   }
}