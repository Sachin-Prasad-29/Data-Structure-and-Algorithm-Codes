package SearchingAlgorithms;
import java.util.*;
public class binarySearch {

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
			System.out.println("The index of the element is"+ binarySearch_(a,x,0,n-1));
		}
	}

	public static int binarySearch_(int[] a, int x,int low,int high) {
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
