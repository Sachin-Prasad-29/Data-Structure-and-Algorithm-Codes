package Sliding_Window;

import java.util.HashMap;
import java.util.Map;

public class Subarray_with_0_sum {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,-4,6,7,-7,8,9,5,34,0};
		int n= arr.length;
		System.out.println(" Is this array contain any subarray with sum is equal to Zero ");
		System.out.println("Answer is "+ findsum(arr,n));

	}
	static boolean findsum(int a[],int n)
    {
       Map<Integer,Integer> map= new HashMap<>();
       
       int i=0;
       int sum=0;
       
       while(i < n){
           sum+=a[i];
           if(sum==0)  return true;
          
           else if(map.containsKey(sum)){
               return true;
           }
           else{
               map.put(sum,i);
           }
           i++;
       }
       return false;
}

}
