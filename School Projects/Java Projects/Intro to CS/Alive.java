import java.util.*;

public class Alive 
{
   public static void main (String[] args) 
   {
      int yearBirth, monthBirth, dayBirth;
      int yearCurrent, monthCurrent, dayCurrent;
      int daysAlive, hoursAsleep;
      Scanner sc = new Scanner(System.in);
      
      System.out.println ("Enter your birth date:");
      System.out.print ("Year:\t");
      yearBirth = sc.nextInt();
      System.out.print ("Month:\t");
      monthBirth = sc.nextInt();
      System.out.print ("Day:\t");
      dayBirth = sc.nextInt();
      System.out.println ("Enter today's date:");
      System.out.print ("Year:\t");
      yearCurrent = sc.nextInt();
      System.out.print ("Month:\t");
      monthCurrent = sc.nextInt();
      System.out.print ("Day:\t");
      dayCurrent = sc.nextInt();
      
      daysAlive = (yearCurrent - yearBirth) * 365 + (monthCurrent - monthBirth) * 30 + dayCurrent - dayBirth;
      hoursAsleep = daysAlive * 8;
      
      System.out.println ("You have been alive for " + daysAlive + " days.");
      System.out.println ("You have slept " + hoursAsleep + " hours.");
   }
}