import java.util.*;

public class AgeCheck
{
   public static void main(String[] args) 
   {
      final int LEGAL_AGE = 18;
      int age, difference;
      Scanner sc = new Scanner(System.in);
      
      System.out.print ("What is your age?\t"); // ask for their age; get integer input
      age = sc.nextInt();
      
      if (age >= LEGAL_AGE)   // if they are 18+, they are able to vote
      {
         System.out.println ("OLD ENOUGH TO VOTE");
      }
      else  // if they are less than 18, they can't vote
      {
         difference = LEGAL_AGE - age;
         System.out.println ("You have to wait "+difference+" years to vote.");
      }
   }
}