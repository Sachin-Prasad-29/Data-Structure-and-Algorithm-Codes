package Stack_Problems;

import java.util.Arrays;
import java.util.Stack;

public class Nearest_smaller_to_RIght {

	public static void main(String[] args) {
		int[] num = {1,2,0,3,4,5,3};
		int n= num.length;
		int[] sol = new int[n];
		Stack<Integer> s = new Stack<>() ;
		for(int i = n-1; i >= 0; i--) {
			if(s.isEmpty())
				sol[i] = -1;
			
			while(!s.isEmpty() && s.peek() >= num[i])
				s.pop();
			
			if(s.isEmpty())
				sol[i] = -1;
			else 
				sol[i]=s.peek();
			s.push(num[i]);
		}
		System.out.println(Arrays.toString(sol));

	}

}
