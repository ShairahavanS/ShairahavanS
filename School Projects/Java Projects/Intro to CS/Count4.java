import java.util.*;

/*
   Count4.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 7th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program uses a while loop that outputs numbers from a to b where a and b are entered by the user..
*/

public class Count4
{
   public static void main(String[] args) 
   {
      int a, b;      // create integer variables; first stores the number inputted by the user; second stores the higher number inputted by the user
      Scanner sc = new Scanner(System.in);      // create scanner
   
      System.out.print("Enter a number: ");     // asks user for input
      a = sc.nextInt();    // integer input from user; stored in b

      System.out.print("Enter a higher number: ");    // asks user for input
      b = sc.nextInt();    // integer input from user; stored in a
       
      while (a <= b)    // condition that a must be less than or equal to b
		{
			System.out.println (a);    // prints value of a
         a++;     // increases value of a by 1; same as a = a + 1
		}
   }
}