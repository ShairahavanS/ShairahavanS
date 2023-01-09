import java.util.*;

/*
   Sum.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 7th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program uses a do while loop and inputs positive integers and displays the
   sum until the loop is exited by inputting a negative integer.
*/

public class Sum
{
   public static void main(String[] args) 
   {
      int sum, number;     // create integer variables; sum stores the sum of the numbers inputted; number stores the integer inputted by the user
      Scanner sc = new Scanner(System.in);      // create scanner
   
      sum = 0;    // initialize to prevent error
      System.out.println("Enter a negative integer to terminate.");     // prints notice
      System.out.print("Enter a positive integer: ");    // prompts user to input positive integer
      number = sc.nextInt();  // inputs an integer; stores in number
      
      do
		{
         sum = sum + number;     // adds the number to the collective sum
         System.out.println("The sum is "+ sum);   // prints sum of all inputted integers so far
         System.out.print("Enter a positive integer: ");    // prompts user to input positive integer
         number = sc.nextInt();  // inputs an integer; stores in number
		} while (number > 0);      // condition that the number must be positive to continue loop
      
      System.out.println("The sum of all the numbers is " + sum);    // prints final sum of inputted numbers
   }
}