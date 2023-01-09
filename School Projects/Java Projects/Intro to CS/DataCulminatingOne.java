import java.util.*;

public class DataCulminatingOne
{
   public static void main (String[] args) 
   {
      final int WINNING_LETTER = 3;
      final int WINNING_POINTS = 35;
      final int FEE = 10;
      int letters;
      int points = 1000;
      int card, suit;
      int wins = 0;
      int losses = 0;
      int turns = 0;
      double winsPercent, lossPercent;
      String filler;
      String allCards[] = new String[100];
      String allSuits[] = new String[100];
      String allResults[] = new String[100];
      String cardInWords[] = {"Ace", "Two", "Three", "Four", "Five", "Six",
         "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
      String[] suitInWords = new String[] {"Spades", "Clubs", "Hearts", 
         "Diamonds"};  
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Welcome to the King's Letters. \n\nYou have 1000 points to start.\nPress anything to flip a card. You will be charged 10 points for the turn. \nIf the card has 3 letters, you win 35 points.\nYou can play 100 turns.");
      
      for (int i = 1; i <= 100; i++)
      {
         System.out.println ("You have " + points + " points. ");
         System.out.println ("This is Turn " + i + ".");
         System.out.print ("Pick a card:\t");
         filler = sc.nextLine();
      
         card = (int)(Math.random()*13);
         suit = (int)(Math.random()*4);
         points = points - FEE;
         
         System.out.println("\nYour card is the " + cardInWords[card] + " of " + suitInWords[suit] + ".\n");
                  
         allCards[i-1] = cardInWords[card];
         allSuits[i-1] = suitInWords[suit];
         letters = cardInWords[card].length();
         
         if (letters == WINNING_LETTER) {
            wins++;
            points = points + WINNING_POINTS;
            allResults[i-1] = "Win";
            System.out.println ("You win 25 points!\n");
         }
         else {
            
            losses++;
            allResults[i-1] = "Loss";
            System.out.println ("Sorry, you lost.\n");
         }
         
         turns = i;
      }
      
      winsPercent = 100.0*((double)wins/(double)turns);
      lossPercent = 100.0*((double)losses/(double)turns);
      
      System.out.println ("\nThank you for playing the King's Letters.\n");
      System.out.println ("You ended with " + points + " points.");
      System.out.printf ("You won " + wins + " times, an experimental probability of %.2f%s%n", winsPercent, "%.");
      System.out.printf ("You loss " + losses + " times, an experimental probability of %.2f%s%n", lossPercent, "%.");
      System.out.println ("\nTurn\t| Card\t| Suits\t| Result");
      
      for (int i = 1; i <= 100; i++)
      {
         System.out.println ("-----------------------------------");
         System.out.println (i+"\t\t| " + allCards[i-1] + " \t| " + allSuits[i-1] + "\t| " + allResults[i-1]);
      }
      
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
      System.out.println("                 \\__       \\__/   \\/ /");
      System.out.println("                     \\__             /");
      System.out.println("                        \\__      /\\ /");
      System.out.println("                          \\__ _/  /");
      System.out.println("                             \\_\\ /");
      System.out.println("                               \\/\n");
   }
}