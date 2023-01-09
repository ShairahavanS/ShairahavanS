import java.util.*;
import java.lang.*;

/*
   AddDigits.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 18th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program outputs the sum of the digits of a number inputted by the user.
*/

public class AddDigits
{
   public static void main(String[] args) 
   {
      int sumOfDigits = 0;
      int digit;  // used to store string converted to int
      String number;    // input from user
      String digitStr;  // used to get each character from input
      
      Scanner sc = new Scanner (System.in);
      
      System.out.print("Enter an integer: ");   // prompt user and get string input; stored in number
      number = sc.nextLine();
      
      for (int i = 0; i < number.length(); i++) // loop for all characters in string
      {
            digitStr = number.substring(i, i+1);   // get one character from the string
            digit = Integer.parseInt(digitStr); // convert this sing chracter in the string into an integer
            sumOfDigits = sumOfDigits + digit;  // add integer to the accumulative sum of digits
      }
      
      System.out.println("The sum of the digits of " + number + " is " + sumOfDigits + "."); // print sum of digits in number
   }
}