import java.util.*;

public class CCCS1
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
      
      for (int i = 0; i <= 5; i++)
      {
         for (int j = 0; j <= 4; j++)
         {
            int b = 4*i;
            int c = 5*j;
            
            if (number%20 == 0)
            {
            }
            else if (number%20 == (b+c))
            {
               
            }
            else if (number%20 != (b+c))
            {
               for (int p = 0; p <= 5; p++)
               {
                  for (int k = 0; k <= 4; k++)
                  {
                  }
               }
            }
            
            int adjust = 1;
             /*
            for (int k = 0; k <= 250000; k++)
            {
               int adjust = 
            }
            */
            if ((number%20) == (b+c))
            {
               n = x*adjust;
            }
            
         }
      }
      System.out.println(n);
   }
}