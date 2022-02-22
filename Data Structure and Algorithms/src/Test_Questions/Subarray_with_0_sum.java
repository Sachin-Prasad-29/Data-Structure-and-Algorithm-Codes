package Test_Questions;

public class Subarray_with_0_sum {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,-4,6,7,-7,8,9,5,34,0};
		int n= arr.length;
		System.out.println(" Is this array contain any subarray with sum is equal to Zero ");
		System.out.println("Answer is "+ findsum(arr,n));
	}
	 static boolean findsum(int a[],int n)
	    {
	       for(int i=0;i < n ;i++){
	           int sum=0;
	           for(int j=i; j< n ;j++){
	               sum+=a[j];
	               if(sum==0) return true;
	           }
	       }
	        return false;
	    }

}
