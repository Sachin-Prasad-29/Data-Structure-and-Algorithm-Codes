package SortingAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array - ");
		int size=sc.nextInt();
		System.out.println(" ENter the values of the array - ");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
		}
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

	private static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int min_index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min_index]) {
					min_index=j;
				}
			}
			swap(arr,min_index,i);
		}
	}
	
	public static void swap(int[] arr,int left,int right) {
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
	}

}
