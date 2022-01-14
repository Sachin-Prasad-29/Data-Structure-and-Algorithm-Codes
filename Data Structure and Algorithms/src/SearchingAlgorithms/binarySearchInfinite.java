package SearchingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearchInfinite {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array - ");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0; i<n;i++) {
			a[i]=sc.nextInt();	
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Enter the searching element - ");
		int x=sc.nextInt();
		System.out.println(searchInfinite(a,x));	

	}
	public static int searchInfinite(int[] a,int x){
		int low=0; int high =1;
		while(a[high]< x) {
			low=high;
			high=2*high;
		}
		return binarySearch(a,x,low,high);
		
	}
	public static int binarySearch(int[] a, int x,int low,int high) {
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(a[mid]==x)
				return mid;
			else if(a[mid]>x)
				high=mid-1;
			else
				low=mid+1;
		}
		
		return -1;
	}
}
