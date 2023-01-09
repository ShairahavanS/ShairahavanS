import java.util.*;

/*
   StringLen.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 18th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program prints out the length of a string entered by the user.
*/

public class StringLen
{
   public static void main(String[] args) 
   {
      String word;
      
      Scanner sc = new Scanner (System.in);
      
      System.out.print("Enter a word: "); // prompt user for word
      word = sc.nextLine();   // get String input; store in word
      
      System.out.println("The length of the word is " + word.length() + "."); // use .length() to find the length and tell user
   }
}