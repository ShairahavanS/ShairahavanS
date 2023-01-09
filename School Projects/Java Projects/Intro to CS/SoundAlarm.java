import java.util.*;

/*
   SoundAlarm.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 18th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program outputs "Alarm!" as many times as the user indicated.
*/

public class SoundAlarm
{
   public static void main(String[] args) 
   {
      int numberOfTimes;
      String message;
      
      Scanner sc = new Scanner (System.in);
      
      System.out.print("How many times do you want the alarm to sound? ");
      numberOfTimes = sc.nextInt(); // prompts user for integer input; stores in numberOfTimes
      
      System.out.println();
      
      message = alarm(numberOfTimes);  // message gets the value of the return of the method with the number of times entered by user
      System.out.println(message);  // print the string
   }
   
   /*
   ---------------------------------------
   Method Name: String alarm (int numberOfTimes)
   Return Type: returns String - a message with "Alarm!" printed a given number of times
   Parameters: int numberOfTimes - number of times "Alarm!" is entered in return String
   
   This method takes a number and returns a string with "Alarm!" printed that number of times.
   ---------------------------------------
   */
   public static String alarm (int numberOfTimes)
   {
      final String ALARM = "ALARM! ";
      String message = ""; // create return String
      
      for (int i = 0; i < numberOfTimes; i++)   // loop as many times as the int indicates
      {
         message = message + ALARM; // the message gets another "Alarm!" during every loop
      }
      
      return message;   // return the string
   }
}