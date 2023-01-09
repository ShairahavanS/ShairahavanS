/*
   Count2.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 7th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program uses a while loop to output numbers from 50 to 100 by 1.
*/

public class Count2
{
   public static void main(String[] args) 
   {
      int counter = 50;       // create and initialize integer variable that counts up to 100 by 1 from 50
   
      while (counter <= 100)  // condition that counter must be less than or equal to 100
		{
			System.out.println (counter);    // prints the value of the counter
         counter++;           // counter is increased by 1; same as counter = counter + 1
		}
   }
}