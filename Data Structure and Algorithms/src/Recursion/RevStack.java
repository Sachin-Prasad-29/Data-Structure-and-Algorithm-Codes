package Recursion;

import java.util.Scanner;
import java.util.Stack;

public class RevStack {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		Stack<Integer> s1=new Stack<Integer>();
		for(int i=0;i<n;i++){
		int j=sc.nextInt();
		s1.push(j);
		}
		System.out.println(s1);
		System.out.println(revStack(s1));

	}
	public static Stack revStack(Stack<Integer> s) {
		if(s.isEmpty()) {
			return s;
		}
		int val= s.pop();
	    revStack(s);
	    addBottomStack(s,val);
	   // s.push(val);
		return s;
	}
	
	public static Stack addBottomStack(Stack<Integer> s,int val) {
		if(s.isEmpty()) {
			s.push(val);
			return s;	
		}
		int temp=s.pop();
		addBottomStack(s,val);
		s.push(temp);
		return s;
		
	}

}
