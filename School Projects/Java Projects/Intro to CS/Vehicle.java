/**
Name: Mr. Lee
Date: Mar 7
Description: the vehicle class (abstract)
*/
public class Vehicle {

   /*
   Attributes
   */
   private String colour; //
   private int numPassengers; //
   private double speed;//
   private double direction;//
   
   /*
   Constructors
   */
   public Vehicle(String colour) {
      this.colour = colour;
      this.numPassengers = 0;  
      this.speed = 0;
      this.direction = 0;
      //no altitude nor brand
   }
   
   public Vehicle(String colour, int numPassengers) {
      this.colour = colour;
      this.numPassengers = numPassengers;  
      this.speed = 0;
      this.direction = 0;
      //no altitude nor brand
   }

   /* Accessors and Mutators */
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
   /* new method for subclasses
   */
   public void setNumPassengers(int newNum) {
      this.numPassengers = newNum;
   }
   
   /* Other methods */ 
   
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
   
    public String toString() {
      return "Colour: " + this.colour + "; Passengers: " + this.numPassengers + 
             "; Speed: " + this.speed + "; Direction: " + this.direction;
   }

}