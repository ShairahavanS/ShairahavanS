
public class Weapon extends Item {

   private final int MAX_ACCURACY = 100;
   private final int MIN_DURABILITY = 0;
   
   /*
      Attributes
   */
   
   /** the amount of damage the item does (if it is a weapon) */
   private double damage;
   
   /** the range of the weapon */
   private double damageRadius;
   
   /** the accuracy of the weapon */
   private double damageAccuracy;


   /*
      Constructor
   */
   
   /**
   * Item
   * Creates a weapon in minecraft.
   * @param damage: the amount of damage the weapon does
   * @param damageAccuracy: the accuracy of damage of the weapon
   */
   public Weapon (double damage, double damageAccuracy) {
      this.damage = damage;
      this.damageAccuracy = damageAccuracy;
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
   
   /**
   * Gets the accuracy of damage of the weapon
   * @return the weapon's accuracy
   */
   public double getDamageAccuracy() {
      return this.damageAccuracy;
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
   
   /**
   * changes the accuracy of damage for the item
   * @param newDamageAccuracy - new damage accuracy of item
   */
   public void setDamageAccuracy(double newDamageAccuracy) {
      this.damageAccuracy = newDamageAccuracy;
   }
   
   // Methods
   
   /**
   * upgradeAccuracy
   * Upgrades the accuracy of damage for the item up to a maximum.
   */
   public void upgradeAccuracy() {
      this.damageAccuracy += 5;
      
      if (this.damageAccuracy >= MAX_ACCURACY) {
         this.damageAccuracy = MAX_ACCURACY;
      }
   }
   
   /**
   * upgradeDamage
   * Upgrades the damage for the item up to a maximum.
   */
   public void upgradeDamage() {
      this.damage += 5;
   }
   
   /**
   * toString
   * Returns a string with the attributes of the item.
   * @return returnString: 
   */
   public String toString() {
      String returnString = "\nDamage: " + this.damage + "\nDamage Accuracy: " + this.damageAccuracy;
      
      return returnString;
   }
}