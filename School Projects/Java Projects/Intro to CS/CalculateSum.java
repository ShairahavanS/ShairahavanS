import java.util.*;

/*
   CalculateSum.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 18th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program calculates the sum of a range of numbers as long as the second number is greater than the first.
*/

public class CalculateSum
{
   public static void main(String[] args) 
   {
      int number1, number2, sum;
      
      Scanner sc = new Scanner (System.in);
      
      System.out.print("Enter number #1 in the range: ");   // prompts user for first number; stores integer input in number1
      number1 = sc.nextInt();
      
      System.out.print("Enter number #2 in the range: ");   // prompts user for second number; stores integer input in number2
      number2 = sc.nextInt();
      
      System.out.println();
      
      sum = sumRange(number1, number2);   // storess integer return from method with given information
      System.out.println("The sum of the numbers is " + sum + ".");  // prints sum of range
   }
   
   /*
   ---------------------------------------
   Method Name: int sumRange (int number1, int number2)
   Return Type: returns int - the sum of the numbers in the range from number1 to number2
   Parameters: int number1 - the first number of the range (lowest value in range)
               int number2 - the last number of the range (highest value in range)
               
   This method takes a name and number and returns a welcome message.
   ---------------------------------------
   */
   public static int sumRange (int number1, int number2)
   {
      int sum = 0;   // create return variable
      
      if (number2 < number1)  // if the second number is less than the first number
      {
         System.out.println("Error");  // prints an error and returns 0
      }
      else  // if the second number is greater than or equal to the first number
      {
      
         for (int i = number1; i <= number2; i++) // loop from number1 to number2 and add all the number to the accumulative sum
         {
            sum = sum + i;
         }
      }
      
      return sum;
   }
}