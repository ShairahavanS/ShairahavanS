import java.util.*;

public class TimeConversion
{
   public static void main(String[] args) 
   {
      int timeInMinutes, hour, minute;
      Scanner sc = new Scanner(System.in);
      
      System.out.print ("Enter the time in minutes:\t");
      timeInMinutes = sc.nextInt();
      
      hour = (timeInMinutes/60)%12;
      minute = timeInMinutes%60;
      
      System.out.printf ("\nThe time is %d:%02d.", hour, minute);
   }
}