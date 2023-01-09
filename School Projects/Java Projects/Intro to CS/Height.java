import java.util.*;

public class Height
{
   public static void main(String[] args) 
   {
      final double METRIC_CONVERSION = 2.54;
      double heightInInches, heightInCm;
      Scanner sc = new Scanner(System.in);
      
      System.out.print ("Enter a height in inches:\t");
      heightInInches = sc.nextDouble();
      
      heightInCm = heightInInches * METRIC_CONVERSION;
      System.out.printf ("\nThe height in centimetres is %.2f", heightInCm);
   }
}