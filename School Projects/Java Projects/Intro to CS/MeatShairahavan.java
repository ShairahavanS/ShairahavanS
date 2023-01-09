/**
* Name: Shairahavan (Copy of Mr. Lee's)
* Class: ICS4U1-5A
* Date: Feb 28th, 2022
* Description: Creates humans with traits such as nationality, 
* name, gender, weight, and changing energy levels.
*/

public class MeatShairahavan {
   /*
   Attributes
   */
   
   /** the type of animal it comes from */
   private String animal;
   
   /** the part of the animal */
   private String organ;
   
   /** the weight of the meat */
   private double weight;
   
   /** whether the meat has a bone*/
   private boolean hasBone;
   
   /** how much percentage fat is in the meat */
   private double fatContent;
   
   /*
   Constructor
   */
   /**
   
   */
  //  public Meat(String a, String o, double f, double w, boolean hB){
//       this.animal = a; //we are initializing the attribute with the parameter
//       
//    }
   public Meat(String animal, String organ, double fatContent, double weight, boolean hasBone){
      this.animal = animal; //we are initializing the attribute with the parameter
      this.organ = organ;
      this.hasBone = hasBone;
      
      //setting restrictions for fatContent attribute
      if (fatContent < 0) {
         this.fatContent = 0;
      } else if (fatContent > 100) {
         this.fatContent = 100;
      } else {
         this.fatContent = fatContent;
      }
      
      
      
      //initializing weight depending on bone content
      if (hasBone) {
         if (this.weight < 20) {
            this.weight = 20;
         } else {
            this.weight = weight;
         }
      } else { 
         if (this.weight < 0) {
            this.weight = 0;
         } else {
            this.weight = weight;
         }

      }
      
   }
   
   /*
   Methods
   */
   
   public void setFatContent (double fatContent) {
      
   }
}