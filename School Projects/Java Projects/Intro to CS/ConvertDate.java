import java.util.*;

public class ConvertDate
{
   public static void main(String[] args) 
   {
      int year, month, day;
      String monthName = "[placeholder]";
      Scanner sc = new Scanner(System.in);


      System.out.print("Input a date:\nYear: ");   // ask for date (YYYY/MM/DD)
      year = sc.nextInt();
      System.out.print("Month: ");
      month = sc.nextInt();
      System.out.print("Day: ");
      day = sc.nextInt();
      
      if (month < 1 || month > 12 || day > 31 || day < 1)   // make sure it's valid
      {
         System.out.println("Invalid date.");
      }
      else
      {
         switch (month) // for each month, the month corresponds with the case of the month number 
		   {
			case 1:
				monthName = "January";
				break;
         case 2:
				monthName = "February";
				break;
         case 3:
				monthName = "March";
				break;
         case 4:
				monthName = "April";
				break;
         case 5:
				monthName = "May";
				break;
         case 6:
				monthName = "June";
				break;
         case 7:
				monthName = "July";
				break;
         case 8:
				monthName = "August";
		      break;
         case 9:
				monthName = "September";
				break;
         case 10:
				monthName = "October";
				break;
         case 11:
				monthName = "November";
				break;
         case 12:
				monthName = "December";
				break;
			default: // if it's an invalid date and was not picked up by the first if statement
				System.out.println("Invalid date.");  
				break;
		   }
         System.out.println(monthName + " " + day + ", " + year); // prints date in a sentence
      }
   
   
   }
}