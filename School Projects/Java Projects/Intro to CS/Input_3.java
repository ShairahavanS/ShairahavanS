import java.util.*;

public class Input_3 
{
   public static void main(String[] args) 
   {
      String name;
      int age;
      Scanner sc = new Scanner(System.in);                 
      
      System.out.print("What's your name?\t");
      name = sc.nextLine();
   
      System.out.print("How old are you?\t");
      age = sc.nextInt();
      
            
      System.out.println("So you are " + name +" and you are " + age);
   }
   
   
      
   int arrayLength = 0;
   int[][] cardsInHand = new int[arrayLength][CARD_AND_SUIT];
   
   arrayLength++;
   
   cardsInHand[][] = addingAnElement(cardsInHand[][]);
   biggerArray[arrayLength-1][0] = card;
   biggerArray[arrayLength-1][1] = suit;
   
   System.out.println("The cards in your hand include: ");
   for (int i = 0; i < arrayLength; i++)
   {
      System.out.println("\t- The " + cardInWords[cardsInHand[i][0]] + " of " + suitInWords[cardsInHand[i][1]]);
   }
   
   public static int[][] addingAnElement (int[][] cardsInHand, int arrayLength)
   {
      int biggerArray[][] = new int [arrayLength][2];
      
      for (int i = 0; i < arrayLength; i++) 
      {
         for (int j = 0; j < 2; j++) 
         {
            biggerArray[i][j] = cardsInHand[i][j];
            return biggerArray[][];
         }
      }
   }
}

/*   int arrayLength = 0;
   
   int[][] cardsInHandBefore = new int[arrayLength][CARD_AND_SUIT];
   
   arrayLength++;
   
   cardsInHandBefore[][] = addingAnElement[][](cardsInHandBefore[][]);
   
   for (int i = 0; i < arrayLength; i++) 
      {
         for (int j = 0; j < CARD_AND_SUIT; j++) 
         {
            cardsInHandBefore[][] = cardsInHandAfter[][];
         }
      }
   
      cardsInHandAfter[][] = addingAnElement[][](cardsInHandAfter[][]);
      
   for (int i = 0; i < arrayLength; i++) 
      {
         for (int j = 0; j < 2; j++) 
         {
            cardsInHandAfter[][] = cardsInHandAfter[][];
         }
      }

   cardsInHandAfter[arrayLength-1][0] = card;
   cardsInHandAfter[arrayLength-1][1] = suit;
   
   public static int[][] addingAnElement(int[][] cardsInHandBefore, int cardsInHandAfter int card, int suit, int arrayLength, final int CARD_AND_SUIT)
   {
      int biggerArray[][] = new int [arrayLength][CARD_AND_LENGTH];
      
      for (int i = 0; i < arrayLength; i++) 
      {
         for (int j = 0; j < 2; j++) 
         {
            biggerArray[i][j] = cardsInHandBefore[i][j];
            return biggerArray[][];
         }
      }
   }
   
   public static int[][] addingAnElement(int[][] cardsInHandBefore, int cardsInHandAfter int card, int suit, int arrayLength, final int CARD_AND_SUIT)
   {
      int biggerArray[][] = new int [arrayLength][CARD_AND_LENGTH];
      
      for (int i = 0; i < arrayLength; i++) 
      {
         for (int j = 0; j < 2; j++) 
         {
            biggerArray[i][j] = cardsInHandBefore[i][j];
            return biggerArray[][];
         }
      }
   }
   */
   