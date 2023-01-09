import java.util.*;

public class BoilingWater
{
   public static void main(String[] args) 
   {
      int temperature, seaLevel, pressure;
      Scanner sc = new Scanner (System.in);
      
      temperature = sc.nextInt();
      
      pressure = (5*temperature)-400;
      
      System.out.println(pressure);
      
      if (pressure < 100)
      {
         System.out.print(1);
      }
      else if (pressure > 100)
      {
         System.out.print(-1);
      }
      else if (pressure == 100)
      {
         System.out.print(0);
      }
   }
}