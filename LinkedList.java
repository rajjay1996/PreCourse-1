import java.util.ArrayList;
import java.util.List;

// Java program to implement
// a Singly Linked List 
public  class LinkedList {
  
    static Node head; // head of list
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            //Write your code here
            this.data = d;
        } 
    } 
  
    // Method to insert a new node
    static int size=0;

    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data


        Node newNode = new Node(data);

        if(size ==0){
            head=newNode;
        }else{
            Node current = head;
            current = current.next;
        }
        size++;
        // If the Linked List is empty, 
        // then make the new node as head 
        
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node
        Node current=head;
        for(int i=0;i<size;i++){
            System.out.println(current.data);

        }
        // Go to next node

    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}