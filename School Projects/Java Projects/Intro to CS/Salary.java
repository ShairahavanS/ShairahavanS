import java.util.*;

public class Salary
{
   public static void main(String[] args) 
   {
      final double BASE_SALARY = 1000;
      int numberOfSales;
      double  commission, salary;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("How many sales did you have in the month?\t");  // ask for number of sales; get integer input
      numberOfSales = sc.nextInt();
      
      if (numberOfSales >= 10)   // if they have 10+ sales, they earn commission (sales/100 percent of their salary on top of their base salary
      {
         commission = (double)(numberOfSales/100.0)*BASE_SALARY;
         salary = BASE_SALARY + commission ;
      }
      else  // if they have less than 10 sales, they only earn their base salary and no commission
      {
         salary = BASE_SALARY;
      }
      
      System.out.printf ("You will make $%.2f this month.", salary); // prints their salary for this month
   }
}