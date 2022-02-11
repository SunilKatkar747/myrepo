package com.cdac;

import java.util.Scanner;

class Node{
	int item;
	Node next;
	
	Node(int item){
		this.item=item;
		this.next=null;		
	}
}


public  class LinkedList {
   static Node head;
 static Node tail;
  
	public LinkedList() {
		head=tail=null;
	}
	
boolean isEmpty() {
	return head==null;	
}

void insertBeginning(int item) {
	Node temp=new Node(item);
	
	if(head==null)//if list is empty
		tail=head=temp;// this indicates there is only one node in the list
	else {
	temp.next=head;
	head=temp;
	}
	
}

void insertEnd(int item) {   //Add node you can say that creation of the nod also
	Node temp=new Node(item);
	if(head==null) { //if list is empty
	head=temp;
	tail=temp;
      }
	else {
		//temp.next=tail.next;
		tail.next=temp;
		tail=temp;
	}
	
	
}

public static Node reverseLinkedlist(Node head) {
	if(head==null) {
		return head;
	}
	Node prev=null;
	Node curr=head;
	Node next=null;
	while(curr!=null) {
		 next=curr.next;
		curr.next=prev;
		prev=curr;
		curr=next;
	}
	
	return prev;	
}

//
//public void printlist(Node nde) {
//	while(nde!=null) {
//		System.out.print(nde.item +" ");
//		nde=nde.next;
//	}
//	
//	
//}
//

void insertAfter( Node p,int item) {
	
	
	Node temp=new Node(item);
	temp.next=p.next;
	p.next=temp;
	if(tail==p) tail=temp;
	
}



public void reverse(Node current) {  
    //Checks if list is empty  
    if(head == null) {  
        System.out.println("List is empty");  
        return;  
    }  
    else {  
        //Checks if the next node is null, if yes then prints it.  
        if(current.next == null) {  
            System.out.print(current.item + " ");  
            return;  
        }  
        //Recursively calls the reverse function  
        reverse(current.next);  
        System.out.print(current.item+ " ");  
    }  
}  

public void deleteFromStart() {  
	  
    //Checks if the list is empty  
    if(head == null) {  
        System.out.println("List is empty");  
        return;  
    }  
    else {  
        //Checks whether the list contains only one node  
        //If not, the head will point to next node in the list and tail will point to the new head.  
        if(head != tail) {  
            head = head.next;  
        }  
        //If the list contains only one node  
        //then, it will remove it and both head and tail will point to null  
        else {  
            head = tail = null;  
        }  
    }  
}  


public void deleteFromEnd() {  
	  
    //Checks if the list is empty  
    if(head == null) {  
        System.out.println("List is empty");  
        return;  
    }  
    else {  
        //Checks whether the list contains only one element  
        if(head != tail ) {  
            Node temp = head;  
            //Loop through the list till the second last element such that current.next is pointing to tail  
            while(temp.next != tail) {  
                temp = temp.next;  
            }  
            //Second last element will become new tail of the list  
            tail = temp;  
            tail.next = null;  
        }  
        //If the list contains only one element  
        //Then it will remove it and both head and tail will point to null  
        else {  
            head = tail = null;  
        }  
    }  
} 




public void traverse() {
	if(!isEmpty()) {
		Node temp= head;
		do {
			System.out.print( " "+temp.item);
			temp=temp.next;
		}while(temp!=null);
		
	}
	else
		System.out.println("list is empty");
	
}


public void minNode() {
	
Node temp=head;
int min;

if(head==null) {
	
	System.out.println("List is Empty");	
	
}
else {
	min=head.item;
	while(temp!=null) {
		if(min>temp.item) {
			min=temp.item;
		}
		temp=temp.next;
	}
	
	System.out.println("Minimum Node of the linked list " +min);
}	
	
	
}

public void maxNode(){
	
	Node temp=head;
	int max;
	
	
	if(head==null) {
		
		System.out.println("List is Empty ");	
		
	}
	else {
		
		max=head.item;
		while(temp!=null) {
			if(max<temp.item) {
				max=temp.item;
			}
			temp=temp.next;
		}
			
		System.out.println(" Maximum element from LinkedList "+max);
		
	}	
	
}

void CountNodes() {
	int count=0;
   Node temp=head;
   
   while(temp!=null) {
	   
	   count++;
	   temp=temp.next;
   }
	
	System.out.println("Total number of nodes int the linked list = "+count);
}

public void findNode(int x) {
	Node temp=head;
	if(head==null) {
		System.out.println("List is Empty ");
	}
	else {
		   
		   if(temp.item==x) {
			System.out.println("Node is present ");
			temp=temp.next;
		}  
		   else System.out.println("Not Found"); 
		   }
	
}

public void  middleElement() {
	Node slow=head;
	Node fast=head;
	
	
	while(fast!=null &&fast.next!=null) {
		slow=slow.next;
		fast=fast.next.next;
	}

	System.out.println(" Middle Element of the Linke list is "+slow.item);
	
	
}





	public static void main(String[] args) {
	
		LinkedList ll = new LinkedList();
		ll.insertBeginning(11);
		ll.insertBeginning(7);
		ll.insertEnd(17);
	//	ll.insertBeginning(9);
		ll.insertEnd(25);
		//ll.insertEnd(14);
		System.out.println("Traversal: ");
		
	//ll.deleteFromEnd();
	
       // ll.reverse(head);	
	//	ll.deleteFromStart();
    	System.out.println("");
        ll.traverse();
        System.out.println();
        ll.minNode();
        System.out.println("");
        ll.maxNode();
        ll.CountNodes();
        ll.findNode(53);
      
         ll.middleElement();
         ll.reverse(head);
         System.out.println();
         ll.traverse();
        
		//ll.printlist(head);
		//head=ll.reverseLinkedlist(head);
		//ll.printlist(head);
	
//		Node found = ll.findNode(5);
//		ll.insertAfter(found,7);
//		System.out.println("Traversal: ");
//		ll.traverse();
//		
//		found = ll.findNode(7);
//		ll.insertBefore(found, 6);
//		System.out.println("Traversal: ");
//		ll.traverse();
			
	}

	
}
