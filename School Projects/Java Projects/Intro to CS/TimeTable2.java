import java.util.*;

import java.io.*;

/*
   TimeTable2.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 25th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program writes a 12x12 multiplication table into the file "timetable.txt".
*/

public class TimeTable2
{
   public static void main(String[] args) 
   {
      
      String fileName = "timetable.txt";  // output file name
      
      try
      {
         BufferedWriter out = new BufferedWriter(new FileWriter(fileName, false));  // create buffered writer that writes timetable.txt
         
         // writing the time table
         
         out.write("\t\t");   // blank at beginning
         for (int i = 1; i <= 12; i++) // loop to print the horizontal header; tabs for format purposes
         {
            out.write(i + "\t\t");
         }
         out.newLine(); // have next writing start on next line
         
         
         for (int i = 1; i <= 9; i++)  // loop 9 times for the first 9 rows
         {
            out.write(i + "\t\t");  // print vertical header at start of each line
            
            for (int j = 1; j <= 12; j++) // loop to print product of i*j to print row ; tab for format purposes
            {
               out.write((i*j) + "\t\t");    
            }
            out.newLine();    // next writing starts on next line
         }
         
         // do the same as above but for rows 10-11
         for (int i = 10; i <= 11; i++)
         {
            out.write(i + "\t\t");
            for (int j = 1; j <= 9; j++)
            {
               out.write((i*j) + "\t\t");
            }
            for (int k = 10; k <= 12; k++)
            {
               out.write((i*k) + "\t");   // only one tab so it aligns with rows 9-11 and columns 10-12
            }
            out.newLine();
         }
         
         
         // writing row 12 ( similar to above)
         for (int i = 12; i <= 12; i++)
         {
            out.write(i + "\t\t");
            for (int j = 1; j <= 8; j++)
            {
               out.write((i*j) + "\t\t");
            }
            for (int k = 9; k <= 12; k++)
            {
               out.write((i*k) + "\t");   // this time, only one tab for columns 9-12 to align with previous 11 rows
            }
         }
         out.close();   // end writing of file
      }
      catch (IOException e)   // if there is a problem writing the file
      {
         System.out.println(e + "  Problem writing " + fileName);
      }
   }
}