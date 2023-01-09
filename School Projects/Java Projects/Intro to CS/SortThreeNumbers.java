import java.util.*;

public class SortThreeNumbers
{
   public static void main(String[] args) 
   {
      int number1, number2, number3;
      Scanner sc = new Scanner(System.in);
      
      // prompt and get values for all 3 numbers
      System.out.print("Input a positive integer:\t");
      number1 = sc.nextInt();
      
      System.out.print("Input a positive integer:\t");
      number2 = sc.nextInt();
      
      System.out.print("Input a positive integer:\t");
      number3 = sc.nextInt();
      
      if (number1 <= 0 || number2 <= 0 || number3 <= 0)  // if it's invalid input
      {
         System.out.println("Error.");
      }
      // all the possible combinations and the order they yield
      else if (number1 <= number2 && number2 <= number3 && number1 <= number3)
      {
         System.out.println(number1 +","+ number2 +","+ number3);
      }
      else if (number1 >= number2 && number2 <= number3 && number1 <= number3)
      {
         System.out.println(number2 +","+ number1 +","+ number3);
      }
      else if (number1 <= number2 && number2 >= number3 && number1 <= number3)
      {
         System.out.println(number1 +","+ number3 +","+ number2);
      }
      
      else if (number1 >= number2 && number2 <= number3 && number1 >= number3)
      {
         System.out.println(number2 +","+ number3 +","+ number1);
      }
      else if (number1 <= number2 && number2 >= number3 && number1 >= number3)
      {
         System.out.println(number3 +","+ number1 +","+ number2);
      }
      else if (number1 >= number2 && number2 >= number3 && number1 >= number3)
      {
         System.out.println(number3 +","+ number2 +","+ number1);
      }
   }
}