package Hashing;

import java.util.HashMap;

public class Longest_SubArray_with_equal_zero_and_One {

	public static void main(String[] args) {
		int[] a= {1,1,0,1,1,0,0};
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==0)
				a[i]=-1;
		}
        
		int sum= 0 ;
		int finalStart=0;
		int finalEnd=0;
		int maxLen=0;
		HashMap<Integer,Integer> h=new HashMap<>();
		// We have to find continous subarray here
		for(int i=0;i<a.length;i++) {
		sum+=a[i];
		
		if(sum == 0) {
			maxLen=i+1;   // when our first element gives its contribution to the largest sub array
			finalEnd=i;
		}
		
		if(h.containsKey(sum)) {
			if(maxLen<i-h.get(sum)) {
				maxLen=i-h.get(sum);
				finalEnd=i;
			}
		}
		else h.put(sum, i);

		}
		finalStart=finalEnd-maxLen+1;
		
		while(finalStart<=finalEnd)
			System.out.print(a[finalStart++]+" ");
		
	}

}
