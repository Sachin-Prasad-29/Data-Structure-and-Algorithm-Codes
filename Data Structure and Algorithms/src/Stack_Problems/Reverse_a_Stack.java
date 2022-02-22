package Stack_Problems;

import java.util.Scanner;
import java.util.Stack;

public class Reverse_a_Stack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		PrintStack(s);
		System.out.println();
		reverseStack(s);
		PrintStack(s);

	}

	private static void reverseStack(Stack<Integer> s) {
		
		if(s.isEmpty()) return ;
		
		int top = s.pop();
		reverseStack(s);
		pushAtButtom(s,top);
		
		
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
