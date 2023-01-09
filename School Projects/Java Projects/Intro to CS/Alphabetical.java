import java.util.*;

/*
   Alphabetical.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 18th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program asks the user for two strings and tells them whether 
   the first is alphabetically first, last or equal.
*/

public class Alphabetical
{
   public static void main(String[] args) 
   {
      String word1, word2;
      
      Scanner sc = new Scanner (System.in);
      
      System.out.print("Enter a word: "); // prompt for first word; get String input and store in word1
      word1 = sc.nextLine();
      
      System.out.print("Enter another word: "); // prompt for second word; get String input and store in word2
      word2 = sc.nextLine();
      
      if (word2.compareTo(word1) == 0) // condition if they are compared to be equal to 0 (no change), they are the same
      {
         System.out.print("The words are the same alphabetically. ");
      }
      else if (word2.compareTo(word1) > 0)   // condition if word 1 is greater than word 2, it is higher alphabetically
      {
         System.out.print("The word 1 is before word 2 alphabetically. ");
      }
      else if (word2.compareTo(word1) < 0)   // condition if word 1 is less than word 2, it is higher alphabetically
      {
         System.out.print("The word 2 is before word 1 alphabetically. ");
      }
   }
}