package SearchingAlgorithms;

import java.util.Scanner;

public class BookAllocation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array - ");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0; i<n;i++) {
			a[i]=sc.nextInt();	
		}
		System.out.println(" Enter the number of students");
		int x=sc.nextInt();
		System.out.println("The minium largest no of pages is "+ binarySearch(a,x));

	}

	private static int binarySearch(int[] a, int x) {
		int start=0,end=0;
		int res=0;
		for(int i=0; i< a.length ; i++) {
			if(a[i]>start) start = a[i];
			end+=a[i];
		}
		
		while(start <= end ) {
			int mid= start +(end -  start)/2;
			
			if(isFessible(a,x,mid)) {
				res=mid;
				end=mid-1;
				}
			else {
				start=mid+1;
			}
		}
		
		return res;
	}

	private static boolean isFessible(int[] a, int x, int mid) {
		int student = 1;
		int sum =0;
		for(int i=0; i< a.length ; i++) {
			if(sum + a[i] > mid ) {
				student++;
				sum=0;
			}
			else
				sum+=a[i];
		}
		return student<=x;
	}

}
