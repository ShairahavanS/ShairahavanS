import java.util.*;

/*
   Tennis.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 13th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program will record the score of a tennis match by:
      a) declaring and creating a 2D array of 5x2
      b) prompting the user for the score of each set and fill in the array accordingly
      c) finding and outputting the total number of games won by player 2 (all sets combined)
      d) calculating and outputting how many sets that were won by player 1.  
*/

public class Tennis
{
   public static void main(String[] args) 
   {
      final int SETS = 5;  // number of sets
      final int PLAYERS = 2;  // number of players
      int[][] table = new int[SETS][PLAYERS];   // integer array of dimensions of 5x2
      int player1 = 0;  // variable that counts number of sets won by player 1
      int player2 = 0;  // variable that counts number of sets won by player 2
      int games = 0; // counts number of games won by player 2
      
      Scanner sc = new Scanner(System.in);   // create scanner
      
      for (int i = 0; i < SETS; i++)   // loops 5 times for the 5 sets
      {
         for (int j = 0; j < PLAYERS; j++)   // loops 2 times every set for the two players
         {
            System.out.print("Player " + (j+1) + "'s score in Set " + (i+1) + ": ");   // prompts user for score
            table[i][j] = sc.nextInt();   // gets integer input; stores player j's score in set 1
            
            if (j == 1) // if j is 1, then it is player 2's score
            {
               games = games + table[i][j];  // adds player 2's score to his accumulative score for the match
            }
         }
         
         if (table[i][0] > table[i][1])   // condition that if player 1's score is greater than player 2's score for that set
         {
            player1++;  // player one has won a set and adds to their score
         }
         else if (table[i][0] < table[i][1])// condition that if player 2's score is greater than player 1's score for that set
         {
            player2++;  // player one has won a set and adds to their score
         }
      }
      
      System.out.println(); 
      
      if (player1 > player2)  // condition that if player 1 has won more sets than player 2
      {
         System.out.println("Player 1 Wins!"); 
      }
      else if (player1 < player2)   // condition that if player 2 has won more sets than player 2
      {
         System.out.println("Player 2 Wins!"); 
      }
      
      System.out.println("\nPlayer 2 won " + games + " games.");  // prints how many games player 2 won
      System.out.println("Player 1 won " + player1 + " sets.");   // prints how many sets player 1 won
   }  
}