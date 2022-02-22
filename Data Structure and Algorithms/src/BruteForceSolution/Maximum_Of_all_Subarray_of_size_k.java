package BruteForceSolution;

import java.util.Arrays;

public class Maximum_Of_all_Subarray_of_size_k {

	public static void main(String[] args) {
		int[] arr= {3,-2,4,8,-4,7,5,3,6,75,8,9};
		int k=3;
		int n=arr.length;
		
		int[] ans=new int[n-k+1];
		
		for(int i=0;i < n-k+1 ;i++) {
			int max = Integer.MIN_VALUE;
			for(int j=i;j < i+k ; j++) {
			    max=Math.max(max,arr[j]);	
			}
			ans[i]=max;
		}
		System.out.println(Arrays.toString(ans));
	}

}
