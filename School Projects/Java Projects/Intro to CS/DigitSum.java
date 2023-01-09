import java.util.*;

public class DigitSum
{
   public static void main (String[] args) 
   {
      int inputtedNumber, hundredsDigit, tensDigit, onesDigit, sumOfDigits;
      Scanner sc = new Scanner(System.in);
      
      System.out.print ("Enter a 3-digit number:\t");
      inputtedNumber = sc.nextInt();
      System.out.println ("");
      
      hundredsDigit = inputtedNumber/100;
      tensDigit = (inputtedNumber%100)/10;
      onesDigit = (inputtedNumber%100)%10;
      sumOfDigits = hundredsDigit + tensDigit + onesDigit;
      
      System.out.print ("Your number is " + inputtedNumber);
      System.out.print (" and the sum of its digits is " + sumOfDigits);
   }
}