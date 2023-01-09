import java.util.*;

/*
   SameSum.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 13th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program gets 10 numbers put into an array and then gives a value
   to a second array so that corresponding elements in each array added up equal 25.
*/

public class SameSum
{
   public static void main(String[] args) 
   {
      final int NUMBER = 10;     // size of array
      double[] list1 = new double[NUMBER];   // double array of size 10; gets user input
      double[] list2 = new double[NUMBER];   // second double array of size 10
      
      Scanner sc = new Scanner(System.in);   // create scanner
      
      for (int i = 0; i < NUMBER; i++)  // loops 10 times from 0-9 to get all elements
      {
         System.out.print("Enter number #" + (i+1) + ": "); // prompts user for input
         list1[i] = sc.nextDouble();   // gets double input; stores in list1[i]
      }
      
      System.out.println();   // blank line
      
      for (int i = 0; i < NUMBER; i++) // loops 10 times from 0-9 to get all elements
      {
         list2[i] = 25 - list1[i];  // list2[i] gets the values of 25-list1[i] so that list1[i] + list2[i] = 25
      }
      
      System.out.printf(" %-10s| %-10s%n", "list1", "list2");  // header
      System.out.println("-----------------------");  // underline
      
      for (int i = 0; i < NUMBER; i++) // loops 10 times from 0-9 to get all elements
      {
         System.out.printf(" %-10f| %-10f%n", list1[i], list2[i]); // all the elements of list1 and list2 are printed with corresponding elements on the same row
      }
   }
}