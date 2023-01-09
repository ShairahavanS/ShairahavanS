import java.util.*;

import java.io.*;

/*
   StarTable2.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 25th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program asks the user for dimensions and writes a 2-D star table in "star.txt" with 
   the dimensions from the user.
*/

public class StarTable2
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner (System.in);
      
      final char STAR = '*'; 
      String fileName = "star.txt"; // create output file
      int rows, columns;
      
      try
      {
         BufferedWriter out = new BufferedWriter(new FileWriter(fileName, false));  // created buffered writer to write file star.txt
         
         System.out.print("How many rows do you want in your star table? ");  // prompt user for number of rows and columns; get integer input
         rows = sc.nextInt();
         
         System.out.print("How many columns do you want in your star table? ");  
         columns = sc.nextInt();
         
         for (int i = 0; i < rows; i++)   // loop for the amount of rows and in nested loop, columns
         {
            for (int j = 0; j < columns; j++)   
            {
               out.write(STAR);  // print an asterisk <column> many times in a row to create the columns
            }
            out.newLine(); // create new line to write next row
         }
         out.close();   // end writing
      }
      catch (IOException e)   // if there is a problem writing the file
      {
         System.out.println(e + "  Problem writing " + fileName);
      }
   }
}