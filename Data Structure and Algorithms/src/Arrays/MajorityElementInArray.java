package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MajorityElementInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Majority Element is : "+majorityEle(arr));
		}

	private static int majorityEle(int[] arr) {
		   int len=arr.length;
		   for(int i=0;i<len;i++) {
			   int count=0;
			   for(int j=0;j<len;j++) {
				   if(arr[i]==arr[j]) {
					   count+=1;   
				   }
				  
				   }
			   if(count>(len/2)){
				   return arr[i];
			   }
		   }
		return 0;
	}

}
