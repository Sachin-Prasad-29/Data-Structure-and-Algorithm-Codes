package Arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GoodPair {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array:");
		int n=sc.nextInt();
		System.out.println("Enter the value of the array : ");
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
		System.out.println(Arrays.toString(a));
        System.out.println(numIdenticalPairs(a));
	}
	
	public static int numIdenticalPairs(int[] nums) {
		 int max = nums[0];
	        
         
         for (int i = 1; i < nums.length; i++)
             if (nums[i] > max)
                 max = nums[i];
        
        int[] arr=new int[max+1];
        Arrays.fill(arr,0);
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;    
        }
        int count=0;
        for(int n:arr){
            count+=n*(n-1)/2;
        }
        
        return count;
}

}
