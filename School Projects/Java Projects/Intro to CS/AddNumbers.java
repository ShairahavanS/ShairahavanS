import java.io.*;

/*
   AddNumbers.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 25th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program reads the number on each line in a file “numbers.txt”, then outputs 
   the sum to the standard output.
*/

public class AddNumbers
{
   public static void main(String[] args) 
   {
      String fileName = "numbers.txt"; // input file name
      String lineIn;
      int sum = 0;
      
      try
      {  
         BufferedReader in = new BufferedReader(new FileReader(fileName)); // create buffered reader that reads numbers.txt
         
         lineIn = in.readLine(); // read first line in file
         while (lineIn != null)  // if there is something in the line (not nothing)
         {   
            sum = sum + Integer.parseInt(lineIn);  // add the integer value of the number to the accumulative sum
            lineIn = in.readLine();    // read in next line
         }
         in.close(); // stop reading file
         
         System.out.println("The sum of the numbers in " + fileName + " is " + sum + ".");  // print the sum of the numbers in numbers.txt               
      }
      catch (IOException e)   // if there is an issue reading the file
      {
         System.out.println(e + " Problem  reading " + fileName);
      } 
   }
}