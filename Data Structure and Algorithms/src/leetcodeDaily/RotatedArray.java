package leetcodeDaily;

import java.util.Arrays;
import java.util.Scanner;

public class RotatedArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array - ");
		int size=sc.nextInt();
		System.out.println(" ENter the values of the array - ");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println(" Enter the times of Rotation - ");
		int x=sc.nextInt();
		rotate(arr,x);
		System.out.println(Arrays.toString(arr));

	}
	 public static void rotate(int[] nums, int k) {
	        rotateArray(nums,0,nums.length-1);
	        System.out.println(Arrays.toString(nums));
	        rotateArray(nums,0,k-1);
	        System.out.println(Arrays.toString(nums));
	        rotateArray(nums,k,nums.length-1);
	        System.out.println(Arrays.toString(nums));
	        
	    }
	    public static void rotateArray(int[] nums,int start,int end){
	         while(start<=end) {
	        	 swap(nums,start,end);
	        	 start++;
	        	 end--;
	         }
	    }
	    public static void swap(int[] nums, int left ,int right){
	        int temp=nums[left];
	        nums[left]= nums[right];
	        nums[right]=temp;
	    }

}
