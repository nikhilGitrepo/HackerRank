package datastructures;

public class ReverseSinglyLinkedList {

	/*
	  Reverse a linked list and return pointer to the head
	  The input list will have at least one element  
	  Node is defined as  
	*/
	  class Node {
	     int data;
	     Node next;
	  }
	
	    // This is a "method-only" submission. 
	    // You only need to complete this method. 
	Node Reverse(Node head) {

	  Node n = new Node();
	  int size = 0;
	  n = head;
	  int count = 0;
	  while(n!=null){
	    count++;
	    n = n.next;
	  }
	  //System.out.println(count);
	  n=head;
	  Node tail = new Node();
	  Node tailPtr = new Node();
	  boolean start = true;
	  while(count!=0){
	    int iC = count-1;
	    n = head;
	    //System.out.println("iC: " + iC);
	    while(n != null){
	      if(iC == 0){
	        break;
	      }
	      n = n.next;
	      iC--;
	    }
	    
	    if(start){
	      tailPtr = tail;
	      start = false;
	    }
	    
	    //System.out.println("n.data: " + n.data);
	    
	    count--;
	    
	    if(count!=0){
	      tail.data = n.data;
	      tail.next = new Node();
	      tail = tail.next;
	    }
	  }
	/*  
	  Node x = new Node();
	  x = tailPtr;
	  while(x!=null){
	    System.out.print(x.data);
	    x = x.next;
	  }
	  System.out.println();
	  */
	  
	  head = tailPtr;
	  return head;
	  
	}

	
}
