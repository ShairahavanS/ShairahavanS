/**
Name: Mr. Lee
Date: Mar 7
Description: A car class
*/

public class Car extends Vehicle {
   private String brand;
   private String colour;
   private int numPassengers;
   private double speed;
   private double direction;
   
   /*
   Constructor
   */
   public Car(String brand, String colour) {
      this.brand = brand;
      this.colour = colour;
      this.numPassengers = 0;  
      this.speed = 0;
      this.direction = 0;
   }
   
   public Car(String brand, String colour, int numPassengers) {
      this.brand = brand;
      this.colour = colour;
      this.numPassengers = numPassengers;  
      this.speed = 0;
      this.direction = 0;
   }
   
   /*Accessors and Mutators*/
   public String getBrand() { return this.brand;}
   public String getColour() { return this.colour;}
   public int getNumPassengers() { return this.numPassengers;}
   public double getSpeed() { return this.speed;}
   public String getDirection() {return "" + this.direction;}
   
   public void setSpeed(double newSpeed) {
      this.speed = newSpeed;
   }
   public void setDirection(double newDirection) {
      this.direction = newDirection;
   }
   
   /* Other Methods */
   public void accelerate(double accel, double time) {
      this.speed += accel * time;
   }
   
   public void stop() {
      this.speed = 0;
   }
   
   /**
   adds a passenger to the car if it is not moving
   @return whether it is successful in adding a passenger
   */
   public boolean addPassenger() {
      if (speed == 0) {
         this.numPassengers++;
         return true;
      } else {
         System.out.println("Cannot add passenger");
         return false;
      }
   }
   
   public void honk() {
      System.out.println("The car HONKs!");
   }
   
   public String toString() {
      return "Brand: " + this.brand + "; Colour: " + this.colour + "; Passengers: " + this.numPassengers + 
             "; Speed: " + this.speed + "; Direction: " + this.direction;
   }
}