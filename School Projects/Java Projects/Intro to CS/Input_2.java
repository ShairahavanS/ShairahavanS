import java.util.*;

public class Input_2
{
   public static void main(String[] args) 
   {
      String name;
      Scanner sc = new Scanner(System.in);
   
      System.out.print("What's your name?\t");
      name = sc.nextLine();
      
      System.out.print("\nHello " + name);
   }
}