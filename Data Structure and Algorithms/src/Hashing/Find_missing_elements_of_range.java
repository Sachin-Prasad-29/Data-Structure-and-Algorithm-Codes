package Hashing;

import java.util.HashSet;

public class Find_missing_elements_of_range {

	public static void main(String[] args) {
		int[] a={1,3,5,7,11,14};
		int low=10;
		int high=15;
		
		HashSet<Integer> set= new HashSet<>();
		//first put all the value of the array to the hashset
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		// now iterate from low to high and check its value present in the hash set or not 
		while(low<high) {
			// if value not found in the hash set print that value
			if(!set.contains(low))
				System.out.println(low);
			low++;
		}
		

	}

}
