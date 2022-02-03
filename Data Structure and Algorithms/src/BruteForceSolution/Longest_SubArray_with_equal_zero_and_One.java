package BruteForceSolution;

public class Longest_SubArray_with_equal_zero_and_One {

	public static void main(String[] args) { 
		int[] arr= {1,0,1,1,1,0,0,1,1,0,0,0,1,1};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0)
				arr[i]=-1;
		}
		int n=arr.length;
		int start=0;
		int size=0;
		 for(int i=0;i<n-1;i++) {
			 int sum= arr[i]==1?1:-1;
			 for(int j=i+1;j<n;j++) {
				 sum+=arr[j];
				 if(sum==0) {
					if(size<j-i+1) {
						start=i;
						size=j-i+1;
					}
				 }
			 }
		 }
		 for(int i=0;i<arr.length;i++) {
				if(arr[i]==-1)
					arr[i]=0;
			}
		 
		 int end=size+start;
		 while(start<end) {
			 System.out.println(arr[start]);
			 start++;
		 }
		
				
			
		
	}

}
