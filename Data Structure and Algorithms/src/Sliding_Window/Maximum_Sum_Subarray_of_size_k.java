package Sliding_Window;

public class Maximum_Sum_Subarray_of_size_k {

	public static void main(String[] args) {
		int[] a={1,3,5,7,11,14,1,3,0,2};
		int len=a.length;
		int k=4;  // Size of our given window
		
		// In this question we have to find out the maximum sum of subarray of size equal to given window 
		
		int start=0;
		int end=0;
		
		int max_sum=Integer.MIN_VALUE;
		int win_Sum=0;
		
		// here end is ilterate form 0 to len because our last window contain the last value also 
	    while(end < len) {
	    	win_Sum+=a[end]; // Here we are taking sum of every element of the array
	    	//System.out.println(win_Sum);
	    	if(end-start+1 < k) // here we checking wheather our current window size is reached to given window size or not
	    		end++;   // because at the starting both end and start variable are pointing to first element 
	    	             // we increase only end until we hit our window size as given window
	    	
	    	else if(end-start+1 == k) { // here the window size meets our required wihdow size
	    		//System.out.println("start = "+start+" end = "+end+ " and sum is "+win_Sum);
	    		max_sum=Math.max(max_sum, win_Sum); // checking wheather current window sum is greater or not 
	    		
	    		win_Sum-=a[start]; // now we remove the first element of this window so that in next ilteration last elemen twill get added to our new window
	    		start++;// at last increae the start to point the first element of next window
	    		end++;
	    	}
	    }
	    
	    System.out.println(" HIghest sum of the window is = "+ max_sum);
		
	}

}
