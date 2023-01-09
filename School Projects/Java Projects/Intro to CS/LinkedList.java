/**
Name:
Date:
Description: A basic linked list 
*/
public class LinkedList<T>{
   Node<T> head; // head of list
    
   public LinkedList() {
      this.head = null;
   }
    
   /* This function prints contents of linked list starting from head */
   public void printList()
   {
      Node<T> n = head;
      while (n != null) {
         System.out.print(n.getData() + " ");
         n = n.getNext();
      }
      System.out.println();
   }
    
   /**
   add(T value)
   adds an element to the end of the list
   @param value the value to be put into the list
   */
   public void add(T value) {
     
      if (this.head == null) {
         this.head = new Node<T>(value);
      } else {
         Node n = head;
         while (n.getNext() != null) {
            n = n.getNext();
         }
         n.setNext( new Node(value));
      }
   }
   
   /**
   add(T value, int index)
   adds an element to the the list
   @param value the value to be put into the list
   @param index the position it should be put in
   */
   public void add(T value, int index) {
      int count = 1;
      if (this.head == null) {
         this.head = new Node(value);
      } else {
         Node n = head;
         while (n.getNext() != null  && count < index) {
            n = n.getNext();
            count++;
         }
         Node temp = new Node(value);
         temp.setNext(n.getNext());
         n.setNext(temp);
      }
   }
   
   /**
   get(int index)
   gets an element in the list. If the index does not exist, 
   then return -1
   @param index the position it should get
   */
   public T get(int index) {
      int count = 0;
      Node<T> n = head;
      while (n != null && count < index) {
         n = n.getNext();
         count++;
      }
      if (n == null) {
         return null;
      } else {
         return n.getData();
      }
   }
    
   public static void main (String [] args) {
      LinkedList myList = new LinkedList<String>();
      myList.add("One");
      myList.add("Two");
      myList.add("Three");
      myList.add("Two-point-five",2);
      
      myList.printList();
      
      System.out.println(myList.get(1));
      
      //TO-DO
      //Create a LinkedList of int values
   }
}

/* Linked list Node*/
class Node <T> {
   private T data;
   private Node next;
   
   // Constructor to create a new node
   // Next is by default initialized
   // as null
   public Node(T data) { 
      this.data = data;
      this.next = null; 
   }
   
   public Node getNext() {
      return this.next;
   }
   public void setNext(Node next) {
      this.next = next;
   }
   public T getData() {
      return this.data;
   }
   public void setData(T data) {
      this.data = data;
   }
 
}