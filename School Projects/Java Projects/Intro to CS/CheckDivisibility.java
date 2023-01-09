import java.util.*;

/*
   CheckDivisibility.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 18th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program checks if either of the two numbers inputted are divisible by the other.
*/

public class CheckDivisibility
{
   public static void main(String[] args) 
   {
      int number1, number2;
      String answer;
      
      Scanner sc = new Scanner (System.in);
      
      System.out.print("Enter a number: ");  // prompt user for number; gets integer input and stores in number1
      number1 = sc.nextInt();
      
      System.out.print("Enter a number: ");  // prompt user for number; gets integer input and stores in number2
      number2 = sc.nextInt();
      
      System.out.print("\nIs either number divisible by the other?  "); // print question
      answer = evenlyDivisible(number1, number2);  // answer gets the value of the return of the method with the given information
      System.out.print(answer);  // print answer
   }
   
   /*
   ---------------------------------------
   Method Name: String evenlyDivisible (int number1, int number2)
   Return Type: returns String - the answer if the either number is divisible by the other (true or false)
   Parameters: int number1 - one of the numbers to be evaluated if it can be divided by the other
               int number2 - the other number to be evaluated if it can be divided by the other
               
   This method takes a name and number and returns a welcome message.
   ---------------------------------------
   */
   public static String evenlyDivisible (int number1, int number2)
   {
      String answer = "False";   // create return String
      
      if (number1 == 0 || number2 == 0)   // if one of the numbers is 0, it automatically returns false
      {
         answer = "False";
      }
      else if (number1 % number2 == 0  || number2 % number1 == 0) // if the remainder of either division is 0, it returns true
      {
         answer = "True";
      }
      else if (number1 % number2 != 0  || number2 % number1 != 0) // if the remainder of either equation is not 0, it returns false
      {
         answer = "False";
      }
      
      return answer; // returns String with either true or false
   }
}