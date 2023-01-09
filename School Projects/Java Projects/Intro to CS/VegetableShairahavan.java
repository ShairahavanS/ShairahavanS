/**
* Name: Shairahavan
* Class: ICS4U1-5A
* Date: Feb 25th, 2022
* Description: Creates vegatables with traits such as colour, 
* name, if it's green, weight, and calories.
*/

public class VegetableShairahavan {

   /*
      Attributes
   */
   
   
   /** the name of the vegetable */
   private String name;
   
   /** the colour of the vegetable */
   private String colour;
   
   /** is the vegetable green */
   private boolean isGreen;
   
   /** is the vegetable edible */
   private boolean isEdible;
   
   /** the number of calories from the vegetable */
   private double calories;
   
   /** the weight of the vegetable */
   private double weight;
   
   /*
      Constructors
   */
   
   public Vegetable(String name, String colour,boolean isGreen, boolean isEdible, double calories, double weight){
      this.name = name;
      this.colour = colour;
      this.isGreen = isGreen;
      this.isEdible = isEdible;
      this.calories = calories;
      this.weight = weight;
      
      //Restriction below 0
      if (calories < 0){
         this.calories = 0;
      }
      else if (calories == 0) {  // If it's 0, nothing happens
         this.calories = 0;
      }
      else {   // else, variable is initilized
         this.calories = calories;
      }
      
      //Restriction below 0
      if (weight < 0){
         this.weight = 0;
      }
      else if (weight == 0){  // If it's 0, nothing happens
         this.weight = 0;
      }
      else {   // else, variable is initilized
         this.weight = weight;
      }
   }
   
   /*
      Accessors
   */
   
   /**
   * Gets colour of veggie
   * @return colour of veggie
   */
   public String getColour(){
      return this.colour;
   }
   
   /**
   * Gets boolean on whether the veggie is green or not
   * @return is the veggie green
   */
   public Boolean getIsGreen(){
      return this.isGreen;
   }
   
   /**
   * Gets name of veggie
   * @return name of the veggie
   */
   public String getName(){
      return this.name;
   }
   
   /**
   * Gets number of calories in veggie
   * @return number of calories in veggie
   */
   public double getCalories(){
      return this.calories;
   }
   
   /**
   * Gets whether the veggie is edible
   * @return is the veggie edible
   */
   public boolean getIsEdible(){
      return this.isEdible;
   }
   
   /**
   * Gets the weight of the veggie
   * @return the weight of the veggie
   */
   public double getWeight(){
      return this.weight;
   }
   
   /*
   Mutators
   */
   
   /**
   * Changes colour for the veggie
   * @param newColour the new colour of the veggie
   */
   public void colourChange(String newColour){
      this.colour = newColour;
   }
   
   /**
   * Changes if the veggie is green/not green
   * @param newIsGreen whether the veggie is currently green
   */
   public void isGreenChange(boolean newIsGreen){
      this.isGreen = newIsGreen;
   }
   
   /**
   * Changes name for the veggie
   * @param newName the new name of the veggie
   */
   public void nameChangeVeg(String newName){
      this.name = newName;
   }
   
   /**
   * Changes calorie count for veggie
   * @param newCalories the new caloric countt of veggie
   */
   public void calorieChange(double newCalories){
      this.calories = newCalories;
   }
   
   /**
   * Changes if veggie is edible/not edible
   * @param newIsEdible new answer for if the veggies is edible or not
   */
   public void isEdibleChange(boolean newIsEdible){
      this.isEdible = newIsEdible;
   }
}