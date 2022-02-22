 package SortingAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array - ");
		int size=sc.nextInt();
		System.out.println(" ENter the values of the array - ");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
		}
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void insertionSort(int[] arr) {
		int len=arr.length;
		for(int i=1;i<len;i++) {
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;	
			}
			arr[j+1]=temp;
		}
		
		
		
	}

}
