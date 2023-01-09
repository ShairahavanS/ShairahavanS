import java.util.*;

public class PizzaCost 
{
   public static void main (String[] args) 
   {
      double diameter, costOfPizza;
      Scanner sc = new Scanner(System.in);
      
      System.out.print ("Input the diameter of a pizza in inches:\t");
      diameter = sc.nextDouble();
      System.out.println ("");
      
      costOfPizza = 1.75 + 0.05 * diameter * diameter;
      System.out.print ("The cost of making the pizza is $" + costOfPizza);
   }
}