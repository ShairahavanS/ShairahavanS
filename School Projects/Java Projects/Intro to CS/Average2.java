import java.util.*;

public class Average2 
{
   public static void main (String[] args) 
   {
      int grade1, grade2, grade3, grade4, grade5;
      double average;
      Scanner sc = new Scanner(System.in);
      
      System.out.print ("Input a grade #1:\t");
      grade1 = sc.nextInt();
      
      System.out.print ("Input a grade #2:\t");
      grade2 = sc.nextInt();
      
      System.out.print ("Input a grade #3:\t");
      grade3 = sc.nextInt();
      
      System.out.print ("Input a grade #4:\t");
      grade4 = sc.nextInt();
      
      System.out.print ("Input a grade #5:\t");
      grade5 = sc.nextInt();
      
      average = (double)(grade1 + grade2 + grade3 + grade4 + grade5)/5;
      System.out.println ("The average of the five grades is " + average);
   }
}