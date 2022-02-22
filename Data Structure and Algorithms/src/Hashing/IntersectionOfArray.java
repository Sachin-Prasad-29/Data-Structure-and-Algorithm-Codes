package Hashing;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArray {

	public static void main(String[] args) {
		int[] a1= {5,6,7,8,1,2,34};
		int[] a2= {7,8,9,10,1,2,34};
		int count=0;
		
		Set<Integer> h=new HashSet<>();
		
		for(int n:a1) 
			  h.add(n);
		for(int n:a2) {
			if(h.contains(n)) {
              count++;
              h.remove(n);
			}
		}
			
		System.out.println(count);

	}

}
