import java.util.*;

/*
   Age.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 7th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program uses a while loop to continually get the user to guess my age until they get it right.
*/

public class Age
{
   public static void main(String[] args) 
   {
      final int AGE = 16;     // my age and the value the user has to guess
      int guess = 1;     // creating and initialize the integer variable used to store the values of the guess by the user (initialize to make sure while loop works)
      Scanner sc = new Scanner(System.in);      // create scanner
      
      while (guess != AGE)    // condition that loop continues if guess is incorrect (ages guessed is not my age)
		{
			System.out.print("Guess my age: ");    // prompts user for input
         guess = sc.nextInt();                  // gets integer input; stores in guess
         if (guess == AGE)       // condition if guess is correct
         {
            System.out.println("Correct!");     // prints if guess is right
         }
         else                    // condition if guess is incorrect
         {
            System.out.println("Incorrect.");   // prints if guess is wrong
         }
		}

   }
}