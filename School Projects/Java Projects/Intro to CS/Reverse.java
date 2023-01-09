import java.util.*;

/*
   Reverse.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 13th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program gets 10 integers inputted by the user into an array and
   stores the values in another array in reverse order.
*/

public class Reverse
{
   public static void main(String[] args) 
   {
      final int NUMBER = 10;     // size of array
      final int INDEX_MAX = 9;   // largest index of array
      double[] list1 = new double[NUMBER];   // create double array with a size of 10; stores input from user
      double[] list2 = new double[NUMBER];   // create double array with a size of 10; stores values of list1[] in reverse order
      int reverse;   // used to store a reverse counter 
      
      Scanner sc = new Scanner(System.in);   // create scanner
      
      for (int i = 0; i <= INDEX_MAX; i++)   // loops 10 times from 0-9 to get all elements
      {
         System.out.print("Enter number #" + (i+1) + ": "); // prompts user for input
         list1[i] = sc.nextDouble();   // gets double input; stores in list[i]
         reverse = INDEX_MAX - i;      // counter the counts in reverse (backwards from index max)
         list2[reverse] = list1[i];    // list2[reverse] stores the value of list[i] so that the elements are in reverse order in list2
      }
      
      System.out.println();   // blank space
      
      for (int i = 0; i <= INDEX_MAX; i++)   // loops 10 times from 0-9 so all elements are printed
      {
         System.out.println(list2[i]); // print elements of list2 in order
      }
   }
}