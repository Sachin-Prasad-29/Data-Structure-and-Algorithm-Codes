package Hashing;

import java.util.HashSet;
import java.util.Set;

public class DistinctElement {

	public static void main(String[] args) {
	int[]	arr = {1,2,3,4,5,1,2,3};
	
	System.out.println(findDistinct(arr));

	}

	private static int findDistinct(int[] arr) {
		Set<Integer> h=new HashSet<>();
		for(int a:arr) {
			h.add(a);
		}
		return h.size();
		// Because set doesnot allow simplier element to be added in same set 
		// and if you try to add sam element it will be added at one only
	}
	

}
