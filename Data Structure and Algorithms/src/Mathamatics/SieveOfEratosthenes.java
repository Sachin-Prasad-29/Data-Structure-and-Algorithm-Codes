package maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		boolean[] res=sieveofEra(n);
		//for(int i=1;i<n+1;i++) {
		//	System.out.println(i+" = "+res[i] );
		//}
		ArrayList<Integer> arr = primearr(res,n+1);
		for(Integer ele : arr) {
			System.out.println(ele);
		}
      
	}
    public static boolean[]  sieveofEra(int n) {
    	boolean[] isPrime=new boolean[n+1];
    	Arrays.fill(isPrime, true);
    	isPrime[0]=false;
    	isPrime[1]=false;
    	
    	for(int i=2;i*i<=n;i++){
    		
    		for(int j=2*i;j<=n;j+=i){
    			isPrime[j]=false;
    		}
    	}
    	return isPrime;
    }
    public static ArrayList<Integer> primearr(boolean[] arr,int n){
    	ArrayList<Integer> res=new ArrayList<>();
    	for(int i=1;i<n;i++) {
    		if(arr[i]==true) {
    			res.add(i);
    		}
    	}
    	return res;
    }
}
