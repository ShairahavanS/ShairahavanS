import java.util.*;

import java.io.*;

public class WinningScore
{
   public static void main(String[] args) 
   {
      char winner;
      int threes, twos, freeThrows, scoreA, scoreB;
      
      Scanner sc = new Scanner(System.in);
      
      threes = sc.nextInt();
      twos = sc.nextInt();
      freeThrows = sc.nextInt();
      scoreA = (3*threes) + (2*twos) + freeThrows;
      
      threes = sc.nextInt();
      twos = sc.nextInt();
      freeThrows = sc.nextInt();
      scoreB = (3*threes) + (2*twos) + freeThrows;
      
      if (scoreA > scoreB)
      {
         System.out.println("A");
      }
      else if (scoreA < scoreB)
      {
         System.out.println("B");
      }
      else if (scoreA == scoreB)
      {
         System.out.println("T");
      }
   }
}