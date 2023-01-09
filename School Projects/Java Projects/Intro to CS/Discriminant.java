import java.util.*;

public class Discriminant
{
   public static void main(String[] args) 
   {
      double a, b, c, discriminant;
      Scanner sc = new Scanner(System.in);
      
      // prompt for value of a, b and c in quadratic standard form
      System.out.print("What is the value of a:\t");
      a = sc.nextDouble();
      
      System.out.print("What is the value of b:\t");
      b = sc.nextDouble();
      
      System.out.print("What is the value of c:\t");
      c = sc.nextDouble();
      
      discriminant = b*b - 4*a*c;
      
      
      if (discriminant == 0.0)   // if the discriminant is equal to 0, there is one real distinct root
      {
         System.out.println("The equation has one root. ");
      }
      else if (discriminant > 0) // if the discriminant is above 0, there is two real distinct roots
      {
         System.out.println("The equation has two roots. ");
      }
      else if (discriminant < 0) // if the discriminant is less than 0, there is no real roots
      {
         System.out.println("The equation has no roots. ");
      }
   }
}