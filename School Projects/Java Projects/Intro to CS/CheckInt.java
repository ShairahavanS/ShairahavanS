import java.util.*;

public class CheckInt
{
   public static void main(String[] args) 
   {
      int number;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Input a number:\t"); // ask for a number; get integer input
      number= sc.nextInt();
      System.out.println("\nThe number is " + number + ". ");
      
      if (number > 0)   // if the number is above 0, it is positive
      {
         System.out.println("The number is positive. ");
      }
      else if (number < 0) // if it less than 0, it is negative
      {
         System.out.println("The number is negative. ");
      }
      else if (number == 0)   // if it is 0, it is neutral
      {
         System.out.println("The number is neither positive or negative. ");
      }
      
      if ((number%2) == 0) // if the remainder when divided by 2 is 0, it is even
      {
         System.out.println("The number is even. ");
      }
      else if ((number%2) == 1 || (number%2) == -1)   // if the remainder when divided by 2 is +/-1, it is odd
      {
         System.out.println("The number is odd. ");
      }
      
      if ((number%7) == 0) // if the remainder when divided by 7 is 0, it is a multiple of 7
      {
         System.out.println("The number is multiple of seven. ");
      }
      else  // if the remainder when divided by 7 isn't 0, it is not a multiple of seven
      {
         System.out.println("The number is not a multiple of seven. ");
      }
   }
}