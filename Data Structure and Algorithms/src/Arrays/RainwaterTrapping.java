package Arrays;

import java.util.Scanner;

public class RainwaterTrapping {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rate as per day basis :");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
		System.out.println("The amx Profit is "+rainWaterTrap(a,n));
	

	}

//	private static int rainWaterTrap(int[] a, int n) {  //O(n) and O(n) solutiion
//		int[] left =new int[n];
//		int[] right =new int[n];
//		left[0]=a[0];
//		right[n-1]=a[n-1];
//		for(int i=1;i<n;i++) {
//			left[i]=Math.max(a[i], left[i-1]);
//		}
//		for(int i=n-2;i>=0;i--) {
//			right[i]=Math.max(a[i], right[i+1]);
//		}
//		int val=0;
//		for(int i=0;i<n;i++) {
//			val+= Math.min(left[i], right[i])-a[i];
//		}
//		return val;
//	}
	
	private static int rainWaterTrap(int[] a, int n) {
		int left=0,right=n-1,water=0;
		int maxleft=a[left];
		int maxright=a[right];
		 while(left< right) {
			 if(a[left]<=a[right]) {
				 left++;
				 maxleft=Math.max(maxleft, a[left]);
				 water+= maxleft-a[left];
			 }
			 else {
				 right--;
				 maxright=Math.max(a[right], maxright);
				 water+=maxright-a[right];
			 }
		 }
		 return water;
	}

}
