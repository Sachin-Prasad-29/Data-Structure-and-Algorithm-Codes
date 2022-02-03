package BruteForceSolution;

import java.util.Arrays;

public class Longest_consecutive_subsequence {

	public static void main(String[] args) {
		int[] a= {6 ,6 ,2 ,3 ,1 ,4 ,1, 5, 6, 2, 8, 7, 4, 2, 1, 3, 4, 5, 9, 6};
		int n=a.length;
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(a[i]!=a[i+1])
				a[j++]=a[i];
		}
		a[j++]=a[n-1];
		System.out.println(Arrays.toString(a));
		int mx_len=0;
	    int start=0;
		
		int cur_length=1;
		for(int i=0; i<n-1 ;i++) {
			   if(a[i]+1==a[i+1])cur_length++;
			   
			   else {
				   mx_len=Math.max(mx_len, cur_length);
				   cur_length=1;
			
			}
		}
		System.out.println(Math.max(mx_len, cur_length));
		

	}

}
