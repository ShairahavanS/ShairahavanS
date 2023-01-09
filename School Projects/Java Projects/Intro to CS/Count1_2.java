/*
   Count1_2.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 7th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program uses a do while loop that outputs numbers from 100 to 1 by 2.
*/

public class Count1_2
{
   public static void main(String[] args) 
   {
      int number = 100;    // create and initialize integer variable to highest number in set; variable will be used to count down to 1 by 2 from 100
      
      do
		{
			System.out.println(number);   // prints the value of number
         number = number-2;            // number decreases by 2
		} while (number >=1);            // condition that loop continues as long as number is greater than or equal to 1
   }
}