package Hashing;

import java.util.HashMap;

public class Four_Sum_II {

	public static void main(String[] args) {
		int[] num1= {1,2,-1,-2};
		int[] num2= {-2,-1,2,0};
		int[] num3= {-1,2,-2,3};
		int[] num4= {0,2,-1,-3};
		
		System.out.println("No of combination which given Zero of sum are" +fourSumCount(num1, num2, num3, num4));

	}
    // Question is what is our approach right ?
	
	private static int fourSumCount(int[] num1, int[] num2, int[] num3, int[] num4) {
		int count=0;
		// what we will do is run one dubble for loop for  num1 and num 2 and stor there each value pair sum and there occurance 
		// In the hashmap. Then again run the double for loop for num3 and num4 and check weather there sum of negative is present in the hashmap
		// or not if yes tis pressent then increase tha count value based on the value of occurance in the hashmap
		HashMap<Integer,Integer> map=new HashMap<>();
		
	for(int i: num1)
		for(int j :num2)
			map.put(i+j, map.getOrDefault(i+j, 0)+1);
	
	for(int i:num3)
		for(int j:num4)
			if(map.containsKey(-(i+j)))   // check if there negative va;ue already present in map or not
				count=count+map.get(-(i+j)); // based on check there value is added to the count
		return count;
	}

}
