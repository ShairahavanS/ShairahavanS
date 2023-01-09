import java.util.*;

/*
   TwoLargest.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 13th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program assigns random values to 10 integers of an array and finds the two largest numbers.
*/

public class TwoLargest
{
   public static void main(String[] args) 
   {
      final int NUMBER = 10;     // size of array
      int[] random = new int[NUMBER];  // create double array with a size of 10; stores input from user
      int largest1, largest2;    // create two double used to store the largest two numbers
      int counter = 0; // this variable is too make sure that if there are two or more numbers tied for the largest number, that the two largest numbers are that number
                       // if this scenario is not accounted for, it may give incorrect results if that scenario occurs
                       // condition in one loop that the second largest number can't be the largest number; this variable will be used to evaluate to see if this must be changed
      
      Scanner sc = new Scanner(System.in);   // create scanner
      
      for (int i = 0; i < NUMBER; i++)    // loop 10 times from 0-9 to get elements of the array
      {
         random[i] = (int)(Math.random()*1001);    // assign a random value to each element
         System.out.println(random[i]);      // print the value of the element
      }
      
      largest1 = -1; // assign a negative number; every random number is positive so it should be initalized so the original value can't be the value after the loop
      largest2 = -1; // assign a negative number
      
      for (int i = 0; i < NUMBER; i++) // loop 10 times from 0-9 to evaluate all elements
      {
         if (random[i] > largest1)  // if the element is larger than the current largest number
         {
            largest1 = random[i];   // the element takes on the value of the largest number
         }
      }
      
      for (int i = 0; i < NUMBER; i++) // loop 10 times from 0-9 to evaluate all elements
      {
         if (random[i] == largest1)  // condition that if the element is equal to the largest number
         {
            counter++;   // the counter increases by 1; if the counter is more than 1, steps will be taken to ensure accurate results
         }
      }
      
      for (int i = 0; i < NUMBER; i++) // loop 10 times from 0-9 to evaluate all elements
      {
         if ((random[i] > largest2) && random[i] != largest1)  // if the element is larger than the current second largest number and is not the largest number
         {
            largest2 = random[i];   // the element takes on the value of the second largest number
         }
      }
      
      if (counter > 1)  // condition that if the counter is greater than 1 (the largest number occurs more than once)
      {
         largest2 = largest1; // the second largest number is then equal to the largest number
      }
      
      System.out.println("Your largest number is " + largest1 + ".");    // prints statement declaring largest number
      System.out.println("Your second largest number is " + largest2 + ".");    // prints statement declaring second largest number
   }
}