package Hashing;

import java.util.HashMap;

public class Count_the_Distinct_element_in_every_window {

	public static void main(String[] args) {
		
		int[] a= { 1,2,1,3,4,2,3 };
		int k= 4;
		int n=a.length;
		HashMap<Integer,Integer> h =new HashMap<>();
		
		for(int i=0;i<k;i++) {
			h.put(a[i], h.getOrDefault(a[i],0)+1);
		}
		 System.out.println(h.size());
		 
		for(int i=k;i<n;i++) {
			if(h.get(a[i-k])==1) h.remove(a[i-k]);
			
			else
				h.put(a[i-k],h.get(a[i-k])-1);
			
			h.put(a[i],h.getOrDefault(a[i],0)+1);
			
			System.out.println(h.size());
			
		}
	}

}
