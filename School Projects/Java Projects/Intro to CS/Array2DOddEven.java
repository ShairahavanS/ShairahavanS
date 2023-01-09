import java.util.*;

/*
   Array2DOddEven.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 13th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program gets input into a 3x3 2D array and says if each column and row
   has all even or all odd numbers.
*/

public class Array2DOddEven
{
   public static void main(String[] args) 
   {
      final int MAX_LENGTH = 3;  // size of array
      int[][] table = new int[MAX_LENGTH][MAX_LENGTH];   // create double array that is 3x3
      int oddCounter = 0;  // create and initialize counter for odd numbers in array
      int evenCounter = 0; // create and initialize counter for even numbers in array
      int remainder; // create integer that stores remainder used to determine if number is even or odd
      
      Scanner sc = new Scanner(System.in);   // create scanner
      
      for (int i = 0; i < MAX_LENGTH; i++)   // loops 3 times from 0-2
      {
         for (int j = 0; j < MAX_LENGTH; j++)   // loops 3 times for every i loop from 0-2
         {
            System.out.print("Enter an integer: ");   // prompts user for input
            table[i][j] = sc.nextInt();   // get integer input; stores in table[i][j]
         }
      }
      
      System.out.println();   // blank line
      
      for (int i = 0; i < MAX_LENGTH; i++)   // each row (loops 3 times) 
      {      
         evenCounter = 0;  // evenCounter returns to 0 after every j loop
         oddCounter = 0;   // oddCounter returns to 0 after every j loop
         
         for (int j = 0; j < MAX_LENGTH; j++)   // numbers in a row (loops 3 times)
         {       
            remainder = table[i][j] % 2;  // remainder when divided by 2 to helps determine if it's odd or even
         
            if (remainder == 0)  // condition that if remainder is 0
            {
               evenCounter++; // evenCounter increases by 1
            }
            else if (remainder == 1)   // condition that if remainder is 1
            {
               oddCounter++;  // oddCounter increases by 1
            }
         }
         
         if (oddCounter == 3) // condition that if oddCounter is equal to 3 (all 3 numbers are odd)
         {
            System.out.println("All 3 integers in Row "+(i+1)+" are odd.");   // print statement
         }
         else if (evenCounter == 3) // condition that if evenCounter is equal to 3 (all 3 numbers are even)
         {
            System.out.println("All 3 integers in Row "+(i+1)+" are even.");  // print statement
         }
      }
      
      for (int i = 0; i < MAX_LENGTH; i++)   // each row (loops 3 times) 
      {      
         evenCounter = 0;  // evenCounter returns to 0 after every j loop
         oddCounter = 0;   // oddCounter returns to 0 after every j loop
         
         for (int j = 0; j < MAX_LENGTH; j++)   // numbers in a row (loops 3 times)
         {       
            remainder = table[j][i] % 2;  // remainder when divided by 2 to helps determine if it's odd or even
         
            if (remainder == 0)  // condition that if remainder is 0
            {
               evenCounter++; // evenCounter increases by 1
            }
            else if (remainder == 1)   // condition that if remainder is 1
            {
               oddCounter++;  // oddCounter increases by 1
            }
         }
         
         if (oddCounter == 3) // condition that if oddCounter is equal to 3 (all 3 numbers are odd)
         {
            System.out.println("All 3 integers in Column "+(i+1)+" are odd.");   // print statement
         }
         else if (evenCounter == 3) // condition that if evenCounter is equal to 3 (all 3 numbers are even)
         {
            System.out.println("All 3 integers in Column "+(i+1)+" are even.");  // print statement
         }
      }   
   }
}