import java.util.*;

import java.io.*;

/*
   RepeatDivision.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 25th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program asks for a numerator and divisor and either gives a quotient, an
   error message for either a 0 denominator or invalid values. Type 'q' or 'Q' in the 
   numerator.
*/

public class RepeatDivision2
{
   public static void main(String[] args) 
   {
      double numerator = 0;
      double denominator = 0;
      double quotient;
      String numeratorStr = "";
      String denominatorStr = "";
      boolean valid = false;
      
      
      Scanner sc = new Scanner (System.in);
      
      System.out.println("Type a word that starts with 'Q' or 'q' in the numerator to end the program.\n");
      
      
      do
      {
         do
         {
            try
            {  
               System.out.print("Enter the numerator: "); // prompt for numerator; get String input
               numeratorStr = sc.nextLine();
               
               if (!numeratorStr.substring(0,1).equals("q") && !numeratorStr.substring(0,1).equals("Q")) // if the String doesn't start with Q or q
               { 
                  valid = true;  // valid is true and the String is parsed into a double
                  numerator = Double.parseDouble(numeratorStr); 
               }         
            }
            catch (NumberFormatException e) // if there is a problem parsing,  
            {
               if (numeratorStr.substring(0,1).equals("q") && numeratorStr.substring(0,1).equals("Q"))
               {
                  valid = true;  // if it starts with Q or q, valid stays true
               }
               else  // if it doesn't an error message is printed and valid get the value of false
               {
                  System.out.println("You entered bad data.");
                  System.out.println("Please try again.\n");
                  valid = false;
               }
            }
         } while (valid == false && !numeratorStr.substring(0,1).equals("q") && !numeratorStr.substring(0,1).equals("Q")); // loop while valid is false and the String doesn't start qith Q or q
         
         if (!numeratorStr.substring(0,1).equals("q") && !numeratorStr.substring(0,1).equals("Q")) // as long as the exit condition is not met, this part is ran; if it is met, skip the rest
         {
            do
            {
               try
               {  
                  System.out.print("Enter the denominator: "); // prompt for denominator; get String input
                  denominatorStr = sc.nextLine();  
                  valid = true;
                  denominator = Double.parseDouble(denominatorStr); // parse String into double        
               }
               catch (NumberFormatException e) // if there is problem parsing, error message is printed and valid gets a value of false
               {
                  System.out.println("You entered bad data.");
                  System.out.println("Please try again.\n");
                  valid = false;
               }
            } while (valid == false);  // continue loop is valid is false (invalid input)
         
            try
            {  
               valid = true;
               quotient = (double)(numerator)/denominator;
               
               if (denominator != 0)
               {
                  System.out.println(numerator + " / " + denominator + " = " + quotient + "."); 
               }     
               else
               {
                  System.out.println("You can't divide " + numerator + " by " + denominator + ".");
               }   
            }
            catch (ArithmeticException e)  
            {
               System.out.println("You can't divide " + numerator + " by " + denominator + ".");
               valid = false;
            }
         
            System.out.println();
         }
      } while (!numeratorStr.substring(0,1).equals("q") && !numeratorStr.substring(0,1).equals("Q")); // continure looping as long as exit condition is not met (numerator starting with 'Q' or 'q'
   }
}