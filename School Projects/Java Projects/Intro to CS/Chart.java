/*
   Chart.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 7th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program uses a for loop to create a chart of sqaures and cubes for integers 5-40.
*/

public class Chart
{
   public static void main(String[] args) 
   {
      int square, cube; // creates integer variables; square stores the value of the square of i in the loop; cube stores the value of the cube of i in the loop

      System.out.println("Number | Square | Cube ");  // header
      System.out.println("-----------------------");  // underline
      
      for (int i = 5; i <= 40; i++) // i originally takes a value of 5, condition is that it must be less than or equal to 40, and i increases by 1 if the condition is met.
      {
         square = i*i;  // i is squared; stored in square
         cube = i*i*i;  // i is cubed; stored in cube
         System.out.printf("%-7d| %-7d| %d%n", i, square, cube);  // formatted so number, square, and cube are formatted  to be aligned and shown.
      }
   }
}