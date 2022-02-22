package Stack_Problems;

import java.util.Arrays;
import java.util.Stack;
// this question is for next largest number to right 
public class Next_Nearest_Largest_number {
  
	public static void main(String[] args) {
		int[] num = {1,2,0,3,4,5,3};
		int n= num.length;
		int[] sol = new int[n];
		Stack<Integer> s = new Stack<>();
		for(int i = 2*n-1 ; i >= 0 ;i--) {
			// pop the stack until it will become empty or the top element
			// become greater than the current element 
			// this is the circular approach when we use % 
			while(!s.isEmpty() && s.peek() <= num[i%n])
				s.pop();
			if(s.isEmpty())
				sol[i%n]=-1;
			else 
				sol[i%n]=s.peek();
			s.push(num[i%n]);
		}
	   System.out.println(Arrays.toString(sol));
		
		
		 // this is the first approach where we stored index in the stack
//		Arrays.fill(sol,-1);
//		Stack<Integer> s = new Stack<>();
//		for(int i = 0;i < n; i++) {
//			while(!s.isEmpty() && num[s.peek()] < num[i])
//				sol[s.pop()] = num[i];
//			s.push(i);
//		}
//		System.out.println(Arrays.toString(sol));

	}

}
