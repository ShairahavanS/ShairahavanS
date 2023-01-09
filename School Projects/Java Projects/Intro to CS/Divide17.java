import java.util.*;

/*
   Divide17.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 18th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program creates a number using two inputted numbers from the user and divide the number by 17.
*/

public class Divide17
{
   public static void main(String[] args) 
   {
      final double DIVIDER = 17.0;  // use real to get real quotient
      double quotient;
      String number1, number2, combinedNumber;
      int combinedNumberInt;
      
      Scanner sc = new Scanner (System.in);
      
      System.out.print("Enter number #1: "); // prompt user for first number; string stored in number1
      number1 = sc.nextLine();
      
      System.out.print("Enter number #2: "); // prompt user for second number; string stored in number2
      number2 = sc.nextLine();
      
      combinedNumber = number1 + number2; // combined the two strings to make a bigger string 
      
      combinedNumberInt = Integer.parseInt(combinedNumber); // convert the combined number into an integer
      
      quotient = combinedNumberInt/DIVIDER;  // divide combined number by 17 and store in quotient
      
      System.out.printf("%n%s divided by 17 is %.2f.", combinedNumber, quotient);   // print the quotient in an equation format with words
   }
}