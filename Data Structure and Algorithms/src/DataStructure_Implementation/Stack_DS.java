package DataStructure_Implementation;

import java.util.ArrayList;

// Stack implementation using LinkedList
public class Stack_DS {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
		
	}
    static class Stack {
    	public static Node head;
    	
    	public static boolean isEmpty() {
    		return head == null;
    	}
    	
    	public static void push(int data) {
    		Node newNode = new Node(data);
    		if(isEmpty()) {
    			head = newNode;
    			return;
    		}
    		newNode.next = head;
    		head = newNode;
    	}
    	public static int pop() {
    	  if(isEmpty()) return -1;
    	  int val=head.data;
    	  head = head.next;
    	  return val;
    	}
    	
    	public static int peek() {
    		if(isEmpty()) return -1;
    		return head.data;
    	}
    }
	 
	public static class Stack1{
		static ArrayList<Integer> list = new ArrayList<>();
		public static void push(int data) {
			list.add(data);
		}
		
		public static int pop() {
			if(isEmpty()) return -1;
			 int val = list.get(list.size()-1);
			 list.remove(list.size()-1);
			 return val;
			
		}
		
		public static boolean isEmpty(){
			 return list.size()==0;
		}
		
		 
		
	    public static int peek() {
	    	if(isEmpty()) return -1;
			 int val = list.get(list.size()-1);
			 return val;
	    }
		
	}
	public static void main(String[] args) {
			Stack1 s = new Stack1();
			s.push(1);
			s.push(2);
			s.push(4);
			s.pop();
			s.push(5);
			s.push(6);
			
			while(!s.isEmpty()) {
				System.out.print(s.pop()+" ");
			}
			System.out.println();
			System.out.println("-----------------------------");
			Stack s1 = new Stack();
			s1.push(1);
			s1.push(2);
			s1.push(4);
			s1.pop();
			s1.push(5);
			s1.push(6);
			
			while(!s1.isEmpty()) {
				System.out.print(s1.pop()+" ");
			}
	}

}
