package DataStructure_Implementation;

public class Queue_Using_array {
	
    static class Queue_ {
    	static int[] arr ;
    	static int size;
    	static int rear= -1;
    	static int front = -1;
    	Queue_(int n){
    		arr = new int[n];
    		this.size = n;
    			
    	}
    	
    	public boolean isEmpty() {
    		return rear == -1 && front == -1;
    	}
    	public boolean isFull() {
    		return (rear+1)%size ==front;
    	}
    	public void add(int data) {
    		if(isFull()) {
    			System.out.println("Queue is full");
    			return;
    		}
    		if(front == -1 )
    			front = 0;
    		
    		    rear=(rear+1)%size;
    		 arr[rear]=data;
    	}
    	
    	public int remove() {
    		if(isEmpty()) {
    			System.out.println("Queue is Empty");
    			return -1;
    		}
    		int val = arr[front];
    		if(front == rear)
    			front = rear = -1;
    		else
    		   front=(front+1)%size;
    		return val;
    	}
    	
    	public int peek() {
    		if(isEmpty()) {
    			System.out.println("Queue is Empty");
    			return -1;
    		}
    		int val = arr[front];
    		return val;
    	}
    	
    	
    }
	public static void main(String[] args) {
		Queue_ q=new Queue_(5);
		q.add(10);
		q.add(20);
		q.add(30);
		//q.printQ();
		q.add(40);
		q.add(50);
		q.add(60);
		//q.printQ();
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		//q.printQ();
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		//q.printQ();

	}

}
