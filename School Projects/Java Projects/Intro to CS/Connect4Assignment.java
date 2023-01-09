import java.util.*;

import java.io.*;

/*
   Connect4Assignment.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Feb 3rd, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program allows the user to play a game of Connect 4 with the computer. It records 
   their record and allows the user to return with theri record saved. The user can play 
   for as many rounds as they want.
   ---------------------------------------
   Change Log:
   -----------
   Jan 27:
      - Create board array
      - Basic prompts
      - Method for resetting the board
      - Method for printing the board
      
   Jan 28:
      - Asks user if they are a returning player and gets/creates their file and writes
      - Makes sure that returning player has indeed player before
      - Prints the user's record at beginning or end
      - Create condition for if the user wants to play again
      - Asks user for move and makes sure it is valid
      
   Jan 29:
      - Creates computer's move
   
   Jan 31:
      - Creates the gameOver method
   
   Feb 1:
      - Creates the result method to work
      - Combined evaluate and addMove methods
      - Creates feature that allows user to choose their piece
   
   Feb 2:
      -  Add comments
   
   Feb 3:
      -  Add AI 
   
   ---------------------------------------
*/

public class Connect4Assignment
{
   final static int ROWS = 6;
   final static int COLUMNS = 7;
   
   public static void main(String[] args) 
   {
      final char RED_PIECE = 'X';
      final char YELLOW_PIECE = 'O';
      char playerPiece = '.';
      char computerPiece = '.';
      String choiceOfPiece;
      int player = 0;
      int playerMove = 0;
      int computerMove;
      int round = 0;
      String playAgain = "No";
      String name;
      String lineIn;
      String fileName;
      String enter;
      double winPercentage = 0;
      double lossPercentage = 0;
      int wins = 0;
      int losses = 0;
      int ties = 0;
      int gamesPlayed = 0;
      boolean valid = false;
      boolean endOfGame = false;
      String result;
      
      char[][] board = new char[ROWS][COLUMNS];
      
      Scanner sc = new Scanner (System.in);
      
      // Getting the records
      do
      {
         do
         {
            try
            {
               System.out.println("Are you a returning or new player? ");  // prompt user for integer; 
               System.out.println("1) Returning Player");
               System.out.println("2) New Player");
            
               System.out.print("--> ");
               lineIn = sc.nextLine();
            
               player = Integer.parseInt(lineIn);  // parse integer
            
               if (player == 1 || player == 2)  // make the do-while loop end by making the condition false so it unsatisfies the loop condition
               {
                  valid = true;
               }
               else if (player < 1 || player > 2)  // if the number is not 1 or 2, prompt for 1 or 2
               {
                  System.out.println("\nPlease enter 1 or 2.\n");
                  valid = false;
               } 
            }
            catch (NumberFormatException e)   // if there's a problem parsing, prompt them to enter 1 or 2
            {
               System.out.println("\nPlease enter 1 or 2.\n");
               valid = false;
            } 
         } while (valid == false);  // lets user pass through if it's 1 or 2
      
         valid = false;
      
         System.out.print("\nWhat is your name? ");   // prompt user for name
         name = sc.nextLine();
      
         System.out.println();
         fileName = name + ".txt";  // user's file name is the user's name + .txt
      
         try
         {  
            if (player == 1)  // if the user is returning, scan their file
            {
               Scanner reader = new Scanner(new File(fileName));
               
               // read first line, becomes number of wins
               lineIn = reader.nextLine();
               wins = Integer.parseInt(lineIn);
               // read second line, becomes number of losses
               lineIn = reader.nextLine();
               losses = Integer.parseInt(lineIn);
               // read third line, becomes number of ties
               lineIn = reader.nextLine();
               ties = Integer.parseInt(lineIn);
               reader.close();
               valid = true;  // let user through do-while loop
            }
            else if (player == 2)   // if the user is a new user
            {
               // buffered writer created to write new file
               BufferedWriter out = new BufferedWriter(new FileWriter(fileName, false));
               
               // write '0' on 3 lines and assign 3 to all three variables
               out.write("" + 0);
               wins = 0;
               out.newLine();
               out.write("" + 0);
               losses = 0;
               out.newLine();
               out.write("" + 0);
               ties = 0;
               out.newLine();
               out.close();
               valid = true;  // let user through do-while loop
            }            
         }
         catch (IOException e)   // if there is an issue reading the file, it's because the user is not a returning user
         {
            System.out.println("\nFile Not Found.\nYou are not a returning user\nPlease try again.\n");
            valid = false;
         } 
      } while (valid == false);  // while the inputted data is not valid
      
      welcomeMessage(name);   // print welcome message and game totals
      System.out.println("\nYou have " + wins + " wins.");
      System.out.println("You have " + losses + " losses.");
      System.out.println("You have " + ties + " ties.\n");
      
      gamesPlayed = wins + losses + ties; // games played gets a value
      try
      {
         winPercentage = (double)(wins)/(double)(gamesPlayed); // calculate win and losing percentage
         winPercentage = winPercentage * 100.0;
         lossPercentage = (double)(losses)/(double)(gamesPlayed);
         lossPercentage = lossPercentage * 100.0;
         
         if (gamesPlayed == 0)   // if no games have been played
         {
            System.out.println("No games have been played.\n");
         }
         else  // print records if games have been played
         {
            System.out.printf("You have a winning percentage of %.2f%s%n", winPercentage, "%.");
            System.out.printf("You have a losing percentage of %.2f%s%n%n", lossPercentage, "%.");
         }
      }
      catch (ArithmeticException e) // if there's a math error
      {
         System.out.println("No games have been played yet.\n");
      }
      
      // -----------------------------------------------------------------------------
      // Game Play
      
      do
      {
         resetBoard(board);   // method that clears the board to have only spaces
         round = 0;
         valid = false;
         
         do
         {
            System.out.print("\nWhich piece do you want: X or O?  ");   // asks user what character they want
            choiceOfPiece = sc.nextLine();
         
            if (choiceOfPiece.toLowerCase().equals("x")) // if it's x, the player gets X and computer gets O
            {
               playerPiece = RED_PIECE;
               computerPiece = YELLOW_PIECE;
               valid = true;
            }
            else if (choiceOfPiece.toLowerCase().equals("o")) // if it's o, the player gets O and computer gets X
            {
               playerPiece = YELLOW_PIECE;
               computerPiece = RED_PIECE;
               valid = true;
            }
            else  // if it is neither, ask for the input again and for a valid option
            {
               System.out.println("\nPlease choose a valid option.");
               valid = false;
            }
         
         } while (valid == false);
          
         do
         {
            // player move
            
            System.out.print("\nPlease press enter start your move: ");   // let user dictate when they go
            enter = sc.nextLine();
            valid = false;
            System.out.println("\n*-------------*");
            System.out.println("|  YOUR TURN  |");
            System.out.println("*-------------*\n");
            
            round++;
            printBoard(board);   // prints the board
            
            do
            {
               do
               {
                  try
                  {
                     System.out.print("\nWhich column do you want to place your token? ");
                     playerMove = Integer.parseInt(sc.nextLine());
                  
                     while (playerMove < 1 || playerMove > 7)  // if it's a number but not from 1-7, ask again
                     {
                        System.out.println("\nPlease pick a column from 1-7.");
                        System.out.print("Which column do you want to place your token? ");
                        playerMove = Integer.parseInt(sc.nextLine());
                     }
                     valid = true;
                  }
                  catch (NumberFormatException e)  // if there's trouble parsing, ask for input again
                  {
                     System.out.println("\nPlease pick a column from 1-7.");
                     valid = false;
                  }
               } while (valid == false);
               
               playerMove--;  // decrease by 1 to match array
               
               valid = evaluate(playerMove, board, playerPiece);  // evaluate and add piece if it is valid
            
               if (valid == false)  // if it is not valid, ask for input again
               {
                  System.out.println("\nInvalid move. Column is already filled.\nPlease try again.");
               }
            } while (valid == false);  // while the input is invalid, loop
            
            System.out.println();
            
            printBoard(board);   // print board again
            
            System.out.println();
            
            endOfGame = gameOver(board, playerPiece, computerPiece);
            
            if (endOfGame == false) // if the game has not ended, continue with computer's turn
            { 
               System.out.print("Please press enter for the computer to move: ");   // let user dictate when the computer goes
               enter = sc.nextLine();
               System.out.println();
            
            // Computer move
               System.out.println("*-------------------*");
               System.out.println("|  COMPUTER'S TURN  |");
               System.out.println("*-------------------*\n");
               valid = false;
               
               do
               {
                  computerMove = calculate(board, round); // pick a random number between 0 and 6
                  valid = evaluate(computerMove, board, computerPiece); // check if it's valid and adds move if it is
               } while (valid == false);
            
               printBoard(board);   // prints board
               
               System.out.println("\nThe computer put a token in Column " + (computerMove+1) + ".\n");   // says where the computer moved
            
               endOfGame = gameOver(board, playerPiece, computerPiece); // check if the game has ended
            }
            
         } while (endOfGame == false); // continue looping game if game has not ended
         
         result = resultOfGame(board, playerPiece, computerPiece);   // when game is done, evaluates the result; gets String return
         
         if (result.equals("win"))  // if it's a win, update and notify user
         {
            wins++;
            System.out.println("You win!!!\n");
         }
         else if (result.equals("loss"))  // if it's a loss, update and notify user
         {
            losses++;
            System.out.println("You lose.\n");
         }
         else if (result.equals("tie"))   // if it's a tie, update and notify user
         {
            ties++;
            System.out.println("It's a draw.\n");
         }
         
      // -----------------------------------------------------------------------------   
      // Printing the new records
      
         try
         {  
            // write new records (wins, losses, ties)
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName, false));
            
            out.write("" + wins);
            out.newLine();
            out.write("" + losses);
            out.newLine();
            out.write("" + ties);
            out.newLine();
            out.close();        
         }
         catch (IOException e)   // if there is an issue finding the file
         {
            System.out.println(e + " Problem Finding " + fileName);
         } 
         
