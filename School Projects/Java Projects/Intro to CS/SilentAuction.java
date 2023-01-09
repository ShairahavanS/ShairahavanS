import java.util.*;

public class SilentAuction
{
   public static void main(String[] args) 
   {
      String highestBidder = "";
      String person;
      int highestBid = -1;
      int bid, number;
      
      Scanner sc = new Scanner (System.in);
      
      number = Integer.parseInt(sc.nextLine());
      
      for (int i = 1; i <= number; i++)
      {
         person = sc.nextLine();
         bid = Integer.parseInt(sc.nextLine());
         if (bid > highestBid)
         {
            highestBid = bid;
            highestBidder = person;
         }
      }
      
      System.out.print(highestBidder);
   }
}