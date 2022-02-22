package Stack_Problems;

import java.util.Arrays;
import java.util.Stack;

public class Area_Of_histogram {

	public static void main(String[] args) {
		int[] h = {2,1,5,6,2,3};
		
		int ans=largestRectangleArea(h);

	}
	
	public static int largestRectangleArea(int[] h) {
        int n = h.length;
        int[] RnextS =  new int[n];
        int[] LnextS = new int[n];
        Stack<Integer> s = new Stack<>();
        // first fill the RnextS array which track the indext the next smallest element from the current element
        for(int i = n -1 ; i >= 0; i--){
            while(!s.isEmpty() && h[s.peek()] > h[i])
                s.pop();
            if(s.isEmpty())
                RnextS[i] = n;
            else
                RnextS[i] = s.peek();
            s.push(i);
        }
        s.clear();
        // Second fill the LnextS array which track the indext the Previous smallest element from the current element
        for(int i = 0 ; i <  n; i++){
            while(!s.isEmpty() && h[s.peek()] > h[i])
                s.pop();
            if(s.isEmpty())
                LnextS[i] = -1;
            else
                LnextS[i] = s.peek();
            s.push(i);
        }
        System.out.println(Arrays.toString(RnextS));
        System.out.println(Arrays.toString(LnextS));
        int maxArea = Integer.MIN_VALUE;
        for(int i=0; i<n ;i++) {
        	RnextS[i] = h[i]*(RnextS[i]-LnextS[i]-1);
        	maxArea = Math.max(maxArea, RnextS[i]);
        }
        System.out.println(Arrays.toString(RnextS));
        System.out.println(Arrays.toString(LnextS));
        System.out.println(maxArea);
        
  return maxArea;
}

}
