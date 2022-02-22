package DataStructure_Implementation;

public class Queue_Implementation_using_LL {
    static class Queue{
    	Node head = null;
    	Node tail = null;
    	public boolean isEmpty() {
    		return head == null;
    	}
    	public void add(int data) {
    		Node node = new Node(data);
    		if(head == null) {
    			head= tail=node;
    		}
    		tail.next=node;
    		tail=node;
    	}
    	
    	public int remove() {
    		if(isEmpty()) {
    			System.out.println("Queue is Empty");
    			return -1;
    		}
    		int val= head.data;
    		head = head.next;
    		return val;
    	}
    	public int peek() {
    		if(isEmpty()) {
    			System.out.println("Queue is Empty");
    			return -1;
    		}
    		int val= head.data;
    		return val;
    	}
    	public void printQ() {
    		if(isEmpty()) {
    			System.out.println("Queue is Empty");
    			return;
    		}
    		Node currNode = head;
    		System.out.print("head -->");
    		while(currNode != null) {
    			System.out.print(currNode.data+" - ");
    			currNode = currNode.next;
    		}
    		System.out.print("<-- tail");
    		System.out.println();
    	}
    	
    	
    	
    	class Node{
    		int data;
    		Node next;
    		Node(int data){
    			this.data = data;
    			this.next = null;
    		}
    		Node(int data, Node next){
    			this.data = data;
    			this.next = next;
    		}
    	}
    }
	public static void main(String[] args) {
		Queue q= new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		q.printQ();	
		q.remove();
		q.printQ();	
		q.remove();
		q.printQ();	
		q.add(89);
		q.add(00);
		q.printQ();	
		
	}

}
