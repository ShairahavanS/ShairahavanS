/**
* Name: Mr. Lee
* Date: Feb 9
* Description: String, ASCII, Casting, Conditionals
*/

import java.util.Scanner;

public class HighestASCII {
   public static void main (String [] args) {
      
      /*
         Given all the words on the line, 
         print out the word with the 
         highest ascii value
      */
      
      /*
         How to approach the problem
          - start with one word
            - deal with ASCII values, store it
          - do the same with multiple words
          - compare
          
      */
      Scanner in = new Scanner(System.in);
      String sentence;
      
      System.out.println("Input words split up by a space");
      sentence = "hello there!";//in.nextLine();
      
      String [] words = sentence.split(" "); //splitting in to different words
      int [] sums = new int[words.length]; //sums for each word
      
      //printing all the words in the array
      for (String word: words) {
         System.out.println(word);
      }
      
      in.close();
      
      //starting with one word, get the individual 
      //ascii values and store it 
      char currC;
      
      //repeat for each of the words
      for (int j = 0; j < words.length; j++) {
         int sum = 0;
         
         //order of operations
   //       System.out.println("hello" + 2 + 3);
   //       System.out.println(2 + 3 + "hello");
   //       double a = 1 + 2.0;
         
         //repeat for all the characters (lenght of the string)
         for (int i = 0; i < words[j].length(); i++) {
            currC = words[j].charAt(i); //get the character
            System.out.println(currC);
           
            sum = currC + sum; //implicit casting; add ASCII value to sum
         }
         System.out.println(sum);
         sums[j] = sum;
      }
      
      for (int s: sums) 
         System.out.println(s);
      //compare the different values/words
      
   }
}