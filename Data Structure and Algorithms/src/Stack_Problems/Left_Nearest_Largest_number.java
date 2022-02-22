package Stack_Problems;

import java.util.Arrays;
import java.util.Stack;

public class Left_Nearest_Largest_number {

	public static void main(String[] args) {
		int[] num = {9,8,7,6,5,4,3,2,1};
		int n= num.length;
		int[] sol = new int[n]; // answer should be  [ -1, 2, -1, -1, 5, 4 ]
		
		Stack<Integer> s = new Stack<>();
		
		for(int i = 0; i < n; i++) {
			
			while(!s.isEmpty() && s.peek() <= num[i])
				s.pop();
			
			if(s.isEmpty()) {
				sol[i]=-1;
				s.push(num[i]);
			}
			else {
				sol[i]= s.peek();
				s.push(num[i]);
			} 
		}
		System.out.println(Arrays.toString(sol));
	}

}
