import java.util.*;

public class Instructions
{
   public static void main(String[] args) 
   {
      String direction = "";
      int sequence, twoDigits, steps;
      Scanner sc = new Scanner (System.in);
      
      do
      {
         sequence = sc.nextInt();
         if (sequence != 99999)
         {
            twoDigits = sequence/1000;
            steps = sequence%1000;
            twoDigits = (twoDigits/10) + (twoDigits%10);
            if (twoDigits == 0)
            {
            }
            else if ((twoDigits%2) == 0)
            {
               direction = "right";
            }
            else if ((twoDigits%2) == 1)
            {
               direction = "left";
            }
            System.out.println(direction + " " + steps);
         }
      } while (sequence != 99999);
   }
}