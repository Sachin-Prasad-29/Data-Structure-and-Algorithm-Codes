package Hashing;

import java.util.HashSet;

public class Longest_consecutive_subsequence {
	public static void main(String[] args) {
		int[] a= {6 ,6 ,2 ,3 ,1 ,4 ,1, 5, 6, 2, 8, 7, 4, 2, 1, 3, 4, 5, 9, 6};
		int n=a.length;
		
		// FIRST PUT ALL THE ELEMENT IN THE HASH SET
		int max_sequ=0;
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<n;i++) set.add(a[i]);
		
		//now check for every element is its smaller than one is present in the set or not 
		// if its smaller then one is not present then we take asuption that it may be the first elemnt of any 
		// sequence
		for(int i=0;i<n;i++) {
			// it means is one less then one value is present is set or not if no then 
			// it is the starting of any sequecne
			if(!set.contains(a[i]-1)) {
				int j=a[i];
				while(set.contains(j))
					j++;
				// checking for the current identified sequence is max or not
				max_sequ=Math.max(max_sequ, j-a[i]);	
			}
		}
	 System.out.println(max_sequ);
	}
}
