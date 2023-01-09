import java.util.*;

import java.io.*;

/*
   PrintAllChar.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 25th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program reads all lines in the file “allChar.txt”, then prints each 
   character on each line on separate line, excluding the spaces, ‘\n’ and ‘\r’
*/

public class PrintAllChar
{
   public static void main(String[] args) 
   {
      String fileName = "allChar.txt"; // input file name
      int charIn;
      
      try
      {  
         BufferedReader in = new BufferedReader(new FileReader(fileName)); // create buffered reader that reads allChar.txt
         
         charIn = in.read();  // read in first character in file
         
         while (charIn != -1)    // if there is a character (not nothing)
         {
            if (charIn != 10 && charIn != 13 && charIn != 32)  // condition that it must not be the ASCII code for '\r', '\n', and ' '
            {
               System.out.println((char)(charIn));  // print character of ASCII number of charIn
            }
            charIn = in.read();           // read next character
         }
         
         in.close();    // end file reading                  
      }
      
      catch (IOException e)   // if there is an issue reading the file
      {
         System.out.println(e + "  Problem reading " + fileName);
      }      
      
   }
}