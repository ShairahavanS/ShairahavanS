/**
Name:
Date:
Description: A basic linked list 
*/
public class IntLinkedList {
   IntNode head; // head of list
    
   public IntLinkedList() {
      this.head = null;
   }
    
     /* This function prints contents of linked list starting from head */
   public void printList()
   {
      IntNode n = head;
      while (n != null) {
         System.out.print(n.getData() + " ");
         n = n.getNext();
      }
      System.out.println();
   }
    
    /*
    To Do
    */
    
    /**
    add(int value)
    adds an element to the end of the list
    @param value the value to be put into the list
    */
   public void add(int value) {
      IntNode newNode = new IntNode(value);
      IntNode n = head;
      if (n == null) {
         n = newNode;
      } 
      else {
         while (n.getNext() != null) {
            n = n.getNext();
         }
         n.setNext(newNode);
      }
   }

    /**
    get(int index)
    gets an element in the list. If the index does not exist, 
    then return -1
    @param index the position it should get
    */
   public int get(int index) {
      int returnValue;
      
      
      
      return returnValue;
   }
    
   public static void main (String [] args) {
      IntLinkedList myList = new IntLinkedList();
      myList.add(10);
      myList.add(20);
      myList.add(30);
      
      myList.printList();
      
      myList.get(1);
   }
}

/* Linked list Node*/
class IntNode {
   private int data;
   private IntNode next;
   
   // Constructor to create a new node
   // Next is by default initialized
   // as null
   public IntNode(int data) { 
      this.data = data;
      this.next = null; 
   }
   
   public IntNode getNext() {
      return this.next;
   }
   public void setNext(IntNode next) {
      this.next = next;
   }
   public int getData() {
      return this.data;
   }
   public void setData(int data) {
      this.data = data;
   }
 
}