/**
Name:
Date:
Description: Human class for Self-Referencing Classes
*/

public class Human {

   /** name of the person */
   private String name;
   /** spouse of person */
   private Human spouse;
   
   /** person can have children. Simplistic implementation,
       so it will have a maximum of 1 child */
   private Human child;
   
   /**
   builds a human with only the name
   @param name the name of the person
   */
   public Human(String name) {
      this.name = name;
      this.spouse = null;
      this.child = null;
   }
   
   /**
   Simplistic adding child method
   Does not prevent adding more than 1 child, or 
   how to handle it
   @param child the child of the person
   */
   public void setChild(Human child) {
      this.child = child;
   }
   
   public String getName() {
      return this.name;
   }
   public Human getChild() {
      return this.child;
   }
   public Human getSpouse() {
      return this.spouse;
   }
   
   
   
   /**
   overrides toString method
   returns the name of person, spouse, and child. If
   the person doesn't have a spouse/child, it will say "None"
   @return the name of the person, spouse, and child
   */
   public String toString() {
      String spouseName = "None";
      String childName = "None";
      if (this.child != null) {
         childName = this.child.getName();
      }
      if (this.spouse != null) {
         spouseName = this.spouse.getName();
      }
      return "Name: " + this.name + "; Spouse: " + spouseName + "; Child: " + childName;
   }
   
   /*-----------------------------------------------------------------
    TO DO
    ----------------------------------------------------------------*/
   
   /** 
   Method sets the spouse of both people to each other
   Be careful of infinite loop (recursion)!
   @param spouse the new spouse of the person
   */
   public void setSpouse(Human spouse) { 
      this.spouse = spouse;
      spouse.spouse = this;  
   }
   
   /**
   Method determines whether person has a child or not
   @return whether the person has a child
   */
   public boolean hasChild() {
      if (this.child == null) {
         return false;
      } else {
         return true;
      }
   }
   
   /**
   Part 2
   Method that gets the name of the grandchild
   if there is no grandchild, will say None
   @return String the name of the grandchild
   */
   public String getGrandchildName() {
      if (child.child == null) {
         return "None";
      } else {
         return child.child.name;
      }
   }
   
   
   
   public static void main (String [] args) {
      /*
         Part 1:
         1. create 4 humans 
         2. Set person 1 and person 2 as spouses
         3. set person 3 as child of person 1
         4. set person 4 as child of person 3
      */
      
      Human person1 = new Human("Li Chen");
      Human person2 = new Human("Ruoyan Bai");
      Human person3 = new Human("Anthony Chen");
      Human person4 = new Human("ඞyee21chienthonyඞmogusfrogbRUHh");
      
      person1.setSpouse(person2);
      person1.setChild(person3);
      person3.setChild(person4);
      
      System.out.println(person1.toString());
      System.out.println(person2.toString());
      System.out.println(person3.toString());
      System.out.println(person4.toString());
      System.out.println(person1.getGrandchildName());
      
      /*
         Part 2:
          1. Create a method that gets the grandchild of a person
      
      
      public void getGrandchild(Human person) {
         
      }
      */
   }
}