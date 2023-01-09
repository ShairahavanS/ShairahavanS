import java.util.*;

public class ArrangingBooks
{
   public static void main(String[] args) 
   {
      String shelf;
      int numberOfSwaps = 0;
      int numberOfBooks;
      int l = 0;
      int m = 0;
      int s = 0;
      char placeholder;
      Scanner sc = new Scanner (System.in);
      
      shelf = sc.nextLine();
      
      numberOfBooks = shelf.length();
      
      char[] bookshelf = new char[numberOfBooks];
      
      for (int i = 0; i < numberOfBooks; i++)
      {
         bookshelf[i] = shelf.charAt(i);
         if (bookshelf[i] == 'L')
         {
            l++;
         }
         else if (bookshelf[i] == 'M')
         {
            m++;
         }
         else if (bookshelf[i] == 'S')
         {
            s++;
         }
      }
      
      for (int i = 0; i < l; i++)
      {
         if (bookshelf[i] != 'L')
         {
            for (int j = l; j < numberOfBooks; j++)
            {
               if (j < (l+m) && bookshelf[i] == 'M')
               {
                  if (bookshelf[j] == 'L')
                  {
                     placeholder = bookshelf[i];
                     bookshelf[i] = bookshelf[j];
                     bookshelf[j] = placeholder;
                     numberOfSwaps++;
                  }
               }
               else if (j >= (l+m) && bookshelf[i] == 'S')
               {
                  if (bookshelf[j] == 'L')
                  {
                     placeholder = bookshelf[i];
                     bookshelf[i] = bookshelf[j];
                     bookshelf[j] = placeholder;
                     numberOfSwaps++;
                  }
               }
               
               if (bookshelf[j] == 'L')
               {
                  placeholder = bookshelf[i];
                  bookshelf[i] = bookshelf[j];
                  bookshelf[j] = placeholder;
                  numberOfSwaps++;
               }
            }
         }
      }
      
      for (int i = l; i < (l+m); i++)
      {
         if (bookshelf[i] != 'M')
         {
            for (int j = (l+m); j < numberOfBooks; j++)
            {
               if (bookshelf[j] == 'M')
               {
                  placeholder = bookshelf[i];
                  bookshelf[i] = bookshelf[j];
                  bookshelf[j] = placeholder;
                  numberOfSwaps++;
               }
            }
         }
      }
      System.out.print(numberOfSwaps);
   }
}