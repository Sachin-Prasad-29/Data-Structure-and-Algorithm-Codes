package practiceQuestion;

import java.util.HashMap;
import java.util.Map;

public class AddTwoNoOfArray {

	public static void main(String[] args) {
		
      int[] num= {3,4,2,5,6,4,3,5};
      int target=8;
      System.out.println(num);
      System.out.println(solution(num,num.length,target));
	}
	public static int[] solution(int[] arr, int n,int target) {
		int[] res=new int[2];
		res[0]=0;
		res[1]=0;
		
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
			if(map.containsKey(arr[i])) {
				res[0]=map.get(arr[i]);
				res[1]=i;
				return res;
			}
			else map.put(target-arr[i],i);
		}
		return res;
	}

}
