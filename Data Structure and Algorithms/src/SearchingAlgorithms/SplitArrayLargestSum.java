package SearchingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class SplitArrayLargestSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of the array - ");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0; i<n;i++) {
			a[i]=sc.nextInt();	
		}
		System.out.println(Arrays.toString(a));
		System.out.print("The the number of splits needed : ");
		int x=sc.nextInt();
		System.out.println("output is "+ splitArray(a,x));	

		sc.close();
	}

	private static int  splitArray(int[] a, int split) {
		
		int maxPossible = 0;
		int minPossible = 0;  // the size of the array is equal to the number of subarray split
		 for(int i=0;i<a.length;i++) {
			 minPossible=Math.max(a[i], minPossible);
			 maxPossible+=a[i];
		 }
		  int start=minPossible;
		  int end= maxPossible;
		  while(start<=end) {
			  int mid=start+(end-start)/2;
			  int sum=0;
			  int count=1;
			  if(start==end)
				  break;
			  for(int num:a) {
				  sum+=num;
				  if(sum>mid) {
					  count++;
					  sum=num;
				  }
			  }
			     if(count<=split) {
				    end=mid;
			     }
			     else
				     start=mid+1;
		  }
		 
		 
		 
		 
		return start;
	}

}
