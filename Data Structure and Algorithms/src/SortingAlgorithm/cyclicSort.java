package SortingAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class cyclicSort {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array - ");
		int size=sc.nextInt();
		System.out.println(" Enter the values of the array - ");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
		}
		cyclicSort_(arr);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

	private static void cyclicSort_(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=i+1) {
				swap(arr,arr[i]-1,i);
				i--;
			}
		}
		
	}
	public static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}

}
