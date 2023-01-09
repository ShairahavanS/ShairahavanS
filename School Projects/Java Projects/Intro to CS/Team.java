
public class Team {

   /*
      Attributes
   */
   
   /** the amount of damage the item does (if it is a weapon) */
   private double damage;
   
   /*
      Constructor
   */
   
   /**
   * Team
   * Creates an array of Players on a team.
   * @param 
   */
   public Team () {
      
   }
   
   /*
      Accessors
   */
   
   /**
   * Gets the damage of the weapon
   * @return the weapon's damage
   */
   public double getDamage() {
      return this.damage;
   }

   /*
      Mutators
   */
   
   /**
   * changes the amount of damage the weapon does
   * @param newDamage - new amount of damage for the weapon
   */
   public void setDamage(double newDamage) {
      this.damage = newDamage;
   }
   
   // Methods

   /**
   * toString
   * Returns a string with the attributes of the item.
   * @return returnString: 
   */
   public String toString() {
      String returnString = "";
      
      returnString += "Player 1: ";
      returnString += "PG";
      returnString += "/nPlayer 2: ";
      returnString += "SG";
      
      return returnString;
   }
}