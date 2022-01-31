package BruteForceSolution;

import java.util.ArrayList;
import java.util.Arrays;

public class InterSectionOfTwoArray {

	public static void main(String[] args) {
		int[] a1= {5,6,7,8,4,7,7,8,89,3,23,2,6,6,};
		int[] a2= {7,8,9,10,34,6,2,1,6};
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		ArrayList<Integer> ar=new ArrayList<>();
		int i=0,j=0;
		while(i<a1.length && j<a2.length) {
			if(a1[i]<a2[j])  i++;
			
			else if(a1[i]>a2[j]) j++;
			
				else {
					ar.add(a1[i]);
					i++;j++;
		           }
		}
		System.out.println(ar.toString());
		System.out.println("Size "+ar.size());
		

	}

}
