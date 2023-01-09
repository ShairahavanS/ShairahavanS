import java.util.*;

/*
   Half.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 18th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program asks the user for a string and prints half of it on one line and the other half on another.
*/

public class Half
{
   public static void main(String[] args) 
   {
      String word;
      int halfLength;
      
      Scanner sc = new Scanner (System.in);
      
      System.out.print("Enter a word: "); // prompt user; get String input and store in words
      word = sc.nextLine();
      
      halfLength = word.length();  // halfLength is the word's length divided by 2
      halfLength = halfLength / 2;
      
      System.out.println();
      System.out.println(word.substring(0, halfLength)); // print first half 
      System.out.println(word.substring(halfLength, word.length())); // print second half
   }
}