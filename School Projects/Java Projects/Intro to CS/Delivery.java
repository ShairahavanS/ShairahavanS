import java.util.*;

public class Delivery
{
   public static void main(String[] args) 
   {
      double weight, length, width, height, volume, price;
      Scanner sc = new Scanner(System.in);
      
      // prompt and get values for all dimensions and measurements
      System.out.print("What is the weight of the package (in kg)?\t");
      weight = sc.nextDouble();
      
      System.out.print("What is the length of the package (in cm)?\t");
      length = sc.nextDouble();
      
      System.out.print("What is the width of the package (in cm)?\t");
      width = sc.nextDouble();
      
      System.out.print("What is the height of the package (in cm)?\t");
      height = sc.nextDouble();
      
      volume = length * width * height;   // calculate volume
      
      if (volume > 100000) // if it's more than 100000 cm^3, it's too big
      {
         System.out.println("\ntoo large");
      }
      else if (volume < 0) // if it's an invalid answer
      {
         System.out.println("\nError.");
      }
      else // if the size is ok, evaluate for weight
      {
         if (weight > 27)  // more than 27 kg is too heavy
         {
         System.out.println("\ntoo heavy");
         }
         else if (weight < 0) // less than 0 is invalid
         {
         System.out.println("\nError.");
         }
         else if (weight <= 5)   // less than or 5 kg will be $3 per kg
         {
         price = 3.00 * weight;
         System.out.printf("The delivery will cost $%.2f.", price);
         }
         else if (weight <= 12)  // less than 5-12 kg winn be $3.50 per kg
         {
         price = 3.50 * weight;
         System.out.printf("The delivery will cost $%.2f.", price);
         }
         else if (weight <= 20)  // less than 12-20 kg winn be $4.00 per kg
         {
         price = 4.00 * weight;
         System.out.printf("The delivery will cost $%.2f.", price);
         }
         else if (weight <= 27)  // less than 20-27 kg winn be $4.50 per kg
         {
         price = 4.50 * weight;
         System.out.printf("The delivery will cost $%.2f.", price);
         }
      }
   }
}