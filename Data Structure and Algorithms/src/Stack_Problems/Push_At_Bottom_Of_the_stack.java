package Stack_Problems;

import java.util.*;

public class Push_At_Bottom_Of_the_stack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
	    System.out.println(" enter the val to push");
	    int a = sc.nextInt();
	    System.out.println(" Before push");
	    PrintStack(s);
	    pushAtButtom(s,a);
	    System.out.println();
	    System.out.println("After push");
	    PrintStack(s);

	}

	

	public static void pushAtButtom(Stack<Integer> s, int a) {
		if(s.isEmpty()) {
			s.push(a);
			return;
		}
		int val = s.pop();
		pushAtButtom(s,a);
		s.push(val);
		
	}
	
	public static void PrintStack(Stack<Integer> s)
	{
	    
	    if (s.isEmpty())
	        return;
	    int x = s.peek();
	    s.pop();
	    PrintStack(s);
	    System.out.print(x + "<-");
	    s.push(x);
	}

}
