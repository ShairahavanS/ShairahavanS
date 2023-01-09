import java.util.*;

public class Cost
{
   public static void main(String[] args) 
   {
      final double PRICE_OF_BAG = 0.05 ;
      final double HST = 0.13 ;
      double itemCost, hstTotal, bagCost, totalCost, numberOfBags;
      Scanner sc = new Scanner(System.in);
      
      System.out.print ("How much does the item cost?\t");
      itemCost = sc.nextDouble();
      
      System.out.print ("How many bags would you like?\t");
      numberOfBags = sc.nextDouble();
      
      hstTotal = itemCost * HST;
      bagCost = numberOfBags * PRICE_OF_BAG;
      totalCost = itemCost + hstTotal + bagCost;
      System.out.printf("\nThe total HST of the item is $%.2f%n", hstTotal);
      System.out.printf("The cost of the bags is $%.2f%n", bagCost);
      System.out.printf("The total cost is $%.2f%n", totalCost);
   }
}