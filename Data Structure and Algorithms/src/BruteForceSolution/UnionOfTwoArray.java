package BruteForceSolution;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionOfTwoArray {

	public static void main(String[] args) {
		int[] a1= {5,6,56,23,7,8};
		int[] a2= {11,34,7,8,9,10};
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		ArrayList<Integer> ar=new ArrayList<>();
		
		int i=0,j=0;
		while(i<a1.length && j<a2.length) {
			if(a1[i]<a2[j]) {
				ar.add(a1[i]);
				i++;
			}
			else if(a1[i]>a2[j]) {
				ar.add(a2[j]);
				j++;
			}
				else {
					ar.add(a1[i]);
					i++;j++;
		           }
		}
		if(j>=a2.length) {
			while(i<a1.length)
				ar.add(a1[i++]);
		}
		else
			while(j<a2.length)
				ar.add(a2[j++]);
		
		System.out.println(ar.toString());

	}
	
	

}
