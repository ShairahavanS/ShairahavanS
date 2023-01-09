import java.lang.*;
import java.util.*;
import java.io.*;

public class Individual {

   /*
      Attributes
   */
   
   /** name of player */
   public String name;
   
   /** the age of the player */
   public int age;
   
   public double weight;
      /*
      Constructor
   */
   
   /**
   * Player
   * Creates a player.
   * @param 
   */
   public Individual (String name, int age, double weight) {
      this.name = name;
      this.age = age;
      this.weight = weight;
   }

   // Methods
   
   /**
   * overUnder
   * Whether the projection expects the player to have over or under the inputted stat.
   */
   public String overUnder(String stat, double number) {
      String overUnder = "";
      double value = 0;

      try {
         value = (double)(this.getClass().getField(stat).get(this));
         if (number < 0) {
            overUnder = "Invalid number";
         } else if (value < number){
            overUnder = "Under";
         } else {
            overUnder = "Over";
         }
      }
      catch (Exception e) { 
         overUnder = "Sorry, we don't offer bets on your stat.";
      }
      
      return overUnder;
   }
   
}