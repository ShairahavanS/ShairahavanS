/*
   Paper.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 7th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program uses a for loop to find both the thickness of the 
   pile and the area of each piece after the procedure has been 
   carried out forty times.
*/

public class Paper
{
   public static void main(String[] args) 
   {
   
      double thickness = 0.09;     // create and initialize double variable to thickness of a single layer; stores thickness after each fold
      double area = 1;      // create and initialize double variable with area of sheet in cm^2 after each fold

      System.out.println("Folds |  Thickness(mm)   | Area(m^2)");                // header
      System.out.println("-----------------------------------------------");     // underline
      System.out.printf("  %-4d| %-17.2f|", 0, thickness);   // first line of data
      System.out.println(" " + area);        // first line of data
      
      for (int i = 1; i <= 40; i++)    // i has an original value of 1, condition that it must be less than or equal to 40, and if condition is met, i increases by 1
      {
         thickness = thickness * 2.0;   // layers multiplied by thickness of the paper
         area = area/2.0;              // area halves from a fold
         System.out.printf("  %-4d| %-17.2f", i, thickness); // format to align
         System.out.println("| " + area);    // prints area
      }
   }
}