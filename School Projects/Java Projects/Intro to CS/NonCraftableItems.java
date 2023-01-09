/**
* Names:  Larry Li
          Shairahavan Selvachandran
          Kevin Yao
          Cyrus Yang
* Class: ICS4U1-5A
* Date: April 29th, 2022
* Description: All the uncraftable items.
*/

public class NonCraftableItems {
    private String name;
    private String colour;
    private int maxStack;
    private double durability;
    private double damage;
    private double damageRadius;
    private boolean edible;
    private double hungerBoost;
    
    public UncraftableItem (String name, String type, int numItem, double pickPower, double weaponPower, double hungerChange, double durability) {
        this.name = name;
        this.colour = colour;
        this.maxStack = maxStack;
        this.durability = durability;
        this.edible = edible;
        this.hungerBoost = hungerBoost;
    }
    
    // Getters
    public String getType() {
        return this.type;
    }

    public int getNumItem() {
        return this.numItem;
    }
    
    public double getPickPower() {
        return this.pickPower;
    }
    
    public double getWeaponPower() {
        return this.weaponPower;
    }
    
    public double getDurability() {
        return this.durability;
    }

    public double getHungerChange() {
        return this.hungerChange;
    }

    // Setters
    public void setType(String newType) {
        this.type = newType;
    }
    
    public void setNumItem(int newNumItem) {
        this.numItem = newNumItem;
    }
    
    public void setWeaponPower(double newWeaponPower){
        this.weaponPower = newWeaponPower;
    }
    
    public void setPickPower(double newPickPower) {
        this.pickPower = newPickPower;
    }
    
    public void setHungerChange(double newHungerChange) {
        this.hungerChange = newHungerChange;
    }

    public void setDurability(double newDurability) {
        this.durability = newDurability;
    }
    // Methods
    
    //Removing the consumable/decresaing it by one when it breaks
    public void removeConsumable() {
        this.numItem -= 1;
    }
    
    //Reducing durability of the item
    public void lowerDurability() {
      this.durability -= 5;
    }

    //Generating 3 instances of the item classm two of which are tools, the other is food
    public static Item[] generateInventory() {
        Item[] inventory = new Item[3];
        inventory[0] = new Item("Pickaxe", 1, 15, 5, 0, 100);
        inventory[1] = new Item("Sword", 1, 5, 20, 0, 100);
        inventory[2] = new Item("Beef", 64, 1, 1, 10, 50);
        
        return inventory;
    }
    
    //Outputting all of the stats of the item
    public String toString() {
        String ret = "Type: " + this.type + "\nItem number: " + this.numItem + "\nPick Power: " + this.pickPower + "\nSword Power: " + this.weaponPower + "\nHunger Change: " + this.hungerChange + "\nDurability: " + this.durability;
        return ret;
    }}