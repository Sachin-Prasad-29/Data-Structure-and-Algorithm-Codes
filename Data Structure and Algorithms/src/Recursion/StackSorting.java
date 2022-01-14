package Recursion;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
//import java.util.List;

public class StackSorting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the size of array ");
		int size=sc.nextInt();
		Stack<Integer> n=new Stack<>();
		for(int i=0;i<size;i++) {
			int val =sc.nextInt();
			n.push(val);
		}
		
		System.out.println("Before Sorting"+n);
		System.out.println("After sorting"+sort(n));

	}
	public static  Stack sort(Stack<Integer> n) { 
		if(n.size()==1) {
			
			return n ;
		}
		int temp= n.get(n.size()-1);
		n.pop();
		sort(n);
		insert(n,temp);
		
		return n;
	}
	
	public static Stack insert(Stack<Integer> n,int temp) {
		if(n.size()==0 || n.get(n.size()-1)<=temp) {
			n.push(temp);
			return n;
		}
		int val = n.get(n.size()-1);
		n.pop();
		insert(n,temp);
		n.push(val);
		//System.out.println(n);
		return n;
	}

}
