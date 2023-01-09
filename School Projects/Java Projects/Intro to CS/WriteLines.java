import java.util.*;

import java.io.*;

/*
   WriteLines.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 25th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program asks user enter 10 lines of text, then writes each of them to 
   the file “writeLines.txt” on separate lines.
*/

public class WriteLines
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner (System.in);
      
      String fileName = "writeLines.txt"; // output file name
      String marks;
      
      try
      {
         BufferedWriter out = new BufferedWriter(new FileWriter(fileName, false));  // create output buffered writer that writes file writeLines.txt
         
         for (int i = 1; i <= 10; i++)
         {
            System.out.print("Enter mark set #" + i + ": ");   // prompt for input
            marks = sc.nextLine();  // get String input
            out.write(marks); // print input on line in file
            out.newLine(); // add a new line to writer
         }
         
         out.close();   // end writing of file
      }
      catch (IOException e)   // if there is an issue writing the file
      {
         System.out.println(e + "  Problem writing " + fileName);
      }
   }
}