import java.util.*;

public class Temperature
{
   public static void main(String[] args) 
   {
      double temperature;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Input a temperature:\t");  // prompt user for input; get double input
      temperature = sc.nextDouble();
      System.out.print("\nIt's ");
      
      if (temperature < -18)  // if it's below -18 degrees
      {
         System.out.println("very cold.");
      }
      else if (temperature < 0)  // if it's between -18 and 0 degrees
      {
         System.out.println("cold.");
      }
      else if (temperature == 0) // if it's 0 degrees
      {
         System.out.println("the freezing point of water.");
      }
      else if (temperature <= 10)   // if it's from 0-10 degrees
      {
         System.out.println("very cool.");
      }
      else if (temperature <= 20)   // if it's from 10-20 degrees
      {
         System.out.println("moderate.");
      }
      else if (temperature <= 30)   // if it's from 20-30 degrees
      {
         System.out.println("warm.");
      }
      else if (temperature <= 40)   // if it's from 30-40 degrees
      {
         System.out.println("hot.");
      }
      else if (temperature < 100)   // from 40-100 degrees
      {
         System.out.println("extremely hot.");
      }
      else if (temperature >= 100)  // above or equal to boiling point
      {
         System.out.println("the boiling point of water.");
      }
   }
}