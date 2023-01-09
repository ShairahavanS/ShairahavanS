import java.util.*;

/*
   Blackjack.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 18th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program allows the user to play blackjack against a computer as many times as they want and make wagers on the game.
*/

public class Editing
{
   public static void main(String[] args) 
   {
      final int CARDS_MAX = 13;  // different cards in a deck
      final int SUITS = 4; // number of suits
      final int WINNING_SCORE = 21; // 21 gives automatic win
      final double ORIGINAL_VALUE = 1000.00; // Amount of money user has at beginning of match and how much their bet can exceed.
      int[][] playersCards = new int[CARDS_MAX][SUITS];
      final int CARD_AND_SUIT = 2;
      int playerScore = 0;
      int computerScore = 0;
      int round = 0; // rounds played
      int roundsPlayer = 0;   // rounds won by player
      int roundsComputer = 0; // rounds won by computer
      int arrayLength = 0;
      int[] cardsInHand = new int[arrayLength];
      int[] suitsInHand = new int[arrayLength];
      int[] cardsComputer = new int[arrayLength];
      int[] suitsComputer = new int[arrayLength];
      int card, aceChoice, suit, pickUser, pickComp;
      double bet; // how much the user has bet on the round
      double winnings = 0.00; // how much money the user has won
      double bankAccount = ORIGINAL_VALUE;   // how much money the user has
      double winningPercentage;  // percent of rounds the user has won
      String playAgain = "no"; 
      String pickAgain = "no";
      int[][] cardsDeck = new int[CARDS_MAX][SUITS];
      String[] suitInWords = new String[] {"Spades", "Clubs", "Hearts", 
         "Diamonds"};   // 4 suits of cards in words
      String cardInWords[] = {"Ace", "Two", "Three", "Four", "Five", "Six",
         "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};  // 13 different types of cards in words
      
      Scanner sc = new Scanner (System.in);
      
      // Las Vegas Sign  ASCII Art
      System.out.println("     /\\");
      System.out.println("  |\\/\\/\\/| ");
      System.out.println(" /\\/\\/\\/\\/\\");
      System.out.println(" \\/\\/\\/\\/\\/ ");
      System.out.println("  |/\\/\\/\\|  _");
      System.out.println("     \\/   _/ \\_");
      System.out.println("  -  -  -/ -  -\\ -  -");
      System.out.println(" (W)(E)(L)(C)(O)(M)(E)");
      System.out.println("  -  -  -  -  -  -  -");
      System.out.println("   _/  TO Fabulous \\_");
      System.out.println(" _/                  \\_");
      System.out.println("/   L A S   V E G A S  \\ ");
      System.out.println("\\_  -----   --------- _/");
      System.out.println("  \\_                _/");
      System.out.println("    \\_   NEVADA   _/");
      System.out.println("      \\_        _/");
      System.out.println("        \\_    _/");
      System.out.println("          \\__/\n");          
      
      // Company Logo ASCII ART
      System.out.println(" _____________________");
      System.out.println("|                     |   _");
      System.out.println("| /\\                  |  / \\__");
      System.out.println("|/``\\                 | /  \\_ \\__ ");
      System.out.println("| /\\                  |/ \\_/     \\__");
      System.out.println("|/__\\                 / _   /\\__    \\__");
      System.out.println("| /\\                 / /|  /    \\__    \\__");
      System.out.println("|         /\\        / |_/ / /\\   |_\\__    \\__");
      System.out.println("|        /  \\      /  /| / /__\\ ///\\_/\\__    \\__");
      System.out.println("|       /    \\    /     /   /\\ /// o/   /      /");
      System.out.println("|      /      \\  /     / _____///__/   /      /");
      System.out.println("|      \\__  __/ /     / /        \\    /      /");
      System.out.println("|         /\\   /     /  \\         \\  /      /");
      System.out.println("|         ^^  /     /   _\\_   ____/ /      /");
      System.out.println("|            /     /   /   ///     /      /");
      System.out.println("|           /     /   /o  ///     /      /");
      System.out.println("|          /      \\__/\\_ ////\\   /  _   /");
      System.out.println("|__________\\__       \\__ \\//__\\ /  |/  /");
      System.out.println("              \\__       \\/_ /\\ /  | / /");
      System.out.println("    Jack         \\__       \\__/   \\/ /");
      System.out.println("     Jack's         \\__             /");
      System.out.println("        Black          \\__      /\\ /");
      System.out.println("          Jack™           \\__ _/  /");
      System.out.println("                             \\_\\ /");
      System.out.println("                               \\/\n");
      
      // Introductory Message
      System.out.println("*-------------------------------------*");
      System.out.println("|  Welcome to Jack Jack's Blackjack!  |");
      System.out.println("*-------------------------------------*");
      
      // initialize cardsDeck array to fit the values given in the game
      for (int i = 0; i < CARDS_MAX; i++)
      {
         for (int j = 0; j < SUITS; j++)
         {
            cardsDeck[i][j] = i+1;  // all types of cards are given the value of their number
            
            if (i >= 10)   // unless it has an index of 10+
            {
               cardsDeck[i][j] = 10;   // jack, queens and kings are valued at 10
            }
         }
      }
      
      do
      {
         round++; // to track number of rounds
         playerScore = 0;  // resets scores
         computerScore = 0;
         pickUser = -1;
         arrayLength = 0;
         cardsInHand = reset1(cardsInHand);
         suitsInHand = reset2(suitsInHand);
         
         // get wager from user
         System.out.println("\nPlease wager an amount below. You can wager $1000 more than what you have.");
         System.out.println("Please note that the game will end if your debt is $1000.");
         System.out.println("You currently have $" + bankAccount + ".");
         System.out.print("How much do you want to wager?  $");
         bet = Double.parseDouble(sc.nextLine());
         
         // if the user inputs an invalid wager (negative or over 1000+bankAccount
         while (bet > (bankAccount+ORIGINAL_VALUE) || bet < 0)
         {
            System.out.println("\nPlease wager a VALID amount below. You currently have $" + bankAccount + ".");
            System.out.print("How much do you want to wager?  $");
            bet = Double.parseDouble(sc.nextLine());
         } 
         
         System.out.println();
         
         // start of player's turn
         System.out.println("*-----------------*");
         System.out.println("|    Your Turn    |");
         System.out.println("*-----------------*");
         
         do 
         {
            pickUser++;
            card = (int)(Math.random()*13);  // random index from 0-12; for cardsDeck array
            suit = (int)(Math.random()*4);   // random index from 0-12; for cardsDeck array
            
            cardsInHand = addingAnElement1(cardsInHand);
            suitsInHand = addingAnElement2(suitsInHand);
            cardsInHand[pickUser] = card;
            suitsInHand[pickUser] = suit;
            arrayLength = cardsInHand.length;
                        
            System.out.println("------------------------------------");
            System.out.println("Your card is the " + cardInWords[card] + " of " + suitInWords[suit] + "."); // informs user of what their card is using the string arrays
            
            // designing the card
            System.out.println(" ------ ");
            System.out.print("|");
            
            // to create a card that matches the random value that is chosen
            if (card == 0)
            {
               System.out.print("A    A");
            }
            else if (card < 10)
            {
               System.out.printf("%-2d  %2d", (card+1), (card+1));
            }
            else if (card == 10)
            {
               System.out.print("J    J");
            }
            else if (card == 11)
            {
               System.out.print("Q    Q");
            }
            else if (card == 12)
            {
               System.out.print("K    K");
            }
            
            System.out.println("|");
            
            // to create the design of the random suit that is chosen
            switch (suit)
            {
               case 0:
                  System.out.println("|  /\\  |");
                  System.out.println("| /__\\ |");
                  System.out.println("|  /\\  |");
                  break;
               case 1:
                  System.out.println("| _/\\_ |");
                  System.out.println("| \\__/ |");
                  System.out.println("|  /\\  |");
                  break;
               case 2:
                  System.out.println("| /\\/\\ |");
                  System.out.println("| \\  / |");
                  System.out.println("|  \\/  |");
                  break;
               case 3:
                  System.out.println("|  /\\  |");
                  System.out.println("| <  > |");
                  System.out.println("|  \\/  |");
                  break;
            }
            
            System.out.print("|");
            
            // finish number customization
            if (card == 0)
            {
               System.out.print("A    A");
            }
            else if (card < 10)
            {
               System.out.printf("%-2d  %2d", (card+1), (card+1));
            }
            else if (card == 10)
            {
               System.out.print("J    J");
            }
            else if (card == 11)
            {
               System.out.print("Q    Q");
            }
            else if (card == 12)
            {
               System.out.print("K    K");
            }
            
            System.out.println("|");
            System.out.println(" ------ ");
            // card design is finished
            
            
            if (card == 0) // if the random card chosen is an ace, the user is asked if they want a value of 1 or 11 for the ace
            {
               do {
                  System.out.print("What value do you want the ace to be: 1 or 11? ");
                  aceChoice = Integer.parseInt(sc.nextLine());
               } while (aceChoice != 1 && aceChoice != 11);
               
               if (aceChoice == 1)  // if they want one, element is given value of 1
               {
                  cardsDeck[0][suit] = 1;
               }
               else if (aceChoice == 11)  // if they want eleven, the element is given a value of 11
               {
                  cardsDeck[0][suit] = 11;
               }
            
            }
            
            playerScore = playerScore + cardsDeck[card][suit]; // card is added to the player's score
            System.out.println("Your score is " + playerScore + ".\n");
            
         
            System.out.println("The cards in your hand include: ");
            
            for (int i = 0; i < arrayLength; i++)
            {
               System.out.println("\t- The " + cardInWords[cardsInHand[i]] + " of " + suitInWords[suitsInHand[i]]);
            }
         
            System.out.println("------------------------------------\n");
             
            if (playerScore == WINNING_SCORE)   // if the player gets to 21 and wins
            {
               System.out.println("You win!");
               pickAgain = "No"; 
               roundsPlayer++;   // win the round
               bankAccount = bankAccount + bet; // win the bet
               winnings = winnings + bet;
               // lets user know what they have won and their current totals
               System.out.println("\n*----------------------------------------------------*");
               System.out.printf("| You have won $%15.2f.%22s%n", bet, "|"); 
               System.out.printf("| You have a total winnings of $%15.2f.%6s%n", winnings, "|");
               System.out.printf("| You have $%15.2f in your account.%10s%n", bankAccount, "|");
               System.out.println("*----------------------------------------------------*\n");
               
               // allows user to play again
               System.out.print("\nDo you want to play another round? ");
               playAgain = sc.nextLine();
            
            }
            else if (playerScore > WINNING_SCORE)  // if they exceed 21 and automatically lose
            {
               System.out.println("You lose!");
               pickAgain = "No";
               roundsComputer++; // computer wins a round
               bankAccount = bankAccount - bet; // they lose the bet
               winnings = winnings - bet;
               // lets user know what they have won and their current totals
               System.out.println("\n*----------------------------------------------------*");
               System.out.printf("| You have lost $%15.2f.%21s%n", bet, "|"); 
               System.out.printf("| You have a total winnings of $%15.2f.%6s%n", winnings, "|");
               System.out.printf("| You have $%15.2f in your account.%10s%n", bankAccount, "|");
               System.out.println("*----------------------------------------------------*\n");
               
               if (bankAccount > -1000)   // if they dont have $1000 in debt, they can play again if they want
               {
                  System.out.print("\nDo you want to play another round? ");
                  playAgain = sc.nextLine();
               }
               else  // if they have $1000 in debt, they cannot play again and notifies the user of this
               {
                  playAgain = "no";
                  System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                  System.out.println("!!                                                        !!");
                  System.out.println("!!    You have a debt of $1000. The game will now end.    !!");
                  System.out.println("!!                                                        !!");
                  System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
               }
            
            }
            else  // if the round doesn't end, the user can pick again
            {   
               System.out.print("Do you want to pick another card (Yes/No)? ");
               pickAgain = sc.nextLine();
            }
            System.out.println();
         } while (pickAgain.equals("Yes") || pickAgain.equals("yes") || pickAgain.equals("YES"));  // keeps the loop going as long as the user inputs yes
         
         
         pickComp = -1;
         arrayLength = 0;
         cardsComputer = reset3(cardsComputer);
         suitsComputer = reset4(suitsComputer);
         
         
         // if the user has less than 21, the computer starts it's turn
         if (playerScore < WINNING_SCORE)
         {
            // let's user know that it's the computer's turn
            System.out.println("*-----------------*");
            System.out.println("| Computer's Turn |");
            System.out.println("*-----------------*");
            
            while (computerScore <= 16)   // while loop will continue as long as the computer's score is 16 or less
            {
               pickComp++;
               card = (int)(Math.random()*13);  // random index from 0-12; for cardsDeck array
               suit = (int)(Math.random()*4);   // random index from 0-12; for cardsDeck array
            
               cardsComputer = addingAnElement3(cardsComputer);
               suitsComputer = addingAnElement4(suitsComputer);
               cardsComputer[pickComp] = card;
               suitsComputer[pickComp] = suit;
               arrayLength = cardsComputer.length;
            
               System.out.println("----------------------------------------------");
               System.out.println("The computer's card is the " + cardInWords[card] + " of " + suitInWords[suit] + ".");   // tells what card the computer got
               
               // card design
               System.out.println(" ------ ");
               System.out.print("|");
               
                // to create a card that matches the random value that is chosen
               if (card == 0)
               {
                  System.out.print("A    A");
               }
               else if (card < 10)
               {
                  System.out.printf("%-2d  %2d", (card+1), (card+1));
               }
               else if (card == 10)
               {
                  System.out.print("J    J");
               }
               else if (card == 11)
               {
                  System.out.print("Q    Q");
               }
               else if (card == 12)
               {
                  System.out.print("K    K");
               }
            
               System.out.println("|");
               
               // creates the random suit that is found
               if (suit == 0)
               {
                  System.out.println("|  /\\  |");
                  System.out.println("| /__\\ |");
                  System.out.println("|  /\\  |");
               }
               else if (suit == 1)
               {
                  System.out.println("| _/\\_ |");
                  System.out.println("| \\__/ |");
                  System.out.println("|  /\\  |");
               }
               else if (suit == 2)
               {
                  System.out.println("| /\\/\\ |");
                  System.out.println("| \\  / |");
                  System.out.println("|  \\/  |");
               }
               else if (suit == 3)
               {
                  System.out.println("|  /\\  |");
                  System.out.println("| <  > |");
                  System.out.println("|  \\/  |");
               }
               
               // finishes design of number/symbol
               System.out.print("|");
               if (card == 0)
               {
                  System.out.print("A    A");
               }
               else if (card < 10)
               {
                  System.out.printf("%-2d  %2d", (card+1), (card+1));
               }
               else if (card == 10)
               {
                  System.out.print("J    J");
               }
               else if (card == 11)
               {
                  System.out.print("Q    Q");
               }
               else if (card == 12)
               {
                  System.out.print("K    K");
               }
            
               System.out.println("|");
               System.out.println(" ------ ");
               // design is finished
               
               // if the computer gets an ace
               if (card == 0)
               {
                  if (computerScore > 10) // it will choose 1 if it has more than 10 and will lose if it chooses an ace value of 1
                  {
                     cardsDeck[0][suit] = 1;
                     System.out.println("The computer chose an ace value of 1.");
                  }
                  if (computerScore <= 10)   // if it has 10 or less, it will choose an ace value of 11
                  {
                     cardsDeck[0][suit] = 11;
                     System.out.println("The computer chose an ace value of 11.");
                  }
               }
               
               computerScore = computerScore + cardsDeck[card][suit];
               System.out.println("The computer's score currently is " + computerScore + ".\n");  // informs user of computer's score
               
               System.out.println("The cards in the computer's hand include: ");
            
               for (int i = 0; i < arrayLength; i++)
               {
                  System.out.println("\t- The " + cardInWords[cardsComputer[i]] + " of " + suitInWords[suitsComputer[i]]);
               }
            
               
               System.out.println("----------------------------------------------\n");
            } 
         
            if (computerScore > WINNING_SCORE)  // if the computer's score is over 21, the player wins
            {
               System.out.println("You win!");
               roundsPlayer++;   // player wins the round
               bankAccount = bankAccount + bet; // player wins bet
               winnings = winnings + bet;
               // lets them know what they currently have
               System.out.println("\n*----------------------------------------------------*");
               System.out.printf("| You have won $%15.2f.%22s%n", bet, "|"); 
               System.out.printf("| You have a total winnings of $%15.2f.%6s%n", winnings, "|");
               System.out.printf("| You have $%15.2f in your account.%10s%n", bankAccount, "|");
               System.out.println("*----------------------------------------------------*\n");
            }
            else if (computerScore == WINNING_SCORE)  // if the computer has a score of 21, the player loses
            {
               System.out.println("You lose!");
               roundsComputer++; // computer wins the round
               bankAccount = bankAccount - bet; // player loses bet
               winnings = winnings - bet;
               // let's them know what they currently have
               System.out.println("\n*----------------------------------------------------*");
               System.out.printf("| You have lost $%15.2f.%21s%n", bet, "|"); 
               System.out.printf("| You have a total winnings of $%15.2f.%6s%n", winnings, "|");
               System.out.printf("| You have $%15.2f in your account.%10s%n", bankAccount, "|");
               System.out.println("*----------------------------------------------------*\n");
            }
            else if (computerScore >= playerScore) // if the computer has a higher score without going over 20, player loses
            {
               System.out.println("You lose!");
               roundsComputer++; // computer wins the round
               bankAccount = bankAccount - bet; // player loses bet
               winnings = winnings - bet;
               // let's them know what they currently have
               System.out.println("\n*----------------------------------------------------*");
               System.out.printf("| You have lost $%15.2f.%21s%n", bet, "|"); 
               System.out.printf("| You have a total winnings of $%15.2f.%6s%n", winnings, "|");
               System.out.printf("| You have $%15.2f in your account.%10s%n", bankAccount, "|");
               System.out.println("*----------------------------------------------------*\n");
            }
            else if (computerScore < playerScore)  // if the player has a higher score without going over 20, player wins
            {
               System.out.println("You win!");
               roundsPlayer++;   // player wins the round
               bankAccount = bankAccount + bet; // player wins the bet
               winnings = winnings + bet;
               // let's them know what they currently have
               System.out.println("\n*----------------------------------------------------*");
               System.out.printf("| You have won $%15.2f.%22s%n", bet, "|"); 
               System.out.printf("| You have a total winnings of $%15.2f.%6s%n", winnings, "|");
               System.out.printf("| You have $%15.2f in your account.%10s%n", bankAccount, "|");
               System.out.println("*----------------------------------------------------*\n");
            }
            
            System.out.println("You picked " + (pickUser+1) + " times.");
            System.out.println("You had: ");
            
            for (int i = 0; i <= pickUser; i++)
            {
               System.out.println("\t- The " + cardInWords[cardsInHand[i]] + " of " + suitInWords[suitsInHand[i]]);
            }
            
            System.out.println("\nThe computer picked " + (pickComp+1) + " times.");
            System.out.println("The computer had: ");
            
            for (int i = 0; i <= pickComp; i++)
            {
               System.out.println("\t- The " + cardInWords[cardsComputer[i]] + " of " + suitInWords[suitsComputer[i]]);
            }
         
               
            if (bankAccount > -1000)   // if the person hase less than $1000 in debt, they can choose to play again
            {
               System.out.print("\nDo you want to play another round (Yes/No)? ");
               playAgain = sc.nextLine();
            }
            else  // if they have $1000 in debt, they cannot play again and notifies the user of this
            {
               playAgain = "no";
               System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
               System.out.println("!!                                                        !!");
               System.out.println("!!    You have a debt of $1000. The game will now end.    !!");
               System.out.println("!!                                                        !!");
               System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            }
         
            System.out.println();
         }
      } while (playAgain.equals("Yes") || playAgain.equals("yes") || playAgain.equals("YES"));  // do-while loop of the entire game continues if the player types yes so the user can play again
      
      winningPercentage = (double)(roundsPlayer)/(double)(round)*100;   // winning percentage is calculated after the player chooss to end the game or is kicked out
      
      // prints a receipt
      System.out.print("\n|\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/|");
      System.out.printf("%n| %-48s |", "");
      System.out.printf("%n| %-48s |", " _____________________");    // logo printed on receipt
      System.out.printf("%n| %-48s |", "|                     |   _");
      System.out.printf("%n| %-48s |", "| /\\                  |  / \\__");
      System.out.printf("%n| %-48s |", "|/``\\                 | /  \\_ \\__");
      System.out.printf("%n| %-48s |", "| /\\                  |/ \\_/     \\__");
      System.out.printf("%n| %-48s |", "|/__\\                 / _   /\\__    \\__");
      System.out.printf("%n| %-48s |", "| /\\                 / /|  /    \\__    \\__");
      System.out.printf("%n| %-48s |", "|         /\\        / |_/ / /\\   |_\\__    \\__");
      System.out.printf("%n| %-48s |", "|        /  \\      /  /| / /__\\ ///\\_/\\__    \\__");
      System.out.printf("%n| %-48s |", "|       /    \\    /     /   /\\ /// o/   /      /");
      System.out.printf("%n| %-48s |", "|      /      \\  /     / _____///__/   /      /");
      System.out.printf("%n| %-48s |", "|      \\__  __/ /     / /        \\    /      /");
      System.out.printf("%n| %-48s |", "|         /\\   /     /  \\         \\  /      /");
      System.out.printf("%n| %-48s |", "|         ^^  /     /   _\\_   ____/ /      /");
      System.out.printf("%n| %-48s |", "|            /     /   /   ///     /      /");
      System.out.printf("%n| %-48s |", "|           /     /   /o  ///     /      /");
      System.out.printf("%n| %-48s |", "|          /      \\__/\\_ ////\\   /  _   /");
      System.out.printf("%n| %-48s |", "|__________\\__       \\__ \\//__\\ /  |/  /");
      System.out.printf("%n| %-48s |", "              \\__       \\/_ /\\ /  | / /");
      System.out.printf("%n| %-48s |", "    Jack         \\__       \\__/   \\/ /");
      System.out.printf("%n| %-48s |", "     Jack's         \\__             /");
      System.out.printf("%n| %-48s |", "        Black          \\__      /\\ /");
      System.out.printf("%n| %-48s |", "          Jack™           \\__ _/  /");
      System.out.printf("%n| %-48s |", "                             \\_\\ /");
      System.out.printf("%n| %-48s |", "                               \\/");
      System.out.printf("\n|%50s|", "");
      System.out.printf("\n| ------------------------------------------------ |");
      System.out.printf("\n|%50s|", "");
      System.out.printf("\n|  You have played %5d %-26s|", round, "rounds."); // how many round played
      System.out.printf("\n|  You have won %5d %-29s|", roundsPlayer, "rounds.");   // how many won by player
      System.out.printf("\n|  You have lost %5d %-28s|", roundsComputer, "rounds.");  // how many lost by player
      System.out.printf("\n|  A winning percentage of %6.2f%-18s|", winningPercentage, "%.");   // winning percentage of player
      System.out.printf("\n|%50s|", "");
      System.out.printf("\n|  You have a total winnings of $%-18.2f|", winnings);   // winning by player
      System.out.printf("\n|  You have $%-15.2f in your account. %6s", bankAccount, "|"); // how much left in bank account
      System.out.printf("\n|%50s|", "");
      System.out.printf("\n| ------------------------------------------------ |");
      System.out.printf("\n|%50s|", "");
      System.out.printf("\n|%16sGOOD GAME !!!   :D%16s|", "", "");   // message at end
      System.out.printf("\n|%50s|", "");
      System.out.println("\n|/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\|");
   }
   
   public static int[] addingAnElement1 (int[] cardsInHand)
   {
      int newLength1 = cardsInHand.length + 1;
      int[] biggerArray1 = new int [newLength1];
      for (int i = 0; i < newLength1-1; i++) 
      {
         biggerArray1[i] = cardsInHand[i];
      }
      return biggerArray1;
   }
   
   public static int[] reset1 (int[] cardsInHand)
   {
      int[] resetArray1 = new int [0];
      
      return resetArray1;
   }
   
   public static int[] addingAnElement2 (int[] suitsInHand)
   {
      int newLength2 = suitsInHand.length + 1;
      int[] biggerArray2 = new int [newLength2];
      for (int i = 0; i < newLength2-1; i++) 
      {
         biggerArray2[i] = suitsInHand[i];
      }
      return biggerArray2;
   }
   
   public static int[] reset2 (int[] suitsInHand)
   {
      int[] resetArray2 = new int [0];
      
      return resetArray2;
   }
   
   public static int[] addingAnElement3 (int[] cardsComputer)
   {
      int newLength3 = cardsComputer.length + 1;
      int[] biggerArray3 = new int [newLength3];
      for (int i = 0; i < newLength3-1; i++) 
      {
         biggerArray3[i] = cardsComputer[i];
      }
      return biggerArray3;
   }
   
   public static int[] reset3 (int[] cardsComputer)
   {
      int[] resetArray3 = new int [0];
      
      return resetArray3;
   }
   
   public static int[] addingAnElement4 (int[] suitsComputer)
   {
      int newLength4 = suitsComputer.length + 1;
      int[] biggerArray4 = new int [newLength4];
      for (int i = 0; i < newLength4-1; i++) 
      {
         biggerArray4[i] = suitsComputer[i];
      }
      return biggerArray4;
   }
   
   public static int[] reset4 (int[] suitsComputer)
   {
      int[] resetArray4 = new int [0];
      
      return resetArray4;
   }
}