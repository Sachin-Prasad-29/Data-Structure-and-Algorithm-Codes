package BruteForceSolution;

import java.util.Arrays;

public class Next_Nearest_Largest_number {

	public static void main(String[] args) {
		
		int[] num = {1,2,0,3,4,5,3};
		int n= num.length;
		int[] sol = new int[n];
	    Arrays.fill(sol,-1);
		for(int i = 0; i < n-1; i++ ) 
			for(int j=i+1 ; j< n ; j++) 
				if(num[j]>num[i]) {
					sol[i]= num[j];
					break;
				}
		System.out.println(Arrays.toString(sol));	
		

	}

}
