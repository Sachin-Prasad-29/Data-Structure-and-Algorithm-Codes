package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class shuffelTheArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array:");
		int n=sc.nextInt();
		System.out.println("Enter the value of the array : ");
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(shuffle(a,a.length/2)));
		sc.close();

	}
	public static int[] shuffle(int[] nums, int n) {
		int[] arr = new int[2*n];
		int s = 0, e = n;
		
		{
		arr[s] = nums[s];
		arr[s+1] = nums[e];
		s++;
		s++;
		e++;
		}
		System.out.println(Arrays.toString(arr));

		    return arr;
		
		
		
//        for(int i=0;i<n;i++){
//            nums[i]=nums[i]+nums[n+i]*100000;
//        }
//        //System.out.println(Arrays.toString(nums));
//        
//        for(int i=n-1;i>=0;i--){
//            nums[2*i+1]=nums[i]/100000;
//            nums[2*i]=nums[i]%100000;
//         }
//        
//        return nums;
    }

}
