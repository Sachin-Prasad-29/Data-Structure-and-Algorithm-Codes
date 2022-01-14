package maths;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeSum {

	public static void main(String[] args) {
		ArrayList<Integer> finals=primesum(3478993);
		System.out.println(finals.get(0)+"  "+finals.get(1));

	}
	
	public static ArrayList<Integer> primesum(int A) {
		boolean[] isPrime=new boolean[A+1];
    	Arrays.fill(isPrime, true);
    	isPrime[0]=false;
    	isPrime[1]=false;
    	
    	for(int i=2;i*i<=A;i++){
    		
    		for(int j=2*i;j<=A;j+=i){
    			isPrime[j]=false;
    		}
    	}
    	
    	ArrayList<Integer> res1=new ArrayList<>();
    	for(int i=1;i<A;i++) {
    		if(isPrime[i]==true) {
    			res1.add(i);
    		}
    	}
	       ArrayList<Integer> res= new ArrayList<Integer>();
	      for(int i =0;i<res1.size();i++){
	          int check=A-res1.get(i);
	          if(res1.contains(check)){
	               res.add(res1.get(i));
	               res.add(A-res1.get(i));
	               break;
	          }
	      }
	      return res;
	    }

}
