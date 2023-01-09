import java.util.*;

public class CCCOne
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      
      int n = 0;
      int x = 0;
      int number;
      double a;
      
      a = sc.nextDouble();
      number = (int)(a);
      int mod = number%20;
      
      if (mod == 0)
      {
         n = (number/20) + 1;
      }
      
      else if (mod == 1 || mod == 2 || mod == 3 || mod == 6 || mod == 7 || mod == 11)
      {
         for (int i = 0; i < 5; i++)
         {
            for (int j = 0; j < 4; j++)
            {
               int b = 4*i + 5*j;
            
               if ((mod+20) == b)
               {
                  x++;
               }
            }
         }
         n = x*(number/20);
      }
      else
      {
         for (int i = 0; i <= 5; i++)
         {
            for (int j = 0; j <= 4; j++)
            {
               int c = 4*i+5*j;
            
               if (mod == c)
               {
                  x++;
               }
            }
         }
         n = x*(1+number/20);
      }
      System.out.println(n);
   }
}