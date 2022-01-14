package Arrays;

import java.util.Scanner;

public class kadenAlgorithm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();	
		}
		System.out.println(kadenAlgo(arr));

	}
	public static int kadenAlgo(int[] arr) {
		int currSum=0;
		int maxSum=0;
		for(int i=0;i<arr.length;i++) {
			currSum=currSum+arr[i];
			if(currSum>maxSum) {
				maxSum=currSum;
			}
			if(currSum<0) {
				currSum=0;
			}
		}
		return maxSum;
	}

}
