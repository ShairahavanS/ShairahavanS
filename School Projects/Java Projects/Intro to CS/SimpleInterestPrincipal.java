import java.util.*;

public class SimpleInterestPrincipal
{
   public static void main(String[] args) 
   {
      double desiredAmount, principal, years, rate;
      Scanner sc = new Scanner(System.in);
      
      System.out.print ("Enter the desired amount:\t$");
      desiredAmount = sc.nextDouble();
      
      System.out.print ("Enter the number of years:\t");
      years = sc.nextDouble();
      
      System.out.print ("Enter the interest rate:\t");
      rate = sc.nextDouble();
      
      rate = rate/100;
      principal = desiredAmount / (1 + years * rate);
      
      System.out.printf("\nThe principal needed to reach your financial goal is $%.2f", principal);
   }
}