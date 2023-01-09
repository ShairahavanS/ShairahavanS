import java.util.*;

public class LastDigit
{
   public static void main(String[] args) 
   {
      int number, lastDigit;
      String inWords = "[placeholder]";
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Input an integer: ");   // prompt for input; get integer
      number = sc.nextInt();
      
      lastDigit = number%10;  // find the last digit using modulo of number by 10
      
      
      switch (lastDigit) // if the number end with +/- n, it writes the number in words
		   {
			case 1:
         case -1:
				inWords = "one";
				break;
         case 2:
         case -2:
				inWords = "two";
				break;
         case 3:
         case -3:
				inWords = "three";
				break;
         case 4:
         case -4:
				inWords = "four";
				break;
         case 5:
         case -5:
				inWords = "five";
				break;
         case 6:
         case -6:
				inWords = "six";
				break;
         case 7:
         case -7:
				inWords = "seven";
				break;
         case 8:
         case -8:
				inWords = "eight";
				break;
         case 9:
         case -9:
				inWords = "nine";
				break;
         case 0:
				inWords = "zero";
				break;
			default: // if there's an invalid answer somehow
				System.out.println("Invalid number.");
				break;
         }
      System.out.println("The last digit of " + number + " is " + inWords + "."); // prints a statement 
   }
}