package Arrays;

import java.util.Arrays;

public class SwapArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		
		int len=arr.length;
		
		int[] arr2=new int[len];
		
		for(int i=len-1;i>=0;i--) {
			arr2[len-1-i]=arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}
	
	
	
}
