package Hashing;

import java.util.HashMap;

public class Longest_SubArray_With_Sum_k {

	public static void main(String[] args) {
		int[] a= {-13,0,6,15 ,6 ,2 ,15 ,-12 ,17 ,-16 ,0 ,-3, 19 ,-3, 2 ,-9, -6};
		int k= 15;
		int n=a.length;
		System.out.println(" the longest subarray with sum equal to K is "+ lenOfLongSubarr(a,n,k));
       
	}
	public static int lenOfLongSubarr (int A[], int N, int K) {
	    
	    HashMap<Integer,Integer> map=new HashMap<>();
	    int start=0;
	    int cur_Sum=0;
	    int Max_Length=0;
	    
	    for(int i=0; i < N ; i++){
	        cur_Sum+=A[i];
	        
	        if(cur_Sum==K)  Max_Length=i+1;
	        
	        
	        if(map.containsKey(cur_Sum - K))
	            if(Max_Length < i - map.get(cur_Sum - K)) {
	                    start= map.get(cur_Sum-K);
	                    Max_Length = i - map.get(cur_Sum - K);
	            }
	        if(A[i]!=0)
	            map.put(cur_Sum,i);
	        
	    }
	    System.out.println(start);
	    return Max_Length;
	}
}
