import java.util.*;

public class Spending
{
   public static void main(String[] args) 
   {
      double total, food, foodPercentage, clothingPercentage, clothing, entPercentage, entertainment, rentPercentage, rent;
      Scanner sc = new Scanner(System.in);
      
      System.out.print ("Enter the amount spent last month on the following item:\n");
      System.out.print ("Food: $");
      food = sc.nextDouble();
      System.out.print ("Clothing: $");
      clothing = sc.nextDouble();
      System.out.print ("Entertainment: $");
      entertainment = sc.nextDouble();
      System.out.print ("Rent: $");
      rent = sc.nextDouble();
      
      total = food+rent+clothing+entertainment;
      foodPercentage = (food/total)*100;
      clothingPercentage = (clothing/total)*100;
      entPercentage = (entertainment/total)*100;
      rentPercentage = (rent/total)*100;
      
      System.out.printf("%s%15s%n", "Category", "Budget");
      System.out.printf("%-16s%6.2f%s%n", "Food:", foodPercentage, "%");
      System.out.printf("%-16s%6.2f%s%n", "Clothing:", clothingPercentage, "%");
      System.out.printf("%-16s%6.2f%s%n", "Entertainment:", entPercentage, "%");
      System.out.printf("%-16s%6.2f%s%n", "Rent:", rentPercentage, "%");
   }
}