         // print new records
         System.out.println("\nYou have " + wins + " wins.");
         System.out.println("You have " + losses + " losses.");
         System.out.println("You have " + ties + " ties.\n");
      
         gamesPlayed = wins + losses + ties; // update games played
         
         // calculate win and losing percentage
         winPercentage = (double)(wins)/(double)(gamesPlayed);
         winPercentage = winPercentage * 100.0;
         lossPercentage = (double)(losses)/(double)(gamesPlayed);
         lossPercentage = lossPercentage * 100.0;
         
         // print new records
         System.out.printf("You have a winning percentage of %.2f%s%n", winPercentage, "%.");
         System.out.printf("You have a losing percentage of %.2f%s%n%n", lossPercentage, "%.");
            
            
         // -----------------------------------------------------------------------------
         // Playing Again
      
         System.out.print("Do you want to play again? ");   // ask user if they want to play again
         playAgain = sc.nextLine();
         
         // if answer is not yes or no
         while (!playAgain.toLowerCase().equals("yes") && !playAgain.toLowerCase().equals("no"))
         {
            System.out.println();
            System.out.println("Please answer yes or no:  ");  // ask them to answer again; has to be yes or no
            System.out.print("Do you want to play again? ");
            playAgain = sc.nextLine();
         }
         
      } while (playAgain.toLowerCase().equals("yes"));   // continue looping if the user wants to continue to play again (answer yes)
      
      System.out.println("\nBye " + name + "! Have a great day!!!");
   }
   
   // --------------------------------------------------------------------------------
   // METHODS:
   
   /*
   ---------------------------------------
   Method Name: String welcomeMessage (String name)
   Return Type: returns nothing - void
   Parameters: String name - the name of the user
   
   This method takes a name and returns a welcome message.
   ---------------------------------------
   */
   
   public static void welcomeMessage (String name)
   {
      System.out.println("Welcome " + name + "! Have fun!"); // create message with given info
   }
      
   /*
   ---------------------------------------
   Method Name: void resetBoard(char[][] fullBoard)
   Return Type: returns nothing - void
   Parameters: char[][] fullBoard - the connect 4 board
   
   This method resets the board so that every element is blank (a space). 
   ---------------------------------------
   */
   
   public static void resetBoard(char[][] fullBoard)
   {  
      for (int i = 0; i < ROWS; i++)
      {
         for (int j = 0; j < COLUMNS; j++)
         {
            fullBoard[i][j] = ' ';  // every element becomes a space
         }
      }
     
   }
   
   /*
   ---------------------------------------
   Method Name: void printBoard(char[][] fullBoard)
   Return Type: returns nothing - void
   Parameters: char[][] fullBoard - the connect 4 board
   
   This method prints out the connect 4 board.
   ---------------------------------------
   */
   public static void printBoard(char[][] fullBoard)
   {  
      System.out.println("    1  2  3  4  5  6  7    ");
      for (int i = 0; i < ROWS; i++)
      {
         System.out.print((i+1)+" |");
         for (int j = 0; j < COLUMNS; j++)
         {
            System.out.print(' ');
            System.out.print(fullBoard[i][j]);
            System.out.print(' ');
         }
         System.out.println("| "+(i+1));
      } 
      System.out.println("  -----------------------  ");
      System.out.println("    1  2  3  4  5  6  7    ");
   }
   
   
   /*
   ---------------------------------------
   Method Name: boolean evaluate(int move, char[][] board, char piece)
   Return Type: returns boolean - asnwer to if it is a valid move 
   Parameters: int move  - the player's move; what column they chose
               char[][] board - the connect 4 board
               char piece - the token that needs to be evaluated and placed
   
   This method evaluates the player's move to see if the column is filled and places
   the token if it is a valid move and returns true. If it's invalid, it returns false.
   ---------------------------------------
   */
   
   public static boolean evaluate(int move, char[][] board, char piece)
   {  
      boolean valid = false;
      
      for (int i = (ROWS-1); i >= 0; i--) // for all the rows from bottom to top
      {
         if (valid == false)  // if the piece hasn't been placed yet
         {
            if (board[i][move] == ' ') // if there is a space, add the piece and return true
            {
               board[i][move] = piece;
               valid = true;
            }
         }
      }
      return valid;
   }
   
   
   /*
   ---------------------------------------
   Method Name: boolean gameOver(char[][] board, char playerPiece, char computerPiece)
   Return Type: returns boolean - says if the game is over
   Parameters: char[][] board - the connect 4 board
               char playerPiece - the token of the player
               char computerPiece - the token of the computer
   
   This method evaluates to see if the game should end and returns true if it should end
   or false if it shouldn't end.
   ---------------------------------------
   */
   public static boolean gameOver(char[][] board, char playerPiece, char computerPiece)
   {  
      boolean valid = false;
      
      // Check Columns
      for (int i = 0; i <= (ROWS-4); i++) // for all the rows for which rows+3 is still in the array
      {
         for (int j = 0; j < COLUMNS; j++)
         {
            if (board[i][j] == board[i+1][j] && board[i][j] == board[i+2][j] && board[i][j] == board[i+3][j])  // if the 3 tokens below are the same as the first token
            {
               if (board[i][j] == computerPiece || board[i][j] == playerPiece)   // if it's a piece
               {
                  valid = true;  // game ends
               }
            }
         }
      }
      
      // Check Rows
      if (valid == false)
      {
         for (int i = 0; i < ROWS; i++)
         {
            for (int j = 0; j <= (COLUMNS-4); j++) // for all the columns for which rows+3 is still in the array
            {
               if (board[i][j] == board[i][j+1] && board[i][j] == board[i][j+2] && board[i][j] == board[i][j+3])  // if the 3 tokens below are the same as the first token
               {
                  if (board[i][j] == computerPiece || board[i][j] == playerPiece)   // if it's a piece
                  {
                     valid = true;  // game ends
                  }
               }
            }
         }
      }
      
      // Check diagonals
      if (valid == false)
      {
         for (int i = (ROWS-1); i > (ROWS-4); i--) // for all diagonals bottom to top
         {
            for (int j = 0; j <= (COLUMNS-4); j++)
            {
               if (board[i][j] == board[i-1][j+1] && board[i][j] == board[i-2][j+2] && board[i][j] == board[i-3][j+3])  // if the 3 tokens in the diagonal are the same as the first token
               {
                  if (board[i][j] == computerPiece || board[i][j] == playerPiece)   // if it's a piece
                  {
                     valid = true;  // game ends
                  }
               }
            }
         }
      }
      
      if (valid == false)
      {
         for (int i = 0; i <= (ROWS-4); i++) // for all diagonals top to bottom
         {
            for (int j = 0; j <= (COLUMNS-4); j++)
            {
               if (board[i][j] == board[i+1][j+1] && board[i][j] == board[i+2][j+2] && board[i][j] == board[i+3][j+3])  // if the 3 tokens in the diagonal are the same as the first token
               {
                  if (board[i][j] == computerPiece || board[i][j] == playerPiece)   // if there's a piece
                  {
                     valid = true;  // game ends
                  }
               }
            }
         }
      }
      
      // Check filled
      
      int counter = 0;
      
      if (valid == false)
      {
         for (int i = 0; i < ROWS; i++)
         {
            for (int j = 0; j < COLUMNS; j++)
            {
               if (board[i][j] == computerPiece || board[i][j] == playerPiece)   // checks to see if element is occupied
               {
                  counter++;  // adds to counter
               }
            }
         }
         if (counter == 42)   // if all 42 spots are filled, game will end
         {
            valid = true;
         }
      }
      
      // if true, game ends; if false, game continues
      return valid;
   }
   
   /*
   ---------------------------------------
   Method Name: String resultOfGame(char[][] board, char playerPiece, char computerPiece)
   Return Type: returns String - result of the game
   Parameters: char[][] board - the connect 4 board
               char playerPiece - the player's piece
               char computerPiece - the computer's piece
   
   This method says who wins the game.
   ---------------------------------------
   */
   public static String resultOfGame(char[][] board, char playerPiece, char computerPiece)
   {  
      String outcome = "false";
      
      // similar code to method gameOver
      
      // Check Columns
      for (int i = 0; i <= (ROWS-4); i++)
      {
         for (int j = 0; j < COLUMNS; j++)
         {
            if (board[i][j] == board[i+1][j] && board[i][j] == board[i+2][j] && board[i][j] == board[i+3][j])
            {
               if (board[i][j] == computerPiece)   // if it's 4 computer piece's, the computer wins
               {
                  outcome = "loss";
               }
               else if (board[i][j] == playerPiece)   // if it's 4 player piece's, the player wins
               {
                  outcome = "win";
               }
            }
         }
      }
      
      // Check Rows
      if (outcome.equals("false"))
      {
         for (int i = 0; i < ROWS; i++)
         {
            for (int j = 0; j <= (COLUMNS-4); j++)
            {
               if (board[i][j] == board[i][j+1] && board[i][j] == board[i][j+2] && board[i][j] == board[i][j+3])
               {
                  if (board[i][j] == computerPiece)   // if it's 4 computer piece's, the computer wins
                  {
                     outcome = "loss";
                  }
                  else if (board[i][j] == playerPiece)   // if it's 4 player piece's, the player wins
                  {
                     outcome = "win";
                  }
               }
            }
         }
      }
      
      // Check diagonals
      if (outcome.equals("false"))
      {
         for (int i = (ROWS-1); i > (ROWS-4); i--)
         {
            for (int j = 0; j <= (COLUMNS-4); j++)
            {
               if (board[i][j] == board[i-1][j+1] && board[i][j] == board[i-2][j+2] && board[i][j] == board[i-3][j+3])
               {
                  if (board[i][j] == computerPiece)
                  {
                     outcome = "loss"; // if it's 4 computer piece's, the computer wins
                  }
                  else if (board[i][j] == playerPiece)
                  {
                     outcome = "win";  // if it's 4 player piece's, the player wins
                  }
               }
            }
         }
      }
      
      if (outcome.equals("false"))
      {
         for (int i = 0; i <= (ROWS-4); i++)
         {
            for (int j = 0; j <= (COLUMNS-4); j++)
            {
               if (board[i][j] == board[i+1][j+1] && board[i][j] == board[i+2][j+2] && board[i][j] == board[i+3][j+3])
               {
                  if (board[i][j] == computerPiece)
                  {
                     outcome = "loss"; // if it's 4 computer piece's, the computer wins
                  }
                  else if (board[i][j] == playerPiece)
                  {
                     outcome = "win";  // if it's 4 player piece's, the player wins
                  }
               }
            }
         }
      }
      
      // Check filled
      
      int counter = 0;
      
      if (outcome.equals("false"))
      {
         for (int i = 0; i < ROWS; i++)
         {
            for (int j = 0; j < COLUMNS; j++)
            {
               if (board[i][j] == playerPiece || board[i][j] == computerPiece)
               {
                  counter++;
               }
            }
         }
         if (counter == 42)
         {
            outcome = "tie";  // if the board is filled with no connect 4s, it's a tie
         }
      }
      
      return outcome;
   }
   
   // AI
   
   /*
   ---------------------------------------
   Method Name: int calculate (char[][] board, int round)
   Return Type: returns int - move the computer should do
   Parameters: char[][] board - the connect 4 board
               round - which round the game is in
   
   This method evaluates the board and picks a move.
      Note: Code is very similar to the endOfGame and resultOfGame methods with few alterations to account for 
      changes in length of connections (3,2,1).
   ---------------------------------------
   */
   
   public static int calculate (char[][] board, int round)
   {
      int move = 0;
      boolean moveFound = false;
      
      // put in the middle if it's the first turn
      if (round == 1)
      {
         move = 3;
         moveFound = true;
      }
      
      // try to block connect 4s or get connect 4s
      
         // Check Rows
      if (moveFound == false)
      {
         for (int i = 0; i < ROWS; i++)
         {
            for (int j = 0; j <= (COLUMNS-3); j++)
            {
               if (board[i][j] == board[i][j+1] && board[i][j] == board[i][j+2] && (board[i][j] == 'X' || board[i][j] == 'O'))
               {
                  if (j > 0)
                  {
                  
                     if (board[i][j-1] == ' ' && moveFound == false)
                     {
                        if (i == (ROWS-1))   // if on first row, you can place it
                        {
                           move = (j-1);
                           moveFound = true;
                        }
                        else
                        {
                           if (board[i+1][j-1] == 'X' || board[i+1][j-1] == 'O') // if it's not on the first row, make sure that there is a piece under
                           {
                              move = (j-1);
                              moveFound = true;
                           }
                        }
                     }
                  }
                  
                  if (j < (COLUMNS-3) && moveFound == false)
                  {
                  
                     if (board[i][j+3] == ' ' && moveFound == false)
                     {
                        if (i == (ROWS-1))   // if on first row, you can place it
                        {
                           move = (j+3);
                           moveFound = true;
                        }
                        else
                        {
                           if (board[i+1][j+3] == 'X' || board[i+1][j+3] == 'O')// if it's not on the first row, make sure that there is a piece under
                           {
                              move = (j+3);
                              moveFound = true;
                           }
                        }
                     }
                  }
               }
            }
         }
      }
      
      if (moveFound == false)
      {
         // Check columns
         for (int i = 0; i <= (ROWS-3); i++)
         {
            for (int j = 0; j < COLUMNS; j++)
            {
               if (board[i][j] == board[i+1][j] && board[i][j] == board[i+2][j] && (board[i][j] == 'X' || board[i][j] == 'O'))
               {
                  if (i > 0)
                  {
                     if (board[i-1][j] == ' ' && moveFound == false) // if it's not on the first row, make sure that there is a piece under
                     {
                        move = j;
                        moveFound = true;
                     }
                  }
               }
            }
         }
      }
      
      // Check diagonals (bottom to top)
      if (moveFound == false)
      {
         for (int i = (ROWS-1); i >= (ROWS-3); i--)
         {
            for (int j = 0; j <= (COLUMNS-3); j++)
            {
               if (board[i][j] == board[i-1][j+1] && board[i][j] == board[i-2][j+2] && (board[i][j] == 'X' || board[i][j] == 'O'))
               {
                  if (j > 0 && i < (ROWS-1)) 
                  {
                     if (board[i+1][j-1] == ' ' && moveFound == false)
                     {
                        if (i == (ROWS-2))   // if on first row, you can place it
                        {
                           move = (j-1);
                           moveFound = true;
                        }
                        else
                        {
                           if (board[i+2][j-1] == 'X' || board[i+2][j-1] == 'O') // if it's not on the first row, make sure that there is a piece under
                           {
                              move = (j-1);
                              moveFound = true;
                           }
                        }
                     }
                  }
                  
                  if (j < (COLUMNS-3) && i > (ROWS-4) && moveFound == false)
                  {
                     if (board[i-3][j+3] == ' ' && moveFound == false)
                     {
                        if (board[i-2][j+3] == 'X' || board[i-2][j+3] == 'O') // if it's not on the first row, make sure that there is a piece under
                        {
                           move = (j+3);
                           moveFound = true;
                        }
                     }
                  }
               }
            }
         }
      }
      
      // Check diagonals (top to bottom)
      if (moveFound == false)
      {
         for (int i = 0; i <= (ROWS-3); i++)
         {
            for (int j = 0; j <= (COLUMNS-3); j++)
            {
               if (board[i][j] == board[i+1][j+1] && board[i][j] == board[i+2][j+2] && (board[i][j] == 'X' || board[i][j] == 'O'))
               {
                  if (j > 0 & i > 0)
                  {
                     if (board[i-1][j-1] == ' ' && moveFound == false)
                     {
                        if (board[i][j-1] == 'X' || board[i][j-1] == 'O')  // if it's not on the first row, make sure that there is a piece under
                        {
                           move = (j-1);
                           moveFound = true;
                        }
                     }
                  }
                  
                  if (j < (COLUMNS-3) && i < (ROWS-3) && moveFound == false)
                  {
                  
                     if (board[i+3][j+3] == ' ')
                     {
                        if (i == (ROWS-4))   // if on first row, you can place it
                        {
                           move = (j+3);
                           moveFound = true;
                        }
                        else
                        {
                           if (board[i+4][j+3] == 'X' || board[i+4][j+3] == 'O') // if it's not on the first row, make sure that there is a piece under
                           {
                              move = (j+3);
                              moveFound = true;
                           }
                        }
                     }
                  }
               }
            }
         }
      }
      
      // try to block 3 in a row or get 3 in a row (current 2 in a row)
      
      if (moveFound == false)
      {
         // Check columns
         for (int i = 0; i <= (ROWS-2); i++)
         {
            for (int j = 0; j < COLUMNS; j++)
            {
               if (board[i][j] == board[i+1][j]  && (board[i][j] == 'X' || board[i][j] == 'O')) 
               {
                  if (i > 0)
                  {
                     if (board[i-1][j] == ' ' && moveFound == false) // if it's not on the first row, make sure that there is a piece under
                     {
                        move = j;
                        moveFound = true;
                     }
                  }
               }
            }
         }
      }
         
         // Check Rows
      if (moveFound == false)
      {
         for (int i = 0; i < ROWS; i++)
         {
            for (int j = 0; j <= (COLUMNS-2); j++)
            {
               if (board[i][j] == board[i][j+1] && (board[i][j] == 'X' || board[i][j] == 'O'))
               {
                  if (j > 0)
                  {
                  
                     if (board[i][j-1] == ' ' && moveFound == false)
                     {
                        if (i == (ROWS-1))   // if on first row, you can place it
                        {
                           move = (j-1);
                           moveFound = true;
                        }
                        else
                        {
                           if (board[i+1][j-1] == 'X' || board[i+1][j-1] == 'O') // if it's not on the first row, make sure that there is a piece under
                           {
                              move = (j-1);
                              moveFound = true;
                           }
                        }
                     }
                  }
                  
                  if (j < (COLUMNS-2) && moveFound == false)
                  {
                  
                     if (board[i][j+2] == ' ' && moveFound == false)
                     {
                        if (i == (ROWS-1))   // if on first row, you can place it
                        {
                           move = (j+2);
                           moveFound = true;
                        }
                        else
                        {
                           if (board[i+1][j+2] == 'X' || board[i+1][j+2] == 'O') // if it's not on the first row, make sure that there is a piece under
                           {
                              move = (j+2);
                              moveFound = true;
                           }
                        }
                     }
                  }
               }
            }
         }
      }
      
      // Check diagonals (bottom to top)
      if (moveFound == false)
      {
         for (int i = (ROWS-1); i >= (ROWS-5); i--)
         {
            for (int j = 0; j <= (COLUMNS-2); j++)
            {
               if (board[i][j] == board[i-1][j+1] && (board[i][j] == 'X' || board[i][j] == 'O'))
               {
                  if (j > 0 && i < (ROWS-1))
                  {
                     if (board[i+1][j-1] == ' ' && moveFound == false)
                     {
                        if (i == (ROWS-1))   // if on first row, you can place it
                        {
                           move = (j-1);
                           moveFound = true;
                        }
                        else
                        {
                           if (board[i+2][j-1] == 'X' || board[i+2][j-1] == 'O') // if it's not on the first row, make sure that there is a piece under
                           {
                              move = (j-1);
                              moveFound = true;
                           }
                        }
                     }
                  }
                  
                  if (j < (COLUMNS-2) && i > (ROWS-5) && moveFound == false)
                  {
                  
                     if (board[i-2][j+2] == ' ' && moveFound == false)
                     {
                        if (board[i-1][j+2] == 'X' || board[i-1][j+2] == 'O') // if it's not on the first row, make sure that there is a piece under
                        {
                           move = (j+2);
                           moveFound = true;
                        }
                     }
                  }
               }
            }
         }
      }
      
      // Check diagonals (top to bottom)
      if (moveFound == false)
      {
         for (int i = 0; i <= (ROWS-2); i++)
         {
            for (int j = 0; j <= (COLUMNS-2); j++)
            {
               if (board[i][j] == board[i+1][j+1] && (board[i][j] == 'X' || board[i][j] == 'O'))
               {
                  if (j > 0 & i > 0)
                  {
                     if (board[i-1][j-1] == ' ' && moveFound == false)
                     {
                        if (board[i][j-1] == 'X' || board[i][j-1] == 'O')  // if it's not on the first row, make sure that there is a piece under
                        {
                           move = (j-1);
                           moveFound = true;
                        }
                     }
                  }
                  
                  if (j < (COLUMNS-4) && i < (ROWS-4) && moveFound == false)
                  {
                  
                     if (board[i+2][j+2] == ' ' && moveFound == false)
                     {
                        if (i == (ROWS-3))   // if on first row, you can place it
                        {
                           move = (j+2);
                           moveFound = true;
                        }
                        else
                        {
                           if (board[i+3][j+2] == 'X' || board[i+3][j+2] == 'O') // if it's not on the first row, make sure that there is a piece under
                           {
                              move = (j+2);
                              moveFound = true;
                           }
                        }
                     }
                  }
               }
            }
         }
      }
      
      // if all fails, just choose a random piece (very unlikely to get to this point though)
      if (moveFound == false)
      {
         move = (int)(Math.random()*7);
         moveFound = true;
      }
      
      return move;  
   }
}