package SearchingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class NoOfTimesRoatedSortedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array - ");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0; i<n;i++) {
			a[i]=sc.nextInt();	
		}
		System.out.println(Arrays.toString(a));
		
		System.out.println("the Mountain  number is : "+mountainEle(a,0,a.length-1));

	}

	private static int  mountainEle(int[] a, int start, int end) {
		while(start<=end) {
			int mid =start+(end-start)/2;
			if(start==end)
				break;
			else if(a[mid]>a[mid+1])
				end=mid;
			else
				start=mid+1;
		}
		return start+1;
	}

}