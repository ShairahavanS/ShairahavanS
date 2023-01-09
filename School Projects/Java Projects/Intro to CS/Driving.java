import java.util.*;

public class Driving
{
   public static void main(String[] args) 
   {
      final int minAge = 18;
      final int maxAge = 75;
      int age;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("What is your age?\t");  // prompt user for age and get integer input
      age = sc.nextInt();
      System.out.println("");
      
      System.out.println("You are "+age+".");   // say how old they are
      
      if (age < minAge) // if they are not an adult, they're too young
      {
         System.out.println("Too young to drive.");
      }
      else if (age > maxAge)  // if they are older than 75, they're too old
      {
         System.out.println("Sorry you are over the legal age limit for driving.");
      }
      else  // any other age will be a valid age
      {
         System.out.println("Age OK.  Have you got a driver’s licence?");
      }
   }
}