import java.util.*;

public class Staircase
{
   public static void main(String[] args) 
   {
   
      Scanner sc = new Scanner (System.in);
   
      double x;
   
      System.out.print("Enter value of x: ");
      x = sc.nextDouble();
   
   // This local variable should hold the result of stair( x )
      int stair = 0;
   
   // TASK: write code that calculates an integer value
   // corresponding to the value of the function stair( x ) here
   
      if (x == 0)
      {
         stair = 0;
      }
      else if (x > 0) {
         for (int i = 0; i < x; i++) {
            stair = i;
         }
      } 
      else 
      {
         for (int k = 0; k > x; k--) {
            stair = k;
         }
      
         stair -= 1;
      }
      System.out.println("The value of stair(x) is: " + stair);
   }
}