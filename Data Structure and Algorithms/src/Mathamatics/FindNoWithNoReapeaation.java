package Mathamatics;

public class FindNoWithNoReapeaation {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,1,2,3,4};
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			ans ^=arr[i];
		}
		System.out.println("Answer is " +ans);

	}

}
