// This is a single line comment
/* This is a 
   block comment */ 
   
import java.util.Scanner;

public class HelloWorld 
{
   public static void main(String[] args) 
   {
      String name;
      final int AGE = 12;
      Scanner sc = new Scanner(System.in);
   
      System.out.println("Hello world\n"); // hi
      System.out.println("What is your name?");
      name = sc.nextLine();
      
      System.out.print("Your name is ");
      System.out.println(name);
      
      System.out.println(3891+323);
      System.out.println(AGE);
   }
}