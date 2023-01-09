import java.util.*;

public class SimpleInterestAmount
{
   public static void main(String[] args) 
   {
      double amount, principal, years, rate;
      Scanner sc = new Scanner(System.in);
      
      System.out.print ("Enter the principal amount:\t$");
      principal = sc.nextDouble();
      
      System.out.print ("Enter the number of years:\t");
      years = sc.nextDouble();
      
      System.out.print ("Enter the interest rate in %:\t");
      rate = sc.nextDouble();
      
      rate = rate/100;
      amount = principal * (1 + years * rate);
      
      System.out.printf("\nThe total amount with accumulate interest is $%.2f", amount);
   }
}