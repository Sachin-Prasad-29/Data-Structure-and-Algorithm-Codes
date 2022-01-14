package SortingAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

 public class bubbleSort {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array - ");
		int size=sc.nextInt();
		System.out.println(" ENter the values of the array - ");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
		}
		bubblesort(arr);
		System.out.println(Arrays.toString(arr));

	}
	static void bubblesort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			boolean check=false;
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j+1]<a[j]) {
					check=true;
					swap(a,j+1,j);
				}
			}
			if(!check)
			  break;
		}
	}
	
	static void swap(int[] a,int i,int j) {
		int  temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
 
}
