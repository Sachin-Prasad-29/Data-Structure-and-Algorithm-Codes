package SearchingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearchInSortedandRoatedArray {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter size of the array - ");
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0; i<n;i++) {
				a[i]=sc.nextInt();	
			}
			System.out.println(Arrays.toString(a));
			System.out.println("Enter the searching element - ");
			int x=sc.nextInt();
			System.out.println(binarySearchSandR(a,x));
		}

	}

	private static int binarySearchSandR(int[] a, int x) {
		int low=0;
		int high=a.length-1;
		while(low<=high) {
			
			int mid=(low+high)/2;
			if(a[mid]==x) return mid;
			if(a[low]<=a[mid]) {  // it means left side is sorted and we can process for searching
				if(a[low]<=x && x<a[mid])
					high=mid-1;
				else
					low=mid+1;
			}
			else {
				if(a[mid]<x && x<=a[high])
					low=mid+1;
				else
					high=mid-1;
			}
				
			} 
		
		return -1;
	}

}
