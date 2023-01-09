import java.util.*;

/*
   LeastTwoPower.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 7th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program inputs a positive integer and finds the least power 
   of two that is greater than or equal to the inputted number.
*/

public class LeastTwoPower
{
   public static void main(String[] args) 
   {
      final int TWO = 2;      // create a constant for 2 (rather than using 2)
      int number, exponent, power;  // create integer variables
                                    // 1) number holds the integer inputted by the user
                                    // 2) exponent serves as a counter to get the exponent of the least two power
                                    // 3) power is the calculated least two power
      double dividend = 2.0;      // create and initialize a double to prevent error; used to store value of number to find least two power
      Scanner sc = new Scanner(System.in);      // create scanner
      
      exponent = 0;     // variable is initialized so that it can count up from 0 by 1
      
      System.out.print("Enter a number: ");     // prompts user for input
      number = sc.nextInt();     // gets integer input; stores in number
      
      dividend = (double)number;    // copy the input into a double for real division
      
      // each subsequent quotient must be greater than 1 
      // this makes sure that if the number is a power of two, it does not increase the exponent to the value above
      // a power of two must eventually have a quotient of 
      while (dividend > 1)       
      {
         dividend/=2;            // divide by two
         exponent++;             // exponent increases by 1
      }
      
      power = 1;                 // initialize the power to 1
      
      while (exponent > 0)       // condition that as long as the exponent is greater than 0
      {
         power = power*TWO;      // the power of two is created by multiplying 2 as many times as it satisfies the condition
         exponent--;             // decrease exponent after each multiplication
      }
      
      System.out.println("The closest power of two greater than or equal to "+number+ " is "+ power);    // print out for user to read
   }
}