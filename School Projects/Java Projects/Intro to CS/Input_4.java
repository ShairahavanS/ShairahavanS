import java.util.*;

public class Input_4
{
   public static void main(String[] args) 
   {
      String word1, word2;
      Scanner sc = new Scanner(System.in);
   
      System.out.print("Please enter word #1:\t");
      word1 = sc.nextLine();
      
      System.out.print("Please enter word #2:\t");
      word2 = sc.nextLine();
      
      System.out.println(word1);
      System.out.println(word2);
      System.out.println(word1 + "\t" + word2);
   }
}