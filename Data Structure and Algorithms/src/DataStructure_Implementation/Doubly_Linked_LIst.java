 package DataStructure_Implementation;

public class Doubly_Linked_LIst {
	Node head;
    class Node{
    	int data;
    	Node next;
    	Node previous; 
    	
    	Node(int data){
    		this.data = data;
    		this.next = null;
    		this.previous = null;
    	}
    }
    	public void addFirst(int data) {
    		Node newNode = new Node(data);
    		if(head == null) {
    			head = newNode;
    			return;
    		}
    		newNode.next=head;
    		head.previous=newNode;
    		head=newNode;
    	}
    	
    	public void addLast(int data) {
    		Node newNode = new Node(data);
    		if(head == null) {
    			head = newNode;
    			return;
    		}
    		Node currentNode=head;
    		while(currentNode.next != null) {
    			currentNode=currentNode.next;
    		}
    		newNode.previous=currentNode;
    		currentNode.next=newNode;
    	}
    	
    	public void printList() {
    		if(head == null) {
    			System.out.println(" no element in the linked list");
    		}
    		Node currentNode= head;
    		while(currentNode != null) {
    			System.out.print(currentNode.data+"->");
    			currentNode=currentNode.next;
    		}
    		System.out.println("null");
    	}
    	
    	public void deleteFirst() {
    		if(head == null) {
    			System.out.println(" linked list is empty");
    			return;
    		}
    		head=head.next;
    		head.previous=null;
    	}
    	
    	public void deleteLast() {
    		if(head == null) {
    			System.out.println(" linked list is empty");
    			return;
    		}
    		if(head.next == null) {
    			head=null;
    			System.out.println("Deleted the only single present node");
    			return;
    		}
    		Node secondLast=head;
    		Node lastNode=head.next;
    		 while(lastNode.next != null ) {
    			 secondLast=secondLast.next;
    			 lastNode=lastNode.next; 
    		 }
    		 secondLast.next=null;
    	}
    
	public static void main(String[] args) {
		Doubly_Linked_LIst list=new Doubly_Linked_LIst();
		list.addFirst(10);
		list.addFirst(20);
		list.addLast(60);
		list.printList();
		list.addLast(70);
		list.printList();
		list.deleteLast();
		list.printList();
		list.deleteFirst();
		list.printList();
		list.deleteFirst();
		list.printList();
		list.deleteLast();
		
		
      
	}

}
