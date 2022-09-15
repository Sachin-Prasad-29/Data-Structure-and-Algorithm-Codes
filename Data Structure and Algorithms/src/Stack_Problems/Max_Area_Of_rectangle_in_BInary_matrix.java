package Stack_Problems;

import java.util.Arrays;
import java.util.Stack;

public class Max_Area_Of_rectangle_in_BInary_matrix {

	public static void main(String[] args) {
		int[][] arr = {
				{0,0,1,1},
				{1,1,1,1},
				{0,0,1,1},
				{0,0,1,1},
				{1,1,1,1},
		};
		int n = arr.length;
		int m = arr[0].length;
		int[] list = new int[n];
		for(int i =0; i < m; i++)
			list[i]=arr[0][i];
		
		System.out.println(Arrays.toString(list));
		int maxArea= largestRectangleArea(list);
		for(int i = 1; i < n; i++) {
			for(int j=0;j < m;j++) {
				if(arr[i][j]==0)
					list[j]=0;
				else
					list[j]=list[j]+arr[i][j];
					
			}
			System.out.println(Arrays.toString(list));
			int area = largestRectangleArea(list);
			System.out.println(area);
			maxArea= Math.max(maxArea,area);
		}
		System.out.println(maxArea);
	}
	
	public static int largestRectangleArea(int[] h) {
        int n = h.length;
        int[] RnextS =  new int[n];
        int[] LnextS = new int[n];
        Stack<Integer> s = new Stack<>();
        // first fill the RnextS array which track the indext the next smallest element from the current element
        for(int i = n -1 ; i >= 0; i--){
            while(!s.isEmpty() && h[s.peek()] >= h[i])
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
            while(!s.isEmpty() && h[s.peek()] >= h[i])
                s.pop();
            if(s.isEmpty())
                LnextS[i] = -1;
            else
                LnextS[i] = s.peek();
            s.push(i);
        }
//        System.out.println(Arrays.toString(RnextS));
//        System.out.println(Arrays.toString(LnextS));
        int maxArea = Integer.MIN_VALUE;
        for(int i=0; i<n ;i++) {
        	RnextS[i] = h[i]*(RnextS[i]-LnextS[i]-1);
        	maxArea = Math.max(maxArea, RnextS[i]);
        }
//        System.out.println(Arrays.toString(RnextS));
//        System.out.println(Arrays.toString(LnextS));
//        System.out.println(maxArea);
        
  return maxArea;
}
	

}
