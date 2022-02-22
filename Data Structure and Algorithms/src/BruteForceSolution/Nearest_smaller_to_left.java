package BruteForceSolution;
import java.util.*;
public class Nearest_smaller_to_left {

	public static void main(String[] args) {
		int[] num = {1,2,0,3,4,5,3};
		int n= num.length;
		int[] sol = new int[n];
		Arrays.fill(sol,-1);
		for(int i = 1; i < n; i++) {
			for(int j = i-1; j>=0; j--) {
				if(num[j] < num[i]) {
					sol[i] = num[j];
					break;
				}
			}
		}
		System.out.println(Arrays.toString(sol));
	}

}
