/*
   Count1.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 7th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program uses a while loop to output numbers from 0 to 50 by 5.
*/

public class Count1
{
   public static void main(String[] args) 
   {
      int counter = 0;     // create and initialize integer variable used to count up to 50 by 5 from 0
   
      while (counter <= 50)      // condition that counter must be equal or less than 50
		{
			System.out.println (counter);    // prints value of counter
         counter = counter+5;             // adds 5 to the counter
		}
   }
}