   import java.util.*;

   public class Encrypt2
   {
      public static void main (String[] args)
      {
         Scanner in = new Scanner (System.in);
         int length;
         String encrypt = "";
     
         System.out.print ("Enter string: ");
         String str = in.nextLine();
         length = str.length();
       
         char[] breakup = new char[length];
         char change;
       
         for (int c = 0; c < length; c++)
            breakup[c] = str.charAt(c);
       
         for (int c = 0; c < length; c++)
         {
         
            if ( (int) breakup[c] == 32)
            {
               change = breakup[0];
               breakup[0] = breakup[c-1];
               breakup[c-1] = breakup[0];
               
               for (int d = c+1; d <length-1; d++)
               {
                  if ((int) breakup[d] == 32)
                  {
                     change = breakup[c+1];
                     breakup[c+1] = breakup[d-1];
                     breakup[d-1] = change;
                  }
                 
                  else
                  {
                     breakup[d] = (char) (((int)breakup[d]) + 2);
                  }
               }
            }
           
            else if (breakup[c] != 32 && c >= 1 && c < length)
            {
               change = breakup[0];
               breakup[0] = breakup[length-1];
               breakup[length-1] = change;
               
               breakup[c] = (char) (((int)breakup[c]) + 1);
            }
                
         }
         
         for (int c = 0; c < length; c++)
            encrypt = encrypt + (breakup[c]);
       
         System.out.println ("Encrypted String: " + encrypt);
           
      }
   }