import java.util.*;

public class Tip
{
   public static void main(String[] args) 
   {
      String grade;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("What is your Computer Science grade? ");  // ask for grade; get letter grade
      grade = sc.nextLine();
      
      
      switch (grade) // evaluate the grade through the following cases
		   {
			case "A":   // if it's an A/4
         case "A-":
         case "A+":
         case "a":
         case "a-":
         case "a+":
				System.out.println("Great job! Keep up the good work!");
				break;
         case "B":   // if it's an B/3
         case "B-":
         case "B+":
         case "b":
         case "b-":
         case "b+":
				System.out.println("Good job! Keep learning!");
				break;
         case "C":   // if it's a C/2
         case "C-":
         case "C+":
         case "c":
         case "c-":
         case "c+":
				System.out.println("You're doing okay. Try to improve by working hard!");
				break;
         case "D":   // if it's a D/1
         case "D-":
         case "D+":
         case "d":
         case "d-":
         case "d+":
				System.out.println("You need to get that mark up. Remember to work hard in this course!");
				break;
         case "F":   // if it's a failing grade
         case "f":
				System.out.println("You are failing! Try to get to a passing grade with hard work and determination! Ask for help if you need it.");
				break;
			default: // if it's none of the above and an invalid grade
				System.out.println("Invalid mark.");
				break;
		   }
   }
}