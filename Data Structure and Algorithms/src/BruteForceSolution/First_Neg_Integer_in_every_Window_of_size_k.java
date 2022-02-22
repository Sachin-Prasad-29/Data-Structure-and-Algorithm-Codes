package BruteForceSolution;

import java.util.*;

public class First_Neg_Integer_in_every_Window_of_size_k {

	public static void main(String[] args) {
		int[] a={1,-3,5,-7,-11,14,-1,3,0,2};
		int len=a.length;
		int k=3;
		List<Integer> list=new ArrayList<>();
		for(int i=0;i < len-k+1 ;i++) {
			
			for(int j=i;j < i+k ;j++) {
				
			     if(a[j]<0) {
			    	 list.add(a[j]);
			    	 break;
			    	 }
			     else if(a[j]>0 && j==i+k-1)
			    	       list.add(0);
			}
		}
			System.out.println(list);
	}

}
