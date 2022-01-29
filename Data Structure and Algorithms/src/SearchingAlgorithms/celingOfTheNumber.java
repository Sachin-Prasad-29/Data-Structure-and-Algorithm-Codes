package SearchingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class celingOfTheNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array - ");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0; i<n;i++) {
			a[i]=sc.nextInt();	
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Enter the target  element - ");
		int x=sc.nextInt();
		System.out.println("the ceiling number is"+ceilingOfTheNumber(a,x));

	}

	private static int ceilingOfTheNumber(int[] a, int x) {
		int low =0;
		int high =a.length-1;
		
		while(low<=high) {
			int mid=low+(high-low)/2;
			
			if(a[mid]==x) return a[mid];
			if(a[mid]<x) low=mid+1;
			else high=mid-1;
			
		}
		return a[low];
	}

}
