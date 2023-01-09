import java.util.*;

/*
   CountInt2.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 7th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program uses a do while loop that allows user to continually input integers
   until a negative number is entered and the count of inputted numbers
   is displayed.
*/

public class CountInt2
{
   public static void main(String[] args) 
   {
      int number, count;      // creates integer variables; number stores the integer inputted by the user; count counts the number of integers inputted
      Scanner sc = new Scanner(System.in);      // create scanner
      
      System.out.println("Enter a negative number to terminate. ");  // prints notice
      
      // count of integers inputted
      count = -1;    // to get the count to 0 before first integer is entered
      
      do
      {
         count = count+1;     // increases count by 1 for every integer entered
         System.out.print("Enter a number: ");  // prompts user for input
         number = sc.nextInt();     // gets integer input; stored in number
      } while (number >= 0);       // condition is that the loop continues until input is negative
            
      System.out.print(count + " numbers were entered.");   // prints count of integers entered
   }
}