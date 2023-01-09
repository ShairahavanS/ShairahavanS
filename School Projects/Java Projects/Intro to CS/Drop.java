import java.util.*;

public class Drop
{
   public static void main (String[] args) 
   {
      double dropTime, heightInMeters;
      Scanner sc = new Scanner(System.in);
      
      System.out.print ("Input a time less than 4.5 seconds:\t");
      dropTime = sc.nextDouble();
      System.out.println ("");
      
      heightInMeters = 100 - 4.9 * dropTime * dropTime;
      System.out.print ("The height of the ball after " + dropTime);
      System.out.print (" seconds is " + heightInMeters + " meters.");
   }
}