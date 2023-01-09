import java.util.*;

import java.io.*;

/*
   WriteChars.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 25th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program 
*/

public class WriteChars
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner (System.in);
      
      String fileName = "writeChars.txt"; // output file name
      String sentence;
      String singleCharacter;
      
      try
      {
         BufferedWriter out = new BufferedWriter(new FileWriter(fileName, false));  // create buffered writer that writes file writeChars.txt
         
         do
         {
            System.out.print("Enter a line of text: ");  // prompt user for input
            sentence = sc.nextLine();  // get String input
            
            if (!sentence.equals("stop"))  // if the word is not stop, loop for all characters, and write them
            {
               for (int i = 0; i < sentence.length(); i++) 
               {
                  singleCharacter = sentence.substring(i, (i+1));
                  out.write(singleCharacter);
                  out.newLine();
               }
               out.newLine(); // blank line separating sets of characters
            }
            
         } while (!sentence.equals("stop")); // continues as long as "stop" isn't enter
         
         out.close();   // end writing of file
      }
      catch (IOException e)   // if there is a problem writing the file
      {
         System.out.println(e + "  Problem writing " + fileName);
      }
   }
}