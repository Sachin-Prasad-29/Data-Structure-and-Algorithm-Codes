package Sliding_Window;

import java.util.*;
import java.util.List;

public class Maximum_Of_all_Subarray_of_size_k {

	public static void main(String[] args) {
		int[] arr= {3,-2,4,8,-4,7,5,3,6,75,8,9};
		int k=3;
		int n=arr.length;
		List<Integer> list =new ArrayList<>(); // to store our answer
		Deque<Integer> queue=new LinkedList<>();
		
		int start=0;
		int end=0;
		
		while(end < n) {
			//calculation here we will insert the current a[end] element but before
			// that all the elment less than a[end] must be removed form the queue 
			while(queue.size()>0 && queue.peek()<=arr[end])
				     queue.removeLast();
			queue.addLast(arr[end]);
			
			if(end-start+1 < k) end++;
			
			else if(end - start +1 == k) {
				//ans <-- calculation 
				list.add(queue.peek());
				// remove the start calculation 
				if(arr[start]==queue.peek()) queue.removeFirst();
				// slide the window
				start++;
				end++;
			}
		}
		
      System.out.println(list);
	}

}
