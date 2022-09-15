package DataStructure_Implementation;
//Important methods
/*
 1.addfirst
 2.addlast
 3.deletefirst
 4.deleteLast
 5.print
 6.size
 
 */
public class LinkedL {
	Node head;
	Node tail;
	int size;
	
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
		Node(int value,Node next){
			this.data=value;
			this.next=next;
		}
	}
	
	public void addFirst(int data) {
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
		if(tail == null) {
			tail = head;
		}
		size+=1;
	}
	
	public void addLast(int data) {
		if(tail == null) addFirst(data);
		else {
		Node newNode=new Node(data);
		
	    tail.next=newNode;
	    tail=newNode;
	    size+=1;
		}
	}
	
	public void printList() {
		if(head == null) {
			System.out.println("NULL");
			return;
		}
		Node currentNode = head;
		while(currentNode != null) {
			System.out.print(currentNode.data+"->");
			currentNode=currentNode.next;
		}
		System.out.println("null");
	}
	
	public void deleteFirst() {
		if(head == null) {
			System.out.println("this is empty");
			return;
		}
		head=head.next;
	}
	
	public void deleteLast() {
		if(head == null) {
			System.out.println("This is empty");
			return;
		}
		if(head.next==null) {
			head=null;
			return;
		}
		Node secondLast=head;
		Node lastNode=head.next;
		
		while(lastNode.next != null) {
			lastNode=lastNode.next;
			secondLast=secondLast.next;
		}
		secondLast.next=null;
	}
	public void addRec(int data,int index) {
		head=addRec(data, index, head);
	}
	 public Node addRec(int data, int index,Node node) {
		 if(index==0) {
		 }
		 node.next=addRec(data, index--,node.next);
		 return node;
	 }
	
	
//    Node head ;
//	class Node{
//		String data;
//		Node next; // next points to a another node having same data and next inside it 
//		
//		Node(String data){
//			this.data = data;  // data part of that node
//			this.next = null; // because when a node first time forms its always points to null 
//		}
//	}
//	//add - first -last
//	//adding element at first position
//	public void addFirst(String data) {
//		Node newNode = new Node(data); // every time we add element in linkedlist we have to create its node first
//		if(head == null) {  // checking wheather any linked list present or not if not then 
//			head = newNode;    // create this newnode our head node 
//			return;
//		}
//		newNode.next = head;   // here if already a linked is preset then newnode will point the already existing head node
//		head =  newNode;  // and that new node make himself the head node 
//	}
//	
//	//adding element at last position
//	public void addLast(String data) {
//		Node newNode = new Node(data); // same here first create node wheather u want to add it into the first or last
//	    if(head == null) {
//	    	head = newNode;
//	    	return;
//	    }
//	    Node currentNode =head; // because we cant change the actual value of our head thaty copy its node value to current node and ilterate for last  node
//	    // before while loop head and currentNOde pointing to same first node 
//	    while(currentNode.next != null) {
//	    	currentNode = currentNode.next; // increamenting the currentnode to next node here 
//	    }
//		currentNode.next = newNode;  // after while loop our current node carries the last node so now 
//		                             // we change the next pointer of our current node to new node form null to newnode and our new node already point to null so it become last node i.e. tail
//	}
//	// print the linked list
//	public void printList() {
//		if(head == null) {
//			System.out.println("list is empty");
//		}
//		Node currentNode = head;
//		while(currentNode != null) {
//			System.out.print(currentNode.data +" --> ");
//			currentNode=currentNode.next;
//		}
//		System.out.println("Null");  // for last tail node which point to null
//	}
	
	public static void main(String[] args) {
		LinkedL list = new LinkedL();
		list.addFirst(1);
		list.printList();
		list.addFirst(2);
		list.printList();
		list.addFirst(2);
		list.printList();
		list.addLast(3);
		list.printList();
		list.addLast(4);
		list.printList();
		list.addFirst(5);
		list.printList();
		list.deleteFirst();
		list.printList();
		list.deleteFirst();
		list.printList();
		list.deleteLast();
		list.printList();
		
	}

}
