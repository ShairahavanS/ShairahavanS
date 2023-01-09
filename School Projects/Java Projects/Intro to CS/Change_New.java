import java.util.*;

public class Change_New
{
   public static void main(String[] args) 
   {
      final int TOONIE_VALUE = 200;
      final int LOONIE_VALUE = 100;
      final int QUARTER_VALUE = 25;
      final int DIME_VALUE = 10;
      final int NICKEL_VALUE = 5;
      int toonies, loonies, quarters, dimes, nickels, pennies, amount;
      double amountInDollars;
      Scanner sc = new Scanner(System.in);
      
      System.out.print ("Enter the amount (in dollars):\t$");
      amountInDollars = sc.nextDouble();
      
      amount = (int)(amountInDollars*100);
      toonies = amount/TOONIE_VALUE;
      loonies = (amount%TOONIE_VALUE)/LOONIE_VALUE;
      quarters = ((amount%TOONIE_VALUE)%LOONIE_VALUE)/QUARTER_VALUE;
      dimes = (((amount%TOONIE_VALUE)%LOONIE_VALUE)%QUARTER_VALUE)/DIME_VALUE;
      nickels = ((((amount%TOONIE_VALUE)%LOONIE_VALUE)%QUARTER_VALUE)%DIME_VALUE)/NICKEL_VALUE;
      pennies = ((((amount%TOONIE_VALUE)%LOONIE_VALUE)%QUARTER_VALUE)%DIME_VALUE)%NICKEL_VALUE;
      
      System.out.println ("The minimum number of coins is:");
      System.out.printf ("\tToonies: %d%n", toonies);
      System.out.printf ("\tLoonies: %d%n", loonies);
      System.out.printf ("\tQuarters: %d%n", quarters);
      System.out.printf ("\tDimes: %d%n", dimes);
      System.out.printf ("\tNickels: %d%n", nickels);
      System.out.printf ("\tPennies: %d", pennies);
   }
}