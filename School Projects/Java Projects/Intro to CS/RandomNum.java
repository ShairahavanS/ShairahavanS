/*
   RandomNum.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date:  Jan 18th, 2021
   Course:  ICS3U1
   ---------------------------------------
   This program prints a random nuber between 0 and 100.
*/

public class RandomNum
{
   public static void main(String[] args) 
   {
      int randomNumber; 
      
      randomNumber = (int)(Math.random()*101);  // generate a random number from 0-100 (go 1 above maximum number); store in randomNumber
      System.out.println(randomNumber);   // print the random number     
   }
}