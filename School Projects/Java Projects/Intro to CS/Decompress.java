import java.util.*;

import java.io.*;

public class Decompress
{
   public static void main(String[] args) 
   {
      int lines, charIn, number;
      char symbol;
      String lineIn;
      Scanner sc = new Scanner (System.in);
      
      lines = sc.nextInt();
      
      try
      {
         Scanner in = new Scanner(lineIn);
         
         for (int i = 0; i < lines; i++)
         {
            lineIn = sc.nextLine();
            
            while (charIn != -1)
            {
               charIn = in.read();
               lineIn = lineIn + (String)(charIn);
            }
            charIn = in.read();
            symbol = (char)(charIn);
            number = Integer.parseInt(lineIn);
            for (int j = 0; j < symbol; j++)
            {
               System.out.print(charIn);
            }
            System.out.println();
         }
      }
      catch (IOException e)
      {
      }
   }
}