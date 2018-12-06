/*
James Hayes
CIT_130 FA18
Assignment 10
*/
//package doubleLink;

public class DriverClass {

    public static void main(String[] args) {
 
    DoublyLinkedList list = new DoublyLinkedList();
    DoublyLinkedList copyList = new DoublyLinkedList();
    DoublyLinkedList.DoublyLinkedListIterator i = list.iterator();
 
    list.addToStart("Dr. Pepper");
    list.addToStart("Pepsi");
    list.addToStart("Coke");
    
    System.out.println("List contains: ");
    i.restart();
    while (i.hasNext())
        System.out.println(i.next());
    System.out.println();
 
    i.restart();
    i.next();
    i.next();
    System.out.println("Deleting " + i.peek());
    i.delete();
 
    System.out.println("List now contains: ");
    i.restart();
    while(i.hasNext())
        System.out.println(i.next());
    System.out.println();
 
    i.restart();
    i.next();
    System.out.println("Inserting Sprite before " + i.peek());
    i.insertBefore("Sprite");
 
    i.restart();
    System.out.println("List now contains: ");
    while (i.hasNext())
          System.out.println(i.next());
    System.out.println();
 
    i.restart();
 
    System.out.println("Reversing the list...");
    list.outputBackwards();
    System.out.println();
 
    i.restart();
    System.out.println("Printing clone of DoublyLinkedList ");
    copyList = list.clone();
    System.out.println(copyList);
    System.out.println();
    System.out.println("Are they equal? " + list.equals(copyList));
    System.out.println();
 
    i.restart();
    System.out.println("Size of list is...");
    System.out.println("list has " + list.size() + " nodes");
    System.out.println();
 
    i.restart();
    System.out.println("Searching for " + i.peek());
    System.out.println(list.contains("Coke"));
    System.out.println(i.peek() + " is in the list");
    System.out.println();
 
    i.restart();
    System.out.println("Searching for Dr. Pepper");
    System.out.println(list.contains("Dr. Pepper"));
    System.out.println("Dr. Pepper is not in the list");
    System.out.println();
 
    System.out.println("List contains: ");
    i.restart();
    while (i.hasNext())
        System.out.println(i.next());
    System.out.println();
 
    }
}
