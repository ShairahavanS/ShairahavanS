import java.util.*;

public class Unit1ProgrammingEvaluation
{
   public static void main(String[] args) 
   {
      final double HST = 0.13;
      final int FIFTY_VALUE = 5000;
      final int TWENTY_VALUE = 2000;
      final int TEN_VALUE = 1000;
      final int FIVE_VALUE = 500;
      final int TOONIE_VALUE = 200;
      final int LOONIE_VALUE = 100;
      final int QUARTER_VALUE = 25;
      final int DIME_VALUE = 10;
      final int NICKEL_VALUE = 5;
      String itemName;
      int numberOfItems;
      double costOfItem, subtotal, taxes, totalCost, payment, change;
      int changeInCents, fifties, twenties, tens, fives, toonies, loonies, quarters, dimes, nickels, pennies;
      Scanner sc = new Scanner(System.in);
      
      System.out.println("||/\\/\\ =======\\/  \"WELCOME TO FRONZEL'S HARDWARE\"  \\/======= /\\/\\||");
         
      System.out.print("Name of Item: ");
      itemName = sc.nextLine();
      
      System.out.print("Number of " + itemName + " purchases? ");
      numberOfItems = sc.nextInt();
      
      System.out.print("Cost of " + itemName + "? ");
      costOfItem = sc.nextDouble();
      
      subtotal = (double)(numberOfItems*costOfItem);
      taxes = HST * subtotal;
      totalCost = subtotal + taxes;
      
      System.out.printf("%n%-19s$%,10.2f%n", "Your subtotal is", subtotal);
      System.out.printf("%-19s$%,10.2f%n", "Your tax is", taxes);
      System.out.printf("%-19s$%,10.2f%n", "Your total is", totalCost);
      
      System.out.print("\nAmount Paid? ");
      payment = sc.nextDouble();
      
      change = payment - totalCost;
      
      System.out.printf("%n%-19s$%,10.2f%n", "Your change is:", change);
      
      changeInCents = (int)(100 * change);
      
      fifties = changeInCents/FIFTY_VALUE;
      twenties = (changeInCents%FIFTY_VALUE)/TWENTY_VALUE;
      tens = ((changeInCents%FIFTY_VALUE)%TWENTY_VALUE)/TEN_VALUE;
      fives = (((changeInCents%FIFTY_VALUE)%TWENTY_VALUE)%TEN_VALUE)/FIVE_VALUE;
      toonies = ((((changeInCents%FIFTY_VALUE)%TWENTY_VALUE)%TEN_VALUE)%FIVE_VALUE)/TOONIE_VALUE;
      loonies = (((((changeInCents%FIFTY_VALUE)%TWENTY_VALUE)%TEN_VALUE)%FIVE_VALUE)%TOONIE_VALUE)/LOONIE_VALUE;
      quarters = ((((((changeInCents%FIFTY_VALUE)%TWENTY_VALUE)%TEN_VALUE)%FIVE_VALUE)%TOONIE_VALUE)%LOONIE_VALUE)/QUARTER_VALUE;
      dimes = (((((((changeInCents%FIFTY_VALUE)%TWENTY_VALUE)%TEN_VALUE)%FIVE_VALUE)%TOONIE_VALUE)%LOONIE_VALUE)%QUARTER_VALUE)/DIME_VALUE;
      nickels = ((((((((changeInCents%FIFTY_VALUE)%TWENTY_VALUE)%TEN_VALUE)%FIVE_VALUE)%TOONIE_VALUE)%LOONIE_VALUE)%QUARTER_VALUE)%DIME_VALUE)/NICKEL_VALUE;
      pennies = ((((((((changeInCents%FIFTY_VALUE)%TWENTY_VALUE)%TEN_VALUE)%FIVE_VALUE)%TOONIE_VALUE)%LOONIE_VALUE)%QUARTER_VALUE)%DIME_VALUE)%NICKEL_VALUE;
      
      System.out.printf("%n%-3d$50s", fifties);
      System.out.printf("%n%-3d$20s", twenties);
      System.out.printf("%n%-3d$10s", tens);
      System.out.printf("%n%-3d$5s", fives);
      System.out.printf("%n%-3dtoonies", toonies);
      System.out.printf("%n%-3dloonies", loonies);
      System.out.printf("%n%-3dquarters", quarters);
      System.out.printf("%n%-3ddimes", dimes);
      System.out.printf("%n%-3dnickels", nickels);
      System.out.printf("%n%-3dpennies", pennies);
   }
}