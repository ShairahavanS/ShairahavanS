import java.util.*;

public class Stages
{
   public static void main(String[] args) 
   {
      int age;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("What is your age?\t");  // prompt for input; get integer
      age = sc.nextInt();
      
      if (age > 18)
      {
         System.out.println("adult");  // if the age is above 18, they are an adult
      }
      else  // if the age is below 18
      {
         if (age <= 5)  // 5 or below is a toddler
         {
            System.out.println("toddler");
         }
         else if (age <= 10)  // 6-10 is a child
         {
            System.out.println("child");
         }
         else if (age <= 12)  // 11-12 is a preteen
         {
            System.out.println("preteen");
         }
         else  // 13-18 is a teen
         {
            System.out.println("teen");
         }
      }
   }
}