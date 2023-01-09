import java.util.*;

public class FoodOrder
{
   public static void main(String[] args) 
   {
      int choice;
      double price;
      Scanner sc = new Scanner(System.in);
      
      // menu
      System.out.println("1) juice, muffin, coffee");
      System.out.println("2) cereal, toast, milk");
      System.out.println("3) egg, toast, coffee");
      System.out.println("4) banana, granola, milk");
      System.out.println("5) grapefruit, bacon, eggs, coffee\n");
      System.out.print("Please enter your choice:\t");   // user chooses 1 of the 5
      choice = sc.nextInt();
      
      switch (choice)   // evaluates the choice of the user and prints based on the following cases
		{
			case 1:  // choice 1 and 2 have the same price of $2.50
         case 2:
            price = 2.50;
				System.out.printf("It will cost $%.2f", price);
				break;
         case 3:  // choice 3 is $3.00
            price = 3.00;
				System.out.printf("It will cost $%.2f", price);
				break;
         case 4:  // choice 3 is $3.50
            price = 3.50;
				System.out.printf("It will cost $%.2f", price);
				break;
         case 5:  // choice 5 is $5.00
            price = 5.00;
				System.out.printf("It will cost $%.2f", price);
				break;
			default: // if there is an invalid response
				System.out.println("You did not select an appropiate number.");
				break;
		}

   }
}