import java.util.*;

import java.io.*;

/*
   GroupSum.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 25th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program asks user enter 10 lines of text, then writes each of them to 
   the file “writeLines.txt” on separate lines.
*/

public class GroupSum
{
   public static void main(String[] args) 
   {
      String fileName = "input.txt";   // input file name
      String lineIn = "";
      int number;
      int sum = 0;
      int counter = 0;
      String groupName = "";
      
      try
      {  
         BufferedReader in = new BufferedReader(new FileReader(fileName)); // create buffered reader that reads the file line.txt
         
         do
         {
            counter++;  // counter only necessary for first group
            
            try
            { 
               lineIn = in.readLine();       // read in next line, try to parse into an integer, add number to accumulative sum 
               number = Integer.parseInt(lineIn); 
               sum = sum + number;  
            }
            
            catch (NumberFormatException e)   // if there is an issue parsing
            {
               if (groupName != null)   // if it is not the first group, previous group name is printed
               {
                  System.out.println(groupName);
               }
               
               groupName = lineIn;  // groupName now gets the value of lineIn
               
               
               if (counter != 1)   // if it is not the first loop, print sum
               {
                  System.out.println("Sum = " + sum + "\n");
               }
               
               sum = 0; // reset values
               number = 0;
            } 
            
         } while (lineIn != null);  // runs as long as there is input
      }
      
      catch (IOException e)   // if there is a problem reading the input file
      {
         System.out.println(e + "  Problem reading " + fileName);
      } 
   }
}