import java.util.*;

/*
   FirstLast.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 18th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program prints the first and last character of a string entered by the user.
*/

public class FirstLast
{
   public static void main(String[] args) 
   {
      String word;
      int length;
      
      Scanner sc = new Scanner (System.in);
      
      System.out.print("Enter a word: "); // prompt user for input
      word = sc.nextLine();   // get String input; store in word
      
      length = word.length(); // store length of word in variable length
      length--;   // decrease by 1 as characters are zero indexed
      
      System.out.println("The first letter of the word is " + word.charAt(0) + ".");   // print first character using .charAt(0) as 0 is the first letter 
      System.out.println("The last letter of the word is " + word.charAt(length) + "."); // print first character using .charAt(length) as length is the last letter (because word.length() was decreased by 1) 
   }
}