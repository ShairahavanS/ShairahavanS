import java.util.*;

public class Capital
{
   public static void main(String[] args) 
   {
      String capital;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("What is the capital of Canada?\t"); // Ask question and get responce
      capital = sc.nextLine();
      
      switch (capital)  // if the answer is Ottawa, they are correct; every other answer is incorrect
		{
			case "ottawa":
         case "Ottawa":
         case "OTTAWA":
				System.out.println("Correct!");
				break;
			default:
				System.out.println("Incorrect.");
				break;
		}
   }
}