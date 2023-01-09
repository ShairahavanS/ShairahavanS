/**
Name: Mr. Lee
Date: Mar 8
Description: Demonstrating Polymorphism Ideas
*/
public class TestVehiclePolymorphism {
   public static void main (String [] args) {
      Vehicle [] myVehicles = new Vehicle[5];
      myVehicles[0] = new Car("Honda", "Blue", 4);
      myVehicles[1] = new Plane("Grey", 100);
      myVehicles[2] = new Car("Toyota", "Orange", 1);
      myVehicles[3] = new Plane("White", 200);
      myVehicles[4] = new Car("Ford", "Blue", 2);
      
      for (int i = 0; i < myVehicles.length; i++) {
         System.out.println("\n" + i);
         
         myVehicles[i].accelerate(10* i, i * 2);
         System.out.println(myVehicles[i]);
         
         if (myVehicles[i] instanceof Car) {
            ((Car)myVehicles[i]).honk();
         } else if (myVehicles[i] instanceof Plane) {
            ((Plane)myVehicles[i]).roar();
         }
      } 
   }
}