import java.util.*;

/*
   AddPairs.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 18th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program divides a number into 2 digit numbers and outputs the sum of those numbers.
*/

public class AddPairs
{
   public static void main(String[] args) 
   {
      int sumOfDigits = 0;
      int digit;  // used to store pair into ints
      String number; // used to store input from user
      String digitStr;  // used to store pair after it is divided 
      
      Scanner sc = new Scanner (System.in);
      
      System.out.print("Enter an integer: ");   // prompt user for input; store string in number
      number = sc.nextLine();
      
      if (number.length() % 2 == 1) // if the number has an odd number of digits, the last digit must be accounted for first and loop will be adjusted
      {
         digitStr = number.substring(number.length()-1); // get the last character of the string
         digit = Integer.parseInt(digitStr); // confert the string into an int
         sumOfDigits = sumOfDigits + digit;  // add to sum of digits
         
         for (int i = 0; i < (number.length()-1); i+=2)  // i will increase by two and be the first number in pair
         {
            digitStr = number.substring(i, i+2);   // divide into pairs
            digit = Integer.parseInt(digitStr);    // convert string into int
            sumOfDigits = sumOfDigits + digit;  // add the pair to the sum of digits
         }
      }
      else  // if the number has an even number of digits, it can just be evaluated
      {
         for (int i = 0; i < number.length(); i+=2)   // i will increase by two and be the first character of the pair
         {
            digitStr = number.substring(i, i+2);   // divide into pairs
            digit = Integer.parseInt(digitStr);    // convert pair into an int
            sumOfDigits = sumOfDigits + digit;  // add the pair to the sum of digits
         }
      }
      
      System.out.println("The sum of the pairs of " + number + " is " + sumOfDigits + ".");  // prints the sum of the pairs in the number
   }
}