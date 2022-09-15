package SearchingAlgorithms;

import java.util.Scanner;

public class binarySearchUsingRecursion {
   
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter size of the array - ");
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0; i<n;i++) {
				a[i]=sc.nextInt();	
			}
			System.out.println("Enter the searching element - ");
			int x=sc.nextInt();
			System.out.println("The index of the element is"+ binarySearch(a,x,0,n-1));
		}
	}

	public static int binarySearch(int[] a, int x,int low,int high) {
		    if(low>high)
		    	return -1;
			int mid=low+(high-low)/2;
			if(a[mid]==x)
				return mid;
			if(a[mid]>x)
				return binarySearch(a,x,low,mid-1);
			
		   return binarySearch(a,x,mid+1,high);
		
	}
	
	
}
