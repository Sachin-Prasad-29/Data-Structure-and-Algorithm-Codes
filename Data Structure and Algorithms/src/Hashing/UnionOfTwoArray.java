package Hashing;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArray {

	public static void main(String[] args) {
		int[] a1= {5,6,7,8};
		int[] a2= {7,8,9,10};
		
		Set<Integer> h=new HashSet<>();
		
		for(int n:a1) 
			  h.add(n);
		for(int n:a2)
			h.add(n);
		System.out.println(h.toString());
			
		
		

	}

}
