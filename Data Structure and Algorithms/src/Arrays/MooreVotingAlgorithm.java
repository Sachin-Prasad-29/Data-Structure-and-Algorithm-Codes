package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MooreVotingAlgorithm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
        System.out.println(MooreVoting(arr));
	}

	private static String MooreVoting(int[] arr) {
		int count=1;
		int maj_ele=arr[0];
		int n=arr.length;
		for(int i=1;i<n;i++) {
			if(arr[i]==maj_ele) { 
				count+=1;
			}
			else
				count-=1;
			if(count==0) {
				maj_ele=arr[i];
				
			}
		}
		System.out.println("Maj ele ment isn "+maj_ele);
		System.out.println("count ele ment isn "+count);
		if(count!=0) {
			int lastcount=0;
			for(int i =0;i<n;i++) {
				if(arr[i]==maj_ele) {
					lastcount+=1;
					if(lastcount>=(n/2)+1) {
						return maj_ele+" is solution";
					}
				}
			}
		}
		return "not major element present";
	}
	

}
