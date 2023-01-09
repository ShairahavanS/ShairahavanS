import java.util.*;

public class Energy
{
   public static void main(String[] args) 
   {
      final int SPEED_OF_LIGHT = 300000000 ;
      final int JOULES_FOR_BULB = 360000 ;
      double energy, mass, numberOfLightbulbs;
      Scanner sc = new Scanner(System.in);
      
      System.out.print ("Enter a mass in kilograms:\t");
      mass = sc.nextDouble();
      
      energy = mass * SPEED_OF_LIGHT * SPEED_OF_LIGHT;
      System.out.printf("\nThe amount of energy is %,.0f joules.\n", energy);
      
      numberOfLightbulbs = energy/JOULES_FOR_BULB;
      System.out.printf ("This can power %,.0f lightbulbs.", numberOfLightbulbs);
   }
}