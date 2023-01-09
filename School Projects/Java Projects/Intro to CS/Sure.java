
public class Sure
{
   public static void main(String[] args) 
   {
      final int SIZE = 5;
   
      for (int i = 1; i < SIZE; i++) {
         for (int j = SIZE; j >= i; j--) {
            System.out.println(j);
         }
      }
   }
}