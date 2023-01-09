import java.util.*;

/*
   Exponent.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 18th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program allows the user to input a base and exponent and then prints out the value.
*/

public class Exponent
{
   public static void main(String[] args) 
   {
      double base, power, number;
      
      Scanner sc = new Scanner (System.in); 
      
      System.out.print("Enter a base: "); // prompt user for base value
      base = sc.nextDouble(); // get double input; store in base
      
      System.out.print("\nEnter a power to the base: "); // prompt user for exponent value
      power = sc.nextDouble();   // get double input; store in power
      
      number = Math.pow(base, power);  // number gets the value of base to the power of power using Math.pow()
      System.out.printf("%n%.2f to the power of %.2f is %.2f.", base, power, number); // prints number
   }
}