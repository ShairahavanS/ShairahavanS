import java.io.*;

/*
   PrintLines.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 25th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program reads each line in a file “line.txt”, then outputs them to the 
   standard output.
*/

public class PrintLines
{
   public static void main(String[] args) 
   {
      String fileName = "line.txt"; // input file name
      String lineIn;
      
      try
      {  
         BufferedReader in = new BufferedReader(new FileReader(fileName)); // create buffered reader that reads the file line.txt
         
         lineIn = in.readLine();    // read first line in file
         while (lineIn != null)  // if there is something in that line (not nothing)
         {
            System.out.println(lineIn);   // print line
            lineIn = in.readLine();       // read in next line   
         }
         in.close();      // stop reading file               
      }
      catch (IOException e)   // if there is an issue reading the file
      {
         System.out.println(e + "  Problem reading " + fileName);
      }      
   }
}