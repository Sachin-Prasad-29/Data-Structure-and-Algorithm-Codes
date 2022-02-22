package BruteForceSolution;

public class Longest_Sub_Array_with_Sum_K {

	public static void main(String[] args) {
		int[] a= {10, 5, 2, 7, 1, 9};
		int k= 15;
		int n=a.length;
		System.out.println(" the longest subarray with sum equal to K is "+ lenOfLongSubarr(a,n,k));
		

	}
	public static int lenOfLongSubarr (int A[], int N, int K) {
        int size=0;
        
       for(int i=0; i < N; i++){
           int sum=0;
           for(int j=i; j < N; j++){
               sum+=A[j];
               if(sum==K){
                   if(size < j-i+1)
                     size=j-i+1;
               }
               
           }
       }
       return size;
    }

}
