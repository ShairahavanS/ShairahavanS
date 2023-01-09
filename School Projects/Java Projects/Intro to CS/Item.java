/**
* Names:  Larry Li
          Shairahavan Selvachandran
          Kevin Yao
          Cyrus Yang
* Class: ICS4U1-5A
* Date: April 29th, 2022
* Description: Creates an item in Minecraft.
*/

public class Item {
   private static final int MAX_ACCURACY = 100;
   private static final int MIN_DURABILITY = 0;
   private static final int MAX_RANGE = 200;
   
   /*
      Attributes
   */
   
   /** the name of the item */
   private String name;
   
   /** the ID of the item */
   private int itemID;
   
   /** the colour of the item */
   private String colour;
   
   /** the maximum number of items in a stack */
   private int maxStack;
   
   /** the durability of the item */
   private double durability;
   
   // for future reference:
   // weapons will be used as a subclass to item
   // will be altered for future sprints
   
   /** the amount of damage the item does (if it is a weapon) */
   private double damage;
   
   /** the range of the weapon */
   private double damageRadius;
   
   /** the accuracy of the weapon */
   private double damageAccuracy;
   
   /** is the item edible */
   private boolean edible;
   
   /** if edible, how much does it affect the hunger bar */
   private double hungerBoost;
   
   
   /*
      Constructor
   */
   
   /**
   * Item
   * Creates an item in minecraft.
   * @param name: the name of the item
   * @param itemID: the ID of the item
   * @param colour: the colour of the item
   * @param maxStack: the maximum number in a stack for the item 
   * @param durability: the durability of the item
   * @param damage: the amount of damage the item does
   * @param damageRadius: the range of damage of the item
   * @param damageAccuracy: the accuracy of damage of the item
   * @param edible: whether or not the item is edible
   * @param hungerBoost: the amount of energy the item gives when consumed
   */
   public Item (String name, int itemID, String colour, int maxStack, double durability, double damage, double damageRadius, double damageAccuracy, boolean edible, double hungerBoost) {
      this.name = name;
      this.itemID = itemID;
      this.colour = colour;
      this.maxStack = maxStack;
      this.durability = durability;
      this.damage = damage;
      this.damageRadius = damageRadius;
      this.damageAccuracy = damageAccuracy;
      this.edible = edible;
      this.hungerBoost = hungerBoost;
   }
   
   /*
   Methods
   */
   
   //Accessors
   
   /**
   * Gets the name of item
   * @return the item's name
   */ 
   public String getName() {
      return this.name;
   } 
       
   /**
   * Gets the ID of item
   * @return the item's ID
   */
   public int getItemID() {
      return this.itemID;
   }
   
   /**
   * Gets the colour of item
   * @return the item's colour
   */
   public String getColour() {
      return this.colour;
   }
   
   /**
   * Gets the maximum stack allowable for the item
   * @return the item's mazimum stack
   */
   public int getMaxStack() {
      return this.maxStack;
   }
   
   /**
   * Gets the durability of the item
   * @return the item's durability
   */
   public double getDurability() {
      return this.durability;
   }
   
   /**
   * Gets the damage of the item
   * @return the item's damage
   */
   public double getDamage() {
      return this.damage;
   }
   
   /**
   * Gets the range of damage for the item
   * @return the item's range
   */
   public double getDamageRadius() {
      return this.damageRadius;
   }
   
   /**
   * Gets the accuracy of damage of the item
   * @return the item's accuracy
   */
   public double getDamageAccuracy() {
      return this.damageAccuracy;
   }
   
   /**
   * Gets whether the item is edible or not
   * @return the item's edibility
   */
   public boolean getEdible() {
      return this.edible;
   }
   
   /**
   * Gets the the amount of boost on the hunger bar that consuming the item gives
   * @return the item's hunger bar boost
   */
   public double getHungerBoost() {
      return this.hungerBoost;
   }

   // Mutators
   
   /**
   * changes name of iitem
   * @param newName - new name of the item
   */
   public void setName(String newName) {
      this.name = newName;
   }
   
   /**
   * changes ID of the item
   * @param newID - new ID of item
   */
   public void setItemID(int newItemID) {
      this.itemID = newItemID;
   }
   
   /**
   * changes the colour of the item
   * @param newColour- new colour of item
   */
   public void setColour(String newColour) {
      this.colour = newColour;
   }
   
   /**
   * changes the maximum amount allowable for a stack of the item
   * @param newMaxStack - new max stack of item
   */
   public void setMaxStack(int newMaxStack) {
      this.maxStack = newMaxStack;
   }
   
   /**
   * changes the durability of the item
   * @param newDurability - the new durability of the item
   */
   public void setDurability(double newDurability){
      this.durability = newDurability;
   }
   
   /**
   * changes the amount of damage the item does
   * @param newDamage - new amount of damage for the item
   */
   public void setDamage(double newDamage) {
      this.damage = newDamage;
   }
   
   /**
   * changes the range of damage for the item
   * @param newDamageRadius - new range of damage
   */
   public void setDamageRadius(double newDamageRadius) {
      this.damageRadius = newDamageRadius;
   }
   
   /**
   * changes the accuracy of damage for the item
   * @param newDamageAccuracy - new damage accuracy of item
   */
   public void setDamageAccuracy(double newDamageAccuracy) {
      this.damageAccuracy = newDamageAccuracy;
   }
   
   /**
   * changes whether the item is edible or notl
   * @param newEdible - new edibility of item
   */
   public void setEdible(boolean newEdible) {
      this.edible = newEdible;
   }  
   
   /**
   * changes the amount that consuming the item contributes to the player
   * @param newHungerBoost - new hunger bar boost possible for item
   */
   public void setHungerBoost(double newHungerBoost) {
      this.hungerBoost = newHungerBoost;
   }

   // Methods
      
   /**
   * upgradeRange
   * Upgrades the range of damage for the item up to a maximum.
   */
   public void upgradeRange() {
      this.damageRadius += 10;
      
      if (this.damageRadius >= MAX_RANGE) {
         this.damageRadius = MAX_RANGE;
      }
   }
   
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
      String returnString = "Name: " + this.name + "\nItem number: #" + this.itemID + "\nColour: " + this.colour + "\nMax Stack: " + this.maxStack + "\nDurability: " + this.durability + "\nDamage: " + this.damage + "\nDamage Radius: " + this.damageRadius + "\nDamage Accuracy: " + this.damageAccuracy + "\nEdible: " + this.edible + "\nHunger Boost: " + this.hungerBoost;
      
      return returnString;
   }
}