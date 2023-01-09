import java.util.*;

public class Fastfood 
{
   public static void main (String[] args) 
   {
      int burgers, fries, sodas;
      double subtotal, harmonizedSalesTax, totalCost, payment, change;
      Scanner sc = new Scanner(System.in);
      
      System.out.print ("How many burgers would you like?\t");
      burgers = sc.nextInt();
      
      System.out.print ("How many fries would you like?\t");
      fries = sc.nextInt();
      
      System.out.print ("How many sodas would you like?\t");
      sodas = sc.nextInt();
      System.out.println ("");
      
      subtotal = burgers * 1.69 + fries * 1.09 + sodas * 0.99;
      harmonizedSalesTax = subtotal * 0.13;
      totalCost = subtotal + harmonizedSalesTax;
      
      System.out.println ("Subtotal: $" + subtotal);
      System.out.println ("HST: $" + harmonizedSalesTax);
      System.out.println ("Final Cost: $" + totalCost);
      System.out.println ("");
      System.out.print ("How much would you like to pay?\t$");
      payment = sc.nextDouble();
      System.out.println ("");
      
      change = payment - totalCost; 
      System.out.println ("Your change is $" + change);
   }
}