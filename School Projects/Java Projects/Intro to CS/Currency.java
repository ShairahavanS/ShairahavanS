import java.util.*;

public class Currency
{
   public static void main(String[] args) 
   {
      final double CONVERSION_RATE = 1.29;
      double amountUs, amountCan;  
      Scanner sc = new Scanner(System.in);
      
      System.out.print ("Enter an amount in USD:\t$");
      amountUs = sc.nextDouble();
      
      amountCan = amountUs * CONVERSION_RATE ; 
      
      System.out.printf ("\n$%.2f USD is $%.2f CAD", amountUs, amountCan);
   }
}