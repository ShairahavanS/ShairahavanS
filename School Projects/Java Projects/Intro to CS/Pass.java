import java.util.*;

public class Pass
{
   public static void main(String[] args) 
   {
      int randInt1, randInt2, answer, response;
      Scanner sc = new Scanner(System.in);
      
      randInt1 = (int)(Math.random()*100);   // get two random numbers
      randInt2 = (int)(Math.random()*100);
      answer = randInt1 + randInt2; // add them together
      
      System.out.print ("What is "+randInt1+" + "+randInt2+"?\t");   // ask question; get response
      response = sc.nextInt();
      
      if (response == answer) // if the response is equal to the answer, it's correct
      {
         System.out.println("Correct!");
      }
      else  // otherwise if it isn't it is incorrect
      {
         System.out.println("Incorrect.");
      }
   }
}