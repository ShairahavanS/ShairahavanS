import java.util.*;

import java.io.*;

/*
   ReverseLines.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 25th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program reads the file "reverse.txt" and outputs the lines in reverse order.
*/

public class ReverseLines
{
   public static void main(String[] args) 
   {
      String fileName = "reverse.txt"; // input file name
      String lineIn;
      int size;
      
      try
      {  
         BufferedReader in = new BufferedReader(new FileReader(fileName)); // create buffered reader that reads reverse.txt
         
         lineIn = in.readLine();    // read first line in file
         size = Integer.parseInt(lineIn); // size of array gets the value of the number in the first line
         String[] lines = new String[size];  // create a String array with the size indicated
         
         for (int i = 0; i < size; i++)    // loop to read the next <size> lines
         {
            lineIn = in.readLine();    // read next line in file
            lines[i] = lineIn;  // an element of the array get the value of the line      
         }
         
         in.close(); // end file reading
         
         
         for (int i = (size-1); i >= 0; i--) // loops from last index to first index
         {
            System.out.println(lines[i]); // prints the element
         }                     
      }
      catch (IOException e)   // if there is an issue reading the file
      {
         System.out.println(e + "  Problem reading " + fileName);
      } 
          
   }
}