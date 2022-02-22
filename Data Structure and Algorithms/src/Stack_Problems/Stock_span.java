package Stack_Problems;

import java.util.ArrayList;
import java.util.Stack;

public class Stock_span {

	public static void main(String[] args) {
		int[] num = new int[]{100,60,70,85,65,75,90};
		int n= num.length;
		ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        
        for(int i = 0; i < n ; i++) {
        	 while(!s.isEmpty() && num[s.peek()] <= num[i]) {
        		 s.pop();
        	 }
        	 if(s.isEmpty())
        		 ans.add(-1);
        	 else
        		 ans.add(s.peek());
        	 s.push(i);
        }
        System.out.println(ans);
        for(int i=0; i < ans.size();i++) {
        	ans.set(i,i-ans.get(i));
            
        }
        System.out.println(ans);
        	
        
        
	}

}
