import java.io.*;

import java.util.*;

/*
   StudentMarks.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 25th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program 
*/

public class StudentMarks
{
   public static void main(String[] args) 
   {
      String inputFileName = "marks.txt";  // the file that is inputted and read
      String outputFileName = "results.txt"; // the file that is outputted and written
      double markIn;
      int students = 0;
      int marks = 0;
      int bestStudent = -1;
      double average = 0;
      double bestAverage = -1;
      
      try
      {  
         Scanner sc = new Scanner(new File(inputFileName));
         
         students = sc.nextInt();   // number of students
         
         marks = sc.nextInt();   // number of tests
      }
      catch (IOException e)   // if there is a problem reading the input file
      {
         System.out.println(e + "  Problem reading " + inputFileName);
      } 
      
      // store outside try/catch block to prevent error
      double[][] studentMarks = new double[students][marks];   // 2D array to store marks more each student
      double[] testAverage = new double[marks]; // array to store average for each student
      double[] studentAverage = new double[students];    // array to store test average for each test
         
         
      try
      {  
         Scanner sc = new Scanner(new File(inputFileName));
         
         students = sc.nextInt();   // just so it doesn't read these values and store for marks
         marks = sc.nextInt();
         
         
         for (int i = 0; i < students; i++)   // read and store all the values in the array 
         {  
            for (int j = 0; j < marks; j++)  
            {  
               markIn = sc.nextDouble();
               
               studentMarks[i][j] = markIn;  
            }
                   
         }                  
      }
      catch (IOException e)   // if there is a problem reading the input file
      {
         System.out.println(e + "  Problem reading " + inputFileName);
      } 
      
      
      
      for (int i = 0; i < students; i++) // calculate average for all the students and find highest average
      {
         average = 0;   // reset
         for (int j = 0; j < marks; j++)
         {
            average = average + studentMarks[i][j];   // add tests scores up
         }
         studentAverage[i] = (double)average/(double)(marks);  // divide by number of tests
         
         if (studentAverage[i] > bestAverage)   // if they have a higher average than the current highest average, that value takes over for highest average and the bestStudent becomes that student
         {
            bestAverage = studentAverage[i];
            bestStudent = (i+1);
         }
      }
      
      for (int i = 0; i < marks; i++)  // calculate average for all tests
      {
         average = 0;   // reset
         for (int j = 0; j < students; j++)
         {
            average = average + studentMarks[j][i];   // add the test score up
         }
         testAverage[i] = (double)average/(double)(students);  // divide by number of students
      }
      
      
      try
      {
         BufferedWriter out = new BufferedWriter(new FileWriter(outputFileName, false));  // created buffered writer for output file "results.txt"
         
         for (int i = 0; i < students; i++)  // write average of each student
         {
            out.write("Student " + (i+1) + " Average: ");
            out.write("" + studentAverage[i]);
            out.newLine();
         }
         
         out.newLine();
         out.write("The student with the highest average is student " + bestStudent + ".");  // say who had the highest average
         out.newLine();
         out.newLine();
         
         for (int i = 0; i < marks; i++)  // write average of each test
         {
            out.write("Test " + (i+1) + " Average: ");
            out.write("" + testAverage[i]);
            out.newLine();
         }
         
         out.close();
      }
      catch (IOException e)   // if there is a problem writing the output file
      {
         System.out.println(e + "  Problem writing " + outputFileName);
      }
   
   }
}