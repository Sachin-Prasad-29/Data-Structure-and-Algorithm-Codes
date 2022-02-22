package SearchingAlgorithms;

public class FirstAndLastPosition {

	public static void main(String[] args) {
		int[] num= {1,2,3,4,4,4,4,4,5,6,7,8,9};
		int[] ans= {-1,-1};
		int target=4;
		ans[0]=firstandlast(num,target,true);
		ans[1]=firstandlast(num,target,false);
		System.out.println(ans[0]+" "+ans[1]);
		

	}
	public static int firstandlast(int[] nums,int target,boolean firstStartIndex){
		int ans=-1;
		int start=0;
		int end=nums.length-1;
		
	while(start<=end) {
		int mid=start+(end-start)/2;
		if(nums[mid]==target) {
			ans=mid;
			if(firstStartIndex)
				end=mid-1;
			else
				start=mid+1;
			
		}
		else if(nums[mid]<target)
			start=mid+1;
		else
			end=mid-1;
	}
		return ans;
		
	}

}
