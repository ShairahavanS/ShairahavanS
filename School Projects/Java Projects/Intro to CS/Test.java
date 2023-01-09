import java.util.*;

public class Test
{
   public static void main(String[] args) 
   {
      final int pass = 50;
      final int perfect = 100;
      int testMark;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Input a mark:\t");   // prompt user for test mark and get integer input
      testMark = sc.nextInt();
      System.out.println("");
      
      if (testMark>perfect)   // if the mark is above 100 and invalid
      {
         System.out.println ("This mark is above the mark range.");
      }  
      else if (testMark<0) // if the mark is below 0 and invalid
      {
         System.out.println ("This mark is below the mark range.");
      } 
      else if (testMark>=pass)   // if the test mark is not invalid and is greater than or equal to the passing mark
      {
         System.out.println("Passing.");
      }
      else if (testMark<pass) // if the test mark is valid and below a passing grade
      {
         System.out.println("Failing.");
      }
   }
}