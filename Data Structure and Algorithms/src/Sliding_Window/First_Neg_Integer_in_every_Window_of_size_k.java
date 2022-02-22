package Sliding_Window;

import java.util.*;

public class First_Neg_Integer_in_every_Window_of_size_k {

	public static void main(String[] args) {
		int[] a={1,-3,5,-7,-11,14,-1,3,0,2};
		int len=a.length;
		int k=3;
        List<Integer> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();// to store the newgative values for the answer
        int start=0;
        int end=0;
        while(end<len) {
        	// If the end th element is negative store it into the list
        	if(a[end] < 0) list.add(a[end]);
        	
        	// Is our current window still not the required window size increase only end part
        	if(end - start + 1 < k) end++;
        	
        	// If we touches our required window size
        	else if(end - start + 1 == k) {
        		 // Is our list contain any value if yeas then first value will be our
                // answer for the current window
                // If its empty the add zero to the result array
        		if(list.isEmpty()) ans.add(0);
        		
        		else {
        			ans.add(list.get(0));// add first value of list into the result
        			if(a[start]==list.get(0))list.remove(0);// if the start index of current value is equal to the first value of the list remove it 
                    // because it lose its contribution in next window
        		}
        		start++;
        		end++; // at the end slide the window here
        		
        	}
        }
        System.out.println(ans);
	}

}
