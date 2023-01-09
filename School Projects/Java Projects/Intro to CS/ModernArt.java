import java.util.*;

public class ModernArt
{
   public static void main(String[] args) 
   {
      int rows, columns, lines;
      int number = -1;
      int goldSquares = 0;
      char dimension;
      String instructions = "       ";
      
      Scanner sc = new Scanner (System.in);
      
      rows = Integer.parseInt(sc.nextLine());
      columns = Integer.parseInt(sc.nextLine());
      
      int[][] canvas = new int[rows][columns];
      
      for (int i = 0; i < rows; i++)
      {
         for (int j = 0; j < columns; j++)
         {
            canvas[i][j] = 0;
         }
      }
      
      lines = Integer.parseInt(sc.nextLine());
      
      for (int i = 0; i < lines; i++)
      {
         instructions = sc.nextLine();
         dimension = instructions.charAt(0);
         number = Integer.parseInt(instructions.substring(2,(instructions.length())));
         number--;
         if (dimension == 'R')
         {
            for (int j = 0; j < columns; j++)
            {
               canvas[number][j]++;
            }
         }
         else if (dimension == 'C')
         {
            for (int j = 0; j < rows; j++)
            {
               canvas[j][number]++;
            }
         }
      }
      
      for (int i = 0; i < rows; i++)
      {
         for (int j = 0; j < columns; j++)
         {
            if ((canvas[i][j]%2) == 1)
            {
               goldSquares++;
            }
         }
      }
      
      System.out.print(goldSquares);
   }
}