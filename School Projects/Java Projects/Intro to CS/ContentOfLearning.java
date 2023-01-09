import java.math.*;

public class ContentOfLearning
{
   public static void main (String[] args) 
   {
      double perimeter = 18;  // perimeter of equilateral triangle
      double angle = 60;      // angle of equilateral triangle in degrees
      double radius, area, bisectedAngle;      
      double sideTriangle = perimeter/3;  // calculate side length
      
      bisectedAngle = Math.toRadians(angle/2);   // convert the angle bisected to radians
      radius = 0.5*sideTriangle / Math.cos(bisectedAngle);   // calculate the radius using trig
      area = Math.PI * Math.pow(radius, 2); // calculate the area of the circle
      
      System.out.println(area); // print the area of the circle
   }
}