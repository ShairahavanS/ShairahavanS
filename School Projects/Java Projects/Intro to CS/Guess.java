import java.util.*;

/*
   Guess.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 7th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program uses a while loop that outputs numbers from a to b where a and b are entered by the user.
*/

public class Guess
{
   public static void main(String[] args) 
   {
      final int NUMBER = 12;     // number in between 1 and 20
      int guess = 1;     // create and initialize integer variable to prevent error entering loop; used to hold the number guessed by the user
      Scanner sc = new Scanner(System.in);      // create scanner   
      
      System.out.println("Enter a number out of range or guess correctly to end program. ");      // tells user how to end program
      
      while (guess != NUMBER && guess >= 1 && guess <= 20)  // condition that number must be in the range of 1-20 (inclusive) and continues program if guess is not correct.
		{
			System.out.print("Guess a number from 1-20: ");    // prompts user for guess 
         guess = sc.nextInt();   // integer input from user; stored in guess
         if (guess == NUMBER)    // condition if guess is correct
         {
            System.out.println("Correct!");     // message for correct answer
         }
         else if (guess < 1 || guess > 20)      // condition is guess is out of range
         {
            System.out.println("Invalid input.");     // message for invalid input
         }
		}
   }
}