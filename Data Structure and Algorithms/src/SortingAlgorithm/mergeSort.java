package SortingAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class mergeSort {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array - ");
		int size=sc.nextInt();
		System.out.println(" Enter the values of the array - ");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
		}
		mergeSort_(arr,0,size-1);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

	private static void mergeSort_(int[] arr, int left, int right) {
	  if(left<right) {
		  int mid=left+(right-left)/2;
		  mergeSort_(arr,left,mid);
		  mergeSort_(arr,mid+1,right);
		  merge(arr,left,mid,right);
	  }
		
	}

	private static void merge(int[] arr, int left, int mid, int right) {
		int[] b=new int[arr.length];
		int i=left;
		int j=mid+1;
		int k=left;
		while(i<=mid && j<=right) {
			if(arr[i]<arr[j])
				b[k]=arr[i++];
			else
				b[k]=arr[j++];
			k++;
		}
		if(i>mid)    //it means that left side sub array reached its maxed limit so now here we will copy right side aray as it is
           while(j<=right) 
				b[k++]=arr[j++];
		else
			while(i<=mid)
				b[k++]=arr[i++];
		
		for(int p=left;p<=right;p++) {
			arr[p]=b[p];
		}
	}
}
