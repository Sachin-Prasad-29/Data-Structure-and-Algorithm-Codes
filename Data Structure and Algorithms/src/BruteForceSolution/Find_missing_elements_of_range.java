package BruteForceSolution;
import java.io.*;
import java.util.Arrays;
public class Find_missing_elements_of_range {

	public static void main (String[] args) {
		int[] a={1,3,5,7,11,14};
		int low=10;
		int high=15;
		Arrays.sort(a);
		for(int i=low;i<high;i++){
		    if(binarySearch(a,i)==-1)
		       System.out.println(i);
		}
	}
	public static int binarySearch(int[] arr, int x){
	    int start=0;
	    int end =arr.length-1;
	    while(start<=end){
	        int mid=start+(end-start)/2;
	        if(arr[mid]<x) start=mid+1;
	        else if(arr[mid]>x) end=mid-1;
	        else return mid;
	    }
	    return -1;
	}

}
