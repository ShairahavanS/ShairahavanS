import java.util.*;

public class Average 
{
   public static void main (String[] args) 
   {
      double numberOne, numberTwo, numberThree, average;
      Scanner sc = new Scanner(System.in);
      
      System.out.print ("Input a number:\t");
      numberOne = sc.nextDouble();
      
      System.out.print ("Input a number:\t");
      numberTwo = sc.nextDouble();
      
      System.out.print ("Input a number:\t");
      numberThree = sc.nextDouble();
      System.out.println ("");
      
      average = (numberOne + numberTwo + numberThree)/3;
      System.out.println ("The average of the three numbers is " + average);
   }
}