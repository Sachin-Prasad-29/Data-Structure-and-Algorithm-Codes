package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MajEleUsingHashMap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
        System.out.println(MajEleHashMap(arr));

	}

	private static String MajEleHashMap(int[] arr) {
	    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	    for(int i=0;i<arr.length;i++) {
	    	if(map.containsKey(arr[i])) {
	    		int count=map.get(arr[i])+1;
	    		map.put(arr[i],count);
	    		if(count>=arr.length/2+1) {
	    			return "the element is "+arr[i];
	    		}
	    		
	    	}
	    	else
	    		map.put(arr[i], 1);
	    }
		return "So major element found";
	}

}
