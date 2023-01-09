/**
Name: Mr. Lee
Date: Mar 7
Description: A plane class
*/

public class Plane extends Vehicle {
//    private String colour; // no longer in Plane class
//    private int numPassengers; //
//    private double speed;//
//    private double direction;//

   private double altitude;
   
   /*
   Constructor
   */
   public Plane(String colour) {
      super(colour); //calls the constructor of my superclass
      // this.colour = colour;
//       this.numPassengers = 0;  
//       this.speed = 0;
//       this.direction = 0;
      this.altitude = 0;
   }
   
   public Plane(String colour, int numPassengers) {
      super(colour, numPassengers);
      this.altitude = 0;
   }
   
   /*Accessors and Mutators*/
   // public String getColour() { return this.colour;}
//    public int getNumPassengers() { return this.numPassengers;}
//    public double getSpeed() { return this.speed;}
//    public String getDirection() {return "" + this.direction;}
   public double getAltitude() { return this.altitude;}
   
//    public void setSpeed(double newSpeed) {
//       this.speed = newSpeed;
//    }
//    public void setDirection(double newDirection) {
//       this.direction = newDirection;
//    }
   
   public void setAltitude(double newAltitude) {
      this.altitude = newAltitude;
   }
    
   
   /* Other methods */ 
   // 
//    public void accelerate(double accel, double time) {
//       this.speed += accel * time;
//    }
//    public void stop() {
//       this.speed = 0;
//    }
   
   /**
   adds a passenger to the plane if it is not moving
   @return whether it is successful in adding a passenger
   */
   public boolean addPassenger() {
      if (getSpeed() == 0 && altitude == 0) {
         setNumPassengers(getNumPassengers() + 1); // needed to create a method to mutate numPass
         return true;
      } else {
         System.out.println("Cannot add passenger");
         return false;
      }
   }
   
   public void roar() {
      System.out.println("The plane engine roars!");
   }
   
   
   public String toString() {
      return super.toString() + "; Altitude: " + this.altitude;
   }
}