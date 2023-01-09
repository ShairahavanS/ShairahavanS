import java.util.*;

/*
   Welcome.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 18th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program asks for a person's name and visitor number and outputs a welcome message.
*/

public class Welcome
{
   public static void main(String[] args) 
   {
      int visitorNum;
      String name, message;
      
      Scanner sc = new Scanner (System.in);
      
      System.out.print("Enter your name: "); // prompts user for name; gets string input and stores in name
      name = sc.nextLine();
      
      System.out.print("What is your visitor number: "); // prompts user for number; gets integer input and stores in visitorNum
      visitorNum = sc.nextInt();
      System.out.println();
      
      message = welcomeMessage(name, visitorNum);  // message gets the value of the return of the method with the parameters of name and visitorNum
      System.out.println(message);  // print the message
   }
   
   /*
   ---------------------------------------
   Method Name: String welcomeMessage (String name, int visitorNum)
   Return Type: returns String - the welcome message
   Parameters: String name - the name of the user
               int visitorNum - the visitor number of the user
   
   This method takes a name and number and returns a welcome message.
   ---------------------------------------
   */
   public static String welcomeMessage (String name, int visitorNum)
   {
      String message;   // create return String
      message = "Welcome " + name + "! You are visitor number " + visitorNum + "."; // create message with given info
      return message;   // returns string
   }
}