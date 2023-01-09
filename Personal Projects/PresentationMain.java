import java.util.*;
import java.io.*;
import java.lang.*;

/**
* Name: Shairahavan Selvachandran
* Description: The simulated results.
*/

public class PresentationMain {
   public static void main(String[] args) {
      
      Player yeah = new Player("Lebron James", "LAL", 20, 30.0, 22.0, 8.0, 5.0, 1.0, 2.0, 2.6, -0.4, 2.2, 108.4, 112.3, 0.4, 16.3, 8.2, 3.2, 2.8, 6.8, 1.2, 3.8, 0.8, 7.8, 3.1, 4.5);
      
      System.out.println(yeah.toString());
      
      System.out.println(yeah.overUnder("oldMinutes", 28.0));
      
      /**
      //read player stats (loops to get all three pages), get rid of duplicates (replace with TOT), make player in loop
      
      // need temporary string for the input
      String inputtedLine = "";
            
      // temporary values to record current champ's name, hp, and armor
      String name = "";
      String hpInWords = "";
      String armorInWords = "";
      double hpNumber, armorNumber; // parsed hp and armor values
      
      // to record champ with top hp and lowest armor (changing as the file is read)
      String champTopHP = "";
      String champLowestArmor = "";
      double lowestArmor = (Double.MAX_VALUE);
      double topHP = -1;

      
      try // try and catch for reading or writing error
      {
         // create input buffered reader that reads file champions.json
         String inputFileName = "champions.json";
         BufferedReader in = new BufferedReader(new FileReader(inputFileName));
         
         // create output buffered writer that writes file MaxChampStats.txt
         String outputFileName = "MaxChampStats.txt";
         BufferedWriter out = new BufferedWriter(new FileWriter(outputFileName, false));  
         
         
         while ((inputtedLine = in.readLine()) != null) // continue while the file can still be read
         {
            try   // try and catch for parsing error
            {
            
               // if the line contains "name": , the variable name temporarily takes on the value of the champion name
               if (inputtedLine.contains("\"name\": ")) 
               {
                  name = inputtedLine.substring(13, inputtedLine.length()-2);
               }
               
               // if the line contains "hp": , the hp is found through parsing a substring
               else if (inputtedLine.contains("\"hp\": ")) 
               {
                  hpInWords = inputtedLine.substring(12, inputtedLine.length()-1);
                  hpNumber = Double.parseDouble(hpInWords);
                  
                  // if the hp value is higher than the current top hp, the champion becomes the new top hp champ and it's name and hp are recorded
                  if (hpNumber > topHP)
                  {
                     topHP = hpNumber;
                     champTopHP = name;
                  }
               }
               
               // if the line contains "hp": , the hp is found through parsing a substring
               else if (inputtedLine.contains("\"armor\": ")) 
               {
                  armorInWords = inputtedLine.substring(15, inputtedLine.length()-1);
                  armorNumber = Double.parseDouble(armorInWords);
                  
                  // if the armor value is higher than the current lowest armor, the champion becomes the new tlow armor champ and it's name and armor are recorded
                  if (armorNumber < lowestArmor)
                  {
                     lowestArmor = armorNumber;
                     champLowestArmor = name;
                  }
               }
            }
            
            //if there is a parsing error
            catch (NumberFormatException e)
            {
               System.out.println("sure");
            }
         }
      */
      
   }
}