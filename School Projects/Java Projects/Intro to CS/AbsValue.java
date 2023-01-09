import java.util.*;

/*
   AbsValue.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 18th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program allows the user to input a number and prints the absolute value of the number.
*/

public class AbsValue
{
   public static void main(String[] args) 
   {
      double number, absNumber;
      
      Scanner sc = new Scanner (System.in);
      
      System.out.print("Enter a number: ");  // prompt user to enter a number; store double in number
      number = sc.nextDouble();
      
      absNumber = Math.abs(number); // store the absolute value of number is absNumber; absolute value found using Math.abs()
      System.out.println("The absolute value of " + number + " is " + absNumber + ".");   // print absolute value
   }
}