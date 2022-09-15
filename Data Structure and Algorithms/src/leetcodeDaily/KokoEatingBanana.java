package leetcodeDaily;

import java.util.Arrays;
import java.util.Scanner;

public class KokoEatingBanana {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of the array - ");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0; i<n;i++) {
			a[i]=sc.nextInt();	
		}
		System.out.println(Arrays.toString(a));
		System.out.print("The the number ofhour needed : ");
		int x=sc.nextInt();
		System.out.println("output is "+ minEatingSpeed(a,x));	
		sc.close();

	}
	
	 public static int minEatingSpeed(int[] piles, int h) {
		 int start=1;
	        int end=1000000000;
	        while(start<=end){
	            int mid=start+(end-start)/2;
	            int newH=0;
	            for(int n:piles){
	               newH+=n/mid;
	               if(n%mid!=0) newH++;
	            }
	        if(newH>h)
	            start=mid+1;
	            
	        if(newH<=h)
	            end=mid-1;
	        }
	        return start;
	    }
}
