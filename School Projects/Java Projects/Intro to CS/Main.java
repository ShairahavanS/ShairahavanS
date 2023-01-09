import java.util.*;
import java.io.*;


public class Main
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      
      String line;
      
      int x;
      x = sc.nextInt();
      sc.nextLine();
      
      String[][] A = new String[x][2];
      
      if (x > 0)
      {
      
         for (int i =0; i < x; i++)
         {
            line = sc.nextLine();
            String um[] = line.split(" ");
            for (int j =0; j < 2; j++)
            {
               A[i][j] = um[j];
            }
         }
      }
      
      int y;
      y = sc.nextInt();
      sc.nextLine();
      
      String[][] B = new String[y][2];
      
      if (y > 0)
      {
         
         for (int i =0; i < y; i++)
         {
            line = sc.nextLine();
            String uh[] = line.split(" ");
            for (int j =0; j < 2; j++)
            {
               B[i][j] = uh[j];
            }
         }
      }
      
      int g;
      g = sc.nextInt();
      sc.nextLine();
      String[][] gee = new String[g][3];
      
      
      for (int i = 0; i < g; i++)
      {
         line = sc.nextLine();
         String sure[] = line.split(" ");
         for (int j = 0; j < 3; j++)
         {
            gee[i][j] = sure[j];
         }
      }
      
      int constraints = 0;
      
      boolean xTrue1 = false;
      boolean yTrue1 = false;
      boolean xTrue2 = false;
      boolean yTrue2 = false;
      int u = 0;
      
      // check for if people are in same group
      if (x > 0)
      {
         for (int k = 0; k < x; k++)
         {
            xTrue1 = false;
            xTrue2 = false;
            for (int i = 0; i < g; i++)
            {
               for (int j = 0; j < 3; j++)
               {
                  if (gee[i][j] == A[k][0])
                  {
                     xTrue1 = true;
                  }
                  if (gee[i][j] == A[k][1])
                  {
                     xTrue2 = true;
                  }
               }
            }
            if ((xTrue1 == false && xTrue2 == true) || xTrue2 == false && xTrue1 == true)
            {
               constraints++;
            }
         }
      }
      
      // check for people in different group
      
      if (y > 0)
      {
         for (int k = 0; k < y; k++)
         {
            yTrue1 = false;
            yTrue2 = false;
            for (int i = 0; i < g; i++)
            {
               for (int j = 0; j < 3; j++)
               {
                  if (gee[i][j] == B[k][0])
                  {
                     yTrue1 = true;
                  }
                  if (gee[i][j] == B[k][1])
                  {
                     yTrue2 = true;
                  }
               }
            }
            if ((yTrue1 == false && yTrue2 == true) || yTrue2 == false && yTrue1 == true)
            {
               constraints++;
            }
         }
      }
      
      System.out.println(constraints);
   }
}