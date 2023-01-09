import java.util.*;

/*
   DiagonalSmallest.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 13th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program inputs 16 integers into a 4x4 array and says the
   smallest integer in each diagonal.
*/

public class DiagonalSmallest
{
   public static void main(String[] args) 
   {
      final int MAX_LENGTH = 4;  // size of array on both sides
      int[][] table = new int[MAX_LENGTH][MAX_LENGTH];   // integer 4x4 array
      int diagonal1Smallest = 0; // smallest number for diagonal 1; initialize to prevent error
      int diagonal2Smallest = 0; // smallest number for diagonal 2; initialize to prevent error
      int diagonal1 = -1;  // one lower than 0 so x++ works (later in code)
      int diagonal2 = MAX_LENGTH;   // one higher than index max so that x-- works (later in code)
      
      Scanner sc = new Scanner(System.in);   // create scanner
      
      for (int i = 0; i < MAX_LENGTH; i++)   // loops 4 times for the 4 rows of array
      {
         for (int j = 0; j < MAX_LENGTH; j++)   // loops 4 times for the 4 columns of the array
         {
            System.out.print("Enter an integer: ");   // prompts user for input
            table[i][j] = sc.nextInt();   // gets integer input; stores in table[i][j]
         }
      }
      
      for (int i = 0; i < MAX_LENGTH; i++)   // loop for all elements
      {
         diagonal1++;   // diagonal1 increases by 1
         diagonal2--;   // diagonal2 decreases by 1
         
         if (i == 0) // condition that if i is 0 (if it's the first loop)
         {
            diagonal1Smallest = table[i][diagonal1];  // diagonal2Smallest becomes value of first element of diagonal
         }
         
         if (table[i][diagonal1] < diagonal1Smallest)  // condition that if the element is smaller than the smallest in the diagonal
         {
            diagonal1Smallest = table[i][diagonal1];  // element becomes the new value of diagonal1Smallest
         }
         
         if (diagonal2 == 3)  // condition that if i is 0 (if it's the first loop)
         {
            diagonal2Smallest = table[i][diagonal2];  // diagonal2Smallest becomes value of first element of diagonal
         }
         
         if (table[i][diagonal2] < diagonal2Smallest)  // condition that if the element is smaller than the smallest in the diagonal
         {
            diagonal2Smallest = table[i][diagonal2];  // element becomes the new value of diagonal1Smallest
         }
      }
      
      System.out.println("\nThe smallest number in the diagonal going from top to bottom going right is " + diagonal1Smallest + ".");  // prints smallest number in diagonal 1
      System.out.println("\nThe smallest number in the diagonal going from bottom to top going right is " + diagonal2Smallest + ".");  // prints smallest number in diagonal 2
   }
}