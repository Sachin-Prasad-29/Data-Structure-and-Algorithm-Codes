package Sliding_Window;

public class Largest_Subarray_of_sum_k {

	public static void main(String[] args) {
		int[] a= {4,1,1,4,1,1};
		int k=5;
		
		int n= a.length;
		int start=0;
		int end=0;
		int sum=0;
		int max=0;
		int count=0;
		
		while(end < n) {
			sum+=a[end];
			
			if(sum<k) end++;
			
			else if(sum==k) {
				count++;
				max=Math.max(max, end-start+1);
				end++;
			}
			else {
				while(sum>k) {   
					sum-=a[start];
					start++;
					}
				if(sum==k) count++;
				end++;
			}
		}
		
		System.out.println(max+" "+count);

	}

}
