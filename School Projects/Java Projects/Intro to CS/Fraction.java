/**
Name:
Date:
Description:
*/

public class Fraction {

   /*
   Attributes
   */
   private int numerator;
   private int denominator;
   
   /** 
   Class Field
   the number of decimals to display
   */
   public static int numDecimals = 2;
   
   /*
   Constructors
   */
   public Fraction(int numerator, int denominator) {
      this.numerator = numerator;
      this.denominator = denominator;
   }
   
   /*
   Accessors
   */
   public int getNumerator() {
      return this.numerator;
   }
   public int getDenominator() {
      return this.denominator;
   }
   
   /*
   Mutators
   */
   public void setNumerator(int newNum) {
      this.numerator = newNum;
      newNum = 30;
   }
   public void setDenominator(int newDen) {
      if (newDen != 0) {
         this.denominator = newDen;
      }
   }
   
   
   
   
   /*
   Other methods
   */
   
   /**
   finds the common denominator between the current fraction and another fraction
   @param another denominator to compare
   @return the common denominator
   */
   public int simpleDenominator(int otherDen) {
      return 0;
   }
   
   /**
   finds the common denominator between two fractions
   @param another fraction to compare
   @return the common denominator
   */
   public int simpleDenominator(Fraction otherF) {
      return 0;
   }
   
   /**
   finds the common denominator of an array of fractions
   @param another fraction to compare
   @return the common denominator
   */
   public int simpleDenominator(Fraction [] otherF) {
      return 0;
   }
   
   
   
   
   /**
   Changes a fraction to its simplest form
   A helper method - used to help do methods, but shouldn't
   be able to access outside of the class
   only does this when multiplying
   */
   private void simplify() {
   }
   
   /*
   Class Method
   */
   /**
   finds the product of the two fractions; does not change the provided fractions
   @param f1 the first fraction to add
   @param f2 the second fraction to add
   @return a new Fraction that is the product of two fractions
   */
   public static Fraction multiply(Fraction f1, Fraction f2){
      return null;
   }
   
   public static void setNumDecimals(int n) {
      if (n>0) {
         numDecimals = n;
      }
   }
   
   /*
   toString
   */
}