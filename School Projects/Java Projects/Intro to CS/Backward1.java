/*
   Backward1.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 7th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program uses a for loop to count backwards from 100 to 5 by 5
*/

public class Backward1
{
   public static void main(String[] args) 
   {
      for (int i = 100; i >=5; i-=5) // i gets an original value of 5, condition is that i must be greater than or equal to 5 and the change is that i decreases by 5 if condition is satisfied.
      {
         System.out.println(i);  // prints value of i
      }
   }
}