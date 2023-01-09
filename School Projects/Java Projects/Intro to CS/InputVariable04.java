import java.util.*;

public class InputVariable04
{
   public static void main(String[] args) 
   {
      String sentence;
      Scanner sc = new Scanner(System.in);
   
      System.out.print("Write something:\t");
      sentence = sc.nextLine();
      
      System.out.print("\n" + sentence);
   }
}