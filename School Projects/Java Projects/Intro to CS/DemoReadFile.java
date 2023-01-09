/**
* Name: Mr. Lee
* Date: Feb 10
* Description: FileIO, Conditionals 
*/

import java.io.*;

public class DemoReadFile {
   public static void main (String [] args)  {
      /*
         Try to get the closing value of the first of each month
         and print it
         Print the highest closing value and date
      */
      String highDate = "";
      double highClose = -1;
      try {
         File f = new File ("BTC-USD.csv");
         FileReader fr = new FileReader(f);
         BufferedReader br = new BufferedReader(fr);
         
         //reading a line from the file
         System.out.println(br.readLine());
         //look for the 8-9th character to check the date
         String line;
         
         
         
         //while there are more lines to read
         while ((line = br.readLine()) != null) {
            //using the text nuances to find my data
            if (line.contains("-01,")) {
               System.out.println(line);
            }
            int date = Integer.parseInt(line.substring(8,10));
            // System.out.println(date);
            //if it is the first of the month
            
            if (date == 1) {
               System.out.println(line);
               String [] values = line.split(","); //separate values by , into array
               
               //first case, before we have a value, we store the first viable value
               if (highClose == -1) {
                  highClose = Double.parseDouble(values[4]); 
                  highDate = values[0];  
               } else {
                  double tempClose = Double.parseDouble(values[4]); //close value for the day
                  
                  //if current close is higher, replace it
                  if (highClose < tempClose) {
                     highClose = Double.parseDouble(values[4]); 
                     highDate = values[0];  
                  }
               }
               
            }
         }
         br.close();
         fr.close();
      } catch (IOException e) {
         System.out.println("Cannot read file");
      }
      
      System.out.println(highDate);
      System.out.println(highClose);
   }
}