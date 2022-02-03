package Hashing;

import java.util.HashMap;

public class SubArray_With_given_sum {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8};
		int sum= 11;
		int curSum=0;
		HashMap<Integer,Integer> h=new HashMap<>();
		int start=0,end=0;
		// We have to find continous subarray here
		for(int i=0;i<a.length;i++) {
			curSum+=a[i];
			if(curSum==sum) { // here we are checking wheather the starting curSum is equal to the given sum if its yes 
				start=0;      // then ur starting index is 0 and end index is i
				end=i;
				break;
			}
			
			if(h.containsKey(curSum-sum)) {
				start=h.get(curSum-sum)+1;
				end=i;
				break;
			}
			h.put(curSum,i);
			
		}
		
		while(start<=end)
			System.out.print(a[start++]+" ");
		
		
	}

}
