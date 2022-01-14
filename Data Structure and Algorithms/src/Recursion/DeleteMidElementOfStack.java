package Recursion;

import java.util.Scanner;
import java.util.Stack;

public class DeleteMidElementOfStack {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		Stack<Integer> s1=new Stack<Integer>();
		for(int i=0;i<n;i++){
		int j=sc.nextInt();
		s1.push(j);
		}
		System.out.println(deleteMidElement(s1,(s1.size()/2)+1));

	}
	 public static Stack deleteMidElement(Stack<Integer> s1,int k) {
		 if(k==1) {
			 s1.pop();
			 return s1;
		 }
		 int temp=s1.pop();
		 deleteMidElement(s1,k-1);
		 s1.push(temp);
		 return s1;
	 }
	
}
