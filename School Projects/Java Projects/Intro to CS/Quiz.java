import java.util.*;

public class Quiz
{
   public static void main(String[] args) 
   {
      String answer;
      Scanner sc = new Scanner(System.in);
      
      System.out.println("What is the operator for 'not equal to'?\n"); // print answer with options
      System.out.println("|A| - &&");
      System.out.println("|-|");
      System.out.println("|B| - !=");
      System.out.println("|-|");
      System.out.println("|C| - ||");
      System.out.println("|-|");
      System.out.println("|D| - !");
      System.out.println("|-|");
      System.out.println("|E| - ==");
      System.out.print("\nAnswer: ");
      answer = sc.nextLine();
      
      switch (answer)   // evaluate response for possible responses; says if it is correct or incorrect
		   {
			case "A": 
         case "a":
         case "&&":
				System.out.println("Incorrect. That is the boolean operator for 'and'.");
				break;
         case "B":   // CORRECT ANSWER
         case "b":
         case "!=":
				System.out.println("Correct. That is the rational operator for 'not equal to'.");
				break;
         case "C":
         case "c":
         case "||":
				System.out.println("Incorrect. That is the boolean operator for 'or'.");
				break;
         case "D":
         case "d":
         case "!":
				System.out.println("Incorrect. That is the boolean operator for 'not'.");
				break;
         case "E":
         case "e":
         case "==":
				System.out.println("Incorrect. That is the rational operator for 'equals'.");
				break;
			default: // if an invalid option is typed
				System.out.println("Invalid option.");
				break;
		   }
   }
}